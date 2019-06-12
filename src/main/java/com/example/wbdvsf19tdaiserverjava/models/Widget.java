package com.example.wbdvsf19tdaiserverjava.models;

import java.util.Date;

public class Widget {	
	public Widget() {
	}
	public Widget(String id) {
		super();
		this.id = id;
		this.name = "Default Name";
		this.type = WidgetType.Heading;
		this.order = OrderType.Unordered;
		this.text = "Default Text";
		this.src = "Default Source";
		this.url = "Default Url";
		this.href = "Default Href";
		this.size = 1;
		this.width = 100;
		this.height = 50;
		this.cssClass = "";
		this.style = "";
		this.value = "";
		this.dataType = DataType.String;
		this.items = "";
	}
	public Widget(String name, 
				  String id, 
				  WidgetType type, 
				  OrderType order, 
				  String text, 
				  String src, 
				  String url, 
				  String href,
				  int size, 
				  int width, 
				  int height, 
				  String cssClass, 
				  String style, 
				  String value, 
				  DataType dataType,
				  String items) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
		this.order = order;
		this.text = text;
		this.src = src;
		this.url = url;
		this.href = href;
		this.size = size;
		this.width = width;
		this.height = height;
		this.cssClass = cssClass;
		this.style = style;
		this.value = value;
		this.dataType = dataType;
		this.items = items;
	}


	private String name;
	private String id;
	private WidgetType type;
	private OrderType order;
	private String text;
	private String src;
	private String url;
	private String href;
	private int size;
	private int width;
	private int height;
	private String cssClass;
	private String style;
	private String value;
	private DataType dataType;
	private String items;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public WidgetType getType() {
		return type;
	}
	public void setType(WidgetType type) {
		this.type = type;
	}
	public OrderType getOrder() {
		return order;
	}
	public void setOrder(OrderType order) {
		this.order = order;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getCssClass() {
		return cssClass;
	}
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public DataType getDataType() {
		return dataType;
	}
	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
}
