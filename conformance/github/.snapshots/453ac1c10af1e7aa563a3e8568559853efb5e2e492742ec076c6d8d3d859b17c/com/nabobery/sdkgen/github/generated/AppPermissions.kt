package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The permissions granted to the fine-grained access token.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions
 */
@Serializable(with = AppPermissions.Serializer::class)
public class AppPermissions(
  /**
   * The level of permission to grant the access token for GitHub Actions workflows, workflow runs, and artifacts.
   */
  public val actions: InlineAppPermissionsActionsXafbce927? = null,
  /**
   * The level of permission to grant the access token for repository creation, deletion, settings, teams, and
   * collaborators creation.
   */
  public val administration: InlineAppPermissionsAdministrationXdde01ac1? = null,
  /**
   * The level of permission to grant the access token to create and retrieve build artifact metadata records.
   */
  public val artifactMetadata: InlineAppPermissionsArtifactMetadataXe8a4fa46? = null,
  /**
   * The level of permission to create and retrieve the access token for repository attestations.
   */
  public val attestations: InlineAppPermissionsAttestationsX0a6108f7? = null,
  /**
   * The level of permission to grant the access token for checks on code.
   */
  public val checks: InlineAppPermissionsChecksX55bad9f3? = null,
  /**
   * The level of permission to grant the access token to view and manage code quality data.
   */
  public val codeQuality: InlineAppPermissionsCodeQualityX8a02deda? = null,
  /**
   * The level of permission to grant the access token to create, edit, delete, and list Codespaces.
   */
  public val codespaces: InlineAppPermissionsCodespacesXce243380? = null,
  /**
   * The level of permission to grant the access token for repository contents, commits, branches, downloads, releases,
   * and merges.
   */
  public val contents: InlineAppPermissionsContentsX5ade989b? = null,
  /**
   * The level of permission to grant the access token to view and edit custom properties for an organization, when
   * allowed by the property.
   */
  public val customPropertiesForOrganizations:
      InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4? = null,
  /**
   * The level of permission to grant the access token to manage Dependabot secrets.
   */
  public val dependabotSecrets: InlineAppPermissionsDependabotSecretsXd6989602? = null,
  /**
   * The level of permission to grant the access token for deployments and deployment statuses.
   */
  public val deployments: InlineAppPermissionsDeploymentsXa5b10b63? = null,
  /**
   * The level of permission to grant the access token for discussions and related comments and labels.
   */
  public val discussions: InlineAppPermissionsDiscussionsX9a86c739? = null,
  /**
   * The level of permission to grant the access token to manage the email addresses belonging to a user.
   */
  public val emailAddresses: InlineAppPermissionsEmailAddressesX192ffbe2? = null,
  /**
   * The level of permission to grant the access token for organization custom properties management at the enterprise
   * level.
   */
  public val enterpriseCustomPropertiesForOrganizations:
      InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96? = null,
  /**
   * The level of permission to grant the access token for managing repository environments.
   */
  public val environments: InlineAppPermissionsEnvironmentsXc27123e6? = null,
  /**
   * The level of permission to grant the access token to manage the followers belonging to a user.
   */
  public val followers: InlineAppPermissionsFollowersX2e17ce08? = null,
  /**
   * The level of permission to grant the access token to manage git SSH keys.
   */
  public val gitSshKeys: InlineAppPermissionsGitSshKeysX8e69e547? = null,
  /**
   * The level of permission to grant the access token to view and manage GPG keys belonging to a user.
   */
  public val gpgKeys: InlineAppPermissionsGpgKeysXa1dccdcb? = null,
  /**
   * The level of permission to grant the access token to view and manage interaction limits on a repository.
   */
  public val interactionLimits: InlineAppPermissionsInteractionLimitsX3b3c372d? = null,
  /**
   * The level of permission to grant the access token for issues and related comments, assignees, labels, and
   * milestones.
   */
  public val issues: InlineAppPermissionsIssuesX1ab90ca1? = null,
  /**
   * The level of permission to grant the access token for organization teams and members.
   */
  public val members: InlineAppPermissionsMembersX97f6c7a3? = null,
  /**
   * The level of permission to grant the access token to manage the merge queues for a repository.
   */
  public val mergeQueues: InlineAppPermissionsMergeQueuesXc0237fae? = null,
  /**
   * The level of permission to grant the access token to search repositories, list collaborators, and access repository
   * metadata.
   */
  public val metadata: InlineAppPermissionsMetadataX4aebb0bf? = null,
  /**
   * The level of permission to grant the access token to manage access to an organization.
   */
  public val organizationAdministration:
      InlineAppPermissionsOrganizationAdministrationX9cab22d8? = null,
  /**
   * The level of permission to grant the access token to view and manage announcement banners for an organization.
   */
  public val organizationAnnouncementBanners:
      InlineAppPermissionsOrganizationAnnouncementBannersX2b607c3a? = null,
  /**
   * The level of permission to grant the access token to view and manage Copilot cloud agent settings for an
   * organization.
   */
  public val organizationCopilotAgentSettings:
      InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a? = null,
  /**
   * The level of permission to grant the access token for managing access to GitHub Copilot for members of an
   * organization with a Copilot Business subscription. This property is in public preview and is subject to change.
   */
  public val organizationCopilotSeatManagement:
      InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda? = null,
  /**
   * The level of permission to grant the access token for custom organization roles management.
   */
  public val organizationCustomOrgRoles:
      InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2? = null,
  /**
   * The level of permission to grant the access token for repository custom properties management at the organization
   * level.
   */
  public val organizationCustomProperties:
      InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f? = null,
  /**
   * The level of permission to grant the access token for custom repository roles management.
   */
  public val organizationCustomRoles: InlineAppPermissionsOrganizationCustomRolesXc6d1e6f0? = null,
  /**
   * The level of permission to grant the access token to view events triggered by an activity in an organization.
   */
  public val organizationEvents: InlineAppPermissionsOrganizationEventsX142d21a2? = null,
  /**
   * The level of permission to grant the access token to manage the post-receive hooks for an organization.
   */
  public val organizationHooks: InlineAppPermissionsOrganizationHooksX2381525d? = null,
  /**
   * The level of permission to grant the access token for organization packages published to GitHub Packages.
   */
  public val organizationPackages: InlineAppPermissionsOrganizationPackagesX198a1c2a? = null,
  /**
   * The level of permission to grant the access token for viewing and managing fine-grained personal access tokens that
   * have been approved by an organization.
   */
  public val organizationPersonalAccessTokenRequests:
      InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b? = null,
  /**
   * The level of permission to grant the access token for viewing and managing fine-grained personal access token
   * requests to an organization.
   */
  public val organizationPersonalAccessTokens:
      InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7? = null,
  /**
   * The level of permission to grant the access token for viewing an organization's plan.
   */
  public val organizationPlan: InlineAppPermissionsOrganizationPlanXfaea73bc? = null,
  /**
   * The level of permission to grant the access token to manage organization projects and projects public preview
   * (where available).
   */
  public val organizationProjects: InlineAppPermissionsOrganizationProjectsX5afe3501? = null,
  /**
   * The level of permission to grant the access token to manage organization secrets.
   */
  public val organizationSecrets: InlineAppPermissionsOrganizationSecretsX6b08d9d2? = null,
  /**
   * The level of permission to grant the access token to view and manage GitHub Actions self-hosted runners available
   * to an organization.
   */
  public val organizationSelfHostedRunners:
      InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617? = null,
  /**
   * The level of permission to grant the access token to view and manage users blocked by the organization.
   */
  public val organizationUserBlocking:
      InlineAppPermissionsOrganizationUserBlockingX03acce02? = null,
  /**
   * The level of permission to grant the access token for packages published to GitHub Packages.
   */
  public val packages: InlineAppPermissionsPackagesXf9362eb3? = null,
  /**
   * The level of permission to grant the access token to retrieve Pages statuses, configuration, and builds, as well as
   * create new builds.
   */
  public val pages: InlineAppPermissionsPagesX32ce89e1? = null,
  /**
   * The level of permission to grant the access token to manage the profile settings belonging to a user.
   */
  public val profile: InlineAppPermissionsProfileX70802582? = null,
  /**
   * The level of permission to grant the access token for pull requests and related comments, assignees, labels,
   * milestones, and merges.
   */
  public val pullRequests: InlineAppPermissionsPullRequestsXa4724cb2? = null,
  /**
   * The level of permission to grant the access token to view and edit custom properties for a repository, when allowed
   * by the property.
   */
  public val repositoryCustomProperties:
      InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0? = null,
  /**
   * The level of permission to grant the access token to manage the post-receive hooks for a repository.
   */
  public val repositoryHooks: InlineAppPermissionsRepositoryHooksX8cce26c8? = null,
  /**
   * The level of permission to grant the access token to manage repository projects, columns, and cards.
   */
  public val repositoryProjects: InlineAppPermissionsRepositoryProjectsX19913fb9? = null,
  /**
   * The level of permission to grant the access token to view and manage secret scanning alerts.
   */
  public val secretScanningAlerts: InlineAppPermissionsSecretScanningAlertsX161d463f? = null,
  /**
   * The level of permission to grant the access token to manage repository secrets.
   */
  public val secrets: InlineAppPermissionsSecretsX877b373e? = null,
  /**
   * The level of permission to grant the access token to view and manage security events like code scanning alerts.
   */
  public val securityEvents: InlineAppPermissionsSecurityEventsXddf5cb81? = null,
  /**
   * The level of permission to grant the access token to manage just a single file.
   */
  public val singleFile: InlineAppPermissionsSingleFileX4e598c37? = null,
  /**
   * The level of permission to grant the access token to list and manage repositories a user is starring.
   */
  public val starring: InlineAppPermissionsStarringX87ff7e81? = null,
  /**
   * The level of permission to grant the access token for commit statuses.
   */
  public val statuses: InlineAppPermissionsStatusesX3f04134c? = null,
  /**
   * The level of permission to grant the access token to manage Dependabot alerts.
   */
  public val vulnerabilityAlerts: InlineAppPermissionsVulnerabilityAlertsXa28a572a? = null,
  /**
   * The level of permission to grant the access token to update GitHub Actions workflow files.
   */
  public val workflows: InlineAppPermissionsWorkflowsX76409a5e? = null,
) {
  public class Builder {
    /**
     * The level of permission to grant the access token for GitHub Actions workflows, workflow runs, and artifacts.
     */
    public var actions: InlineAppPermissionsActionsXafbce927? = null

    /**
     * The level of permission to grant the access token for repository creation, deletion, settings, teams, and
     * collaborators creation.
     */
    public var administration: InlineAppPermissionsAdministrationXdde01ac1? = null

    /**
     * The level of permission to grant the access token to create and retrieve build artifact metadata records.
     */
    public var artifactMetadata: InlineAppPermissionsArtifactMetadataXe8a4fa46? = null

    /**
     * The level of permission to create and retrieve the access token for repository attestations.
     */
    public var attestations: InlineAppPermissionsAttestationsX0a6108f7? = null

    /**
     * The level of permission to grant the access token for checks on code.
     */
    public var checks: InlineAppPermissionsChecksX55bad9f3? = null

    /**
     * The level of permission to grant the access token to view and manage code quality data.
     */
    public var codeQuality: InlineAppPermissionsCodeQualityX8a02deda? = null

    /**
     * The level of permission to grant the access token to create, edit, delete, and list Codespaces.
     */
    public var codespaces: InlineAppPermissionsCodespacesXce243380? = null

    /**
     * The level of permission to grant the access token for repository contents, commits, branches, downloads,
     * releases, and merges.
     */
    public var contents: InlineAppPermissionsContentsX5ade989b? = null

    /**
     * The level of permission to grant the access token to view and edit custom properties for an organization, when
     * allowed by the property.
     */
    public var customPropertiesForOrganizations:
        InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4? = null

    /**
     * The level of permission to grant the access token to manage Dependabot secrets.
     */
    public var dependabotSecrets: InlineAppPermissionsDependabotSecretsXd6989602? = null

    /**
     * The level of permission to grant the access token for deployments and deployment statuses.
     */
    public var deployments: InlineAppPermissionsDeploymentsXa5b10b63? = null

    /**
     * The level of permission to grant the access token for discussions and related comments and labels.
     */
    public var discussions: InlineAppPermissionsDiscussionsX9a86c739? = null

    /**
     * The level of permission to grant the access token to manage the email addresses belonging to a user.
     */
    public var emailAddresses: InlineAppPermissionsEmailAddressesX192ffbe2? = null

    /**
     * The level of permission to grant the access token for organization custom properties management at the enterprise
     * level.
     */
    public var enterpriseCustomPropertiesForOrganizations:
        InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96? = null

    /**
     * The level of permission to grant the access token for managing repository environments.
     */
    public var environments: InlineAppPermissionsEnvironmentsXc27123e6? = null

    /**
     * The level of permission to grant the access token to manage the followers belonging to a user.
     */
    public var followers: InlineAppPermissionsFollowersX2e17ce08? = null

    /**
     * The level of permission to grant the access token to manage git SSH keys.
     */
    public var gitSshKeys: InlineAppPermissionsGitSshKeysX8e69e547? = null

    /**
     * The level of permission to grant the access token to view and manage GPG keys belonging to a user.
     */
    public var gpgKeys: InlineAppPermissionsGpgKeysXa1dccdcb? = null

    /**
     * The level of permission to grant the access token to view and manage interaction limits on a repository.
     */
    public var interactionLimits: InlineAppPermissionsInteractionLimitsX3b3c372d? = null

    /**
     * The level of permission to grant the access token for issues and related comments, assignees, labels, and
     * milestones.
     */
    public var issues: InlineAppPermissionsIssuesX1ab90ca1? = null

    /**
     * The level of permission to grant the access token for organization teams and members.
     */
    public var members: InlineAppPermissionsMembersX97f6c7a3? = null

    /**
     * The level of permission to grant the access token to manage the merge queues for a repository.
     */
    public var mergeQueues: InlineAppPermissionsMergeQueuesXc0237fae? = null

    /**
     * The level of permission to grant the access token to search repositories, list collaborators, and access
     * repository metadata.
     */
    public var metadata: InlineAppPermissionsMetadataX4aebb0bf? = null

    /**
     * The level of permission to grant the access token to manage access to an organization.
     */
    public var organizationAdministration: InlineAppPermissionsOrganizationAdministrationX9cab22d8?
        = null

    /**
     * The level of permission to grant the access token to view and manage announcement banners for an organization.
     */
    public var organizationAnnouncementBanners:
        InlineAppPermissionsOrganizationAnnouncementBannersX2b607c3a? = null

    /**
     * The level of permission to grant the access token to view and manage Copilot cloud agent settings for an
     * organization.
     */
    public var organizationCopilotAgentSettings:
        InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a? = null

    /**
     * The level of permission to grant the access token for managing access to GitHub Copilot for members of an
     * organization with a Copilot Business subscription. This property is in public preview and is subject to change.
     */
    public var organizationCopilotSeatManagement:
        InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda? = null

    /**
     * The level of permission to grant the access token for custom organization roles management.
     */
    public var organizationCustomOrgRoles: InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2?
        = null

    /**
     * The level of permission to grant the access token for repository custom properties management at the organization
     * level.
     */
    public var organizationCustomProperties:
        InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f? = null

    /**
     * The level of permission to grant the access token for custom repository roles management.
     */
    public var organizationCustomRoles: InlineAppPermissionsOrganizationCustomRolesXc6d1e6f0? = null

    /**
     * The level of permission to grant the access token to view events triggered by an activity in an organization.
     */
    public var organizationEvents: InlineAppPermissionsOrganizationEventsX142d21a2? = null

    /**
     * The level of permission to grant the access token to manage the post-receive hooks for an organization.
     */
    public var organizationHooks: InlineAppPermissionsOrganizationHooksX2381525d? = null

    /**
     * The level of permission to grant the access token for organization packages published to GitHub Packages.
     */
    public var organizationPackages: InlineAppPermissionsOrganizationPackagesX198a1c2a? = null

    /**
     * The level of permission to grant the access token for viewing and managing fine-grained personal access tokens
     * that have been approved by an organization.
     */
    public var organizationPersonalAccessTokenRequests:
        InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b? = null

    /**
     * The level of permission to grant the access token for viewing and managing fine-grained personal access token
     * requests to an organization.
     */
    public var organizationPersonalAccessTokens:
        InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7? = null

    /**
     * The level of permission to grant the access token for viewing an organization's plan.
     */
    public var organizationPlan: InlineAppPermissionsOrganizationPlanXfaea73bc? = null

    /**
     * The level of permission to grant the access token to manage organization projects and projects public preview
     * (where available).
     */
    public var organizationProjects: InlineAppPermissionsOrganizationProjectsX5afe3501? = null

    /**
     * The level of permission to grant the access token to manage organization secrets.
     */
    public var organizationSecrets: InlineAppPermissionsOrganizationSecretsX6b08d9d2? = null

    /**
     * The level of permission to grant the access token to view and manage GitHub Actions self-hosted runners available
     * to an organization.
     */
    public var organizationSelfHostedRunners:
        InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617? = null

    /**
     * The level of permission to grant the access token to view and manage users blocked by the organization.
     */
    public var organizationUserBlocking: InlineAppPermissionsOrganizationUserBlockingX03acce02? =
        null

    /**
     * The level of permission to grant the access token for packages published to GitHub Packages.
     */
    public var packages: InlineAppPermissionsPackagesXf9362eb3? = null

    /**
     * The level of permission to grant the access token to retrieve Pages statuses, configuration, and builds, as well
     * as create new builds.
     */
    public var pages: InlineAppPermissionsPagesX32ce89e1? = null

    /**
     * The level of permission to grant the access token to manage the profile settings belonging to a user.
     */
    public var profile: InlineAppPermissionsProfileX70802582? = null

    /**
     * The level of permission to grant the access token for pull requests and related comments, assignees, labels,
     * milestones, and merges.
     */
    public var pullRequests: InlineAppPermissionsPullRequestsXa4724cb2? = null

    /**
     * The level of permission to grant the access token to view and edit custom properties for a repository, when
     * allowed by the property.
     */
    public var repositoryCustomProperties: InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0?
        = null

    /**
     * The level of permission to grant the access token to manage the post-receive hooks for a repository.
     */
    public var repositoryHooks: InlineAppPermissionsRepositoryHooksX8cce26c8? = null

    /**
     * The level of permission to grant the access token to manage repository projects, columns, and cards.
     */
    public var repositoryProjects: InlineAppPermissionsRepositoryProjectsX19913fb9? = null

    /**
     * The level of permission to grant the access token to view and manage secret scanning alerts.
     */
    public var secretScanningAlerts: InlineAppPermissionsSecretScanningAlertsX161d463f? = null

    /**
     * The level of permission to grant the access token to manage repository secrets.
     */
    public var secrets: InlineAppPermissionsSecretsX877b373e? = null

    /**
     * The level of permission to grant the access token to view and manage security events like code scanning alerts.
     */
    public var securityEvents: InlineAppPermissionsSecurityEventsXddf5cb81? = null

    /**
     * The level of permission to grant the access token to manage just a single file.
     */
    public var singleFile: InlineAppPermissionsSingleFileX4e598c37? = null

    /**
     * The level of permission to grant the access token to list and manage repositories a user is starring.
     */
    public var starring: InlineAppPermissionsStarringX87ff7e81? = null

    /**
     * The level of permission to grant the access token for commit statuses.
     */
    public var statuses: InlineAppPermissionsStatusesX3f04134c? = null

    /**
     * The level of permission to grant the access token to manage Dependabot alerts.
     */
    public var vulnerabilityAlerts: InlineAppPermissionsVulnerabilityAlertsXa28a572a? = null

    /**
     * The level of permission to grant the access token to update GitHub Actions workflow files.
     */
    public var workflows: InlineAppPermissionsWorkflowsX76409a5e? = null

    public fun build(): AppPermissions = AppPermissions(
      actions = actions,
      administration = administration,
      artifactMetadata = artifactMetadata,
      attestations = attestations,
      checks = checks,
      codeQuality = codeQuality,
      codespaces = codespaces,
      contents = contents,
      customPropertiesForOrganizations = customPropertiesForOrganizations,
      dependabotSecrets = dependabotSecrets,
      deployments = deployments,
      discussions = discussions,
      emailAddresses = emailAddresses,
      enterpriseCustomPropertiesForOrganizations = enterpriseCustomPropertiesForOrganizations,
      environments = environments,
      followers = followers,
      gitSshKeys = gitSshKeys,
      gpgKeys = gpgKeys,
      interactionLimits = interactionLimits,
      issues = issues,
      members = members,
      mergeQueues = mergeQueues,
      metadata = metadata,
      organizationAdministration = organizationAdministration,
      organizationAnnouncementBanners = organizationAnnouncementBanners,
      organizationCopilotAgentSettings = organizationCopilotAgentSettings,
      organizationCopilotSeatManagement = organizationCopilotSeatManagement,
      organizationCustomOrgRoles = organizationCustomOrgRoles,
      organizationCustomProperties = organizationCustomProperties,
      organizationCustomRoles = organizationCustomRoles,
      organizationEvents = organizationEvents,
      organizationHooks = organizationHooks,
      organizationPackages = organizationPackages,
      organizationPersonalAccessTokenRequests = organizationPersonalAccessTokenRequests,
      organizationPersonalAccessTokens = organizationPersonalAccessTokens,
      organizationPlan = organizationPlan,
      organizationProjects = organizationProjects,
      organizationSecrets = organizationSecrets,
      organizationSelfHostedRunners = organizationSelfHostedRunners,
      organizationUserBlocking = organizationUserBlocking,
      packages = packages,
      pages = pages,
      profile = profile,
      pullRequests = pullRequests,
      repositoryCustomProperties = repositoryCustomProperties,
      repositoryHooks = repositoryHooks,
      repositoryProjects = repositoryProjects,
      secretScanningAlerts = secretScanningAlerts,
      secrets = secrets,
      securityEvents = securityEvents,
      singleFile = singleFile,
      starring = starring,
      statuses = statuses,
      vulnerabilityAlerts = vulnerabilityAlerts,
      workflows = workflows,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AppPermissions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AppPermissions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AppPermissions {
      val jsonDecoder = decoder.requireJsonDecoder("AppPermissions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AppPermissions must be a JSON object")
      return AppPermissions(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineAppPermissionsActionsXafbce927>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineAppPermissionsAdministrationXdde01ac1>(it) },
        artifactMetadata = rawObject["artifact_metadata"]?.let { json.decodeFromJsonElement<InlineAppPermissionsArtifactMetadataXe8a4fa46>(it) },
        attestations = rawObject["attestations"]?.let { json.decodeFromJsonElement<InlineAppPermissionsAttestationsX0a6108f7>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineAppPermissionsChecksX55bad9f3>(it) },
        codeQuality = rawObject["code_quality"]?.let { json.decodeFromJsonElement<InlineAppPermissionsCodeQualityX8a02deda>(it) },
        codespaces = rawObject["codespaces"]?.let { json.decodeFromJsonElement<InlineAppPermissionsCodespacesXce243380>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineAppPermissionsContentsX5ade989b>(it) },
        customPropertiesForOrganizations = rawObject["custom_properties_for_organizations"]?.let { json.decodeFromJsonElement<InlineAppPermissionsCustomPropertiesForOrganizationsX9a66f3f4>(it) },
        dependabotSecrets = rawObject["dependabot_secrets"]?.let { json.decodeFromJsonElement<InlineAppPermissionsDependabotSecretsXd6989602>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineAppPermissionsDeploymentsXa5b10b63>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineAppPermissionsDiscussionsX9a86c739>(it) },
        emailAddresses = rawObject["email_addresses"]?.let { json.decodeFromJsonElement<InlineAppPermissionsEmailAddressesX192ffbe2>(it) },
        enterpriseCustomPropertiesForOrganizations = rawObject["enterprise_custom_properties_for_organizations"]?.let { json.decodeFromJsonElement<InlineAppPermissionsEnterpriseCustomPropertiesForOrganizationsX1769ea96>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineAppPermissionsEnvironmentsXc27123e6>(it) },
        followers = rawObject["followers"]?.let { json.decodeFromJsonElement<InlineAppPermissionsFollowersX2e17ce08>(it) },
        gitSshKeys = rawObject["git_ssh_keys"]?.let { json.decodeFromJsonElement<InlineAppPermissionsGitSshKeysX8e69e547>(it) },
        gpgKeys = rawObject["gpg_keys"]?.let { json.decodeFromJsonElement<InlineAppPermissionsGpgKeysXa1dccdcb>(it) },
        interactionLimits = rawObject["interaction_limits"]?.let { json.decodeFromJsonElement<InlineAppPermissionsInteractionLimitsX3b3c372d>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineAppPermissionsIssuesX1ab90ca1>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineAppPermissionsMembersX97f6c7a3>(it) },
        mergeQueues = rawObject["merge_queues"]?.let { json.decodeFromJsonElement<InlineAppPermissionsMergeQueuesXc0237fae>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineAppPermissionsMetadataX4aebb0bf>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationAdministrationX9cab22d8>(it) },
        organizationAnnouncementBanners = rawObject["organization_announcement_banners"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationAnnouncementBannersX2b607c3a>(it) },
        organizationCopilotAgentSettings = rawObject["organization_copilot_agent_settings"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationCopilotAgentSettingsX4599f49a>(it) },
        organizationCopilotSeatManagement = rawObject["organization_copilot_seat_management"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationCopilotSeatManagementXa3c97fda>(it) },
        organizationCustomOrgRoles = rawObject["organization_custom_org_roles"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationCustomOrgRolesX3a8a97c2>(it) },
        organizationCustomProperties = rawObject["organization_custom_properties"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationCustomPropertiesX87f3cc7f>(it) },
        organizationCustomRoles = rawObject["organization_custom_roles"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationCustomRolesXc6d1e6f0>(it) },
        organizationEvents = rawObject["organization_events"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationEventsX142d21a2>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationHooksX2381525d>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationPackagesX198a1c2a>(it) },
        organizationPersonalAccessTokenRequests = rawObject["organization_personal_access_token_requests"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationPersonalAccessTokenRequestsX07463e6b>(it) },
        organizationPersonalAccessTokens = rawObject["organization_personal_access_tokens"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationPersonalAccessTokensX74a5b6f7>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationPlanXfaea73bc>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationProjectsX5afe3501>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationSecretsX6b08d9d2>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationSelfHostedRunnersX4f2da617>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineAppPermissionsOrganizationUserBlockingX03acce02>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineAppPermissionsPackagesXf9362eb3>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineAppPermissionsPagesX32ce89e1>(it) },
        profile = rawObject["profile"]?.let { json.decodeFromJsonElement<InlineAppPermissionsProfileX70802582>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineAppPermissionsPullRequestsXa4724cb2>(it) },
        repositoryCustomProperties = rawObject["repository_custom_properties"]?.let { json.decodeFromJsonElement<InlineAppPermissionsRepositoryCustomPropertiesXe4f59bc0>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineAppPermissionsRepositoryHooksX8cce26c8>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineAppPermissionsRepositoryProjectsX19913fb9>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineAppPermissionsSecretScanningAlertsX161d463f>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineAppPermissionsSecretsX877b373e>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineAppPermissionsSecurityEventsXddf5cb81>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineAppPermissionsSingleFileX4e598c37>(it) },
        starring = rawObject["starring"]?.let { json.decodeFromJsonElement<InlineAppPermissionsStarringX87ff7e81>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineAppPermissionsStatusesX3f04134c>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineAppPermissionsVulnerabilityAlertsXa28a572a>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineAppPermissionsWorkflowsX76409a5e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AppPermissions) {
      val jsonEncoder = encoder.requireJsonEncoder("AppPermissions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.actions?.let { put("actions", json.encodeToJsonElement(it)) }
        value.administration?.let { put("administration", json.encodeToJsonElement(it)) }
        value.artifactMetadata?.let { put("artifact_metadata", json.encodeToJsonElement(it)) }
        value.attestations?.let { put("attestations", json.encodeToJsonElement(it)) }
        value.checks?.let { put("checks", json.encodeToJsonElement(it)) }
        value.codeQuality?.let { put("code_quality", json.encodeToJsonElement(it)) }
        value.codespaces?.let { put("codespaces", json.encodeToJsonElement(it)) }
        value.contents?.let { put("contents", json.encodeToJsonElement(it)) }
        value.customPropertiesForOrganizations?.let { put("custom_properties_for_organizations", json.encodeToJsonElement(it)) }
        value.dependabotSecrets?.let { put("dependabot_secrets", json.encodeToJsonElement(it)) }
        value.deployments?.let { put("deployments", json.encodeToJsonElement(it)) }
        value.discussions?.let { put("discussions", json.encodeToJsonElement(it)) }
        value.emailAddresses?.let { put("email_addresses", json.encodeToJsonElement(it)) }
        value.enterpriseCustomPropertiesForOrganizations?.let { put("enterprise_custom_properties_for_organizations", json.encodeToJsonElement(it)) }
        value.environments?.let { put("environments", json.encodeToJsonElement(it)) }
        value.followers?.let { put("followers", json.encodeToJsonElement(it)) }
        value.gitSshKeys?.let { put("git_ssh_keys", json.encodeToJsonElement(it)) }
        value.gpgKeys?.let { put("gpg_keys", json.encodeToJsonElement(it)) }
        value.interactionLimits?.let { put("interaction_limits", json.encodeToJsonElement(it)) }
        value.issues?.let { put("issues", json.encodeToJsonElement(it)) }
        value.members?.let { put("members", json.encodeToJsonElement(it)) }
        value.mergeQueues?.let { put("merge_queues", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.organizationAdministration?.let { put("organization_administration", json.encodeToJsonElement(it)) }
        value.organizationAnnouncementBanners?.let { put("organization_announcement_banners", json.encodeToJsonElement(it)) }
        value.organizationCopilotAgentSettings?.let { put("organization_copilot_agent_settings", json.encodeToJsonElement(it)) }
        value.organizationCopilotSeatManagement?.let { put("organization_copilot_seat_management", json.encodeToJsonElement(it)) }
        value.organizationCustomOrgRoles?.let { put("organization_custom_org_roles", json.encodeToJsonElement(it)) }
        value.organizationCustomProperties?.let { put("organization_custom_properties", json.encodeToJsonElement(it)) }
        value.organizationCustomRoles?.let { put("organization_custom_roles", json.encodeToJsonElement(it)) }
        value.organizationEvents?.let { put("organization_events", json.encodeToJsonElement(it)) }
        value.organizationHooks?.let { put("organization_hooks", json.encodeToJsonElement(it)) }
        value.organizationPackages?.let { put("organization_packages", json.encodeToJsonElement(it)) }
        value.organizationPersonalAccessTokenRequests?.let { put("organization_personal_access_token_requests", json.encodeToJsonElement(it)) }
        value.organizationPersonalAccessTokens?.let { put("organization_personal_access_tokens", json.encodeToJsonElement(it)) }
        value.organizationPlan?.let { put("organization_plan", json.encodeToJsonElement(it)) }
        value.organizationProjects?.let { put("organization_projects", json.encodeToJsonElement(it)) }
        value.organizationSecrets?.let { put("organization_secrets", json.encodeToJsonElement(it)) }
        value.organizationSelfHostedRunners?.let { put("organization_self_hosted_runners", json.encodeToJsonElement(it)) }
        value.organizationUserBlocking?.let { put("organization_user_blocking", json.encodeToJsonElement(it)) }
        value.packages?.let { put("packages", json.encodeToJsonElement(it)) }
        value.pages?.let { put("pages", json.encodeToJsonElement(it)) }
        value.profile?.let { put("profile", json.encodeToJsonElement(it)) }
        value.pullRequests?.let { put("pull_requests", json.encodeToJsonElement(it)) }
        value.repositoryCustomProperties?.let { put("repository_custom_properties", json.encodeToJsonElement(it)) }
        value.repositoryHooks?.let { put("repository_hooks", json.encodeToJsonElement(it)) }
        value.repositoryProjects?.let { put("repository_projects", json.encodeToJsonElement(it)) }
        value.secretScanningAlerts?.let { put("secret_scanning_alerts", json.encodeToJsonElement(it)) }
        value.secrets?.let { put("secrets", json.encodeToJsonElement(it)) }
        value.securityEvents?.let { put("security_events", json.encodeToJsonElement(it)) }
        value.singleFile?.let { put("single_file", json.encodeToJsonElement(it)) }
        value.starring?.let { put("starring", json.encodeToJsonElement(it)) }
        value.statuses?.let { put("statuses", json.encodeToJsonElement(it)) }
        value.vulnerabilityAlerts?.let { put("vulnerability_alerts", json.encodeToJsonElement(it)) }
        value.workflows?.let { put("workflows", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun appPermissions(block: AppPermissions.Builder.() -> Unit): AppPermissions = AppPermissions.build(block)
