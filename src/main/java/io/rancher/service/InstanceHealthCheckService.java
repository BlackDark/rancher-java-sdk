package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceHealthCheck;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface InstanceHealthCheckService {

  @GET("instanceHealthCheck")
  Call<TypeCollection<InstanceHealthCheck>> list();

  @GET("instanceHealthCheck")
  Call<TypeCollection<InstanceHealthCheck>> list(@QueryMap Filters<String, String> filters);

  @GET("instanceHealthCheck/{id}")
  Call<InstanceHealthCheck> get(@Path("id") String id);

  @POST("instanceHealthCheck")
  Call<InstanceHealthCheck> create(@Body InstanceHealthCheck instanceHealthCheck);

  @PUT("instanceHealthCheck/{id}")
  Call<InstanceHealthCheck> update(@Path("id") String id, @Body InstanceHealthCheck instanceHealthCheck);

  @DELETE("instanceHealthCheck/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
