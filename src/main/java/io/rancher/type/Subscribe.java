package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Subscribe extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private List<String> eventNames;

  public List<String> getEventNames() {
    return this.eventNames;
  }

  public void setEventNames(List<String> eventNames) {
    this.eventNames = eventNames;
  }

}
