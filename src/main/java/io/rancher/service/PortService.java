package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.Instance;
import io.rancher.type.Port;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PortService {

  @GET("port")
  Call<TypeCollection<Port>> list();

  @GET("port")
  Call<TypeCollection<Port>> list(@QueryMap Filters<String, String> filters);

  @GET("port/{id}")
  Call<Port> get(@Path("id") String id);

  @POST("port")
  Call<Port> create(@Body Port port);

  @PUT("port/{id}")
  Call<Port> update(@Path("id") String id, @Body Port port);

  @DELETE("port/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("port/{id}?action=activate")
  Call<Port> activate(@Path("id") String id);

  @POST("port/{id}?action=deactivate")
  Call<Port> deactivate(@Path("id") String id);

  @POST("port/{id}?action=purge")
  Call<Port> purge(@Path("id") String id);

  @POST("port/{id}?action=remove")
  Call<Port> remove(@Path("id") String id);

  @POST("port/{id}?action=restore")
  Call<Port> restore(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<Instance> getLinkInstance(@Url String url);

}
