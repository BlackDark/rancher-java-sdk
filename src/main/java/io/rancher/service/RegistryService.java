package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RegistryService {

  @GET("registry")
  Call<TypeCollection<Registry>> list();

  @GET("registry")
  Call<TypeCollection<Registry>> list(@QueryMap Filters<String, String> filters);

  @GET("registry/{id}")
  Call<Registry> get(@Path("id") String id);

  @POST("registry")
  Call<Registry> create(@Body Registry registry);

  @PUT("registry/{id}")
  Call<Registry> update(@Path("id") String id, @Body Registry registry);

  @DELETE("registry/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("registry/{id}?action=activate")
  Call<StoragePool> activate(@Path("id") String id);

  @POST("registry/{id}?action=deactivate")
  Call<StoragePool> deactivate(@Path("id") String id);

  @POST("registry/{id}?action=purge")
  Call<StoragePool> purge(@Path("id") String id);

  @POST("registry/{id}?action=remove")
  Call<StoragePool> remove(@Path("id") String id);

  @POST("registry/{id}?action=restore")
  Call<StoragePool> restore(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Credential>> getLinkCredentials(@Url String url);

  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url);

  @GET
  Call<TypeCollection<Image>> getLinkImages(@Url String url);

  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url);

}
