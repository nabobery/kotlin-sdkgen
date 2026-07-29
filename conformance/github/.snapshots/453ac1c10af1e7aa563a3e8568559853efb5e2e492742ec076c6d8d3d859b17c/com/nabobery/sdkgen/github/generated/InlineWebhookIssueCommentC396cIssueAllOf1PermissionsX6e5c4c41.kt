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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41.Serializer::class)
public class InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41(
  public val actions:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppActionsX222de44a? = null,
  public val administration:
      InlineWebhookIssueCommentC396cIssueAllOf1AdministrationXfb7370eb? = null,
  public val checks:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppChecksX8f12358d? = null,
  public val contentReferences:
      InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d? = null,
  public val contents:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppContentsX9e002086? = null,
  public val deployments: InlineWebhookIssueCommentC396cIssueAllOf1DeploymentsX2a2a0461? = null,
  public val discussions: InlineWebhookIssueCommentC396cIssueAllOf1DiscussionsXf65ab032? = null,
  public val emails:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppEmailsX6bd75183? = null,
  public val environments: InlineWebhookIssueCommentC396cIssueAllOf1EnvironmentsXb130b0ed? = null,
  public val issues:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppIssuesXe730a7fa? = null,
  public val keys:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppKeysX4b13c03b? = null,
  public val members:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppMembersXb514114c? = null,
  public val metadata:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppMetadataXbc98b4b3? = null,
  public val organizationAdministration:
      InlineWebhookIssueCommentC396cIssueAllOf1OrganizationAdministca9fXba5d6277? = null,
  public val organizationHooks:
      InlineWebhookIssueCommentC396cIssueAllOf1OrganizationHooksX18722df9? = null,
  public val organizationPackages:
      InlineWebhookIssueCommentC396cIssueAllOf1OrganizationPackagesXbd63de21? = null,
  public val organizationPlan:
      InlineWebhookIssueCommentC396cIssueAllOf1OrganizationPlanX565561e9? = null,
  public val organizationProjects:
      InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3? = null,
  public val organizationSecrets:
      InlineWebhookIssueCommentC396cIssueAllOf1OrganizationSecretsX5c7a7e25? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssueCommentC396cIssueAllOf1OrganizationSelfHost148fX49823ce6? = null,
  public val organizationUserBlocking:
      InlineWebhookIssueCommentC396cIssueAllOf1OrganizationUserBlockingX13af7001? = null,
  public val packages:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppPackagesX67756482? = null,
  public val pages:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppPagesX25bce9bd? = null,
  public val pullRequests: InlineWebhookIssueCommentC396cIssueAllOf1PullRequestsX58484d4f? = null,
  public val repositoryHooks:
      InlineWebhookIssueCommentC396cIssueAllOf1RepositoryHooksX2eb47292? = null,
  public val repositoryProjects:
      InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e? = null,
  public val secretScanningAlerts:
      InlineWebhookIssueCommentC396cIssueAllOf1SecretScanningAlertsX79203152? = null,
  public val secrets:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppSecretsXf3d7b3f5? = null,
  public val securityEvents:
      InlineWebhookIssueCommentC396cIssueAllOf1SecurityEventsX11fef6f2? = null,
  public val securityScanningAlert:
      InlineWebhookIssueCommentC396cIssueAllOf1SecurityScanningAlertX8b88b643? = null,
  public val singleFile: InlineWebhookIssueCommentC396cIssueAllOf1SingleFileXf42f5389? = null,
  public val statuses:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppStatusesXe0d32ab5? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssueCommentC396cIssueAllOf1VulnerabilityAlertsX8797b630? = null,
  public val workflows:
      InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppWorkflowsXb890add9? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppActionsX222de44a? = null

    public var administration: InlineWebhookIssueCommentC396cIssueAllOf1AdministrationXfb7370eb? =
        null

    public var checks:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppChecksX8f12358d? = null

    public var contentReferences:
        InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d? = null

    public var contents:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppContentsX9e002086? = null

    public var deployments: InlineWebhookIssueCommentC396cIssueAllOf1DeploymentsX2a2a0461? = null

    public var discussions: InlineWebhookIssueCommentC396cIssueAllOf1DiscussionsXf65ab032? = null

    public var emails:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppEmailsX6bd75183? = null

    public var environments: InlineWebhookIssueCommentC396cIssueAllOf1EnvironmentsXb130b0ed? = null

    public var issues:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppIssuesXe730a7fa? = null

    public var keys: InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppKeysX4b13c03b? =
        null

    public var members:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppMembersXb514114c? = null

    public var metadata:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppMetadataXbc98b4b3? = null

    public var organizationAdministration:
        InlineWebhookIssueCommentC396cIssueAllOf1OrganizationAdministca9fXba5d6277? = null

    public var organizationHooks:
        InlineWebhookIssueCommentC396cIssueAllOf1OrganizationHooksX18722df9? = null

    public var organizationPackages:
        InlineWebhookIssueCommentC396cIssueAllOf1OrganizationPackagesXbd63de21? = null

    public var organizationPlan: InlineWebhookIssueCommentC396cIssueAllOf1OrganizationPlanX565561e9?
        = null

    public var organizationProjects:
        InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3? = null

    public var organizationSecrets:
        InlineWebhookIssueCommentC396cIssueAllOf1OrganizationSecretsX5c7a7e25? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssueCommentC396cIssueAllOf1OrganizationSelfHost148fX49823ce6? = null

    public var organizationUserBlocking:
        InlineWebhookIssueCommentC396cIssueAllOf1OrganizationUserBlockingX13af7001? = null

    public var packages:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppPackagesX67756482? = null

    public var pages: InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppPagesX25bce9bd?
        = null

    public var pullRequests: InlineWebhookIssueCommentC396cIssueAllOf1PullRequestsX58484d4f? = null

    public var repositoryHooks: InlineWebhookIssueCommentC396cIssueAllOf1RepositoryHooksX2eb47292? =
        null

    public var repositoryProjects:
        InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e? = null

    public var secretScanningAlerts:
        InlineWebhookIssueCommentC396cIssueAllOf1SecretScanningAlertsX79203152? = null

    public var secrets:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppSecretsXf3d7b3f5? = null

    public var securityEvents: InlineWebhookIssueCommentC396cIssueAllOf1SecurityEventsX11fef6f2? =
        null

    public var securityScanningAlert:
        InlineWebhookIssueCommentC396cIssueAllOf1SecurityScanningAlertX8b88b643? = null

    public var singleFile: InlineWebhookIssueCommentC396cIssueAllOf1SingleFileXf42f5389? = null

    public var statuses:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppStatusesXe0d32ab5? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssueCommentC396cIssueAllOf1VulnerabilityAlertsX8797b630? = null

    public var workflows:
        InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppWorkflowsXb890add9? = null

    public fun build(): InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41 = InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41 must be a JSON object")
      return InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppActionsX222de44a>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1AdministrationXfb7370eb>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppChecksX8f12358d>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1ContentReferencesX4b3ea36d>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppContentsX9e002086>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1DeploymentsX2a2a0461>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1DiscussionsXf65ab032>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppEmailsX6bd75183>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1EnvironmentsXb130b0ed>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppIssuesXe730a7fa>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppKeysX4b13c03b>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppMembersXb514114c>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppMetadataXbc98b4b3>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1OrganizationAdministca9fXba5d6277>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1OrganizationHooksX18722df9>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1OrganizationPackagesXbd63de21>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1OrganizationPlanX565561e9>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1OrganizationSecretsX5c7a7e25>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1OrganizationSelfHost148fX49823ce6>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1OrganizationUserBlockingX13af7001>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppPackagesX67756482>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppPagesX25bce9bd>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PullRequestsX58484d4f>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1RepositoryHooksX2eb47292>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1RepositoryProjectsX19249b9e>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1SecretScanningAlertsX79203152>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppSecretsXf3d7b3f5>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1SecurityEventsX11fef6f2>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1SecurityScanningAlertX8b88b643>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1SingleFileXf42f5389>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppStatusesXe0d32ab5>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1VulnerabilityAlertsX8797b630>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentC396cIssueAllOf1PerformedViaGithubAppWorkflowsXb890add9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41")
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

public fun inlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41(block: InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41.Builder.() -> Unit): InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41 = InlineWebhookIssueCommentC396cIssueAllOf1PermissionsX6e5c4c41.build(block)
