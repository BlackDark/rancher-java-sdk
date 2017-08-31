package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class PortRule extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private String backendName;

  private String hostname;

  private String path;

  private Long priority;

  private String protocol;

  private String selector;

  private String serviceId;

  private Long sourcePort;

  private Long targetPort;

  public String getBackendName() {
    return this.backendName;
  }

  public void setBackendName(String backendName) {
    this.backendName = backendName;
  }

  public String getHostname() {
    return this.hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Long getPriority() {
    return this.priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public String getProtocol() {
    return this.protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public String getSelector() {
    return this.selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }

  public String getServiceId() {
    return this.serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public Long getSourcePort() {
    return this.sourcePort;
  }

  public void setSourcePort(Long sourcePort) {
    this.sourcePort = sourcePort;
  }

  public Long getTargetPort() {
    return this.targetPort;
  }

  public void setTargetPort(Long targetPort) {
    this.targetPort = targetPort;
  }

}
