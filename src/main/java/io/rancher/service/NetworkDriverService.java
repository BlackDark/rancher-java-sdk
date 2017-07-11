package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkDriver;
import io.rancher.type.Account;
import io.rancher.type.Network;
import io.rancher.type.Service;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

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
  Call<Response> delete(@Path("id") String id);
  
  @POST("networkDriver/{id}?action=activate")
  Call<NetworkDriver> activate(@Path("id") String id);
  
  @POST("networkDriver/{id}?action=deactivate")
  Call<NetworkDriver> deactivate(@Path("id") String id);
  
  @POST("networkDriver/{id}?action=remove")
  Call<NetworkDriver> remove(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<TypeCollection<Network>> getLinkNetworks(@Url String url );
  
  @GET
  Call<Service> getLinkService(@Url String url );
  
}
