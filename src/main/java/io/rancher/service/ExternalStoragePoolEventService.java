package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.ExternalEvent;
import io.rancher.type.ExternalStoragePoolEvent;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ExternalStoragePoolEventService {

  @GET("externalStoragePoolEvent")
  Call<TypeCollection<ExternalStoragePoolEvent>> list();

  @GET("externalStoragePoolEvent")
  Call<TypeCollection<ExternalStoragePoolEvent>> list(@QueryMap Filters<String, String> filters);

  @GET("externalStoragePoolEvent/{id}")
  Call<ExternalStoragePoolEvent> get(@Path("id") String id);

  @POST("externalStoragePoolEvent")
  Call<ExternalStoragePoolEvent> create(@Body ExternalStoragePoolEvent externalStoragePoolEvent);

  @PUT("externalStoragePoolEvent/{id}")
  Call<ExternalStoragePoolEvent> update(@Path("id") String id, @Body ExternalStoragePoolEvent externalStoragePoolEvent);

  @DELETE("externalStoragePoolEvent/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("externalStoragePoolEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

}
