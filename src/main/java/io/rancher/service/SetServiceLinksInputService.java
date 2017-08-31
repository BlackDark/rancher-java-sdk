package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SetServiceLinksInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SetServiceLinksInputService {

  @GET("setServiceLinksInput")
  Call<TypeCollection<SetServiceLinksInput>> list();

  @GET("setServiceLinksInput")
  Call<TypeCollection<SetServiceLinksInput>> list(@QueryMap Filters<String, String> filters);

  @GET("setServiceLinksInput/{id}")
  Call<SetServiceLinksInput> get(@Path("id") String id);

  @POST("setServiceLinksInput")
  Call<SetServiceLinksInput> create(@Body SetServiceLinksInput setServiceLinksInput);

  @PUT("setServiceLinksInput/{id}")
  Call<SetServiceLinksInput> update(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput);

  @DELETE("setServiceLinksInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
