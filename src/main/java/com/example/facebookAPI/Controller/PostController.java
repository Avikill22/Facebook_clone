package com.example.facebookAPI.Controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebookAPI.Entity.Post;

@RestController
@RequestMapping("api/postService")
public class PostController {

	@PostMapping("/save")
	public ArrayList<Post> submitPost(@RequestBody Post body){
		return new ArrayList<>();
	}
	
	@GetMapping("/getPost")
	public ArrayList<Post> retrieveAllPost(){
		return new ArrayList<>();
	}
	
	@DeleteMapping("/delete")
	public ArrayList<Post> deleteParticularPost(@PathVariable("postId") UUID postID){
		return new ArrayList<Post>(); 
	}
	
}
