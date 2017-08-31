package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.Network;
import io.rancher.type.NetworkDriver;
import io.rancher.type.Service;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NetworkDriverService {

  @GET("networkDriver")
  Call<TypeCollection<NetworkDriver>> list();

  @GET("networkDriver")
  Call<TypeCollection<NetworkDriver>> list(@QueryMap Filters<String, String> filters);

  @GET("networkDriver/{id}")
  Call<NetworkDriver> get(@Path("id") String id);

  @POST("networkDriver")
  Call<NetworkDriver> create(@Body NetworkDriver networkDriver);

  @PUT("networkDriver/{id}")
  Call<NetworkDriver> update(@Path("id") String id, @Body NetworkDriver networkDriver);

  @DELETE("networkDriver/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("networkDriver/{id}?action=activate")
  Call<NetworkDriver> activate(@Path("id") String id);

  @POST("networkDriver/{id}?action=deactivate")
  Call<NetworkDriver> deactivate(@Path("id") String id);

  @POST("networkDriver/{id}?action=remove")
  Call<NetworkDriver> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Network>> getLinkNetworks(@Url String url);

  @GET
  Call<Service> getLinkService(@Url String url);

}
