package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AddOutputsInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AddOutputsInputService {

  @GET("addOutputsInput")
  Call<TypeCollection<AddOutputsInput>> list();

  @GET("addOutputsInput")
  Call<TypeCollection<AddOutputsInput>> list(@QueryMap Filters<String, String> filters);

  @GET("addOutputsInput/{id}")
  Call<AddOutputsInput> get(@Path("id") String id);

  @POST("addOutputsInput")
  Call<AddOutputsInput> create(@Body AddOutputsInput addOutputsInput);

  @PUT("addOutputsInput/{id}")
  Call<AddOutputsInput> update(@Path("id") String id, @Body AddOutputsInput addOutputsInput);

  @DELETE("addOutputsInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
