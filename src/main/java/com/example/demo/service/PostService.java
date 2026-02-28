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
        posts.add(new Post("Недавно вышла новенькая Reanimal", new Date()));
        posts.add(new Post("Ждем выхода кооперативной Burglin' Gnomes", new Date()));
        posts.add(new Post("Сколько еще ждать TES6???", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
