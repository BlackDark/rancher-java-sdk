package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Project;
import io.rancher.type.ProjectMember;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProjectMemberService {

  @GET("projectMember")
  Call<TypeCollection<ProjectMember>> list();

  @GET("projectMember")
  Call<TypeCollection<ProjectMember>> list(@QueryMap Filters<String, String> filters);

  @GET("projectMember/{id}")
  Call<ProjectMember> get(@Path("id") String id);

  @POST("projectMember")
  Call<ProjectMember> create(@Body ProjectMember projectMember);

  @PUT("projectMember/{id}")
  Call<ProjectMember> update(@Path("id") String id, @Body ProjectMember projectMember);

  @DELETE("projectMember/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("projectMember/{id}?action=activate")
  Call<ProjectMember> activate(@Path("id") String id);

  @POST("projectMember/{id}?action=deactivate")
  Call<ProjectMember> deactivate(@Path("id") String id);

  @POST("projectMember/{id}?action=purge")
  Call<ProjectMember> purge(@Path("id") String id);

  @POST("projectMember/{id}?action=remove")
  Call<ProjectMember> remove(@Path("id") String id);

  @POST("projectMember/{id}?action=restore")
  Call<ProjectMember> restore(@Path("id") String id);


  @GET
  Call<Project> getLinkProject(@Url String url);

}
