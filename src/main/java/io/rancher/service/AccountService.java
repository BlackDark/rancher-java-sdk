package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AccountService {

  @GET("account")
  Call<TypeCollection<Account>> list();

  @GET("account")
  Call<TypeCollection<Account>> list(@QueryMap Filters<String, String> filters);

  @GET("account/{id}")
  Call<Account> get(@Path("id") String id);

  @POST("account")
  Call<Account> create(@Body Account account);

  @PUT("account/{id}")
  Call<Account> update(@Path("id") String id, @Body Account account);

  @DELETE("account/{id}")
  Call<ResponseBody> delete(@Path("id") String id);

  @POST("account/{id}?action=activate")
  Call<Account> activate(@Path("id") String id);

  @POST("account/{id}?action=deactivate")
  Call<Account> deactivate(@Path("id") String id);

  @POST("account/{id}?action=purge")
  Call<Account> purge(@Path("id") String id);

  @POST("account/{id}?action=remove")
  Call<Account> remove(@Path("id") String id);

  @POST("account/{id}?action=restore")
  Call<Account> restore(@Path("id") String id);

  @POST("account/{id}?action=upgrade")
  Call<Account> upgrade(@Path("id") String id);


  @GET
  Call<TypeCollection<AuditLog>> getLinkAuditLogs(@Url String url);

  @GET
  Call<TypeCollection<BackupTarget>> getLinkBackupTargets(@Url String url);

  @GET
  Call<TypeCollection<Backup>> getLinkBackups(@Url String url);

  @GET
  Call<TypeCollection<Certificate>> getLinkCertificates(@Url String url);

  @GET
  Call<TypeCollection<ContainerEvent>> getLinkContainerEvents(@Url String url);

  @GET
  Call<TypeCollection<Credential>> getLinkCredentials(@Url String url);

  @GET
  Call<TypeCollection<ExternalEvent>> getLinkExternalEvents(@Url String url);

  @GET
  Call<TypeCollection<HealthcheckInstanceHostMap>> getLinkHealthcheckInstanceHostMaps(@Url String url);

  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url);

  @GET
  Call<TypeCollection<Image>> getLinkImages(@Url String url);

  @GET
  Call<TypeCollection<InstanceLink>> getLinkInstanceLinks(@Url String url);

  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url);

  @GET
  Call<TypeCollection<IpAddress>> getLinkIpAddresses(@Url String url);

  @GET
  Call<TypeCollection<Label>> getLinkLabels(@Url String url);

  @GET
  Call<TypeCollection<Mount>> getLinkMounts(@Url String url);

  @GET
  Call<TypeCollection<NetworkDriver>> getLinkNetworkDrivers(@Url String url);

  @GET
  Call<TypeCollection<Network>> getLinkNetworks(@Url String url);

  @GET
  Call<TypeCollection<PhysicalHost>> getLinkPhysicalHosts(@Url String url);

  @GET
  Call<TypeCollection<Port>> getLinkPorts(@Url String url);

  @GET
  Call<TypeCollection<ProjectMember>> getLinkProjectMembers(@Url String url);

  @GET
  Call<TypeCollection<ProjectTemplate>> getLinkProjectTemplates(@Url String url);

  @GET
  Call<TypeCollection<ServiceConsumeMap>> getLinkServiceConsumeMaps(@Url String url);

  @GET
  Call<TypeCollection<ServiceEvent>> getLinkServiceEvents(@Url String url);

  @GET
  Call<TypeCollection<ServiceExposeMap>> getLinkServiceExposeMaps(@Url String url);

  @GET
  Call<TypeCollection<ServiceLog>> getLinkServiceLogs(@Url String url);

  @GET
  Call<TypeCollection<Service>> getLinkServices(@Url String url);

  @GET
  Call<TypeCollection<Snapshot>> getLinkSnapshots(@Url String url);

  @GET
  Call<TypeCollection<Stack>> getLinkStacks(@Url String url);

  @GET
  Call<TypeCollection<StorageDriver>> getLinkStorageDrivers(@Url String url);

  @GET
  Call<TypeCollection<StoragePool>> getLinkStoragePools(@Url String url);

  @GET
  Call<TypeCollection<Subnet>> getLinkSubnets(@Url String url);

  @GET
  Call<TypeCollection<VolumeTemplate>> getLinkVolumeTemplates(@Url String url);

  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url);

}
