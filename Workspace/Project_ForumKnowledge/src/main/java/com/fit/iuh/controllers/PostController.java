package com.fit.iuh.controllers;

import com.fit.iuh.entites.Post;
import com.fit.iuh.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//@RestController
@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/search")
    public ResponseEntity<Map<String, Object>> search(@RequestParam("keyword") String keyword) {
        Map<String, Object> response = new LinkedHashMap<>();

        response.put("status", HttpStatus.OK.value());

        response.put("data", postService.search(keyword));

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("id") int id, Model model) {
        Post post = postService.findById(id);
        model.addAttribute("post", post);
        return "post/detail-test";
    }

}