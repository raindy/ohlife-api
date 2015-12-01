package com.fantasi.raindy.ohlife.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
public class Note {

	private @Id @GeneratedValue Long id;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPubTime() {
		return pubTime;
	}

	public void setPubTime(String pubTime) {
		this.pubTime = pubTime;
	}

	private String title;
	private String content;
	private String pubTime;

	private Note() {}

	public Note(String title, String content, String pubTime) {
		this.title = title;
		this.content = content;
		this.pubTime = pubTime;
	}
}