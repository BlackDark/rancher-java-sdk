package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class VolumeTemplate extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }

  public String getAccountLink() {
    return this.links.get("account");
  }

  public String getStackLink() {
    return this.links.get("stack");
  }

  public String getVolumesLink() {
    return this.links.get("volumes");
  }


  private String accountId;

  private String created;

  private String description;

  private String driver;

  private Map<String, Object> driverOpts;

  private Boolean external;

  private String kind;

  private String name;

  private Boolean perContainer;

  private String removed;

  private String stackId;

  private String state;

  private String transitioning;

  private String transitioningMessage;

  private Long transitioningProgress;

  private String uuid;

  public String getAccountId() {
    return this.accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDriver() {
    return this.driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public Map<String, Object> getDriverOpts() {
    return this.driverOpts;
  }

  public void setDriverOpts(Map<String, Object> driverOpts) {
    this.driverOpts = driverOpts;
  }

  public Boolean getExternal() {
    return this.external;
  }

  public void setExternal(Boolean external) {
    this.external = external;
  }

  public String getKind() {
    return this.kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getPerContainer() {
    return this.perContainer;
  }

  public void setPerContainer(Boolean perContainer) {
    this.perContainer = perContainer;
  }

  public String getRemoved() {
    return this.removed;
  }

  public void setRemoved(String removed) {
    this.removed = removed;
  }

  public String getStackId() {
    return this.stackId;
  }

  public void setStackId(String stackId) {
    this.stackId = stackId;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getTransitioning() {
    return this.transitioning;
  }

  public void setTransitioning(String transitioning) {
    this.transitioning = transitioning;
  }

  public String getTransitioningMessage() {
    return this.transitioningMessage;
  }

  public void setTransitioningMessage(String transitioningMessage) {
    this.transitioningMessage = transitioningMessage;
  }

  public Long getTransitioningProgress() {
    return this.transitioningProgress;
  }

  public void setTransitioningProgress(Long transitioningProgress) {
    this.transitioningProgress = transitioningProgress;
  }

  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

}
