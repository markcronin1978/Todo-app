package ie.cit.adf.domain;

import java.util.UUID;

public class Todo {
	private String id;
	private Boolean done; 
	private String text;
	
	public Todo(){
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getDone() {
		return done;
	}
	public void setDone(Boolean done) {
		this.done = done;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", done=" + done + ", text=" + text + "]";
	}
	
	

}
