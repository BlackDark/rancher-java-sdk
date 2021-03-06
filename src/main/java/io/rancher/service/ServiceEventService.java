package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.Host;
import io.rancher.type.Instance;
import io.rancher.type.ServiceEvent;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceEventService {

  @GET("serviceEvent")
  Call<TypeCollection<ServiceEvent>> list();

  @GET("serviceEvent")
  Call<TypeCollection<ServiceEvent>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceEvent/{id}")
  Call<ServiceEvent> get(@Path("id") String id);

  @POST("serviceEvent")
  Call<ServiceEvent> create(@Body ServiceEvent serviceEvent);

  @PUT("serviceEvent/{id}")
  Call<ServiceEvent> update(@Path("id") String id, @Body ServiceEvent serviceEvent);

  @DELETE("serviceEvent/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("serviceEvent/{id}?action=remove")
  Call<ServiceEvent> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<Host> getLinkHost(@Url String url);

  @GET
  Call<Instance> getLinkInstance(@Url String url);

}
