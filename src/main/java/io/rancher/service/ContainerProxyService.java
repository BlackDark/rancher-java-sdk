package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerProxy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ContainerProxyService {

  @GET("containerProxy")
  Call<TypeCollection<ContainerProxy>> list();

  @GET("containerProxy")
  Call<TypeCollection<ContainerProxy>> list(@QueryMap Filters<String, String> filters);

  @GET("containerProxy/{id}")
  Call<ContainerProxy> get(@Path("id") String id);

  @POST("containerProxy")
  Call<ContainerProxy> create(@Body ContainerProxy containerProxy);

  @PUT("containerProxy/{id}")
  Call<ContainerProxy> update(@Path("id") String id, @Body ContainerProxy containerProxy);

  @DELETE("containerProxy/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
