package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ToServiceUpgradeStrategy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ToServiceUpgradeStrategyService {

  @GET("toServiceUpgradeStrategy")
  Call<TypeCollection<ToServiceUpgradeStrategy>> list();

  @GET("toServiceUpgradeStrategy")
  Call<TypeCollection<ToServiceUpgradeStrategy>> list(@QueryMap Filters<String, String> filters);

  @GET("toServiceUpgradeStrategy/{id}")
  Call<ToServiceUpgradeStrategy> get(@Path("id") String id);

  @POST("toServiceUpgradeStrategy")
  Call<ToServiceUpgradeStrategy> create(@Body ToServiceUpgradeStrategy toServiceUpgradeStrategy);

  @PUT("toServiceUpgradeStrategy/{id}")
  Call<ToServiceUpgradeStrategy> update(@Path("id") String id, @Body ToServiceUpgradeStrategy toServiceUpgradeStrategy);

  @DELETE("toServiceUpgradeStrategy/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
