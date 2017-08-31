package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class RestartPolicy extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long maximumRetryCount;

  private String name;

  public Long getMaximumRetryCount() {
    return this.maximumRetryCount;
  }

  public void setMaximumRetryCount(Long maximumRetryCount) {
    this.maximumRetryCount = maximumRetryCount;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
