package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetPortRule;

import retrofit2.Call;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface TargetPortRuleService {

  @GET("targetPortRule")
  Call<TypeCollection<TargetPortRule>> list();

  @GET("targetPortRule")
  Call<TypeCollection<TargetPortRule>> list(@QueryMap Filters<String, String> filters);

  @GET("targetPortRule/{id}")
  Call<TargetPortRule> get(@Path("id") String id);

  @POST("targetPortRule")
  Call<TargetPortRule> create(@Body TargetPortRule targetPortRule);

  @PUT("targetPortRule/{id}")
  Call<TargetPortRule> update(@Path("id") String id, @Body TargetPortRule targetPortRule);

  @DELETE("targetPortRule/{id}")
  Call<ResponseBody> delete(@Path("id") String id);
  

  
}
