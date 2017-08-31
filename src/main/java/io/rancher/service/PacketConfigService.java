package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PacketConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PacketConfigService {

  @GET("packetConfig")
  Call<TypeCollection<PacketConfig>> list();

  @GET("packetConfig")
  Call<TypeCollection<PacketConfig>> list(@QueryMap Filters<String, String> filters);

  @GET("packetConfig/{id}")
  Call<PacketConfig> get(@Path("id") String id);

  @POST("packetConfig")
  Call<PacketConfig> create(@Body PacketConfig packetConfig);

  @PUT("packetConfig/{id}")
  Call<PacketConfig> update(@Path("id") String id, @Body PacketConfig packetConfig);

  @DELETE("packetConfig/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
