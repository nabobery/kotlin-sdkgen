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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment_status/prope
 * rties/performed_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac.Serializer::class)
public class InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac(
  public val actions: InlineWebhookDeploymentSta5240DeploymentStatusActionsXad0bac08? = null,
  public val administration:
      InlineWebhookDeploymentSta5240DeploymentStatusAdministrationXe55c3110? = null,
  public val checks: InlineWebhookDeploymentSta5240DeploymentStatusChecksX69986311? = null,
  public val contentReferences:
      InlineWebhookDeploymentSta5240DeploymentStatusContentReferencesX36d34a3e? = null,
  public val contents: InlineWebhookDeploymentSta5240DeploymentStatusContentsXde1f6e6b? = null,
  public val deployments:
      InlineWebhookDeploymentSta5240DeploymentStatusDeploymentsX6d0fc839? = null,
  public val discussions:
      InlineWebhookDeploymentSta5240DeploymentStatusDiscussionsX8d3a43c8? = null,
  public val emails: InlineWebhookDeploymentSta5240DeploymentStatusEmailsXc03c25c9? = null,
  public val environments:
      InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71? = null,
  public val issues: InlineWebhookDeploymentSta5240DeploymentStatusIssuesXac5f8a6d? = null,
  public val keys:
      InlineWebhookDeploymentSta5240DeploymentStatusPerformedViaGithubAppKeysX0ea73495? = null,
  public val members: InlineWebhookDeploymentSta5240DeploymentStatusMembersXbe7902a4? = null,
  public val metadata: InlineWebhookDeploymentSta5240DeploymentStatusMetadataX70beede0? = null,
  public val organizationAdministration:
      InlineWebhookDeploymentSta5240DeploymentStatusOrganizationAdministca9fX558e7e63? = null,
  public val organizationHooks:
      InlineWebhookDeploymentSta5240DeploymentStatusOrganizationHooksX346a8c39? = null,
  public val organizationPackages:
      InlineWebhookDeploymentSta5240DeploymentStatusOrganizationPackagesX4a9e4009? = null,
  public val organizationPlan:
      InlineWebhookDeploymentSta5240DeploymentStatusOrganizationPlanXc4586c8f? = null,
  public val organizationProjects:
      InlineWebhookDeploymentSta5240DeploymentStatusOrganizationProjectsX6f66449d? = null,
  public val organizationSecrets:
      InlineWebhookDeploymentSta5240DeploymentStatusOrganizationSecretsX643d0f52? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookDeploymentSta5240DeploymentStatusOrganizationSelfHost148fX2efe61be? = null,
  public val organizationUserBlocking:
      InlineWebhookDeploymentSta5240DeploymentStatusOrganizationUserBlockingXaf595bb0? = null,
  public val packages: InlineWebhookDeploymentSta5240DeploymentStatusPackagesX15f13794? = null,
  public val pages: InlineWebhookDeploymentSta5240DeploymentStatusPagesX93734aff? = null,
  public val pullRequests:
      InlineWebhookDeploymentSta5240DeploymentStatusPullRequestsX082d55a1? = null,
  public val repositoryHooks:
      InlineWebhookDeploymentSta5240DeploymentStatusRepositoryHooksX44819c15? = null,
  public val repositoryProjects:
      InlineWebhookDeploymentSta5240DeploymentStatusRepositoryProjectsX1d245eba? = null,
  public val secretScanningAlerts:
      InlineWebhookDeploymentSta5240DeploymentStatusSecretScanningAlertsX2d7a770d? = null,
  public val secrets: InlineWebhookDeploymentSta5240DeploymentStatusSecretsXd97e80d7? = null,
  public val securityEvents:
      InlineWebhookDeploymentSta5240DeploymentStatusSecurityEventsXd1dc4cf4? = null,
  public val securityScanningAlert:
      InlineWebhookDeploymentSta5240DeploymentStatusSecurityScanningAlertX41761a21? = null,
  public val singleFile: InlineWebhookDeploymentSta5240DeploymentStatusSingleFileX9b285480? = null,
  public val statuses: InlineWebhookDeploymentSta5240DeploymentStatusStatusesX452ff922? = null,
  public val vulnerabilityAlerts:
      InlineWebhookDeploymentSta5240DeploymentStatusVulnerabilityAlertsX971442df? = null,
  public val workflows: InlineWebhookDeploymentSta5240DeploymentStatusWorkflowsX72730e97? = null,
) {
  public class Builder {
    public var actions: InlineWebhookDeploymentSta5240DeploymentStatusActionsXad0bac08? = null

    public var administration:
        InlineWebhookDeploymentSta5240DeploymentStatusAdministrationXe55c3110? = null

    public var checks: InlineWebhookDeploymentSta5240DeploymentStatusChecksX69986311? = null

    public var contentReferences:
        InlineWebhookDeploymentSta5240DeploymentStatusContentReferencesX36d34a3e? = null

    public var contents: InlineWebhookDeploymentSta5240DeploymentStatusContentsXde1f6e6b? = null

    public var deployments: InlineWebhookDeploymentSta5240DeploymentStatusDeploymentsX6d0fc839? =
        null

    public var discussions: InlineWebhookDeploymentSta5240DeploymentStatusDiscussionsX8d3a43c8? =
        null

    public var emails: InlineWebhookDeploymentSta5240DeploymentStatusEmailsXc03c25c9? = null

    public var environments: InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71? =
        null

    public var issues: InlineWebhookDeploymentSta5240DeploymentStatusIssuesXac5f8a6d? = null

    public var keys:
        InlineWebhookDeploymentSta5240DeploymentStatusPerformedViaGithubAppKeysX0ea73495? = null

    public var members: InlineWebhookDeploymentSta5240DeploymentStatusMembersXbe7902a4? = null

    public var metadata: InlineWebhookDeploymentSta5240DeploymentStatusMetadataX70beede0? = null

    public var organizationAdministration:
        InlineWebhookDeploymentSta5240DeploymentStatusOrganizationAdministca9fX558e7e63? = null

    public var organizationHooks:
        InlineWebhookDeploymentSta5240DeploymentStatusOrganizationHooksX346a8c39? = null

    public var organizationPackages:
        InlineWebhookDeploymentSta5240DeploymentStatusOrganizationPackagesX4a9e4009? = null

    public var organizationPlan:
        InlineWebhookDeploymentSta5240DeploymentStatusOrganizationPlanXc4586c8f? = null

    public var organizationProjects:
        InlineWebhookDeploymentSta5240DeploymentStatusOrganizationProjectsX6f66449d? = null

    public var organizationSecrets:
        InlineWebhookDeploymentSta5240DeploymentStatusOrganizationSecretsX643d0f52? = null

    public var organizationSelfHostedRunners:
        InlineWebhookDeploymentSta5240DeploymentStatusOrganizationSelfHost148fX2efe61be? = null

    public var organizationUserBlocking:
        InlineWebhookDeploymentSta5240DeploymentStatusOrganizationUserBlockingXaf595bb0? = null

    public var packages: InlineWebhookDeploymentSta5240DeploymentStatusPackagesX15f13794? = null

    public var pages: InlineWebhookDeploymentSta5240DeploymentStatusPagesX93734aff? = null

    public var pullRequests: InlineWebhookDeploymentSta5240DeploymentStatusPullRequestsX082d55a1? =
        null

    public var repositoryHooks:
        InlineWebhookDeploymentSta5240DeploymentStatusRepositoryHooksX44819c15? = null

    public var repositoryProjects:
        InlineWebhookDeploymentSta5240DeploymentStatusRepositoryProjectsX1d245eba? = null

    public var secretScanningAlerts:
        InlineWebhookDeploymentSta5240DeploymentStatusSecretScanningAlertsX2d7a770d? = null

    public var secrets: InlineWebhookDeploymentSta5240DeploymentStatusSecretsXd97e80d7? = null

    public var securityEvents:
        InlineWebhookDeploymentSta5240DeploymentStatusSecurityEventsXd1dc4cf4? = null

    public var securityScanningAlert:
        InlineWebhookDeploymentSta5240DeploymentStatusSecurityScanningAlertX41761a21? = null

    public var singleFile: InlineWebhookDeploymentSta5240DeploymentStatusSingleFileX9b285480? = null

    public var statuses: InlineWebhookDeploymentSta5240DeploymentStatusStatusesX452ff922? = null

    public var vulnerabilityAlerts:
        InlineWebhookDeploymentSta5240DeploymentStatusVulnerabilityAlertsX971442df? = null

    public var workflows: InlineWebhookDeploymentSta5240DeploymentStatusWorkflowsX72730e97? = null

    public fun build(): InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac = InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac must be a JSON object")
      return InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusActionsXad0bac08>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusAdministrationXe55c3110>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusChecksX69986311>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusContentReferencesX36d34a3e>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusContentsXde1f6e6b>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusDeploymentsX6d0fc839>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusDiscussionsX8d3a43c8>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusEmailsXc03c25c9>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusEnvironmentsX6554ec71>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusIssuesXac5f8a6d>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusPerformedViaGithubAppKeysX0ea73495>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusMembersXbe7902a4>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusMetadataX70beede0>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusOrganizationAdministca9fX558e7e63>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusOrganizationHooksX346a8c39>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusOrganizationPackagesX4a9e4009>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusOrganizationPlanXc4586c8f>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusOrganizationProjectsX6f66449d>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusOrganizationSecretsX643d0f52>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusOrganizationSelfHost148fX2efe61be>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusOrganizationUserBlockingXaf595bb0>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusPackagesX15f13794>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusPagesX93734aff>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusPullRequestsX082d55a1>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusRepositoryHooksX44819c15>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusRepositoryProjectsX1d245eba>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusSecretScanningAlertsX2d7a770d>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusSecretsXd97e80d7>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusSecurityEventsXd1dc4cf4>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusSecurityScanningAlertX41761a21>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusSingleFileX9b285480>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusStatusesX452ff922>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusVulnerabilityAlertsX971442df>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentStatusWorkflowsX72730e97>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac")
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

public fun inlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac(block: InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac.Builder.() -> Unit): InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac = InlineWebhookDeploymentSta5240DeploymentStatusPermissionsX2e6b71ac.build(block)
