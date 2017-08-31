package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class ContainerProxy extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long port;

  private String scheme;

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

}
