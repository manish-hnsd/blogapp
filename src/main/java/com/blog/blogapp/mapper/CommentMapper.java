package com.blog.blogapp.mapper;

import com.blog.blogapp.dto.CommentDto;
import com.blog.blogapp.entities.Comment;

public class CommentMapper {
    //Convert Comment Entity to Comment DTO

    public static CommentDto mapToCommentDto(Comment comment) {
        return CommentDto.builder()
                .id(comment.getId())
                .name(comment.getName())
                .email(comment.getEmail())
                .content(comment.getContent())
                .createdOn(comment.getCreatedOn())
                .updatedOn(comment.getUpdatedOn())
                .build();

    }
}
