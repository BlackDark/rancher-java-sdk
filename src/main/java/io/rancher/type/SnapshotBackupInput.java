package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class SnapshotBackupInput extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }

  public String getBackupTargetLink() {
    return this.links.get("backupTarget");
  }


  private String backupTargetId;

  private String name;

  public String getBackupTargetId() {
    return this.backupTargetId;
  }

  public void setBackupTargetId(String backupTargetId) {
    this.backupTargetId = backupTargetId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
