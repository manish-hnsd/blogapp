package com.blog.blogapp.services;

import com.blog.blogapp.dto.CommentDto;

import java.util.List;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);


   List<CommentDto> getComments();

    void deleteComment(long commentId);
}
