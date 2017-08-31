package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class Instance extends AbstractType {

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

  public String getCredentialsLink() {
    return this.links.get("credentials");
  }

  public String getHealthcheckInstanceHostMapsLink() {
    return this.links.get("healthcheckInstanceHostMaps");
  }

  public String getHostsLink() {
    return this.links.get("hosts");
  }

  public String getInstanceLinksLink() {
    return this.links.get("instanceLinks");
  }

  public String getInstancesLink() {
    return this.links.get("instances");
  }

  public String getMountsLink() {
    return this.links.get("mounts");
  }

  public String getPortsLink() {
    return this.links.get("ports");
  }

  public String getServiceEventsLink() {
    return this.links.get("serviceEvents");
  }

  public String getServiceExposeMapsLink() {
    return this.links.get("serviceExposeMaps");
  }

  public String getServiceLogsLink() {
    return this.links.get("serviceLogs");
  }

  public String getServicesLink() {
    return this.links.get("services");
  }

  public String getVolumesLink() {
    return this.links.get("volumes");
  }


  private String accountId;

  private String created;

  private String description;

  private String externalId;

  private String hostId;

  private String kind;

  private String name;

  private String removed;

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

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public String getHostId() {
    return this.hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
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

  public String getRemoved() {
    return this.removed;
  }

  public void setRemoved(String removed) {
    this.removed = removed;
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
