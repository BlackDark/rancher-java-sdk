package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.ExternalEvent;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ExternalEventService {

  @GET("externalEvent")
  Call<TypeCollection<ExternalEvent>> list();

  @GET("externalEvent")
  Call<TypeCollection<ExternalEvent>> list(@QueryMap Filters<String, String> filters);

  @GET("externalEvent/{id}")
  Call<ExternalEvent> get(@Path("id") String id);

  @POST("externalEvent")
  Call<ExternalEvent> create(@Body ExternalEvent externalEvent);

  @PUT("externalEvent/{id}")
  Call<ExternalEvent> update(@Path("id") String id, @Body ExternalEvent externalEvent);

  @DELETE("externalEvent/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("externalEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

}
