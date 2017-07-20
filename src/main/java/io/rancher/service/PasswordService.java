package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Password;
import io.rancher.type.Account;
import io.rancher.type.ChangeSecretInput;
import io.rancher.type.Credential;
import io.rancher.type.Image;
import io.rancher.type.Instance;

import retrofit2.Call;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface PasswordService {

  @GET("password")
  Call<TypeCollection<Password>> list();

  @GET("password")
  Call<TypeCollection<Password>> list(@QueryMap Filters<String, String> filters);

  @GET("password/{id}")
  Call<Password> get(@Path("id") String id);

  @POST("password")
  Call<Password> create(@Body Password password);

  @PUT("password/{id}")
  Call<Password> update(@Path("id") String id, @Body Password password);

  @DELETE("password/{id}")
  Call<ResponseBody> delete(@Path("id") String id);
  
  @POST("password/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id);
  
  @POST("password/{id}?action=changesecret")
  Call<ChangeSecretInput> changesecret(@Path("id") String id, @Body ChangeSecretInput changeSecretInput);
  
  @POST("password/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id);
  
  @POST("password/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id);
  
  @POST("password/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<TypeCollection<Image>> getLinkImages(@Url String url );
  
  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url );
  
}
