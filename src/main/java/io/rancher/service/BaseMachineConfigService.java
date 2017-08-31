package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BaseMachineConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BaseMachineConfigService {

  @GET("baseMachineConfig")
  Call<TypeCollection<BaseMachineConfig>> list();

  @GET("baseMachineConfig")
  Call<TypeCollection<BaseMachineConfig>> list(@QueryMap Filters<String, String> filters);

  @GET("baseMachineConfig/{id}")
  Call<BaseMachineConfig> get(@Path("id") String id);

  @POST("baseMachineConfig")
  Call<BaseMachineConfig> create(@Body BaseMachineConfig baseMachineConfig);

  @PUT("baseMachineConfig/{id}")
  Call<BaseMachineConfig> update(@Path("id") String id, @Body BaseMachineConfig baseMachineConfig);

  @DELETE("baseMachineConfig/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
