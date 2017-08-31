package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceUpgradeStrategy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceUpgradeStrategyService {

  @GET("serviceUpgradeStrategy")
  Call<TypeCollection<ServiceUpgradeStrategy>> list();

  @GET("serviceUpgradeStrategy")
  Call<TypeCollection<ServiceUpgradeStrategy>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceUpgradeStrategy/{id}")
  Call<ServiceUpgradeStrategy> get(@Path("id") String id);

  @POST("serviceUpgradeStrategy")
  Call<ServiceUpgradeStrategy> create(@Body ServiceUpgradeStrategy serviceUpgradeStrategy);

  @PUT("serviceUpgradeStrategy/{id}")
  Call<ServiceUpgradeStrategy> update(@Path("id") String id, @Body ServiceUpgradeStrategy serviceUpgradeStrategy);

  @DELETE("serviceUpgradeStrategy/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
