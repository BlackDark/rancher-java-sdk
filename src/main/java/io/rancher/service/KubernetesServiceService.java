package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface KubernetesServiceService {

  @GET("kubernetesService")
  Call<TypeCollection<KubernetesService>> list();

  @GET("kubernetesService")
  Call<TypeCollection<KubernetesService>> list(@QueryMap Filters<String, String> filters);

  @GET("kubernetesService/{id}")
  Call<KubernetesService> get(@Path("id") String id);

  @POST("kubernetesService")
  Call<KubernetesService> create(@Body KubernetesService kubernetesService);

  @PUT("kubernetesService/{id}")
  Call<KubernetesService> update(@Path("id") String id, @Body KubernetesService kubernetesService);

  @DELETE("kubernetesService/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("kubernetesService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);

  @POST("kubernetesService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);

  @POST("kubernetesService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);

  @POST("kubernetesService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);

  @POST("kubernetesService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id);

  @POST("kubernetesService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);

  @POST("kubernetesService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);

  @POST("kubernetesService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);

  @POST("kubernetesService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart);

  @POST("kubernetesService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);

  @POST("kubernetesService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);

  @POST("kubernetesService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url);

  @GET
  Call<TypeCollection<NetworkDriver>> getLinkNetworkDrivers(@Url String url);

  @GET
  Call<TypeCollection<ServiceExposeMap>> getLinkServiceExposeMaps(@Url String url);

  @GET
  Call<TypeCollection<ServiceLog>> getLinkServiceLogs(@Url String url);

  @GET
  Call<Stack> getLinkStack(@Url String url);

  @GET
  Call<TypeCollection<StorageDriver>> getLinkStorageDrivers(@Url String url);

}
