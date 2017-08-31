package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VolumeSnapshotInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VolumeSnapshotInputService {

  @GET("volumeSnapshotInput")
  Call<TypeCollection<VolumeSnapshotInput>> list();

  @GET("volumeSnapshotInput")
  Call<TypeCollection<VolumeSnapshotInput>> list(@QueryMap Filters<String, String> filters);

  @GET("volumeSnapshotInput/{id}")
  Call<VolumeSnapshotInput> get(@Path("id") String id);

  @POST("volumeSnapshotInput")
  Call<VolumeSnapshotInput> create(@Body VolumeSnapshotInput volumeSnapshotInput);

  @PUT("volumeSnapshotInput/{id}")
  Call<VolumeSnapshotInput> update(@Path("id") String id, @Body VolumeSnapshotInput volumeSnapshotInput);

  @DELETE("volumeSnapshotInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
