package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class ServiceBinding extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Map<String, Object> labels;
    
    private List<String> ports;
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public List<String> getPorts() {
        return this.ports;
    }

    public void setPorts(List<String> ports) {
      this.ports = ports;
    }
    
}
