package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.Instance;
import io.rancher.type.Service;
import io.rancher.type.ServiceExposeMap;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceExposeMapService {

  @GET("serviceExposeMap")
  Call<TypeCollection<ServiceExposeMap>> list();

  @GET("serviceExposeMap")
  Call<TypeCollection<ServiceExposeMap>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceExposeMap/{id}")
  Call<ServiceExposeMap> get(@Path("id") String id);

  @POST("serviceExposeMap")
  Call<ServiceExposeMap> create(@Body ServiceExposeMap serviceExposeMap);

  @PUT("serviceExposeMap/{id}")
  Call<ServiceExposeMap> update(@Path("id") String id, @Body ServiceExposeMap serviceExposeMap);

  @DELETE("serviceExposeMap/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("serviceExposeMap/{id}?action=remove")
  Call<ServiceExposeMap> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<Instance> getLinkInstance(@Url String url);

  @GET
  Call<Service> getLinkService(@Url String url);

}
