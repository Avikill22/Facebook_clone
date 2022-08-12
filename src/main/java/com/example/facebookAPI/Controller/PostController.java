package com.example.facebookAPI.Controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebookAPI.Entity.Post;
import com.example.facebookAPI.Service.PostService;

@RestController
@RequestMapping("api/postService")
public class PostController {

	@Autowired
	PostService postService;
	
	@PostMapping("/save")
	public Post submitPost(@RequestBody Post body){
		return postService.submitPostToDB(body);
	}
	
	@GetMapping("/getPost")
	public ArrayList<Post> retrieveAllPost(){
		return postService.retrievePostFromDB();
	}
	
	@DeleteMapping("/delete")
	public Post deleteParticularPost(@PathVariable("postId") UUID postId){
		return postService.deletePostFromDB(postId); 
	}
	
}
