package ru.itgirls.libraryproject.service;

import ru.itgirls.libraryproject.dto.AuthorDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);
    AuthorDto getByName_1(String name);
    AuthorDto getByName_2(String name);

    AuthorDto getByName_3(String name);

}
