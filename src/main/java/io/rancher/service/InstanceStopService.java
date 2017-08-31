package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceStop;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface InstanceStopService {

  @GET("instanceStop")
  Call<TypeCollection<InstanceStop>> list();

  @GET("instanceStop")
  Call<TypeCollection<InstanceStop>> list(@QueryMap Filters<String, String> filters);

  @GET("instanceStop/{id}")
  Call<InstanceStop> get(@Path("id") String id);

  @POST("instanceStop")
  Call<InstanceStop> create(@Body InstanceStop instanceStop);

  @PUT("instanceStop/{id}")
  Call<InstanceStop> update(@Path("id") String id, @Body InstanceStop instanceStop);

  @DELETE("instanceStop/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
