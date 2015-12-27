package cn.edu.zju.cst.ideas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class Brands {

	@Id
	private int goods_brand_id;
	@Column(name = "goods_brand_name",length = 100)
	private String goods_brand_name;
	

	public int getBrand_id() {
		return goods_brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.goods_brand_id = brand_id;
	}

	public String getBrand_name() {
		return goods_brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.goods_brand_name = brand_name;
	}
}
