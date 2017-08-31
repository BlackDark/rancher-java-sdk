package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.Instance;
import io.rancher.type.InstanceLink;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface InstanceLinkService {

  @GET("instanceLink")
  Call<TypeCollection<InstanceLink>> list();

  @GET("instanceLink")
  Call<TypeCollection<InstanceLink>> list(@QueryMap Filters<String, String> filters);

  @GET("instanceLink/{id}")
  Call<InstanceLink> get(@Path("id") String id);

  @POST("instanceLink")
  Call<InstanceLink> create(@Body InstanceLink instanceLink);

  @PUT("instanceLink/{id}")
  Call<InstanceLink> update(@Path("id") String id, @Body InstanceLink instanceLink);

  @DELETE("instanceLink/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("instanceLink/{id}?action=activate")
  Call<InstanceLink> activate(@Path("id") String id);

  @POST("instanceLink/{id}?action=deactivate")
  Call<InstanceLink> deactivate(@Path("id") String id);

  @POST("instanceLink/{id}?action=purge")
  Call<InstanceLink> purge(@Path("id") String id);

  @POST("instanceLink/{id}?action=remove")
  Call<InstanceLink> remove(@Path("id") String id);

  @POST("instanceLink/{id}?action=restore")
  Call<InstanceLink> restore(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<Instance> getLinkInstance(@Url String url);

}
