package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;

    {
        posts = new ArrayList<>();
        posts.add(new Post(0L,"Недавно вышла новенькая Reanimal", new Date()));
        posts.add(new Post(1L,"Ждем выхода кооперативной Burglin' Gnomes", new Date()));
        posts.add(new Post(2L,"Сколько еще ждать TES6???", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        Long newId = (long)posts.size();
        posts.add(new Post(newId, text, new Date()));
    }
}
