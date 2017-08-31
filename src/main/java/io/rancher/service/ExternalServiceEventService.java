package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.ExternalEvent;
import io.rancher.type.ExternalServiceEvent;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ExternalServiceEventService {

  @GET("externalServiceEvent")
  Call<TypeCollection<ExternalServiceEvent>> list();

  @GET("externalServiceEvent")
  Call<TypeCollection<ExternalServiceEvent>> list(@QueryMap Filters<String, String> filters);

  @GET("externalServiceEvent/{id}")
  Call<ExternalServiceEvent> get(@Path("id") String id);

  @POST("externalServiceEvent")
  Call<ExternalServiceEvent> create(@Body ExternalServiceEvent externalServiceEvent);

  @PUT("externalServiceEvent/{id}")
  Call<ExternalServiceEvent> update(@Path("id") String id, @Body ExternalServiceEvent externalServiceEvent);

  @DELETE("externalServiceEvent/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("externalServiceEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

}
