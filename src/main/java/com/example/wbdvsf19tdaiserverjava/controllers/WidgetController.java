package com.example.wbdvsf19tdaiserverjava.controllers;

import com.example.wbdvsf19tdaiserverjava.models.Widget;
import com.example.wbdvsf19tdaiserverjava.models.WidgetType;
import com.example.wbdvsf19tdaiserverjava.service.WidgetService;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
public class WidgetController {
	WidgetService widgetService = new WidgetService();
    
    @PostMapping("/api/widgets")
    public List<Widget> createWidget(@RequestBody Widget widget) {
        return widgetService.createWidget(widget);
    }
    
    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return widgetService.findAllWidgets();
    }
    
    @GetMapping("/api/widgets/{widgetId}")
    public Widget findWidgetById(@PathVariable("widgetId") String wid) {
        return widgetService.findWidgetById(wid);
    }
    
    @PutMapping("/api/widgets/{widgetId}")
    public Widget updateWidget(
            @PathVariable("widgetId") String wid,
            @RequestBody Widget widget) {
        return widgetService.updateWidget(wid, widget);
    }
    
    @DeleteMapping("/api/widgets/{widgetId}")
    public void deleteWidget(@PathVariable("widgetId") String wid) {
    	widgetService.deleteWidget(wid);
    }
    
}