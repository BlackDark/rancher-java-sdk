package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class ContainerLogs extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Boolean follow;

  private Long lines;

  public Boolean getFollow() {
    return this.follow;
  }

  public void setFollow(Boolean follow) {
    this.follow = follow;
  }

  public Long getLines() {
    return this.lines;
  }

  public void setLines(Long lines) {
    this.lines = lines;
  }

}
