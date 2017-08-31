package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class Account extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }

  public String getAuditLogsLink() {
    return this.links.get("auditLogs");
  }

  public String getBackupTargetsLink() {
    return this.links.get("backupTargets");
  }

  public String getBackupsLink() {
    return this.links.get("backups");
  }

  public String getCertificatesLink() {
    return this.links.get("certificates");
  }

  public String getContainerEventsLink() {
    return this.links.get("containerEvents");
  }

  public String getCredentialsLink() {
    return this.links.get("credentials");
  }

  public String getExternalEventsLink() {
    return this.links.get("externalEvents");
  }

  public String getHealthcheckInstanceHostMapsLink() {
    return this.links.get("healthcheckInstanceHostMaps");
  }

  public String getHostsLink() {
    return this.links.get("hosts");
  }

  public String getImagesLink() {
    return this.links.get("images");
  }

  public String getInstanceLinksLink() {
    return this.links.get("instanceLinks");
  }

  public String getInstancesLink() {
    return this.links.get("instances");
  }

  public String getIpAddressesLink() {
    return this.links.get("ipAddresses");
  }

  public String getLabelsLink() {
    return this.links.get("labels");
  }

  public String getMountsLink() {
    return this.links.get("mounts");
  }

  public String getNetworkDriversLink() {
    return this.links.get("networkDrivers");
  }

  public String getNetworksLink() {
    return this.links.get("networks");
  }

  public String getPhysicalHostsLink() {
    return this.links.get("physicalHosts");
  }

  public String getPortsLink() {
    return this.links.get("ports");
  }

  public String getProjectMembersLink() {
    return this.links.get("projectMembers");
  }

  public String getProjectTemplatesLink() {
    return this.links.get("projectTemplates");
  }

  public String getServiceConsumeMapsLink() {
    return this.links.get("serviceConsumeMaps");
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

  public String getSnapshotsLink() {
    return this.links.get("snapshots");
  }

  public String getStacksLink() {
    return this.links.get("stacks");
  }

  public String getStorageDriversLink() {
    return this.links.get("storageDrivers");
  }

  public String getStoragePoolsLink() {
    return this.links.get("storagePools");
  }

  public String getSubnetsLink() {
    return this.links.get("subnets");
  }

  public String getVolumeTemplatesLink() {
    return this.links.get("volumeTemplates");
  }

  public String getVolumesLink() {
    return this.links.get("volumes");
  }


  private String created;

  private String description;

  private String kind;

  private String name;

  private String removed;

  private String state;

  private String transitioning;

  private String transitioningMessage;

  private Long transitioningProgress;

  private String uuid;

  private String version;

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

  public String getVersion() {
    return this.version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

}
