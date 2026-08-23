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
 * The set of permissions for the GitHub app
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d.Serializer::class)
public class InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d(
  public val actions:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsActionsXbc77453b? = null,
  public val administration:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppAdministrationX47498bec? = null,
  public val checks:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsChecksX2403bdaf? = null,
  public val contentReferences:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5? = null,
  public val contents:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentsXd2d39820? = null,
  public val deployments:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDeploymentsX7f5816e1? = null,
  public val discussions:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47? = null,
  public val emails:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsEmailsX352a5228? = null,
  public val environments:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppEnvironmentsX27d4c1fd? = null,
  public val issues:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsIssuesXb80d7bfa? = null,
  public val keys:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsKeysX75ec5176? = null,
  public val members:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043? = null,
  public val metadata:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppMetadataX3a80688b? = null,
  public val organizationAdministration:
      InlineWebhookIssuesReopenedIssueOrganizationAdministca9fX61298d33? = null,
  public val organizationHooks:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationHooksX1f8e08c8? = null,
  public val organizationPackages:
      InlineWebhookIssuesReopenedIssueOrganizationPackagesXb4a13f2a? = null,
  public val organizationPlan:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d? = null,
  public val organizationProjects:
      InlineWebhookIssuesReopenedIssueOrganizationProjectsXec3395b8? = null,
  public val organizationSecrets:
      InlineWebhookIssuesReopenedIssueOrganizationSecretsX51d70cc4? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesReopenedIssueOrganizationSelfHost148fX220c6935? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesReopenedIssueOrganizationUserBlockingX26d76819? = null,
  public val packages:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6? = null,
  public val pages:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsPagesXe70a7b91? = null,
  public val pullRequests:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPullRequestsXc13c4920? = null,
  public val repositoryHooks:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppRepositoryHooksXa791321a? = null,
  public val repositoryProjects:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppRepositoryProjectsX2c488d99? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752? = null,
  public val secrets:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsSecretsX223021ae? = null,
  public val securityEvents:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppSecurityEventsX2fd6408a? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesReopenedIssueSecurityScanningAlertX02cd83a3? = null,
  public val singleFile:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppSingleFileX63798509? = null,
  public val statuses:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppStatusesX206676db? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesReopenedIssueVulnerabilityAlertsX1f9aca8d? = null,
  public val workflows:
      InlineWebhookIssuesReopenedIssuePerformedViaGithubAppWorkflowsXc3eb4369? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsActionsXbc77453b? = null

    public var administration:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppAdministrationX47498bec? = null

    public var checks:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsChecksX2403bdaf? = null

    public var contentReferences:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5? = null

    public var contents: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentsXd2d39820? =
        null

    public var deployments:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDeploymentsX7f5816e1? = null

    public var discussions:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47? = null

    public var emails:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsEmailsX352a5228? = null

    public var environments:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppEnvironmentsX27d4c1fd? = null

    public var issues:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsIssuesXb80d7bfa? = null

    public var keys: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsKeysX75ec5176?
        = null

    public var members:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043? = null

    public var metadata: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppMetadataX3a80688b? =
        null

    public var organizationAdministration:
        InlineWebhookIssuesReopenedIssueOrganizationAdministca9fX61298d33? = null

    public var organizationHooks:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationHooksX1f8e08c8? = null

    public var organizationPackages: InlineWebhookIssuesReopenedIssueOrganizationPackagesXb4a13f2a?
        = null

    public var organizationPlan:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d? = null

    public var organizationProjects: InlineWebhookIssuesReopenedIssueOrganizationProjectsXec3395b8?
        = null

    public var organizationSecrets: InlineWebhookIssuesReopenedIssueOrganizationSecretsX51d70cc4? =
        null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesReopenedIssueOrganizationSelfHost148fX220c6935? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesReopenedIssueOrganizationUserBlockingX26d76819? = null

    public var packages: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6? =
        null

    public var pages:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsPagesXe70a7b91? = null

    public var pullRequests:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPullRequestsXc13c4920? = null

    public var repositoryHooks:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppRepositoryHooksXa791321a? = null

    public var repositoryProjects:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppRepositoryProjectsX2c488d99? = null

    public var secretScanningAlerts: InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752?
        = null

    public var secrets:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsSecretsX223021ae? = null

    public var securityEvents:
        InlineWebhookIssuesReopenedIssuePerformedViaGithubAppSecurityEventsX2fd6408a? = null

    public var securityScanningAlert:
        InlineWebhookIssuesReopenedIssueSecurityScanningAlertX02cd83a3? = null

    public var singleFile: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppSingleFileX63798509?
        = null

    public var statuses: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppStatusesX206676db? =
        null

    public var vulnerabilityAlerts: InlineWebhookIssuesReopenedIssueVulnerabilityAlertsX1f9aca8d? =
        null

    public var workflows: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppWorkflowsXc3eb4369? =
        null

    public fun build(): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d(
      actions = actions,
      administration = administration,
      checks = checks,
      contentReferences = contentReferences,
      contents = contents,
      deployments = deployments,
      discussions = discussions,
      emails = emails,
      environments = environments,
      issues = issues,
      keys = keys,
      members = members,
      metadata = metadata,
      organizationAdministration = organizationAdministration,
      organizationHooks = organizationHooks,
      organizationPackages = organizationPackages,
      organizationPlan = organizationPlan,
      organizationProjects = organizationProjects,
      organizationSecrets = organizationSecrets,
      organizationSelfHostedRunners = organizationSelfHostedRunners,
      organizationUserBlocking = organizationUserBlocking,
      packages = packages,
      pages = pages,
      pullRequests = pullRequests,
      repositoryHooks = repositoryHooks,
      repositoryProjects = repositoryProjects,
      secretScanningAlerts = secretScanningAlerts,
      secrets = secrets,
      securityEvents = securityEvents,
      securityScanningAlert = securityScanningAlert,
      singleFile = singleFile,
      statuses = statuses,
      vulnerabilityAlerts = vulnerabilityAlerts,
      workflows = workflows,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d must be a JSON object")
      return InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsActionsXbc77453b>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppAdministrationX47498bec>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsChecksX2403bdaf>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentReferencesXe1adffb5>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppContentsXd2d39820>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDeploymentsX7f5816e1>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppDiscussionsX590b9e47>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsEmailsX352a5228>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppEnvironmentsX27d4c1fd>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsIssuesXb80d7bfa>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsKeysX75ec5176>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsMembersX40a76043>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppMetadataX3a80688b>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssueOrganizationAdministca9fX61298d33>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationHooksX1f8e08c8>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssueOrganizationPackagesXb4a13f2a>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppOrganizationPlanX6fbfef3d>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssueOrganizationProjectsXec3395b8>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssueOrganizationSecretsX51d70cc4>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssueOrganizationSelfHost148fX220c6935>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssueOrganizationUserBlockingX26d76819>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPackagesX8d2c8da6>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsPagesXe70a7b91>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPullRequestsXc13c4920>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppRepositoryHooksXa791321a>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppRepositoryProjectsX2c488d99>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssueSecretScanningAlertsXb2ef8752>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsSecretsX223021ae>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppSecurityEventsX2fd6408a>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssueSecurityScanningAlertX02cd83a3>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppSingleFileX63798509>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppStatusesX206676db>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssueVulnerabilityAlertsX1f9aca8d>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesReopenedIssuePerformedViaGithubAppWorkflowsXc3eb4369>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.actions?.let { put("actions", json.encodeToJsonElement(it)) }
        value.administration?.let { put("administration", json.encodeToJsonElement(it)) }
        value.checks?.let { put("checks", json.encodeToJsonElement(it)) }
        value.contentReferences?.let { put("content_references", json.encodeToJsonElement(it)) }
        value.contents?.let { put("contents", json.encodeToJsonElement(it)) }
        value.deployments?.let { put("deployments", json.encodeToJsonElement(it)) }
        value.discussions?.let { put("discussions", json.encodeToJsonElement(it)) }
        value.emails?.let { put("emails", json.encodeToJsonElement(it)) }
        value.environments?.let { put("environments", json.encodeToJsonElement(it)) }
        value.issues?.let { put("issues", json.encodeToJsonElement(it)) }
        value.keys?.let { put("keys", json.encodeToJsonElement(it)) }
        value.members?.let { put("members", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.organizationAdministration?.let { put("organization_administration", json.encodeToJsonElement(it)) }
        value.organizationHooks?.let { put("organization_hooks", json.encodeToJsonElement(it)) }
        value.organizationPackages?.let { put("organization_packages", json.encodeToJsonElement(it)) }
        value.organizationPlan?.let { put("organization_plan", json.encodeToJsonElement(it)) }
        value.organizationProjects?.let { put("organization_projects", json.encodeToJsonElement(it)) }
        value.organizationSecrets?.let { put("organization_secrets", json.encodeToJsonElement(it)) }
        value.organizationSelfHostedRunners?.let { put("organization_self_hosted_runners", json.encodeToJsonElement(it)) }
        value.organizationUserBlocking?.let { put("organization_user_blocking", json.encodeToJsonElement(it)) }
        value.packages?.let { put("packages", json.encodeToJsonElement(it)) }
        value.pages?.let { put("pages", json.encodeToJsonElement(it)) }
        value.pullRequests?.let { put("pull_requests", json.encodeToJsonElement(it)) }
        value.repositoryHooks?.let { put("repository_hooks", json.encodeToJsonElement(it)) }
        value.repositoryProjects?.let { put("repository_projects", json.encodeToJsonElement(it)) }
        value.secretScanningAlerts?.let { put("secret_scanning_alerts", json.encodeToJsonElement(it)) }
        value.secrets?.let { put("secrets", json.encodeToJsonElement(it)) }
        value.securityEvents?.let { put("security_events", json.encodeToJsonElement(it)) }
        value.securityScanningAlert?.let { put("security_scanning_alert", json.encodeToJsonElement(it)) }
        value.singleFile?.let { put("single_file", json.encodeToJsonElement(it)) }
        value.statuses?.let { put("statuses", json.encodeToJsonElement(it)) }
        value.vulnerabilityAlerts?.let { put("vulnerability_alerts", json.encodeToJsonElement(it)) }
        value.workflows?.let { put("workflows", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d(block: InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d.Builder.() -> Unit): InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d = InlineWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsXc35abe3d.build(block)
