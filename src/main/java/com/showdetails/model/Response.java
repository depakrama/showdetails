package com.showdetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"image",
"slug",
"title"
})
public class Response {

@JsonProperty("image")
private String image;
@JsonProperty("slug")
private String slug;
@JsonProperty("title")
private String title;

@JsonProperty("image")
public String getImage() {
return image;
}

@JsonProperty("image")
public void setImage(String image) {
this.image = image;
}

@JsonProperty("slug")
public String getSlug() {
return slug;
}

@JsonProperty("slug")
public void setSlug(String slug) {
this.slug = slug;
}

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

}
