package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.PullTask;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PullTaskService {

  @GET("pullTask")
  Call<TypeCollection<PullTask>> list();

  @GET("pullTask")
  Call<TypeCollection<PullTask>> list(@QueryMap Filters<String, String> filters);

  @GET("pullTask/{id}")
  Call<PullTask> get(@Path("id") String id);

  @POST("pullTask")
  Call<PullTask> create(@Body PullTask pullTask);

  @PUT("pullTask/{id}")
  Call<PullTask> update(@Path("id") String id, @Body PullTask pullTask);

  @DELETE("pullTask/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

}
