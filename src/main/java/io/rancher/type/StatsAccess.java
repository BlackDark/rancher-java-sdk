package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class StatsAccess extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private String token;

  private String url;

  public String getToken() {
    return this.token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
