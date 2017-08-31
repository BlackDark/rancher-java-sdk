package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MountEntry;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MountEntryService {

  @GET("mountEntry")
  Call<TypeCollection<MountEntry>> list();

  @GET("mountEntry")
  Call<TypeCollection<MountEntry>> list(@QueryMap Filters<String, String> filters);

  @GET("mountEntry/{id}")
  Call<MountEntry> get(@Path("id") String id);

  @POST("mountEntry")
  Call<MountEntry> create(@Body MountEntry mountEntry);

  @PUT("mountEntry/{id}")
  Call<MountEntry> update(@Path("id") String id, @Body MountEntry mountEntry);

  @DELETE("mountEntry/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
