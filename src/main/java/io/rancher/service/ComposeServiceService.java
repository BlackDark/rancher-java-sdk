package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ComposeServiceService {

  @GET("composeService")
  Call<TypeCollection<ComposeService>> list();

  @GET("composeService")
  Call<TypeCollection<ComposeService>> list(@QueryMap Filters<String, String> filters);

  @GET("composeService/{id}")
  Call<ComposeService> get(@Path("id") String id);

  @POST("composeService")
  Call<ComposeService> create(@Body ComposeService composeService);

  @PUT("composeService/{id}")
  Call<ComposeService> update(@Path("id") String id, @Body ComposeService composeService);

  @DELETE("composeService/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("composeService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);

  @POST("composeService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);

  @POST("composeService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);

  @POST("composeService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);

  @POST("composeService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);

  @POST("composeService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);


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
