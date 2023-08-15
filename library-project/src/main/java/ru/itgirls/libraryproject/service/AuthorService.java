package ru.itgirls.libraryproject.service;

import ru.itgirls.libraryproject.dto.AuthorCreateDto;
import ru.itgirls.libraryproject.dto.AuthorDto;
import ru.itgirls.libraryproject.dto.AuthorUpdateDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);

    AuthorDto getByName_1(String name);

    AuthorDto getByName_2(String name);

    AuthorDto getByName_3(String name);

    AuthorDto createAuthor(AuthorCreateDto authorCreateDto);

    AuthorDto updateAuthor(AuthorUpdateDto authorUpdateDto);

    void deleteAuthor(Long id);
}
