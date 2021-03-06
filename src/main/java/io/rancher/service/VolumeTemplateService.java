package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.Stack;
import io.rancher.type.Volume;
import io.rancher.type.VolumeTemplate;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VolumeTemplateService {

  @GET("volumeTemplate")
  Call<TypeCollection<VolumeTemplate>> list();

  @GET("volumeTemplate")
  Call<TypeCollection<VolumeTemplate>> list(@QueryMap Filters<String, String> filters);

  @GET("volumeTemplate/{id}")
  Call<VolumeTemplate> get(@Path("id") String id);

  @POST("volumeTemplate")
  Call<VolumeTemplate> create(@Body VolumeTemplate volumeTemplate);

  @PUT("volumeTemplate/{id}")
  Call<VolumeTemplate> update(@Path("id") String id, @Body VolumeTemplate volumeTemplate);

  @DELETE("volumeTemplate/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("volumeTemplate/{id}?action=activate")
  Call<VolumeTemplate> activate(@Path("id") String id);

  @POST("volumeTemplate/{id}?action=deactivate")
  Call<VolumeTemplate> deactivate(@Path("id") String id);

  @POST("volumeTemplate/{id}?action=purge")
  Call<VolumeTemplate> purge(@Path("id") String id);

  @POST("volumeTemplate/{id}?action=remove")
  Call<VolumeTemplate> remove(@Path("id") String id);

  @POST("volumeTemplate/{id}?action=restore")
  Call<VolumeTemplate> restore(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<Stack> getLinkStack(@Url String url);

  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url);

}
