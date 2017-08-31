package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.Map;

public class ScalePolicy extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private Long increment;

  private Long max;

  private Long min;

  public Long getIncrement() {
    return this.increment;
  }

  public void setIncrement(Long increment) {
    this.increment = increment;
  }

  public Long getMax() {
    return this.max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  public Long getMin() {
    return this.min;
  }

  public void setMin(Long min) {
    this.min = min;
  }

}
