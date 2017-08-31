package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class VolumeActivateInput extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private String hostId;

  public String getHostId() {
    return this.hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

}
