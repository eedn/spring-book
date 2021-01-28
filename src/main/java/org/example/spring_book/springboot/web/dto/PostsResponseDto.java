package org.example.spring_book.springboot.web.dto;

import lombok.Getter;
import org.example.spring_book.springboot.domain.posts.Posts;
import org.example.spring_book.springboot.domain.posts.PostsRepository;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
