package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RegistryCredentialService {

  @GET("registryCredential")
  Call<TypeCollection<RegistryCredential>> list();

  @GET("registryCredential")
  Call<TypeCollection<RegistryCredential>> list(@QueryMap Filters<String, String> filters);

  @GET("registryCredential/{id}")
  Call<RegistryCredential> get(@Path("id") String id);

  @POST("registryCredential")
  Call<RegistryCredential> create(@Body RegistryCredential registryCredential);

  @PUT("registryCredential/{id}")
  Call<RegistryCredential> update(@Path("id") String id, @Body RegistryCredential registryCredential);

  @DELETE("registryCredential/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("registryCredential/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id);

  @POST("registryCredential/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id);

  @POST("registryCredential/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id);

  @POST("registryCredential/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Image>> getLinkImages(@Url String url);

  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url);

  @GET
  Call<Registry> getLinkRegistry(@Url String url);

}
