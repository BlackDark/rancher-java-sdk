package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceConsole;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface InstanceConsoleService {

  @GET("instanceConsole")
  Call<TypeCollection<InstanceConsole>> list();

  @GET("instanceConsole")
  Call<TypeCollection<InstanceConsole>> list(@QueryMap Filters<String, String> filters);

  @GET("instanceConsole/{id}")
  Call<InstanceConsole> get(@Path("id") String id);

  @POST("instanceConsole")
  Call<InstanceConsole> create(@Body InstanceConsole instanceConsole);

  @PUT("instanceConsole/{id}")
  Call<InstanceConsole> update(@Path("id") String id, @Body InstanceConsole instanceConsole);

  @DELETE("instanceConsole/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
