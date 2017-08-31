package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.ExternalDnsEvent;
import io.rancher.type.ExternalEvent;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ExternalDnsEventService {

  @GET("externalDnsEvent")
  Call<TypeCollection<ExternalDnsEvent>> list();

  @GET("externalDnsEvent")
  Call<TypeCollection<ExternalDnsEvent>> list(@QueryMap Filters<String, String> filters);

  @GET("externalDnsEvent/{id}")
  Call<ExternalDnsEvent> get(@Path("id") String id);

  @POST("externalDnsEvent")
  Call<ExternalDnsEvent> create(@Body ExternalDnsEvent externalDnsEvent);

  @PUT("externalDnsEvent/{id}")
  Call<ExternalDnsEvent> update(@Path("id") String id, @Body ExternalDnsEvent externalDnsEvent);

  @DELETE("externalDnsEvent/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("externalDnsEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

}
