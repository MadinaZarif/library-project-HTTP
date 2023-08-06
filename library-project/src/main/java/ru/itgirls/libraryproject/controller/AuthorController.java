package ru.itgirls.libraryproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirls.libraryproject.dto.AuthorDto;
import ru.itgirls.libraryproject.service.AuthorService;

@RestController
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("author/a3")
    AuthorDto getAuthorByName_3(@RequestParam("name") String name) {
        return authorService.getByName_3(name);
    }

    @GetMapping("/author/a2")
    AuthorDto getAuthorByName_2(@RequestParam("name") String name) {
        return authorService.getByName_2(name);
    }

    @GetMapping("author/{id}")
    AuthorDto getAuthorById(@PathVariable("id") Long id) {
        return authorService.getAuthorById(id);
    }

    @GetMapping("/author")
    AuthorDto getAuthorByName(@RequestParam("name") String name) {
        return authorService.getByName_1(name);
    }

}
