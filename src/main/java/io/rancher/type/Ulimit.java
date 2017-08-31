package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class Ulimit extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long hard;

  private String name;

  private Long soft;

  public Long getHard() {
    return this.hard;
  }

  public void setHard(Long hard) {
    this.hard = hard;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getSoft() {
    return this.soft;
  }

  public void setSoft(Long soft) {
    this.soft = soft;
  }

}
