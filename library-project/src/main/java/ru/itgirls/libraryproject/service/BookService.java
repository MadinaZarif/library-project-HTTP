package ru.itgirls.libraryproject.service;

import ru.itgirls.libraryproject.dto.BookDto;

public interface BookService {

    BookDto getByNameV3(String name);
    BookDto getByNameV1(String name);

    BookDto getByNameV2(String name);
}
