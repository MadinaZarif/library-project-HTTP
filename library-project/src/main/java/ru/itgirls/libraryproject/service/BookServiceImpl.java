package ru.itgirls.libraryproject.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.itgirls.libraryproject.dto.BookDto;
import ru.itgirls.libraryproject.model.Book;
import ru.itgirls.libraryproject.repository.BookRepository;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public BookDto getByNameV3(String name) {
        Specification<Book> bookSpecification = Specification.where(new Specification<Book>() {
            @Override
            public Predicate toPredicate(Root<Book> root,
                                         CriteriaQuery<?> query,
                                         CriteriaBuilder cb) {
                return cb.equal(root.get("name"), name);
            }
        });

        Book book = bookRepository.findOne(bookSpecification).orElseThrow();
        return convertToDto(book);
    }
        @Override
        public BookDto getByNameV1 (String name){
            Book book = bookRepository.findBookByName(name).orElseThrow();
            return convertToDto(book);
        }


        @Override
        public BookDto getByNameV2 (String name){
            Book book = bookRepository.findBookByNameBySql(name).orElseThrow();
            return convertToDto(book);
        }

        private BookDto convertToDto (Book book){
            return BookDto.builder()
                    .id(book.getId())
                    .genre(book.getGenre().getName())
                    .name(book.getName())
                    .build();
        }
    }
