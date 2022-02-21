package in.co.rays.Hibernate;

import java.util.Set;

public class AuctionItem {
	
	private int id;
	private Set<Bids> bids;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Bids> getBids() {
		return bids;
	}
	public void setBids(Set<Bids> bids) {
		this.bids = bids;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
