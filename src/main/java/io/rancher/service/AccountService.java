package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Account;
import io.rancher.type.AuditLog;
import io.rancher.type.Backup;
import io.rancher.type.BackupTarget;
import io.rancher.type.Certificate;
import io.rancher.type.ContainerEvent;
import io.rancher.type.Credential;
import io.rancher.type.ExternalEvent;
import io.rancher.type.HealthcheckInstanceHostMap;
import io.rancher.type.Host;
import io.rancher.type.Image;
import io.rancher.type.Instance;
import io.rancher.type.InstanceLink;
import io.rancher.type.IpAddress;
import io.rancher.type.Label;
import io.rancher.type.Mount;
import io.rancher.type.Network;
import io.rancher.type.NetworkDriver;
import io.rancher.type.PhysicalHost;
import io.rancher.type.Port;
import io.rancher.type.ProjectMember;
import io.rancher.type.ProjectTemplate;
import io.rancher.type.Service;
import io.rancher.type.ServiceConsumeMap;
import io.rancher.type.ServiceEvent;
import io.rancher.type.ServiceExposeMap;
import io.rancher.type.ServiceLog;
import io.rancher.type.Snapshot;
import io.rancher.type.Stack;
import io.rancher.type.StorageDriver;
import io.rancher.type.StoragePool;
import io.rancher.type.Subnet;
import io.rancher.type.Volume;
import io.rancher.type.VolumeTemplate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

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
  Call<Response> delete(@Path("id") String id);

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
  Call<TypeCollection<AuditLog>> getLinkAuditLogs(@Url String url );

  @GET
  Call<TypeCollection<BackupTarget>> getLinkBackupTargets(@Url String url );

  @GET
  Call<TypeCollection<Backup>> getLinkBackups(@Url String url );

  @GET
  Call<TypeCollection<Certificate>> getLinkCertificates(@Url String url );

  @GET
  Call<TypeCollection<ContainerEvent>> getLinkContainerEvents(@Url String url );

  @GET
  Call<TypeCollection<Credential>> getLinkCredentials(@Url String url );

  @GET
  Call<TypeCollection<ExternalEvent>> getLinkExternalEvents(@Url String url );

  @GET
  Call<TypeCollection<HealthcheckInstanceHostMap>> getLinkHealthcheckInstanceHostMaps(@Url String url );

  @GET
  Call<TypeCollection<Host>> getLinkHosts(@Url String url );

  @GET
  Call<TypeCollection<Image>> getLinkImages(@Url String url );

  @GET
  Call<TypeCollection<InstanceLink>> getLinkInstanceLinks(@Url String url );

  @GET
  Call<TypeCollection<Instance>> getLinkInstances(@Url String url );

  @GET
  Call<TypeCollection<IpAddress>> getLinkIpAddress(@Url String url );

  @GET
  Call<TypeCollection<Label>> getLinkLabels(@Url String url );

  @GET
  Call<TypeCollection<Mount>> getLinkMounts(@Url String url );

  @GET
  Call<TypeCollection<NetworkDriver>> getLinkNetworkDrivers(@Url String url );

  @GET
  Call<TypeCollection<Network>> getLinkNetworks(@Url String url );

  @GET
  Call<TypeCollection<PhysicalHost>> getLinkPhysicalHosts(@Url String url );

  @GET
  Call<TypeCollection<Port>> getLinkPorts(@Url String url );

  @GET
  Call<TypeCollection<ProjectMember>> getLinkProjectMembers(@Url String url );

  @GET
  Call<TypeCollection<ProjectTemplate>> getLinkProjectTemplates(@Url String url );

  @GET
  Call<TypeCollection<ServiceConsumeMap>> getLinkServiceConsumeMaps(@Url String url );

  @GET
  Call<TypeCollection<ServiceEvent>> getLinkServiceEvents(@Url String url );

  @GET
  Call<TypeCollection<ServiceExposeMap>> getLinkServiceExposeMaps(@Url String url );

  @GET
  Call<TypeCollection<ServiceLog>> getLinkServiceLogs(@Url String url );

  @GET
  Call<TypeCollection<Service>> getLinkServices(@Url String url );

  @GET
  Call<TypeCollection<Snapshot>> getLinkSnapshots(@Url String url );

  @GET
  Call<TypeCollection<Stack>> getLinkStacks(@Url String url );

  @GET
  Call<TypeCollection<StorageDriver>> getLinkStorageDrivers(@Url String url );

  @GET
  Call<TypeCollection<StoragePool>> getLinkStoragePools(@Url String url );

  @GET
  Call<TypeCollection<Subnet>> getLinkSubnets(@Url String url );

  @GET
  Call<TypeCollection<VolumeTemplate>> getLinkVolumeTemplates(@Url String url );

  @GET
  Call<TypeCollection<Volume>> getLinkVolumes(@Url String url );

}
