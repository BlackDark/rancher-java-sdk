package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class InstanceHealthCheck extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long healthyThreshold;

  private Long initializingTimeout;

  private Long interval;

  private String name;

  private Long port;

  private RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig;

  private Long reinitializingTimeout;

  private String requestLine;

  private Long responseTimeout;

  private String strategy;

  private Long unhealthyThreshold;

  public Long getHealthyThreshold() {
    return this.healthyThreshold;
  }

  public void setHealthyThreshold(Long healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
  }

  public Long getInitializingTimeout() {
    return this.initializingTimeout;
  }

  public void setInitializingTimeout(Long initializingTimeout) {
    this.initializingTimeout = initializingTimeout;
  }

  public Long getInterval() {
    return this.interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getPort() {
    return this.port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public RecreateOnQuorumStrategyConfig getRecreateOnQuorumStrategyConfig() {
    return this.recreateOnQuorumStrategyConfig;
  }

  public void setRecreateOnQuorumStrategyConfig(RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig) {
    this.recreateOnQuorumStrategyConfig = recreateOnQuorumStrategyConfig;
  }

  public Long getReinitializingTimeout() {
    return this.reinitializingTimeout;
  }

  public void setReinitializingTimeout(Long reinitializingTimeout) {
    this.reinitializingTimeout = reinitializingTimeout;
  }

  public String getRequestLine() {
    return this.requestLine;
  }

  public void setRequestLine(String requestLine) {
    this.requestLine = requestLine;
  }

  public Long getResponseTimeout() {
    return this.responseTimeout;
  }

  public void setResponseTimeout(Long responseTimeout) {
    this.responseTimeout = responseTimeout;
  }

  public String getStrategy() {
    return this.strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public Long getUnhealthyThreshold() {
    return this.unhealthyThreshold;
  }

  public void setUnhealthyThreshold(Long unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
  }

}
