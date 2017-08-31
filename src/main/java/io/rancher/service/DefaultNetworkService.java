package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DefaultNetworkService {

  @GET("defaultNetwork")
  Call<TypeCollection<DefaultNetwork>> list();

  @GET("defaultNetwork")
  Call<TypeCollection<DefaultNetwork>> list(@QueryMap Filters<String, String> filters);

  @GET("defaultNetwork/{id}")
  Call<DefaultNetwork> get(@Path("id") String id);

  @POST("defaultNetwork")
  Call<DefaultNetwork> create(@Body DefaultNetwork defaultNetwork);

  @PUT("defaultNetwork/{id}")
  Call<DefaultNetwork> update(@Path("id") String id, @Body DefaultNetwork defaultNetwork);

  @DELETE("defaultNetwork/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("defaultNetwork/{id}?action=activate")
  Call<Network> activate(@Path("id") String id);

  @POST("defaultNetwork/{id}?action=deactivate")
  Call<Network> deactivate(@Path("id") String id);

  @POST("defaultNetwork/{id}?action=purge")
  Call<Network> purge(@Path("id") String id);

  @POST("defaultNetwork/{id}?action=remove")
  Call<Network> remove(@Path("id") String id);

  @POST("defaultNetwork/{id}?action=restore")
  Call<Network> restore(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<IpAddress>> getLinkIpAddresses(@Url String url);

  @GET
  Call<TypeCollection<Subnet>> getLinkSubnets(@Url String url);

}
