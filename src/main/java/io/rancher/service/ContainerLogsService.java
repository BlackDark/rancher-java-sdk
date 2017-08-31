package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerLogs;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ContainerLogsService {

  @GET("containerLogs")
  Call<TypeCollection<ContainerLogs>> list();

  @GET("containerLogs")
  Call<TypeCollection<ContainerLogs>> list(@QueryMap Filters<String, String> filters);

  @GET("containerLogs/{id}")
  Call<ContainerLogs> get(@Path("id") String id);

  @POST("containerLogs")
  Call<ContainerLogs> create(@Body ContainerLogs containerLogs);

  @PUT("containerLogs/{id}")
  Call<ContainerLogs> update(@Path("id") String id, @Body ContainerLogs containerLogs);

  @DELETE("containerLogs/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
