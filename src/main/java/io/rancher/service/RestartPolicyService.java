package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RestartPolicy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RestartPolicyService {

  @GET("restartPolicy")
  Call<TypeCollection<RestartPolicy>> list();

  @GET("restartPolicy")
  Call<TypeCollection<RestartPolicy>> list(@QueryMap Filters<String, String> filters);

  @GET("restartPolicy/{id}")
  Call<RestartPolicy> get(@Path("id") String id);

  @POST("restartPolicy")
  Call<RestartPolicy> create(@Body RestartPolicy restartPolicy);

  @PUT("restartPolicy/{id}")
  Call<RestartPolicy> update(@Path("id") String id, @Body RestartPolicy restartPolicy);

  @DELETE("restartPolicy/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
