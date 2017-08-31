package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DockerBuild;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DockerBuildService {

  @GET("dockerBuild")
  Call<TypeCollection<DockerBuild>> list();

  @GET("dockerBuild")
  Call<TypeCollection<DockerBuild>> list(@QueryMap Filters<String, String> filters);

  @GET("dockerBuild/{id}")
  Call<DockerBuild> get(@Path("id") String id);

  @POST("dockerBuild")
  Call<DockerBuild> create(@Body DockerBuild dockerBuild);

  @PUT("dockerBuild/{id}")
  Call<DockerBuild> update(@Path("id") String id, @Body DockerBuild dockerBuild);

  @DELETE("dockerBuild/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
