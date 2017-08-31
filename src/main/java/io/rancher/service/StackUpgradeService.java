package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StackUpgrade;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StackUpgradeService {

  @GET("stackUpgrade")
  Call<TypeCollection<StackUpgrade>> list();

  @GET("stackUpgrade")
  Call<TypeCollection<StackUpgrade>> list(@QueryMap Filters<String, String> filters);

  @GET("stackUpgrade/{id}")
  Call<StackUpgrade> get(@Path("id") String id);

  @POST("stackUpgrade")
  Call<StackUpgrade> create(@Body StackUpgrade stackUpgrade);

  @PUT("stackUpgrade/{id}")
  Call<StackUpgrade> update(@Path("id") String id, @Body StackUpgrade stackUpgrade);

  @DELETE("stackUpgrade/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
