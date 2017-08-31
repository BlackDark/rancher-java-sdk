package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class ToServiceUpgradeStrategy extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long batchSize;

  private Long finalScale;

  private Long intervalMillis;

  private String toServiceId;

  private Boolean updateLinks;

  public Long getBatchSize() {
    return this.batchSize;
  }

  public void setBatchSize(Long batchSize) {
    this.batchSize = batchSize;
  }

  public Long getFinalScale() {
    return this.finalScale;
  }

  public void setFinalScale(Long finalScale) {
    this.finalScale = finalScale;
  }

  public Long getIntervalMillis() {
    return this.intervalMillis;
  }

  public void setIntervalMillis(Long intervalMillis) {
    this.intervalMillis = intervalMillis;
  }

  public String getToServiceId() {
    return this.toServiceId;
  }

  public void setToServiceId(String toServiceId) {
    this.toServiceId = toServiceId;
  }

  public Boolean getUpdateLinks() {
    return this.updateLinks;
  }

  public void setUpdateLinks(Boolean updateLinks) {
    this.updateLinks = updateLinks;
  }

}
