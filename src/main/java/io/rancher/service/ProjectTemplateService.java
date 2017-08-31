package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.ProjectTemplate;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProjectTemplateService {

  @GET("projectTemplate")
  Call<TypeCollection<ProjectTemplate>> list();

  @GET("projectTemplate")
  Call<TypeCollection<ProjectTemplate>> list(@QueryMap Filters<String, String> filters);

  @GET("projectTemplate/{id}")
  Call<ProjectTemplate> get(@Path("id") String id);

  @POST("projectTemplate")
  Call<ProjectTemplate> create(@Body ProjectTemplate projectTemplate);

  @PUT("projectTemplate/{id}")
  Call<ProjectTemplate> update(@Path("id") String id, @Body ProjectTemplate projectTemplate);

  @DELETE("projectTemplate/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("projectTemplate/{id}?action=remove")
  Call<ProjectTemplate> remove(@Path("id") String id);


  @GET
  Call<Account> getLinkAccount(@Url String url);

  @GET
  Call<TypeCollection<Account>> getLinkAccounts(@Url String url);

}
