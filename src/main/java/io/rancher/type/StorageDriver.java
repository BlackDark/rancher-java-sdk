package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class StorageDriver extends AbstractType {

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

  public String getServiceLink() {
    return this.links.get("service");
  }

  public String getStoragePoolsLink() {
    return this.links.get("storagePools");
  }

  public String getVolumesLink() {
    return this.links.get("volumes");
  }


  private String accountId;

  private String blockDevicePath;

  private String created;

  private String description;

  private String kind;

  private String name;

  private String removed;

  private String scope;

  private String serviceId;

  private String state;

  private String transitioning;

  private String transitioningMessage;

  private Long transitioningProgress;

  private String uuid;

  private String volumeAccessMode;

  private List<String> volumeCapabilities;

  public String getAccountId() {
    return this.accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getBlockDevicePath() {
    return this.blockDevicePath;
  }

  public void setBlockDevicePath(String blockDevicePath) {
    this.blockDevicePath = blockDevicePath;
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

  public String getScope() {
    return this.scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public String getServiceId() {
    return this.serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
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

  public String getVolumeAccessMode() {
    return this.volumeAccessMode;
  }

  public void setVolumeAccessMode(String volumeAccessMode) {
    this.volumeAccessMode = volumeAccessMode;
  }

  public List<String> getVolumeCapabilities() {
    return this.volumeCapabilities;
  }

  public void setVolumeCapabilities(List<String> volumeCapabilities) {
    this.volumeCapabilities = volumeCapabilities;
  }

}
