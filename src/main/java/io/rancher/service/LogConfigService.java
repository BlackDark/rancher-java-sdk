package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LogConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LogConfigService {

  @GET("logConfig")
  Call<TypeCollection<LogConfig>> list();

  @GET("logConfig")
  Call<TypeCollection<LogConfig>> list(@QueryMap Filters<String, String> filters);

  @GET("logConfig/{id}")
  Call<LogConfig> get(@Path("id") String id);

  @POST("logConfig")
  Call<LogConfig> create(@Body LogConfig logConfig);

  @PUT("logConfig/{id}")
  Call<LogConfig> update(@Path("id") String id, @Body LogConfig logConfig);

  @DELETE("logConfig/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
