package com.example.facebookAPI.Entity;

import java.security.Timestamp;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Post {

	@PrimaryKey
	private UUID postID;
	
	private UUID userID;
	private String userName;
	private String imageURL;
	private String description;
	private String postImageURL;
	
	private int likes;
	private Timestamp dateTime;
	
	public Post() {
		super();
	}
	/**
	 * @param postID
	 * @param userID
	 * @param userName
	 * @param imageURL
	 * @param description
	 * @param postImageURL
	 * @param likes
	 * @param dateTime
	 */
	public Post(UUID postID, UUID userID, String userName, String imageURL, String description, String postImageURL,
			int likes, Timestamp dateTime) {
		super();
		this.postID = postID;
		this.userID = userID;
		this.userName = userName;
		this.imageURL = imageURL;
		this.description = description;
		this.postImageURL = postImageURL;
		this.likes = likes;
		this.dateTime = dateTime;
	}
	/**
	 * @return the postID
	 */
	public UUID getPostID() {
		return postID;
	}
	/**
	 * @param postID the postID to set
	 */
	public void setPostID(UUID postID) {
		this.postID = postID;
	}
	/**
	 * @return the userID
	 */
	public UUID getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(UUID userID) {
		this.userID = userID;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}
	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the postImageURL
	 */
	public String getPostImageURL() {
		return postImageURL;
	}
	/**
	 * @param postImageURL the postImageURL to set
	 */
	public void setPostImageURL(String postImageURL) {
		this.postImageURL = postImageURL;
	}
	/**
	 * @return the likes
	 */
	public int getLikes() {
		return likes;
	}
	/**
	 * @param likes the likes to set
	 */
	public void setLikes(int likes) {
		this.likes = likes;
	}
	/**
	 * @return the dateTime
	 */
	public Timestamp getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	
	
}
