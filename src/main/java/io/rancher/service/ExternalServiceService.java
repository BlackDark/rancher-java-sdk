package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ExternalServiceService {

  @GET("externalService")
  Call<TypeCollection<ExternalService>> list();

  @GET("externalService")
  Call<TypeCollection<ExternalService>> list(@QueryMap Filters<String, String> filters);

  @GET("externalService/{id}")
  Call<ExternalService> get(@Path("id") String id);

  @POST("externalService")
  Call<ExternalService> create(@Body ExternalService externalService);

  @PUT("externalService/{id}")
  Call<ExternalService> update(@Path("id") String id, @Body ExternalService externalService);

  @DELETE("externalService/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("externalService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);

  @POST("externalService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);

  @POST("externalService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);

  @POST("externalService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id);

  @POST("externalService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);

  @POST("externalService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);

  @POST("externalService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart);

  @POST("externalService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);

  @POST("externalService/{id}?action=upgrade")
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
