package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ChangeSecretInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ChangeSecretInputService {

  @GET("changeSecretInput")
  Call<TypeCollection<ChangeSecretInput>> list();

  @GET("changeSecretInput")
  Call<TypeCollection<ChangeSecretInput>> list(@QueryMap Filters<String, String> filters);

  @GET("changeSecretInput/{id}")
  Call<ChangeSecretInput> get(@Path("id") String id);

  @POST("changeSecretInput")
  Call<ChangeSecretInput> create(@Body ChangeSecretInput changeSecretInput);

  @PUT("changeSecretInput/{id}")
  Call<ChangeSecretInput> update(@Path("id") String id, @Body ChangeSecretInput changeSecretInput);

  @DELETE("changeSecretInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
