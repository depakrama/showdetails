package com.showdetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"country",
"description",
"drm",
"episodeCount",
"genre",
"image",
"language",
"nextEpisode",
"primaryColour",
"seasons",
"slug",
"title",
"tvChannel"
})
public class Payload {

@JsonProperty("country")
private String country;
@JsonProperty("description")
private String description;
@JsonProperty("drm")
private Boolean drm;
@JsonProperty("episodeCount")
private Long episodeCount;
@JsonProperty("genre")
private String genre;
@JsonProperty("image")
private Image image;
@JsonProperty("language")
private String language;
@JsonProperty("nextEpisode")
private NextEpisode nextEpisode;
@JsonProperty("primaryColour")
private String primaryColour;
@JsonProperty("seasons")
private Object seasons;
@JsonProperty("slug")
private String slug;
@JsonProperty("title")
private String title;
@JsonProperty("tvChannel")
private String tvChannel;


@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("description")
public String getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("drm")
public Boolean getDrm() {
return drm;
}

@JsonProperty("drm")
public void setDrm(Boolean drm) {
this.drm = drm;
}

@JsonProperty("episodeCount")
public Long getEpisodeCount() {
return episodeCount;
}

@JsonProperty("episodeCount")
public void setEpisodeCount(Long episodeCount) {
this.episodeCount = episodeCount;
}

@JsonProperty("genre")
public String getGenre() {
return genre;
}

@JsonProperty("genre")
public void setGenre(String genre) {
this.genre = genre;
}

@JsonProperty("image")
public Image getImage() {
return image;
}

@JsonProperty("image")
public void setImage(Image image) {
this.image = image;
}

@JsonProperty("language")
public String getLanguage() {
return language;
}

@JsonProperty("language")
public void setLanguage(String language) {
this.language = language;
}

@JsonProperty("nextEpisode")
public NextEpisode getNextEpisode() {
return nextEpisode;
}

@JsonProperty("nextEpisode")
public void setNextEpisode(NextEpisode nextEpisode) {
this.nextEpisode = nextEpisode;
}

@JsonProperty("primaryColour")
public String getPrimaryColour() {
return primaryColour;
}

@JsonProperty("primaryColour")
public void setPrimaryColour(String primaryColour) {
this.primaryColour = primaryColour;
}

@JsonProperty("seasons")
public Object getSeasons() {
return seasons;
}

@JsonProperty("seasons")
public void setSeasons(Object seasons) {
this.seasons = seasons;
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

@JsonProperty("tvChannel")
public String getTvChannel() {
return tvChannel;
}

@JsonProperty("tvChannel")
public void setTvChannel(String tvChannel) {
this.tvChannel = tvChannel;
}

}