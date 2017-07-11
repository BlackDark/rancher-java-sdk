package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class TargetPortRule extends AbstractType {

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
    
    private Integer targetPort;
    
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
    
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public void setTargetPort(Integer targetPort) {
      this.targetPort = targetPort;
    }
    
}
