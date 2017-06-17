package com.websystique.springboot.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by hoang yen on 10/06/2017. Description: Repository
 */
@Entity
@Table(name = "SONG")
public class Song implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;

	@NotEmpty
	@Column(name = "title", nullable = false)
	private String title;
	
	private String artists;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtists() {
		return artists;
	}

	public void setArtists(String artists) {
		this.artists = artists;
	}

	public Song() {
	}

	public Song(String id) {
		this.id = id;
	}

	public Song(String id, String title, String artists) {
		this.id = id;
		this.title = title;
		this.artists = artists;
	}
	
	
}