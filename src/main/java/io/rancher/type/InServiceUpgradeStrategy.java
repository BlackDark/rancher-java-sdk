package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class InServiceUpgradeStrategy extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long batchSize;

  private Long intervalMillis;

  private LaunchConfig launchConfig;

  private LaunchConfig previousLaunchConfig;

  private List<SecondaryLaunchConfig> previousSecondaryLaunchConfigs;

  private List<SecondaryLaunchConfig> secondaryLaunchConfigs;

  private Boolean startFirst;

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

  public LaunchConfig getLaunchConfig() {
    return this.launchConfig;
  }

  public void setLaunchConfig(LaunchConfig launchConfig) {
    this.launchConfig = launchConfig;
  }

  public LaunchConfig getPreviousLaunchConfig() {
    return this.previousLaunchConfig;
  }

  public void setPreviousLaunchConfig(LaunchConfig previousLaunchConfig) {
    this.previousLaunchConfig = previousLaunchConfig;
  }

  public List<SecondaryLaunchConfig> getPreviousSecondaryLaunchConfigs() {
    return this.previousSecondaryLaunchConfigs;
  }

  public void setPreviousSecondaryLaunchConfigs(List<SecondaryLaunchConfig> previousSecondaryLaunchConfigs) {
    this.previousSecondaryLaunchConfigs = previousSecondaryLaunchConfigs;
  }

  public List<SecondaryLaunchConfig> getSecondaryLaunchConfigs() {
    return this.secondaryLaunchConfigs;
  }

  public void setSecondaryLaunchConfigs(List<SecondaryLaunchConfig> secondaryLaunchConfigs) {
    this.secondaryLaunchConfigs = secondaryLaunchConfigs;
  }

  public Boolean getStartFirst() {
    return this.startFirst;
  }

  public void setStartFirst(Boolean startFirst) {
    this.startFirst = startFirst;
  }

}
