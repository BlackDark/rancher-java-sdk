package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceProxy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceProxyService {

  @GET("serviceProxy")
  Call<TypeCollection<ServiceProxy>> list();

  @GET("serviceProxy")
  Call<TypeCollection<ServiceProxy>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceProxy/{id}")
  Call<ServiceProxy> get(@Path("id") String id);

  @POST("serviceProxy")
  Call<ServiceProxy> create(@Body ServiceProxy serviceProxy);

  @PUT("serviceProxy/{id}")
  Call<ServiceProxy> update(@Path("id") String id, @Body ServiceProxy serviceProxy);

  @DELETE("serviceProxy/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
