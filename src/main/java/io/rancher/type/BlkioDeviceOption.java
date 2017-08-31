package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class BlkioDeviceOption extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long readBps;

  private Long readIops;

  private Long weight;

  private Long writeBps;

  private Long writeIops;

  public Long getReadBps() {
    return this.readBps;
  }

  public void setReadBps(Long readBps) {
    this.readBps = readBps;
  }

  public Long getReadIops() {
    return this.readIops;
  }

  public void setReadIops(Long readIops) {
    this.readIops = readIops;
  }

  public Long getWeight() {
    return this.weight;
  }

  public void setWeight(Long weight) {
    this.weight = weight;
  }

  public Long getWriteBps() {
    return this.writeBps;
  }

  public void setWriteBps(Long writeBps) {
    this.writeBps = writeBps;
  }

  public Long getWriteIops() {
    return this.writeIops;
  }

  public void setWriteIops(Long writeIops) {
    this.writeIops = writeIops;
  }

}
