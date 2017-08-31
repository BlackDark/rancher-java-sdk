package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BackupTarget;
import io.rancher.type.SnapshotBackupInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SnapshotBackupInputService {

  @GET("snapshotBackupInput")
  Call<TypeCollection<SnapshotBackupInput>> list();

  @GET("snapshotBackupInput")
  Call<TypeCollection<SnapshotBackupInput>> list(@QueryMap Filters<String, String> filters);

  @GET("snapshotBackupInput/{id}")
  Call<SnapshotBackupInput> get(@Path("id") String id);

  @POST("snapshotBackupInput")
  Call<SnapshotBackupInput> create(@Body SnapshotBackupInput snapshotBackupInput);

  @PUT("snapshotBackupInput/{id}")
  Call<SnapshotBackupInput> update(@Path("id") String id, @Body SnapshotBackupInput snapshotBackupInput);

  @DELETE("snapshotBackupInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


  @GET
  Call<BackupTarget> getLinkBackupTarget(@Url String url);

}
