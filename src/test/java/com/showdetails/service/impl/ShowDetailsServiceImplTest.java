package com.showdetails.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.showdetails.main.ShowDetailsRestApplication;
import com.showdetails.model.Image;
import com.showdetails.model.Payload;
import com.showdetails.model.ShowDetailsResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShowDetailsRestApplication.class)
public class ShowDetailsServiceImplTest {
	
	@Autowired
	private ShowDetailsServiceImpl showDetailsRestServiceImpl;
	
	List<Payload> requestList = new ArrayList<Payload>();
	
	 @Before
	  public void setUp() throws Exception {
		 
		 Payload payload = new Payload();
			Image img = new Image();
			img.setShowImage("sample image");
			payload.setImage(img);
			payload.setDrm(true);
			payload.setEpisodeCount(1l);
			payload.setSlug("sample slug");
			payload.setTitle("sample title");
			requestList.add(payload);
			
			Payload drmFalsePayload = new Payload();
			Image imgDrmFalseImg = new Image();
			imgDrmFalseImg.setShowImage("drm_false_image");
			drmFalsePayload.setImage(imgDrmFalseImg);
			drmFalsePayload.setDrm(false);
			drmFalsePayload.setEpisodeCount(1l);
			drmFalsePayload.setSlug("drm_false_slug");
			drmFalsePayload.setTitle("drm_false_title");
			requestList.add(drmFalsePayload);
			
			Payload episodeCountZeroPayload = new Payload();
			Image img2 = new Image();
			img2.setShowImage("zero_episode_count_image");
			episodeCountZeroPayload.setImage(img2);
			episodeCountZeroPayload.setDrm(true);
			episodeCountZeroPayload.setEpisodeCount(0l);
			episodeCountZeroPayload.setSlug("zero_episode_count_slug");
			episodeCountZeroPayload.setTitle("zero_episode_count_title");
			requestList.add(episodeCountZeroPayload);
			
	}
	
	@Test
	public void testGetFilteredShowResponse() {
		
		try {
			ShowDetailsResponse response  = showDetailsRestServiceImpl.getFilteredShowResponse(requestList);
			//assert to check whether service filters the request based on condition
			Assert.assertEquals("Response List contains one resposne object",1, response.getResponse().size());
			//assert to check if response contains the expected result
			Assert.assertEquals("Response List contains correct image","sample image", response.getResponse().get(0).getImage());
			Assert.assertEquals("Response List contains correct slug","sample slug", response.getResponse().get(0).getSlug());
			Assert.assertEquals("Response List contains correct title","sample title", response.getResponse().get(0).getTitle());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testGetFilteredShowResponseForDrmFalse() {
		
		try {
			ShowDetailsResponse response  = showDetailsRestServiceImpl.getFilteredShowResponse(requestList);
			
			//assert to make sure the response does not contain if drm is false
			Assert.assertNotEquals("Response List contains correct image","drm_false_image", response.getResponse().get(0).getImage());
			Assert.assertNotEquals("Response List contains correct slug","drm_false_slug", response.getResponse().get(0).getSlug());
			Assert.assertNotEquals("Response List contains correct title","drm_false_title", response.getResponse().get(0).getTitle());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetFilteredShowResponseForZeroEpisodeCount() {
		
		try {
			ShowDetailsResponse response  = showDetailsRestServiceImpl.getFilteredShowResponse(requestList);
			
			//assert to make sure the response does not contain if episode count is 0
			Assert.assertNotEquals("Response List contains correct image","zero_episode_count_image", response.getResponse().get(0).getImage());
			Assert.assertNotEquals("Response List contains correct slug","zero_episode_count_slug", response.getResponse().get(0).getSlug());
			Assert.assertNotEquals("Response List contains correct title","zero_episode_count_title", response.getResponse().get(0).getTitle());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
