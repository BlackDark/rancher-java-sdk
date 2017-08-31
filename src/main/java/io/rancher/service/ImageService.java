package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ImageService {

  @GET("image")
  Call<TypeCollection<Image>> list();

  @GET("image")
  Call<TypeCollection<Image>> list(@QueryMap Filters<String, String> filters);

  @GET("image/{id}")
  Call<Image> get(@Path("id") String id);

  @POST("image")
  Call<Image> create(@Body Image image);

  @PUT("image/{id}")
  Call<Image> update(@Path("id") String id, @Body Image image);

  @DELETE("image/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("image/{id}?action=activate")
  Call<Image> activate(@Path("id") String id);

  @POST("image/{id}?action=deactivate")
  Call<Image> deactivate(@Path("id") String id);

  @POST("image/{id}?action=purge")
  Call<Image> purge(@Path("id") String id);

  @POST("image/{id}?action=remove")
  Call<Image> remove(@Path("id") String id);

  @POST("image/{id}?action=restore")
  Call<Image> restore(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url);

  @GET
  Call<TypeCollection<StoragePool>> getLinkStoragePools(@Url String url);

  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url);

}
