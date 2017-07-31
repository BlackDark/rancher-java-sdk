package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VolumeActivateInput;

import retrofit2.Call;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface VolumeActivateInputService {

  @GET("volumeActivateInput")
  Call<TypeCollection<VolumeActivateInput>> list();

  @GET("volumeActivateInput")
  Call<TypeCollection<VolumeActivateInput>> list(@QueryMap Filters<String, String> filters);

  @GET("volumeActivateInput/{id}")
  Call<VolumeActivateInput> get(@Path("id") String id);

  @POST("volumeActivateInput")
  Call<VolumeActivateInput> create(@Body VolumeActivateInput volumeActivateInput);

  @PUT("volumeActivateInput/{id}")
  Call<VolumeActivateInput> update(@Path("id") String id, @Body VolumeActivateInput volumeActivateInput);

  @DELETE("volumeActivateInput/{id}")
  Call<ResponseBody> delete(@Path("id") String id);
  

  
}
