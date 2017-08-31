package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RevertToSnapshotInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RevertToSnapshotInputService {

  @GET("revertToSnapshotInput")
  Call<TypeCollection<RevertToSnapshotInput>> list();

  @GET("revertToSnapshotInput")
  Call<TypeCollection<RevertToSnapshotInput>> list(@QueryMap Filters<String, String> filters);

  @GET("revertToSnapshotInput/{id}")
  Call<RevertToSnapshotInput> get(@Path("id") String id);

  @POST("revertToSnapshotInput")
  Call<RevertToSnapshotInput> create(@Body RevertToSnapshotInput revertToSnapshotInput);

  @PUT("revertToSnapshotInput/{id}")
  Call<RevertToSnapshotInput> update(@Path("id") String id, @Body RevertToSnapshotInput revertToSnapshotInput);

  @DELETE("revertToSnapshotInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
