package com.showdetails.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.showdetails.model.ShowDetailsRequest;
import com.showdetails.model.ShowDetailsResponse;
import com.showdetails.service.ShowDetailsRestService;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/")
@Slf4j
public class ShowDetailsRestController {
	
	@Autowired
	private ShowDetailsRestService service;


	@PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> filterJsonRequest(@RequestBody ShowDetailsRequest request) throws Exception {
		
		log.info("inside the controller-----");
		
		ShowDetailsResponse response = null;
		HttpStatus status = null;
		try {
			if(request == null || (request.getPayload() == null || request.getPayload().isEmpty())) {
				status = HttpStatus.BAD_REQUEST;
				
				response = new ShowDetailsResponse();
				response.setError("Could not decode request: Payload is Empty");
				return new ResponseEntity<>(response, status);
			}
			
			request.getPayload().stream().forEach(p->System.out.println("request---"+"----" +p.getSlug()));
			
			response = service.getFilteredShowResponse(request.getPayload());
			log.info("inside the controller-----"+response.getResponse().get(0).getImage());
			status = HttpStatus.OK;
			 
		}catch(Exception e) {
			e.printStackTrace();
			status = HttpStatus.INTERNAL_SERVER_ERROR;
			return new ResponseEntity<>(response, status);
		}
		
		return new ResponseEntity<>(response, status);
	}
	
}