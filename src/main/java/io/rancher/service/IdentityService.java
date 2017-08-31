package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Identity;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface IdentityService {

  @GET("identity")
  Call<TypeCollection<Identity>> list();

  @GET("identity")
  Call<TypeCollection<Identity>> list(@QueryMap Filters<String, String> filters);

  @GET("identity/{id}")
  Call<Identity> get(@Path("id") String id);

  @POST("identity")
  Call<Identity> create(@Body Identity identity);

  @PUT("identity/{id}")
  Call<Identity> update(@Path("id") String id, @Body Identity identity);

  @DELETE("identity/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
