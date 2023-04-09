package com.blog.blogapp.services;

import com.blog.blogapp.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> findAllPosts();
    void createPost(PostDto postDto);


    PostDto findPostById(Long postId);
    void updatePost(PostDto postDto);

    void deletePost(Long postId);

    PostDto findPostByUrl(String postUrl);
    List<PostDto> searchPosts(String query);
}