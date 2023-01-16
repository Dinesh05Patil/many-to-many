package many_to_many_uni_pl.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
	
	@Id
	private int id;
	private String name;
	private String origin;
	private String counutry;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCounutry() {
		return counutry;
	}
	public void setCounutry(String counutry) {
		this.counutry = counutry;
	}
	@Override
	public String toString() {
		return "Language [id=" + id + ", name=" + name + ", origin=" + origin + ", counutry=" + counutry + "]";
	}
	
	

}
