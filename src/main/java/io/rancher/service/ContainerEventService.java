package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.ContainerEvent;
import io.rancher.type.Host;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ContainerEventService {

  @GET("containerEvent")
  Call<TypeCollection<ContainerEvent>> list();

  @GET("containerEvent")
  Call<TypeCollection<ContainerEvent>> list(@QueryMap Filters<String, String> filters);

  @GET("containerEvent/{id}")
  Call<ContainerEvent> get(@Path("id") String id);

  @POST("containerEvent")
  Call<ContainerEvent> create(@Body ContainerEvent containerEvent);

  @PUT("containerEvent/{id}")
  Call<ContainerEvent> update(@Path("id") String id, @Body ContainerEvent containerEvent);

  @DELETE("containerEvent/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("containerEvent/{id}?action=remove")
  Call<ContainerEvent> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<Host> getLinkHost(@Url String url);

}
