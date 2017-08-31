package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NfsConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NfsConfigService {

  @GET("nfsConfig")
  Call<TypeCollection<NfsConfig>> list();

  @GET("nfsConfig")
  Call<TypeCollection<NfsConfig>> list(@QueryMap Filters<String, String> filters);

  @GET("nfsConfig/{id}")
  Call<NfsConfig> get(@Path("id") String id);

  @POST("nfsConfig")
  Call<NfsConfig> create(@Body NfsConfig nfsConfig);

  @PUT("nfsConfig/{id}")
  Call<NfsConfig> update(@Path("id") String id, @Body NfsConfig nfsConfig);

  @DELETE("nfsConfig/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
