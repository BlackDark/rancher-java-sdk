package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MachineDriver;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MachineDriverService {

  @GET("machineDriver")
  Call<TypeCollection<MachineDriver>> list();

  @GET("machineDriver")
  Call<TypeCollection<MachineDriver>> list(@QueryMap Filters<String, String> filters);

  @GET("machineDriver/{id}")
  Call<MachineDriver> get(@Path("id") String id);

  @POST("machineDriver")
  Call<MachineDriver> create(@Body MachineDriver machineDriver);

  @PUT("machineDriver/{id}")
  Call<MachineDriver> update(@Path("id") String id, @Body MachineDriver machineDriver);

  @DELETE("machineDriver/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
