package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class PublicEndpoint extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private String hostId;

  private String instanceId;

  private String ipAddress;

  private Long port;

  private String serviceId;

  public String getHostId() {
    return this.hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

  public String getInstanceId() {
    return this.instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public String getIpAddress() {
    return this.ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Long getPort() {
    return this.port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public String getServiceId() {
    return this.serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

}
