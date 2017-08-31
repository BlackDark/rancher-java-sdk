package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceLink;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceLinkService {

  @GET("serviceLink")
  Call<TypeCollection<ServiceLink>> list();

  @GET("serviceLink")
  Call<TypeCollection<ServiceLink>> list(@QueryMap Filters<String, String> filters);

  @GET("serviceLink/{id}")
  Call<ServiceLink> get(@Path("id") String id);

  @POST("serviceLink")
  Call<ServiceLink> create(@Body ServiceLink serviceLink);

  @PUT("serviceLink/{id}")
  Call<ServiceLink> update(@Path("id") String id, @Body ServiceLink serviceLink);

  @DELETE("serviceLink/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
