package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class ServiceRestart extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private RollingRestartStrategy rollingRestartStrategy;

  public RollingRestartStrategy getRollingRestartStrategy() {
    return this.rollingRestartStrategy;
  }

  public void setRollingRestartStrategy(RollingRestartStrategy rollingRestartStrategy) {
    this.rollingRestartStrategy = rollingRestartStrategy;
  }

}
