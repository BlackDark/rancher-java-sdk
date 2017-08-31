package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeConfigInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ComposeConfigInputService {

  @GET("composeConfigInput")
  Call<TypeCollection<ComposeConfigInput>> list();

  @GET("composeConfigInput")
  Call<TypeCollection<ComposeConfigInput>> list(@QueryMap Filters<String, String> filters);

  @GET("composeConfigInput/{id}")
  Call<ComposeConfigInput> get(@Path("id") String id);

  @POST("composeConfigInput")
  Call<ComposeConfigInput> create(@Body ComposeConfigInput composeConfigInput);

  @PUT("composeConfigInput/{id}")
  Call<ComposeConfigInput> update(@Path("id") String id, @Body ComposeConfigInput composeConfigInput);

  @DELETE("composeConfigInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
