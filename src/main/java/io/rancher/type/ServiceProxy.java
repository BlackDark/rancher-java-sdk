package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class ServiceProxy extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long port;

  private String scheme;

  private String service;

  private String token;

  private String url;

  public Long getPort() {
    return this.port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public String getScheme() {
    return this.scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public String getService() {
    return this.service;
  }

  public void setService(String service) {
    this.service = service;
  }

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
