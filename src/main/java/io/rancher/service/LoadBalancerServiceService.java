package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LoadBalancerServiceService {

  @GET("loadBalancerService")
  Call<TypeCollection<LoadBalancerService>> list();

  @GET("loadBalancerService")
  Call<TypeCollection<LoadBalancerService>> list(@QueryMap Filters<String, String> filters);

  @GET("loadBalancerService/{id}")
  Call<LoadBalancerService> get(@Path("id") String id);

  @POST("loadBalancerService")
  Call<LoadBalancerService> create(@Body LoadBalancerService loadBalancerService);

  @PUT("loadBalancerService/{id}")
  Call<LoadBalancerService> update(@Path("id") String id, @Body LoadBalancerService loadBalancerService);

  @DELETE("loadBalancerService/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("loadBalancerService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);

  @POST("loadBalancerService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);

  @POST("loadBalancerService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);

  @POST("loadBalancerService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);

  @POST("loadBalancerService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id);

  @POST("loadBalancerService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);

  @POST("loadBalancerService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);

  @POST("loadBalancerService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);

  @POST("loadBalancerService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart);

  @POST("loadBalancerService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);

  @POST("loadBalancerService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);

  @POST("loadBalancerService/{id}?action=upgrade")
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
