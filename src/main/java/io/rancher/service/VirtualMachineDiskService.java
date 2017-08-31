package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VirtualMachineDisk;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VirtualMachineDiskService {

  @GET("virtualMachineDisk")
  Call<TypeCollection<VirtualMachineDisk>> list();

  @GET("virtualMachineDisk")
  Call<TypeCollection<VirtualMachineDisk>> list(@QueryMap Filters<String, String> filters);

  @GET("virtualMachineDisk/{id}")
  Call<VirtualMachineDisk> get(@Path("id") String id);

  @POST("virtualMachineDisk")
  Call<VirtualMachineDisk> create(@Body VirtualMachineDisk virtualMachineDisk);

  @PUT("virtualMachineDisk/{id}")
  Call<VirtualMachineDisk> update(@Path("id") String id, @Body VirtualMachineDisk virtualMachineDisk);

  @DELETE("virtualMachineDisk/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
