package com.rh.springkeycloak.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rh.springkeycloak.domain.Topic;

@Service
public class TopicsService {

    private List<Topic> topicList = new ArrayList<>(Arrays.asList(

            new Topic("_spring", "_Spring FrameWork", "_Spring Description"),
            new Topic("spring", "Spring FrameWork", "Spring Description"),
            new Topic("java", "Java FrameWork", "Java Description")

    ));

	public List<Topic> getAllTopicList() {
		// TODO Auto-generated method stub
		return topicList;
	}
}