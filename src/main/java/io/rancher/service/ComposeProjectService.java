package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ComposeProjectService {

  @GET("composeProject")
  Call<TypeCollection<ComposeProject>> list();

  @GET("composeProject")
  Call<TypeCollection<ComposeProject>> list(@QueryMap Filters<String, String> filters);

  @GET("composeProject/{id}")
  Call<ComposeProject> get(@Path("id") String id);

  @POST("composeProject")
  Call<ComposeProject> create(@Body ComposeProject composeProject);

  @PUT("composeProject/{id}")
  Call<ComposeProject> update(@Path("id") String id, @Body ComposeProject composeProject);

  @DELETE("composeProject/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("composeProject/{id}?action=cancelupgrade")
  Call<Stack> cancelupgrade(@Path("id") String id);

  @POST("composeProject/{id}?action=error")
  Call<Stack> error(@Path("id") String id);

  @POST("composeProject/{id}?action=finishupgrade")
  Call<Stack> finishupgrade(@Path("id") String id);

  @POST("composeProject/{id}?action=remove")
  Call<Stack> remove(@Path("id") String id);

  @POST("composeProject/{id}?action=rollback")
  Call<Stack> rollback(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Service>> getLinkServices(@Url String url);

  @GET
  Call<TypeCollection<VolumeTemplate>> getLinkVolumeTemplates(@Url String url);

  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url);

}
