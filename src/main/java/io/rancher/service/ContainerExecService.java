package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerExec;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ContainerExecService {

  @GET("containerExec")
  Call<TypeCollection<ContainerExec>> list();

  @GET("containerExec")
  Call<TypeCollection<ContainerExec>> list(@QueryMap Filters<String, String> filters);

  @GET("containerExec/{id}")
  Call<ContainerExec> get(@Path("id") String id);

  @POST("containerExec")
  Call<ContainerExec> create(@Body ContainerExec containerExec);

  @PUT("containerExec/{id}")
  Call<ContainerExec> update(@Path("id") String id, @Body ContainerExec containerExec);

  @DELETE("containerExec/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
