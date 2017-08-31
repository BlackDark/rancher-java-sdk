package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.Host;
import io.rancher.type.Machine;
import io.rancher.type.PhysicalHost;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MachineService {

  @GET("machine")
  Call<TypeCollection<Machine>> list();

  @GET("machine")
  Call<TypeCollection<Machine>> list(@QueryMap Filters<String, String> filters);

  @GET("machine/{id}")
  Call<Machine> get(@Path("id") String id);

  @POST("machine")
  Call<Machine> create(@Body Machine machine);

  @PUT("machine/{id}")
  Call<Machine> update(@Path("id") String id, @Body Machine machine);

  @DELETE("machine/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("machine/{id}?action=bootstrap")
  Call<PhysicalHost> bootstrap(@Path("id") String id);

  @POST("machine/{id}?action=error")
  Call<PhysicalHost> error(@Path("id") String id);

  @POST("machine/{id}?action=remove")
  Call<PhysicalHost> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url);

}
