package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Ulimit;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface UlimitService {

  @GET("ulimit")
  Call<TypeCollection<Ulimit>> list();

  @GET("ulimit")
  Call<TypeCollection<Ulimit>> list(@QueryMap Filters<String, String> filters);

  @GET("ulimit/{id}")
  Call<Ulimit> get(@Path("id") String id);

  @POST("ulimit")
  Call<Ulimit> create(@Body Ulimit ulimit);

  @PUT("ulimit/{id}")
  Call<Ulimit> update(@Path("id") String id, @Body Ulimit ulimit);

  @DELETE("ulimit/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
