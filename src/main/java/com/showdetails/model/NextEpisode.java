package com.showdetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"channel",
"channelLogo",
"date",
"html",
"url"
})
public class NextEpisode {

@JsonProperty("channel")
private Object channel;
@JsonProperty("channelLogo")
private String channelLogo;
@JsonProperty("date")
private Object date;
@JsonProperty("html")
private String html;
@JsonProperty("url")
private String url;

@JsonProperty("channel")
public Object getChannel() {
return channel;
}

@JsonProperty("channel")
public void setChannel(Object channel) {
this.channel = channel;
}

@JsonProperty("channelLogo")
public String getChannelLogo() {
return channelLogo;
}

@JsonProperty("channelLogo")
public void setChannelLogo(String channelLogo) {
this.channelLogo = channelLogo;
}

@JsonProperty("date")
public Object getDate() {
return date;
}

@JsonProperty("date")
public void setDate(Object date) {
this.date = date;
}

@JsonProperty("html")
public String getHtml() {
return html;
}

@JsonProperty("html")
public void setHtml(String html) {
this.html = html;
}

@JsonProperty("url")
public String getUrl() {
return url;
}

@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
}


}