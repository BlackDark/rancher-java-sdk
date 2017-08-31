package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceRestart;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceRestartService {

  @GET("serviceRestart")
  Call<TypeCollection<ServiceRestart>> list();

  @GET("serviceRestart")
  Call<TypeCollection<ServiceRestart>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceRestart/{id}")
  Call<ServiceRestart> get(@Path("id") String id);

  @POST("serviceRestart")
  Call<ServiceRestart> create(@Body ServiceRestart serviceRestart);

  @PUT("serviceRestart/{id}")
  Call<ServiceRestart> update(@Path("id") String id, @Body ServiceRestart serviceRestart);

  @DELETE("serviceRestart/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
