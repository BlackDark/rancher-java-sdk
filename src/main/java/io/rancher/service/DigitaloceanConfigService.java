package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DigitaloceanConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DigitaloceanConfigService {

  @GET("digitaloceanConfig")
  Call<TypeCollection<DigitaloceanConfig>> list();

  @GET("digitaloceanConfig")
  Call<TypeCollection<DigitaloceanConfig>> list(@QueryMap Filters<String, String> filters);

  @GET("digitaloceanConfig/{id}")
  Call<DigitaloceanConfig> get(@Path("id") String id);

  @POST("digitaloceanConfig")
  Call<DigitaloceanConfig> create(@Body DigitaloceanConfig digitaloceanConfig);

  @PUT("digitaloceanConfig/{id}")
  Call<DigitaloceanConfig> update(@Path("id") String id, @Body DigitaloceanConfig digitaloceanConfig);

  @DELETE("digitaloceanConfig/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
