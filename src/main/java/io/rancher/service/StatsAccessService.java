package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StatsAccess;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StatsAccessService {

  @GET("statsAccess")
  Call<TypeCollection<StatsAccess>> list();

  @GET("statsAccess")
  Call<TypeCollection<StatsAccess>> list(@QueryMap Filters<String, String> filters);

  @GET("statsAccess/{id}")
  Call<StatsAccess> get(@Path("id") String id);

  @POST("statsAccess")
  Call<StatsAccess> create(@Body StatsAccess statsAccess);

  @PUT("statsAccess/{id}")
  Call<StatsAccess> update(@Path("id") String id, @Body StatsAccess statsAccess);

  @DELETE("statsAccess/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
