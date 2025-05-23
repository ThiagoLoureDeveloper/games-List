package com.louredev.listgames.dto;

import com.louredev.listgames.entities.Game;

public class GameMinDto {
		
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	
	public GameMinDto() {
		
	}


	public GameMinDto(Game entities) {
		super();
		id = entities.getId();
		this.title = entities.getTitle();
		this.year = entities.getYear();
		this.imgUrl = entities.getImgUrl();
		this.shortDescription = entities.getShortDescription();
	}


	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getYear() {
		return year;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
}
