package ru.itgirls.libraryproject.service;

import ru.itgirls.libraryproject.dto.AuthorDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);
}
