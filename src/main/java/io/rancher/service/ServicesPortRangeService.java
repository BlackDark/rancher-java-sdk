package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServicesPortRange;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServicesPortRangeService {

  @GET("servicesPortRange")
  Call<TypeCollection<ServicesPortRange>> list();

  @GET("servicesPortRange")
  Call<TypeCollection<ServicesPortRange>> list(@QueryMap Filters<String, String> filters);

  @GET("servicesPortRange/{id}")
  Call<ServicesPortRange> get(@Path("id") String id);

  @POST("servicesPortRange")
  Call<ServicesPortRange> create(@Body ServicesPortRange servicesPortRange);

  @PUT("servicesPortRange/{id}")
  Call<ServicesPortRange> update(@Path("id") String id, @Body ServicesPortRange servicesPortRange);

  @DELETE("servicesPortRange/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
