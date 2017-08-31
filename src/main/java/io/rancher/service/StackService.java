package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StackService {

  @GET("stack")
  Call<TypeCollection<Stack>> list();

  @GET("stack")
  Call<TypeCollection<Stack>> list(@QueryMap Filters<String, String> filters);

  @GET("stack/{id}")
  Call<Stack> get(@Path("id") String id);

  @POST("stack")
  Call<Stack> create(@Body Stack stack);

  @PUT("stack/{id}")
  Call<Stack> update(@Path("id") String id, @Body Stack stack);

  @DELETE("stack/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("stack/{id}?action=activateservices")
  Call<Stack> activateservices(@Path("id") String id);

  @POST("stack/{id}?action=addoutputs")
  Call<Stack> addoutputs(@Path("id") String id, @Body AddOutputsInput addOutputsInput);

  @POST("stack/{id}?action=cancelupgrade")
  Call<Stack> cancelupgrade(@Path("id") String id);

  @POST("stack/{id}?action=deactivateservices")
  Call<Stack> deactivateservices(@Path("id") String id);

  @POST("stack/{id}?action=error")
  Call<Stack> error(@Path("id") String id);

  @POST("stack/{id}?action=exportconfig")
  Call<ComposeConfig> exportconfig(@Path("id") String id, @Body ComposeConfigInput composeConfigInput);

  @POST("stack/{id}?action=finishupgrade")
  Call<Stack> finishupgrade(@Path("id") String id);

  @POST("stack/{id}?action=remove")
  Call<Stack> remove(@Path("id") String id);

  @POST("stack/{id}?action=rollback")
  Call<Stack> rollback(@Path("id") String id);

  @POST("stack/{id}?action=upgrade")
  Call<Stack> upgrade(@Path("id") String id, @Body StackUpgrade stackUpgrade);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Service>> getLinkServices(@Url String url);

  @GET
  Call<TypeCollection<VolumeTemplate>> getLinkVolumeTemplates(@Url String url);

  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url);

}
