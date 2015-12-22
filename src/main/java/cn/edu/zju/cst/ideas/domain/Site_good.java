package cn.edu.zju.cst.ideas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Site_good")
public class Site_good {
	
	@Id
	private int id;
	private int goods_id;
	private int sites_id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public int getSites_id() {
		return sites_id;
	}

	public void setSites_id(int sites_id) {
		this.sites_id = sites_id;
	}

	
}
