package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.ExternalEvent;
import io.rancher.type.ExternalHostEvent;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ExternalHostEventService {

  @GET("externalHostEvent")
  Call<TypeCollection<ExternalHostEvent>> list();

  @GET("externalHostEvent")
  Call<TypeCollection<ExternalHostEvent>> list(@QueryMap Filters<String, String> filters);

  @GET("externalHostEvent/{id}")
  Call<ExternalHostEvent> get(@Path("id") String id);

  @POST("externalHostEvent")
  Call<ExternalHostEvent> create(@Body ExternalHostEvent externalHostEvent);

  @PUT("externalHostEvent/{id}")
  Call<ExternalHostEvent> update(@Path("id") String id, @Body ExternalHostEvent externalHostEvent);

  @DELETE("externalHostEvent/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("externalHostEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

}
