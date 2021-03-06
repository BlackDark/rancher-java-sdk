package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class SetServiceLinksInput extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private List<ServiceLink> serviceLinks;

  public List<ServiceLink> getServiceLinks() {
    return this.serviceLinks;
  }

  public void setServiceLinks(List<ServiceLink> serviceLinks) {
    this.serviceLinks = serviceLinks;
  }

}
