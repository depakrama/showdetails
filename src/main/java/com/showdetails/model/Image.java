package com.showdetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"showImage"
})
public class Image {

@JsonProperty("showImage")
private String showImage;

@JsonProperty("showImage")
public String getShowImage() {
return showImage;
}

@JsonProperty("showImage")
public void setShowImage(String showImage) {
this.showImage = showImage;
}


}
