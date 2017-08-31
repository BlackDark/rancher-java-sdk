package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.HostAccess;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HostAccessService {

  @GET("hostAccess")
  Call<TypeCollection<HostAccess>> list();

  @GET("hostAccess")
  Call<TypeCollection<HostAccess>> list(@QueryMap Filters<String, String> filters);

  @GET("hostAccess/{id}")
  Call<HostAccess> get(@Path("id") String id);

  @POST("hostAccess")
  Call<HostAccess> create(@Body HostAccess hostAccess);

  @PUT("hostAccess/{id}")
  Call<HostAccess> update(@Path("id") String id, @Body HostAccess hostAccess);

  @DELETE("hostAccess/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
