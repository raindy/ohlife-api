package com.fantasi.raindy.ohlife.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "acq_bbs_board")
public class AcqBbsBoard {
	private @Id int bid;
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	private String name;
	private String genus;
	private Date update_time;
	
	@ManyToOne
    @JoinColumn(name = "hid", referencedColumnName = "websiteId", nullable = false)
	private WebsiteInfo websiteInfo;
	
	public WebsiteInfo getWebsiteInfo() {
		return websiteInfo;
	}
}
