package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.Instance;
import io.rancher.type.Mount;
import io.rancher.type.Volume;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MountService {

  @GET("mount")
  Call<TypeCollection<Mount>> list();

  @GET("mount")
  Call<TypeCollection<Mount>> list(@QueryMap Filters<String, String> filters);

  @GET("mount/{id}")
  Call<Mount> get(@Path("id") String id);

  @POST("mount")
  Call<Mount> create(@Body Mount mount);

  @PUT("mount/{id}")
  Call<Mount> update(@Path("id") String id, @Body Mount mount);

  @DELETE("mount/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("mount/{id}?action=deactivate")
  Call<Mount> deactivate(@Path("id") String id);

  @POST("mount/{id}?action=remove")
  Call<Mount> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<Instance> getLinkInstance(@Url String url);

  @GET
  Call<Volume> getLinkVolume(@Url String url);

}
