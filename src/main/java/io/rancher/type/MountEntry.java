package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class MountEntry extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private String instanceId;

  private String instanceName;

  private String path;

  private String volumeId;

  private String volumeName;

  public String getInstanceId() {
    return this.instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public String getInstanceName() {
    return this.instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getVolumeId() {
    return this.volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  public String getVolumeName() {
    return this.volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

}
