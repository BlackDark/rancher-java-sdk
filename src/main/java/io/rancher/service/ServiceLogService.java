package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceLog;
import io.rancher.type.Account;
import io.rancher.type.Instance;
import io.rancher.type.Service;

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

public interface ServiceLogService {

  @GET("serviceLog")
  Call<TypeCollection<ServiceLog>> list();

  @GET("serviceLog")
  Call<TypeCollection<ServiceLog>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceLog/{id}")
  Call<ServiceLog> get(@Path("id") String id);

  @POST("serviceLog")
  Call<ServiceLog> create(@Body ServiceLog serviceLog);

  @PUT("serviceLog/{id}")
  Call<ServiceLog> update(@Path("id") String id, @Body ServiceLog serviceLog);

  @DELETE("serviceLog/{id}")
  Call<ResponseBody> delete(@Path("id") String id);
  

  
  @GET
  Call<Account> getLinkAccount(@Url String url );
  
  @GET
  Call<Instance> getLinkInstance(@Url String url );
  
  @GET
  Call<Service> getLinkService(@Url String url );
  
}
