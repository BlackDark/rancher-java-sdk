package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LbConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LbConfigService {

  @GET("lbConfig")
  Call<TypeCollection<LbConfig>> list();

  @GET("lbConfig")
  Call<TypeCollection<LbConfig>> list(@QueryMap Filters<String, String> filters);

  @GET("lbConfig/{id}")
  Call<LbConfig> get(@Path("id") String id);

  @POST("lbConfig")
  Call<LbConfig> create(@Body LbConfig lbConfig);

  @PUT("lbConfig/{id}")
  Call<LbConfig> update(@Path("id") String id, @Body LbConfig lbConfig);

  @DELETE("lbConfig/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
