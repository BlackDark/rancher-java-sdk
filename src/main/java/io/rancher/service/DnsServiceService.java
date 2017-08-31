package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DnsServiceService {

  @GET("dnsService")
  Call<TypeCollection<DnsService>> list();

  @GET("dnsService")
  Call<TypeCollection<DnsService>> list(@QueryMap Filters<String, String> filters);

  @GET("dnsService/{id}")
  Call<DnsService> get(@Path("id") String id);

  @POST("dnsService")
  Call<DnsService> create(@Body DnsService dnsService);

  @PUT("dnsService/{id}")
  Call<DnsService> update(@Path("id") String id, @Body DnsService dnsService);

  @DELETE("dnsService/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("dnsService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id);

  @POST("dnsService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);

  @POST("dnsService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id);

  @POST("dnsService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id);

  @POST("dnsService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id);

  @POST("dnsService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id);

  @POST("dnsService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id);

  @POST("dnsService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput);

  @POST("dnsService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart);

  @POST("dnsService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id);

  @POST("dnsService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);

  @POST("dnsService/{id}?action=upgrade")
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
