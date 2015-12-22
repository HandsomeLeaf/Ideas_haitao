package cn.edu.zju.cst.ideas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Goods")
public class Goods {
	
	@Id
	private int goods_id;
	private String goods_name;
	private int sites_id;
	private int brand_id;
	private String goods_standard;
	private String producting_area;
	private String composition;
	private String use;
	private String article_number;
	private String weight;
	private String tax_rate;
	@Column(name="goods_label",length = 1024)
	private String goods_label;
	private String level_workshop_price;
	private String price;
	private String good_reputation_rating;
	private String month_sale_number;
	private String store_number;
	private String tariffs_detail;
	private String goods_picture;
	private Date crawling_time;
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public int getSites_id() {
		return sites_id;
	}
	public void setSites_id(int sites_id) {
		this.sites_id = sites_id;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public String getGoods_standard() {
		return goods_standard;
	}
	public void setGoods_standard(String goods_standard) {
		this.goods_standard = goods_standard;
	}
	public String getProducting_area() {
		return producting_area;
	}
	public void setProducting_area(String producting_area) {
		this.producting_area = producting_area;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getArticle_number() {
		return article_number;
	}
	public void setArticle_number(String article_number) {
		this.article_number = article_number;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getTax_rate() {
		return tax_rate;
	}
	public void setTax_rate(String tax_rate) {
		this.tax_rate = tax_rate;
	}
	public String getGoods_label() {
		return goods_label;
	}
	public void setGoods_label(String goods_label) {
		this.goods_label = goods_label;
	}
	public String getLevel_workshop_price() {
		return level_workshop_price;
	}
	public void setLevel_workshop_price(String level_workshop_price) {
		this.level_workshop_price = level_workshop_price;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getGood_reputation_rating() {
		return good_reputation_rating;
	}
	public void setGood_reputation_rating(String good_reputation_rating) {
		this.good_reputation_rating = good_reputation_rating;
	}
	public String getMonth_sale_number() {
		return month_sale_number;
	}
	public void setMonth_sale_number(String month_sale_number) {
		this.month_sale_number = month_sale_number;
	}
	public String getStore_number() {
		return store_number;
	}
	public void setStore_number(String store_number) {
		this.store_number = store_number;
	}
	public String getTariffs_detail() {
		return tariffs_detail;
	}
	public void setTariffs_detail(String tariffs_detail) {
		this.tariffs_detail = tariffs_detail;
	}
	public String getGoods_picture() {
		return goods_picture;
	}
	public void setGoods_picture(String goods_picture) {
		this.goods_picture = goods_picture;
	}
	public Date getCrawling_time() {
		return crawling_time;
	}
	public void setCrawling_time(Date crawling_time) {
		this.crawling_time = crawling_time;
	}
	
}
