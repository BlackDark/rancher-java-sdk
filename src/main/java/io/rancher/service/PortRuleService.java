package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PortRule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PortRuleService {

  @GET("portRule")
  Call<TypeCollection<PortRule>> list();

  @GET("portRule")
  Call<TypeCollection<PortRule>> list(@QueryMap Filters<String, String> filters);

  @GET("portRule/{id}")
  Call<PortRule> get(@Path("id") String id);

  @POST("portRule")
  Call<PortRule> create(@Body PortRule portRule);

  @PUT("portRule/{id}")
  Call<PortRule> update(@Path("id") String id, @Body PortRule portRule);

  @DELETE("portRule/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
