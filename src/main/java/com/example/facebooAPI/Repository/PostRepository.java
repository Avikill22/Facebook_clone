package com.example.facebooAPI.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.facebookAPI.Entity.Post;

@Repository
public interface PostRepository extends CassandraRepository<Post,UUID>{
	
	ArrayList<Post> findAll();
	Post save(Post post);
}
