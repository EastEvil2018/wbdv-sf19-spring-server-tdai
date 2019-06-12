package com.example.wbdvsf19tdaiserverjava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.wbdvsf19tdaiserverjava.models.Widget;
import com.example.wbdvsf19tdaiserverjava.models.WidgetType;

public class WidgetService {
    static List<Widget> widgets = new ArrayList<Widget>();
    
    static {
    	Widget heading = new Widget("123");
    	heading.setName("Widget 1");
    	heading.setType(WidgetType.Heading);
    	Widget para = new Widget("234");
    	para.setName("Widget 2");
    	para.setType(WidgetType.Paragraph);
    	Widget img = new Widget("345");
    	img.setName("Widget 3");
    	img.setType(WidgetType.Image);  
    	Widget list = new Widget("456");
    	list.setName("Widget 4");
    	list.setType(WidgetType.List);
        widgets.add(heading);
        widgets.add(para);
        widgets.add(img);
        widgets.add(list);
    }
    
    public List<Widget> createWidget(Widget widget) {
        widgets.add(widget);
        return widgets;
    }
    
    public List<Widget> findAllWidgets() {
        return widgets;
    }
    
    public Widget findWidgetById(String wid) {
        for(Widget w: widgets) {
            if(w.getId().equals(wid))
                return w;
        }
        return null;
    }
    
    public Widget updateWidget(String wid,
    						   Widget widget) {
		Widget target = null;
		for (Widget w : widgets) {
			if (w.getId().equals(wid)) {
				target = w;
				break;
			}
		}
		widgets.remove(target);
		widgets.add(widget);
        return widget;
    }
    
    public List<Widget> deleteWidget(String wid) {
    	widgets = widgets
    			.stream()
    			.filter(widget -> !widget.getId().equals(wid))
    			.collect(Collectors.toList());
    	return widgets;
    }    
}
