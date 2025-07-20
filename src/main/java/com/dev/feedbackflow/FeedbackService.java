package com.dev.feedbackflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FeedbackService {

		@Autowired
		private FeedbackRepository repository;
		public void save(Feedback feedback) {
			repository.save(feedback);
		}
		
		public List<Feedback>findAll(){
			return repository.findAll();
		}
}
