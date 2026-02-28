package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Недавно вышла новенькая Reanimal"));
        posts.add(new Post("Ждем выхода кооперативной Burglin' Gnomes"));
        posts.add(new Post("Сколько ещё ждать TES6???"));

        return posts;
    }
}
