package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RestoreFromBackupInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RestoreFromBackupInputService {

  @GET("restoreFromBackupInput")
  Call<TypeCollection<RestoreFromBackupInput>> list();

  @GET("restoreFromBackupInput")
  Call<TypeCollection<RestoreFromBackupInput>> list(@QueryMap Filters<String, String> filters);

  @GET("restoreFromBackupInput/{id}")
  Call<RestoreFromBackupInput> get(@Path("id") String id);

  @POST("restoreFromBackupInput")
  Call<RestoreFromBackupInput> create(@Body RestoreFromBackupInput restoreFromBackupInput);

  @PUT("restoreFromBackupInput/{id}")
  Call<RestoreFromBackupInput> update(@Path("id") String id, @Body RestoreFromBackupInput restoreFromBackupInput);

  @DELETE("restoreFromBackupInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
