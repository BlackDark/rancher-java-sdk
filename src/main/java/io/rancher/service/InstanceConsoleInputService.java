package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceConsoleInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface InstanceConsoleInputService {

  @GET("instanceConsoleInput")
  Call<TypeCollection<InstanceConsoleInput>> list();

  @GET("instanceConsoleInput")
  Call<TypeCollection<InstanceConsoleInput>> list(@QueryMap Filters<String, String> filters);

  @GET("instanceConsoleInput/{id}")
  Call<InstanceConsoleInput> get(@Path("id") String id);

  @POST("instanceConsoleInput")
  Call<InstanceConsoleInput> create(@Body InstanceConsoleInput instanceConsoleInput);

  @PUT("instanceConsoleInput/{id}")
  Call<InstanceConsoleInput> update(@Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput);

  @DELETE("instanceConsoleInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
