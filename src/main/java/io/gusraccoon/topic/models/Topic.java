package io.gusraccoon.topic.models;

public class Topic {

	private String id;
	private String contents;
	private String description;
	
	public Topic() {
		
	}
	
	public Topic(String id, String contents, String description) {
		super();
		this.id = id;
		this.contents = contents;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
