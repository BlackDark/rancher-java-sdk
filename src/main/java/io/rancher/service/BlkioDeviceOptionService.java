package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BlkioDeviceOption;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BlkioDeviceOptionService {

  @GET("blkioDeviceOption")
  Call<TypeCollection<BlkioDeviceOption>> list();

  @GET("blkioDeviceOption")
  Call<TypeCollection<BlkioDeviceOption>> list(@QueryMap Filters<String, String> filters);

  @GET("blkioDeviceOption/{id}")
  Call<BlkioDeviceOption> get(@Path("id") String id);

  @POST("blkioDeviceOption")
  Call<BlkioDeviceOption> create(@Body BlkioDeviceOption blkioDeviceOption);

  @PUT("blkioDeviceOption/{id}")
  Call<BlkioDeviceOption> update(@Path("id") String id, @Body BlkioDeviceOption blkioDeviceOption);

  @DELETE("blkioDeviceOption/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
