package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StorageDriver;
import io.rancher.type.Account;
import io.rancher.type.Service;
import io.rancher.type.StoragePool;
import io.rancher.type.Volume;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

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
  Call<Response> delete(@Path("id") String id);
  
  @POST("storageDriver/{id}?action=activate")
  Call<StorageDriver> activate(@Path("id") String id);
  
  @POST("storageDriver/{id}?action=deactivate")
  Call<StorageDriver> deactivate(@Path("id") String id);
  
  @POST("storageDriver/{id}?action=remove")
  Call<StorageDriver> remove(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<Service> getLinkService(@Url String url );
  
  @GET
  Call<TypeCollection<StoragePool>> getLinkStoragePools(@Url String url );
  
  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url );
  
}
