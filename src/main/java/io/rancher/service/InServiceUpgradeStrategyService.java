package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.InServiceUpgradeStrategy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface InServiceUpgradeStrategyService {

  @GET("inServiceUpgradeStrategy")
  Call<TypeCollection<InServiceUpgradeStrategy>> list();

  @GET("inServiceUpgradeStrategy")
  Call<TypeCollection<InServiceUpgradeStrategy>> list(@QueryMap Filters<String, String> filters);

  @GET("inServiceUpgradeStrategy/{id}")
  Call<InServiceUpgradeStrategy> get(@Path("id") String id);

  @POST("inServiceUpgradeStrategy")
  Call<InServiceUpgradeStrategy> create(@Body InServiceUpgradeStrategy inServiceUpgradeStrategy);

  @PUT("inServiceUpgradeStrategy/{id}")
  Call<InServiceUpgradeStrategy> update(@Path("id") String id, @Body InServiceUpgradeStrategy inServiceUpgradeStrategy);

  @DELETE("inServiceUpgradeStrategy/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
