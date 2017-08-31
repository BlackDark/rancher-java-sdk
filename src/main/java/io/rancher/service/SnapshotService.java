package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SnapshotService {

  @GET("snapshot")
  Call<TypeCollection<Snapshot>> list();

  @GET("snapshot")
  Call<TypeCollection<Snapshot>> list(@QueryMap Filters<String, String> filters);

  @GET("snapshot/{id}")
  Call<Snapshot> get(@Path("id") String id);

  @POST("snapshot")
  Call<Snapshot> create(@Body Snapshot snapshot);

  @PUT("snapshot/{id}")
  Call<Snapshot> update(@Path("id") String id, @Body Snapshot snapshot);

  @DELETE("snapshot/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("snapshot/{id}?action=backup")
  Call<Backup> backup(@Path("id") String id, @Body SnapshotBackupInput snapshotBackupInput);

  @POST("snapshot/{id}?action=remove")
  Call<Snapshot> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Backup>> getLinkBackups(@Url String url);

  @GET
  Call<Volume> getLinkVolume(@Url String url);

}
