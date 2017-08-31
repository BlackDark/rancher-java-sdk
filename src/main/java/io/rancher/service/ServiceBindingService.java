package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceBinding;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceBindingService {

  @GET("serviceBinding")
  Call<TypeCollection<ServiceBinding>> list();

  @GET("serviceBinding")
  Call<TypeCollection<ServiceBinding>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceBinding/{id}")
  Call<ServiceBinding> get(@Path("id") String id);

  @POST("serviceBinding")
  Call<ServiceBinding> create(@Body ServiceBinding serviceBinding);

  @PUT("serviceBinding/{id}")
  Call<ServiceBinding> update(@Path("id") String id, @Body ServiceBinding serviceBinding);

  @DELETE("serviceBinding/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
