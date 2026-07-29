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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment/properties/p
 * erformed_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f.Serializer::class)
public class InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f(
  public val actions:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppActionsX28d943cc? = null,
  public val administration:
      InlineWebhookDeploymentSta5240DeploymentAdministrationX2e8218ca? = null,
  public val checks:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppChecksX759b0ef3? = null,
  public val contentReferences:
      InlineWebhookDeploymentSta5240DeploymentContentReferencesX9d9832ef? = null,
  public val contents:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppContentsX5a69556d? = null,
  public val deployments: InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb? = null,
  public val discussions: InlineWebhookDeploymentSta5240DeploymentDiscussionsX232d522f? = null,
  public val emails:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEmailsX0497cd65? = null,
  public val environments: InlineWebhookDeploymentSta5240DeploymentEnvironmentsX65e77e33? = null,
  public val issues:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppIssuesX67385a75? = null,
  public val keys:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppKeysX18f23d6b? = null,
  public val members:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppMembersX17f0bb20? = null,
  public val metadata:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppMetadataXd86d1413? = null,
  public val organizationAdministration:
      InlineWebhookDeploymentSta5240DeploymentOrganizationAdministca9fXc3ada3e3? = null,
  public val organizationHooks:
      InlineWebhookDeploymentSta5240DeploymentOrganizationHooksXfe8d23e4? = null,
  public val organizationPackages:
      InlineWebhookDeploymentSta5240DeploymentOrganizationPackagesX91256caf? = null,
  public val organizationPlan:
      InlineWebhookDeploymentSta5240DeploymentOrganizationPlanX206fafd1? = null,
  public val organizationProjects:
      InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767? = null,
  public val organizationSecrets:
      InlineWebhookDeploymentSta5240DeploymentOrganizationSecretsX7b45323a? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookDeploymentSta5240DeploymentOrganizationSelfHost148fX65a59e2b? = null,
  public val organizationUserBlocking:
      InlineWebhookDeploymentSta5240DeploymentOrganizationUserBlockingX72fa163d? = null,
  public val packages:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppPackagesX0289d021? = null,
  public val pages:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppPagesX8a8baa9a? = null,
  public val pullRequests: InlineWebhookDeploymentSta5240DeploymentPullRequestsXac706475? = null,
  public val repositoryHooks:
      InlineWebhookDeploymentSta5240DeploymentRepositoryHooksX5b1ea979? = null,
  public val repositoryProjects:
      InlineWebhookDeploymentSta5240DeploymentRepositoryProjectsX4c6ac775? = null,
  public val secretScanningAlerts:
      InlineWebhookDeploymentSta5240DeploymentSecretScanningAlertsX7fca198c? = null,
  public val secrets:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppSecretsXaa3b638b? = null,
  public val securityEvents:
      InlineWebhookDeploymentSta5240DeploymentSecurityEventsX9618cb07? = null,
  public val securityScanningAlert:
      InlineWebhookDeploymentSta5240DeploymentSecurityScanningAlertX8870cfd3? = null,
  public val singleFile:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppSingleFileX7acbdda1? = null,
  public val statuses:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppStatusesXf40a049d? = null,
  public val vulnerabilityAlerts:
      InlineWebhookDeploymentSta5240DeploymentVulnerabilityAlertsX3cea0c0d? = null,
  public val workflows:
      InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppWorkflowsX8b2d00e7? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppActionsX28d943cc? = null

    public var administration: InlineWebhookDeploymentSta5240DeploymentAdministrationX2e8218ca? =
        null

    public var checks: InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppChecksX759b0ef3?
        = null

    public var contentReferences:
        InlineWebhookDeploymentSta5240DeploymentContentReferencesX9d9832ef? = null

    public var contents:
        InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppContentsX5a69556d? = null

    public var deployments: InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb? = null

    public var discussions: InlineWebhookDeploymentSta5240DeploymentDiscussionsX232d522f? = null

    public var emails: InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEmailsX0497cd65?
        = null

    public var environments: InlineWebhookDeploymentSta5240DeploymentEnvironmentsX65e77e33? = null

    public var issues: InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppIssuesX67385a75?
        = null

    public var keys: InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppKeysX18f23d6b? =
        null

    public var members:
        InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppMembersX17f0bb20? = null

    public var metadata:
        InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppMetadataXd86d1413? = null

    public var organizationAdministration:
        InlineWebhookDeploymentSta5240DeploymentOrganizationAdministca9fXc3ada3e3? = null

    public var organizationHooks:
        InlineWebhookDeploymentSta5240DeploymentOrganizationHooksXfe8d23e4? = null

    public var organizationPackages:
        InlineWebhookDeploymentSta5240DeploymentOrganizationPackagesX91256caf? = null

    public var organizationPlan: InlineWebhookDeploymentSta5240DeploymentOrganizationPlanX206fafd1?
        = null

    public var organizationProjects:
        InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767? = null

    public var organizationSecrets:
        InlineWebhookDeploymentSta5240DeploymentOrganizationSecretsX7b45323a? = null

    public var organizationSelfHostedRunners:
        InlineWebhookDeploymentSta5240DeploymentOrganizationSelfHost148fX65a59e2b? = null

    public var organizationUserBlocking:
        InlineWebhookDeploymentSta5240DeploymentOrganizationUserBlockingX72fa163d? = null

    public var packages:
        InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppPackagesX0289d021? = null

    public var pages: InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppPagesX8a8baa9a? =
        null

    public var pullRequests: InlineWebhookDeploymentSta5240DeploymentPullRequestsXac706475? = null

    public var repositoryHooks: InlineWebhookDeploymentSta5240DeploymentRepositoryHooksX5b1ea979? =
        null

    public var repositoryProjects:
        InlineWebhookDeploymentSta5240DeploymentRepositoryProjectsX4c6ac775? = null

    public var secretScanningAlerts:
        InlineWebhookDeploymentSta5240DeploymentSecretScanningAlertsX7fca198c? = null

    public var secrets:
        InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppSecretsXaa3b638b? = null

    public var securityEvents: InlineWebhookDeploymentSta5240DeploymentSecurityEventsX9618cb07? =
        null

    public var securityScanningAlert:
        InlineWebhookDeploymentSta5240DeploymentSecurityScanningAlertX8870cfd3? = null

    public var singleFile:
        InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppSingleFileX7acbdda1? = null

    public var statuses:
        InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppStatusesXf40a049d? = null

    public var vulnerabilityAlerts:
        InlineWebhookDeploymentSta5240DeploymentVulnerabilityAlertsX3cea0c0d? = null

    public var workflows:
        InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppWorkflowsX8b2d00e7? = null

    public fun build(): InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f = InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f must be a JSON object")
      return InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppActionsX28d943cc>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentAdministrationX2e8218ca>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppChecksX759b0ef3>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentContentReferencesX9d9832ef>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppContentsX5a69556d>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentDeploymentsXe46020cb>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentDiscussionsX232d522f>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEmailsX0497cd65>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentEnvironmentsX65e77e33>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppIssuesX67385a75>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppKeysX18f23d6b>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppMembersX17f0bb20>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppMetadataXd86d1413>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentOrganizationAdministca9fXc3ada3e3>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentOrganizationHooksXfe8d23e4>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentOrganizationPackagesX91256caf>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentOrganizationPlanX206fafd1>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentOrganizationProjectsXe221d767>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentOrganizationSecretsX7b45323a>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentOrganizationSelfHost148fX65a59e2b>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentOrganizationUserBlockingX72fa163d>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppPackagesX0289d021>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppPagesX8a8baa9a>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPullRequestsXac706475>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentRepositoryHooksX5b1ea979>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentRepositoryProjectsX4c6ac775>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentSecretScanningAlertsX7fca198c>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppSecretsXaa3b638b>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentSecurityEventsX9618cb07>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentSecurityScanningAlertX8870cfd3>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppSingleFileX7acbdda1>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppStatusesXf40a049d>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentVulnerabilityAlertsX3cea0c0d>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppWorkflowsX8b2d00e7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f")
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

public fun inlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f(block: InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f.Builder.() -> Unit): InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f = InlineWebhookDeploymentSta5240DeploymentPermissionsX56f1b97f.build(block)
