package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TypeDocumentation;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TypeDocumentationService {

  @GET("typeDocumentation")
  Call<TypeCollection<TypeDocumentation>> list();

  @GET("typeDocumentation")
  Call<TypeCollection<TypeDocumentation>> list(@QueryMap Filters<String, String> filters);

  @GET("typeDocumentation/{id}")
  Call<TypeDocumentation> get(@Path("id") String id);

  @POST("typeDocumentation")
  Call<TypeDocumentation> create(@Body TypeDocumentation typeDocumentation);

  @PUT("typeDocumentation/{id}")
  Call<TypeDocumentation> update(@Path("id") String id, @Body TypeDocumentation typeDocumentation);

  @DELETE("typeDocumentation/{id}")
  Call<ResponseBody> delete(@Path("id") String id);


}
