package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class ServicesPortRange extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long endPort;

  private Long startPort;

  public Long getEndPort() {
    return this.endPort;
  }

  public void setEndPort(Long endPort) {
    this.endPort = endPort;
  }

  public Long getStartPort() {
    return this.startPort;
  }

  public void setStartPort(Long startPort) {
    this.startPort = startPort;
  }

}
