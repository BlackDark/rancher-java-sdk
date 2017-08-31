package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ScalePolicy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ScalePolicyService {

  @GET("scalePolicy")
  Call<TypeCollection<ScalePolicy>> list();

  @GET("scalePolicy")
  Call<TypeCollection<ScalePolicy>> list(@QueryMap Filters<String, String> filters);

  @GET("scalePolicy/{id}")
  Call<ScalePolicy> get(@Path("id") String id);

  @POST("scalePolicy")
  Call<ScalePolicy> create(@Body ScalePolicy scalePolicy);

  @PUT("scalePolicy/{id}")
  Call<ScalePolicy> update(@Path("id") String id, @Body ScalePolicy scalePolicy);

  @DELETE("scalePolicy/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
