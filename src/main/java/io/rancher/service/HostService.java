package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HostService {

  @GET("host")
  Call<TypeCollection<Host>> list();

  @GET("host")
  Call<TypeCollection<Host>> list(@QueryMap Filters<String, String> filters);

  @GET("host/{id}")
  Call<Host> get(@Path("id") String id);

  @POST("host")
  Call<Host> create(@Body Host host);

  @PUT("host/{id}")
  Call<Host> update(@Path("id") String id, @Body Host host);

  @DELETE("host/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("host/{id}?action=activate")
  Call<Host> activate(@Path("id") String id);

  @POST("host/{id}?action=deactivate")
  Call<Host> deactivate(@Path("id") String id);

  @POST("host/{id}?action=dockersocket")
  Call<HostAccess> dockersocket(@Path("id") String id);

  @POST("host/{id}?action=error")
  Call<Host> error(@Path("id") String id);

  @POST("host/{id}?action=provision")
  Call<Host> provision(@Path("id") String id);

  @POST("host/{id}?action=purge")
  Call<Host> purge(@Path("id") String id);

  @POST("host/{id}?action=remove")
  Call<Host> remove(@Path("id") String id);

  @POST("host/{id}?action=restore")
  Call<Host> restore(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<ContainerEvent>> getLinkContainerEvents(@Url String url);

  @GET
  Call<TypeCollection<HealthcheckInstanceHostMap>> getLinkHealthcheckInstanceHostMaps(@Url String url);

  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url);

  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url);

  @GET
  Call<TypeCollection<IpAddress>> getLinkIpAddresses(@Url String url);

  @GET
  Call<PhysicalHost> getLinkPhysicalHost(@Url String url);

  @GET
  Call<TypeCollection<ServiceEvent>> getLinkServiceEvents(@Url String url);

  @GET
  Call<TypeCollection<StoragePool>> getLinkStoragePools(@Url String url);

  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url);

}
