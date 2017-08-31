package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class RecreateOnQuorumStrategyConfig extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long quorum;

  public Long getQuorum() {
    return this.quorum;
  }

  public void setQuorum(Long quorum) {
    this.quorum = quorum;
  }

}
