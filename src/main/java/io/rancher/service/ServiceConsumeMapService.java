package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.InstanceLink;
import io.rancher.type.Service;
import io.rancher.type.ServiceConsumeMap;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceConsumeMapService {

  @GET("serviceConsumeMap")
  Call<TypeCollection<ServiceConsumeMap>> list();

  @GET("serviceConsumeMap")
  Call<TypeCollection<ServiceConsumeMap>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceConsumeMap/{id}")
  Call<ServiceConsumeMap> get(@Path("id") String id);

  @POST("serviceConsumeMap")
  Call<ServiceConsumeMap> create(@Body ServiceConsumeMap serviceConsumeMap);

  @PUT("serviceConsumeMap/{id}")
  Call<ServiceConsumeMap> update(@Path("id") String id, @Body ServiceConsumeMap serviceConsumeMap);

  @DELETE("serviceConsumeMap/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("serviceConsumeMap/{id}?action=remove")
  Call<ServiceConsumeMap> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<InstanceLink>> getLinkInstanceLinks(@Url String url);

  @GET
  Call<Service> getLinkService(@Url String url);

}
