package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class InstanceStop extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Boolean remove;

  private Long timeout;

  public Boolean getRemove() {
    return this.remove;
  }

  public void setRemove(Boolean remove) {
    this.remove = remove;
  }

  public Long getTimeout() {
    return this.timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

}
