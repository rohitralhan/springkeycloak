package com.rh.springkeycloak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rh.springkeycloak.domain.Topic;
import com.rh.springkeycloak.services.TopicsService;

@RestController
public class TopicsController {

	@Autowired
	private TopicsService topicService;
	
	@GetMapping("/topics")
	public List<Topic> all_topics(){
		return topicService.getAllTopicList();
	}
	
}
