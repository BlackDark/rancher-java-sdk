package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class LbTargetConfig extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private List<TargetPortRule> portRules;

  public List<TargetPortRule> getPortRules() {
    return this.portRules;
  }

  public void setPortRules(List<TargetPortRule> portRules) {
    this.portRules = portRules;
  }

}
