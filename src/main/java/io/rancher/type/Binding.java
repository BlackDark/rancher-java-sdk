package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.Map;

public class Binding extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Map<String, Object> services;
    
    public Map<String, Object> getServices() {
        return this.services;
    }

    public void setServices(Map<String, Object> services) {
      this.services = services;
    }
    
}
