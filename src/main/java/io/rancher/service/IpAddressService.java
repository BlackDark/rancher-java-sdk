package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.Host;
import io.rancher.type.IpAddress;
import io.rancher.type.Network;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface IpAddressService {

  @GET("ipAddress")
  Call<TypeCollection<IpAddress>> list();

  @GET("ipAddress")
  Call<TypeCollection<IpAddress>> list(@QueryMap Filters<String, String> filters);

  @GET("ipAddress/{id}")
  Call<IpAddress> get(@Path("id") String id);

  @POST("ipAddress")
  Call<IpAddress> create(@Body IpAddress ipAddress);

  @PUT("ipAddress/{id}")
  Call<IpAddress> update(@Path("id") String id, @Body IpAddress ipAddress);

  @DELETE("ipAddress/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("ipAddress/{id}?action=activate")
  Call<IpAddress> activate(@Path("id") String id);

  @POST("ipAddress/{id}?action=associate")
  Call<IpAddress> associate(@Path("id") String id);

  @POST("ipAddress/{id}?action=deactivate")
  Call<IpAddress> deactivate(@Path("id") String id);

  @POST("ipAddress/{id}?action=disassociate")
  Call<IpAddress> disassociate(@Path("id") String id);

  @POST("ipAddress/{id}?action=purge")
  Call<IpAddress> purge(@Path("id") String id);

  @POST("ipAddress/{id}?action=remove")
  Call<IpAddress> remove(@Path("id") String id);

  @POST("ipAddress/{id}?action=restore")
  Call<IpAddress> restore(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url);

  @GET
  Call<Network> getLinkNetwork(@Url String url);

}
