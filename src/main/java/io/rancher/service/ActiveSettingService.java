package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ActiveSetting;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ActiveSettingService {

  @GET("activeSetting")
  Call<TypeCollection<ActiveSetting>> list();

  @GET("activeSetting")
  Call<TypeCollection<ActiveSetting>> list(@QueryMap Filters<String, String> filters);

  @GET("activeSetting/{id}")
  Call<ActiveSetting> get(@Path("id") String id);

  @POST("activeSetting")
  Call<ActiveSetting> create(@Body ActiveSetting activeSetting);

  @PUT("activeSetting/{id}")
  Call<ActiveSetting> update(@Path("id") String id, @Body ActiveSetting activeSetting);

  @DELETE("activeSetting/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
