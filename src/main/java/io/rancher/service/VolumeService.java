package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VolumeService {

  @GET("volume")
  Call<TypeCollection<Volume>> list();

  @GET("volume")
  Call<TypeCollection<Volume>> list(@QueryMap Filters<String, String> filters);

  @GET("volume/{id}")
  Call<Volume> get(@Path("id") String id);

  @POST("volume")
  Call<Volume> create(@Body Volume volume);

  @PUT("volume/{id}")
  Call<Volume> update(@Path("id") String id, @Body Volume volume);

  @DELETE("volume/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("volume/{id}?action=allocate")
  Call<Volume> allocate(@Path("id") String id);

  @POST("volume/{id}?action=deallocate")
  Call<Volume> deallocate(@Path("id") String id);

  @POST("volume/{id}?action=purge")
  Call<Volume> purge(@Path("id") String id);

  @POST("volume/{id}?action=remove")
  Call<Volume> remove(@Path("id") String id);

  @POST("volume/{id}?action=restore")
  Call<Volume> restore(@Path("id") String id);

  @POST("volume/{id}?action=restorefrombackup")
  Call<Volume> restorefrombackup(@Path("id") String id, @Body RestoreFromBackupInput restoreFromBackupInput);

  @POST("volume/{id}?action=reverttosnapshot")
  Call<Volume> reverttosnapshot(@Path("id") String id, @Body RevertToSnapshotInput revertToSnapshotInput);

  @POST("volume/{id}?action=snapshot")
  Call<Snapshot> snapshot(@Path("id") String id, @Body VolumeSnapshotInput volumeSnapshotInput);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Backup>> getLinkBackups(@Url String url);

  @GET
  Call<Host> getLinkHost(@Url String url);

  @GET
  Call<Image> getLinkImage(@Url String url);

  @GET
  Call<Instance> getLinkInstance(@Url String url);

  @GET
  Call<TypeCollection<Mount>> getLinkMounts(@Url String url);

  @GET
  Call<TypeCollection<Snapshot>> getLinkSnapshots(@Url String url);

  @GET
  Call<Stack> getLinkStack(@Url String url);

  @GET
  Call<StorageDriver> getLinkStorageDriver(@Url String url);

  @GET
  Call<TypeCollection<StoragePool>> getLinkStoragePools(@Url String url);

  @GET
  Call<VolumeTemplate> getLinkVolumeTemplate(@Url String url);

}
