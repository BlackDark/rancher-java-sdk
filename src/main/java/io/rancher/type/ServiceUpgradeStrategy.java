package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class ServiceUpgradeStrategy extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long batchSize;

  private Long intervalMillis;

  public Long getBatchSize() {
    return this.batchSize;
  }

  public void setBatchSize(Long batchSize) {
    this.batchSize = batchSize;
  }

  public Long getIntervalMillis() {
    return this.intervalMillis;
  }

  public void setIntervalMillis(Long intervalMillis) {
    this.intervalMillis = intervalMillis;
  }

}
