package io.rancher.type;

import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class SetProjectMembersInput extends AbstractType {

  private Map<String, String> links;

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  private List<ProjectMember> members;

  public List<ProjectMember> getMembers() {
    return this.members;
  }

  public void setMembers(List<ProjectMember> members) {
    this.members = members;
  }

}
