package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceUpgrade;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceUpgradeService {

  @GET("serviceUpgrade")
  Call<TypeCollection<ServiceUpgrade>> list();

  @GET("serviceUpgrade")
  Call<TypeCollection<ServiceUpgrade>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceUpgrade/{id}")
  Call<ServiceUpgrade> get(@Path("id") String id);

  @POST("serviceUpgrade")
  Call<ServiceUpgrade> create(@Body ServiceUpgrade serviceUpgrade);

  @PUT("serviceUpgrade/{id}")
  Call<ServiceUpgrade> update(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade);

  @DELETE("serviceUpgrade/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
