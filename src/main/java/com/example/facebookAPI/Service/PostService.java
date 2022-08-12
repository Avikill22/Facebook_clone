package com.example.facebookAPI.Service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebooAPI.Repository.PostRepository;
import com.example.facebookAPI.Entity.Post;

@Service		
public class PostService {
	
	@Autowired
	PostRepository postRepository;

	public Post submitPostToDB(Post postData){
		return postRepository.save(postData);
	}
	
	public ArrayList<Post> retrievePostFromDB(){
		ArrayList<Post> posts = postRepository.findAll();
		return posts;
	} 
	
	public Post deletePostFromDB(UUID postID){
		Post data = postRepository.findById(postID).get();
		postRepository.delete(data);
		return data;
	}
}
