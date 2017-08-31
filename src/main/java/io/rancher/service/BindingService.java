package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Binding;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BindingService {

  @GET("binding")
  Call<TypeCollection<Binding>> list();

  @GET("binding")
  Call<TypeCollection<Binding>> list(@QueryMap Filters<String, String> filters);

  @GET("binding/{id}")
  Call<Binding> get(@Path("id") String id);

  @POST("binding")
  Call<Binding> create(@Body Binding binding);

  @PUT("binding/{id}")
  Call<Binding> update(@Path("id") String id, @Body Binding binding);

  @DELETE("binding/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
