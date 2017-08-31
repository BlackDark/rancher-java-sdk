package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FieldDocumentation;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FieldDocumentationService {

  @GET("fieldDocumentation")
  Call<TypeCollection<FieldDocumentation>> list();

  @GET("fieldDocumentation")
  Call<TypeCollection<FieldDocumentation>> list(@QueryMap Filters<String, String> filters);

  @GET("fieldDocumentation/{id}")
  Call<FieldDocumentation> get(@Path("id") String id);

  @POST("fieldDocumentation")
  Call<FieldDocumentation> create(@Body FieldDocumentation fieldDocumentation);

  @PUT("fieldDocumentation/{id}")
  Call<FieldDocumentation> update(@Path("id") String id, @Body FieldDocumentation fieldDocumentation);

  @DELETE("fieldDocumentation/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
