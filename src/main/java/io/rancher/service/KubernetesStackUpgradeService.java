package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubernetesStackUpgrade;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface KubernetesStackUpgradeService {

  @GET("kubernetesStackUpgrade")
  Call<TypeCollection<KubernetesStackUpgrade>> list();

  @GET("kubernetesStackUpgrade")
  Call<TypeCollection<KubernetesStackUpgrade>> list(@QueryMap Filters<String, String> filters);

  @GET("kubernetesStackUpgrade/{id}")
  Call<KubernetesStackUpgrade> get(@Path("id") String id);

  @POST("kubernetesStackUpgrade")
  Call<KubernetesStackUpgrade> create(@Body KubernetesStackUpgrade kubernetesStackUpgrade);

  @PUT("kubernetesStackUpgrade/{id}")
  Call<KubernetesStackUpgrade> update(@Path("id") String id, @Body KubernetesStackUpgrade kubernetesStackUpgrade);

  @DELETE("kubernetesStackUpgrade/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
