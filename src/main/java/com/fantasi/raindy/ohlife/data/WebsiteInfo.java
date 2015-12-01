package com.fantasi.raindy.ohlife.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "website_info")
public class WebsiteInfo {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private @Id int websiteId;
	private String name;
	
	@OneToMany(mappedBy = "websiteInfo", cascade = CascadeType.ALL)
	private List<AcqBbsBoard> boards;
	
}
