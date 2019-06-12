package com.example.wbdvsf19tdaiserverjava.models;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	String id;
	String title;
	List<Widget> widgets;
	
	public Topic() {
		this.widgets = new ArrayList<Widget>();
	}
	
	public Topic(String id) {
		this.id = id;
		this.title = "Default Title";
		this.widgets = new ArrayList<Widget>();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Widget> getWidgets() {
		return widgets;
	}
	public void setWidgets(List<Widget> widgets) {
		this.widgets = widgets;
	}
	
	
}
