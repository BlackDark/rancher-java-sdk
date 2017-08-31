package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BackupService {

  @GET("backup")
  Call<TypeCollection<Backup>> list();

  @GET("backup")
  Call<TypeCollection<Backup>> list(@QueryMap Filters<String, String> filters);

  @GET("backup/{id}")
  Call<Backup> get(@Path("id") String id);

  @POST("backup")
  Call<Backup> create(@Body Backup backup);

  @PUT("backup/{id}")
  Call<Backup> update(@Path("id") String id, @Body Backup backup);

  @DELETE("backup/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("backup/{id}?action=remove")
  Call<Backup> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<BackupTarget> getLinkBackupTarget(@Url String url);

  @GET
  Call<Snapshot> getLinkSnapshot(@Url String url);

  @GET
  Call<Volume> getLinkVolume(@Url String url);

}
