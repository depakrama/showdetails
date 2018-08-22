package com.showdetails.service;

import java.util.List;

import com.showdetails.model.Payload;
import com.showdetails.model.ShowDetailsResponse;

public interface ShowDetailsRestService {
	
	public ShowDetailsResponse getFilteredShowResponse(List<Payload> request) throws  Exception;
	
}
