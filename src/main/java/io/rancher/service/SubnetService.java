package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.IpAddress;
import io.rancher.type.Network;
import io.rancher.type.Subnet;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SubnetService {

  @GET("subnet")
  Call<TypeCollection<Subnet>> list();

  @GET("subnet")
  Call<TypeCollection<Subnet>> list(@QueryMap Filters<String, String> filters);

  @GET("subnet/{id}")
  Call<Subnet> get(@Path("id") String id);

  @POST("subnet")
  Call<Subnet> create(@Body Subnet subnet);

  @PUT("subnet/{id}")
  Call<Subnet> update(@Path("id") String id, @Body Subnet subnet);

  @DELETE("subnet/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("subnet/{id}?action=activate")
  Call<Subnet> activate(@Path("id") String id);

  @POST("subnet/{id}?action=deactivate")
  Call<Subnet> deactivate(@Path("id") String id);

  @POST("subnet/{id}?action=purge")
  Call<Subnet> purge(@Path("id") String id);

  @POST("subnet/{id}?action=remove")
  Call<Subnet> remove(@Path("id") String id);

  @POST("subnet/{id}?action=restore")
  Call<Subnet> restore(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<IpAddress>> getLinkIpAddresses(@Url String url);

  @GET
  Call<Network> getLinkNetwork(@Url String url);

}
