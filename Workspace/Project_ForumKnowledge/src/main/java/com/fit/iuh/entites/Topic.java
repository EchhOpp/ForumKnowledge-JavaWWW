package com.fit.iuh.entites;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Topic {
	private int tagId;

	private String name;

	private String hashtag;

	private Date createdAt;

	private Date updatedAt;

	private List<Post> posts;

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Topic(int tagId, String name, String hashtag, Date createdAt, Date updatedAt) {
		super();
		this.tagId = tagId;
		this.name = name;
		this.hashtag = hashtag;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Topic(int tagId, String name, String hashtag, Date createdAt, Date updatedAt, List<Post> posts) {
		super();
		this.tagId = tagId;
		this.name = name;
		this.hashtag = hashtag;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.posts = posts;
	}

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tagId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topic other = (Topic) obj;
		return tagId == other.tagId;
	}

}
