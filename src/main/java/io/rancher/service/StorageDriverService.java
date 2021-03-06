package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StorageDriverService {

  @GET("storageDriver")
  Call<TypeCollection<StorageDriver>> list();

  @GET("storageDriver")
  Call<TypeCollection<StorageDriver>> list(@QueryMap Filters<String, String> filters);

  @GET("storageDriver/{id}")
  Call<StorageDriver> get(@Path("id") String id);

  @POST("storageDriver")
  Call<StorageDriver> create(@Body StorageDriver storageDriver);

  @PUT("storageDriver/{id}")
  Call<StorageDriver> update(@Path("id") String id, @Body StorageDriver storageDriver);

  @DELETE("storageDriver/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("storageDriver/{id}?action=activate")
  Call<StorageDriver> activate(@Path("id") String id);

  @POST("storageDriver/{id}?action=deactivate")
  Call<StorageDriver> deactivate(@Path("id") String id);

  @POST("storageDriver/{id}?action=remove")
  Call<StorageDriver> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<Service> getLinkService(@Url String url);

  @GET
  Call<TypeCollection<StoragePool>> getLinkStoragePools(@Url String url);

  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url);

}
