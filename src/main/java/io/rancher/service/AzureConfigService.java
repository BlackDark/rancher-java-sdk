package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AzureConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AzureConfigService {

  @GET("azureConfig")
  Call<TypeCollection<AzureConfig>> list();

  @GET("azureConfig")
  Call<TypeCollection<AzureConfig>> list(@QueryMap Filters<String, String> filters);

  @GET("azureConfig/{id}")
  Call<AzureConfig> get(@Path("id") String id);

  @POST("azureConfig")
  Call<AzureConfig> create(@Body AzureConfig azureConfig);

  @PUT("azureConfig/{id}")
  Call<AzureConfig> update(@Path("id") String id, @Body AzureConfig azureConfig);

  @DELETE("azureConfig/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
