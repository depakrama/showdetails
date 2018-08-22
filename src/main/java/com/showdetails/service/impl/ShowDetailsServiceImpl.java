package com.showdetails.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.showdetails.model.Payload;
import com.showdetails.model.Response;
import com.showdetails.model.ShowDetailsResponse;
import com.showdetails.service.ShowDetailsRestService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ShowDetailsServiceImpl implements ShowDetailsRestService{
	
	@Override
	public ShowDetailsResponse getFilteredShowResponse(List<Payload> request) throws Exception {
		
		log.info("inside the service");
		
		List<Response> responseList = new ArrayList<Response>();
		request.stream().filter(drmEpisodeCountPredicate()).forEach(
				req ->{
					Response resp = new Response();
					resp.setImage(req.getImage() != null ? StringUtils.isBlank(req.getImage().getShowImage()) ? "" : req.getImage().getShowImage() : "");
					resp.setSlug(StringUtils.isBlank(req.getSlug()) ? "" : req.getSlug());
					resp.setTitle(StringUtils.isBlank(req.getTitle()) ? "" :req.getTitle());
					responseList.add(resp);
				}
				
		);
		
		log.info("inside the service-------"+responseList.get(0).getImage());
		
		ShowDetailsResponse response = new ShowDetailsResponse();
		response.setResponse(responseList);
		return response;

	}

	private Predicate<? super Payload> drmEpisodeCountPredicate() {
		return p ->  p.getDrm() != null && p.getDrm().equals(true) && p.getEpisodeCount() != null && p.getEpisodeCount() > 0;
	}

}
