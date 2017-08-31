package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.ExternalEvent;
import io.rancher.type.ExternalVolumeEvent;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ExternalVolumeEventService {

  @GET("externalVolumeEvent")
  Call<TypeCollection<ExternalVolumeEvent>> list();

  @GET("externalVolumeEvent")
  Call<TypeCollection<ExternalVolumeEvent>> list(@QueryMap Filters<String, String> filters);

  @GET("externalVolumeEvent/{id}")
  Call<ExternalVolumeEvent> get(@Path("id") String id);

  @POST("externalVolumeEvent")
  Call<ExternalVolumeEvent> create(@Body ExternalVolumeEvent externalVolumeEvent);

  @PUT("externalVolumeEvent/{id}")
  Call<ExternalVolumeEvent> update(@Path("id") String id, @Body ExternalVolumeEvent externalVolumeEvent);

  @DELETE("externalVolumeEvent/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("externalVolumeEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

}
