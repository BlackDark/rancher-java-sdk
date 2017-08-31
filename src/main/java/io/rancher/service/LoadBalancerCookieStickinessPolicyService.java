package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoadBalancerCookieStickinessPolicy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LoadBalancerCookieStickinessPolicyService {

  @GET("loadBalancerCookieStickinessPolicy")
  Call<TypeCollection<LoadBalancerCookieStickinessPolicy>> list();

  @GET("loadBalancerCookieStickinessPolicy")
  Call<TypeCollection<LoadBalancerCookieStickinessPolicy>> list(@QueryMap Filters<String, String> filters);

  @GET("loadBalancerCookieStickinessPolicy/{id}")
  Call<LoadBalancerCookieStickinessPolicy> get(@Path("id") String id);

  @POST("loadBalancerCookieStickinessPolicy")
  Call<LoadBalancerCookieStickinessPolicy> create(@Body LoadBalancerCookieStickinessPolicy loadBalancerCookieStickinessPolicy);

  @PUT("loadBalancerCookieStickinessPolicy/{id}")
  Call<LoadBalancerCookieStickinessPolicy> update(@Path("id") String id, @Body LoadBalancerCookieStickinessPolicy loadBalancerCookieStickinessPolicy);

  @DELETE("loadBalancerCookieStickinessPolicy/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
