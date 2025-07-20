package com.dev.feedbackflow;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class FeedbackController {

		@Autowired
		private FeedbackService service;
		
		@PostMapping("/submit-feedback")
		public void handleSubmit(HttpServletRequest request, HttpServletResponse response)throws IOException {
			Feedback fb = new Feedback();
			fb.setName(request.getParameter("name"));
			fb.setEmail(request.getParameter("email"));
			
		fb.setComments(request.getParameter("comments"));
		
				service.save(fb);
				response.sendRedirect("/list.html");//static HTML page
		}
		
		@GetMapping("/feedback-data")
		@ResponseBody
		public List<Feedback>showData(){
			return service.findAll();
		}
}
