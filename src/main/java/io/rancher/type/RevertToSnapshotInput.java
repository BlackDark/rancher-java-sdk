package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class RevertToSnapshotInput extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private String snapshotId;

  public String getSnapshotId() {
    return this.snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

}
