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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/per
 * formed_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b.Serializer::class)
public class InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b(
  public val actions:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppActionsXe94e22ab? = null,
  public val administration:
      InlineWebhookIssueCommentE365aIssueAllOf1AdministrationXe7a50335? = null,
  public val checks:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppChecksX6e695b45? = null,
  public val contentReferences:
      InlineWebhookIssueCommentE365aIssueAllOf1ContentReferencesXb0603d77? = null,
  public val contents:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppContentsXfbfcec80? = null,
  public val deployments: InlineWebhookIssueCommentE365aIssueAllOf1DeploymentsX2c4233ff? = null,
  public val discussions: InlineWebhookIssueCommentE365aIssueAllOf1DiscussionsX7aac414a? = null,
  public val emails:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppEmailsX1e643e81? = null,
  public val environments: InlineWebhookIssueCommentE365aIssueAllOf1EnvironmentsXe709404e? = null,
  public val issues:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppIssuesX8039afe8? = null,
  public val keys:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppKeysX57682cb7? = null,
  public val members:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppMembersX2020384c? = null,
  public val metadata:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppMetadataX205ec2cf? = null,
  public val organizationAdministration:
      InlineWebhookIssueCommentE365aIssueAllOf1OrganizationAdministca9fX694196ff? = null,
  public val organizationHooks:
      InlineWebhookIssueCommentE365aIssueAllOf1OrganizationHooksXa7286f71? = null,
  public val organizationPackages:
      InlineWebhookIssueCommentE365aIssueAllOf1OrganizationPackagesX732b8b7d? = null,
  public val organizationPlan:
      InlineWebhookIssueCommentE365aIssueAllOf1OrganizationPlanXe6bc483a? = null,
  public val organizationProjects:
      InlineWebhookIssueCommentE365aIssueAllOf1OrganizationProjectsXdd175b3a? = null,
  public val organizationSecrets:
      InlineWebhookIssueCommentE365aIssueAllOf1OrganizationSecretsX94fd6cbf? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssueCommentE365aIssueAllOf1OrganizationSelfHost148fXe3074585? = null,
  public val organizationUserBlocking:
      InlineWebhookIssueCommentE365aIssueAllOf1OrganizationUserBlockingX817c57df? = null,
  public val packages:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppPackagesX9dd4d32d? = null,
  public val pages:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppPagesX1ed5d6c2? = null,
  public val pullRequests: InlineWebhookIssueCommentE365aIssueAllOf1PullRequestsX50ff04ca? = null,
  public val repositoryHooks:
      InlineWebhookIssueCommentE365aIssueAllOf1RepositoryHooksXc24c73ec? = null,
  public val repositoryProjects:
      InlineWebhookIssueCommentE365aIssueAllOf1RepositoryProjectsX82f63e13? = null,
  public val secretScanningAlerts:
      InlineWebhookIssueCommentE365aIssueAllOf1SecretScanningAlertsXff3362c6? = null,
  public val secrets:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppSecretsXb53f6d4e? = null,
  public val securityEvents:
      InlineWebhookIssueCommentE365aIssueAllOf1SecurityEventsX24d3b2b3? = null,
  public val securityScanningAlert:
      InlineWebhookIssueCommentE365aIssueAllOf1SecurityScanningAlertX9dad9008? = null,
  public val singleFile: InlineWebhookIssueCommentE365aIssueAllOf1SingleFileX3c02754e? = null,
  public val statuses:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssueCommentE365aIssueAllOf1VulnerabilityAlertsX7213823d? = null,
  public val workflows:
      InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppWorkflowsX2702c012? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppActionsXe94e22ab? = null

    public var administration: InlineWebhookIssueCommentE365aIssueAllOf1AdministrationXe7a50335? =
        null

    public var checks:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppChecksX6e695b45? = null

    public var contentReferences:
        InlineWebhookIssueCommentE365aIssueAllOf1ContentReferencesXb0603d77? = null

    public var contents:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppContentsXfbfcec80? = null

    public var deployments: InlineWebhookIssueCommentE365aIssueAllOf1DeploymentsX2c4233ff? = null

    public var discussions: InlineWebhookIssueCommentE365aIssueAllOf1DiscussionsX7aac414a? = null

    public var emails:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppEmailsX1e643e81? = null

    public var environments: InlineWebhookIssueCommentE365aIssueAllOf1EnvironmentsXe709404e? = null

    public var issues:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppIssuesX8039afe8? = null

    public var keys: InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppKeysX57682cb7? =
        null

    public var members:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppMembersX2020384c? = null

    public var metadata:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppMetadataX205ec2cf? = null

    public var organizationAdministration:
        InlineWebhookIssueCommentE365aIssueAllOf1OrganizationAdministca9fX694196ff? = null

    public var organizationHooks:
        InlineWebhookIssueCommentE365aIssueAllOf1OrganizationHooksXa7286f71? = null

    public var organizationPackages:
        InlineWebhookIssueCommentE365aIssueAllOf1OrganizationPackagesX732b8b7d? = null

    public var organizationPlan: InlineWebhookIssueCommentE365aIssueAllOf1OrganizationPlanXe6bc483a?
        = null

    public var organizationProjects:
        InlineWebhookIssueCommentE365aIssueAllOf1OrganizationProjectsXdd175b3a? = null

    public var organizationSecrets:
        InlineWebhookIssueCommentE365aIssueAllOf1OrganizationSecretsX94fd6cbf? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssueCommentE365aIssueAllOf1OrganizationSelfHost148fXe3074585? = null

    public var organizationUserBlocking:
        InlineWebhookIssueCommentE365aIssueAllOf1OrganizationUserBlockingX817c57df? = null

    public var packages:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppPackagesX9dd4d32d? = null

    public var pages: InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppPagesX1ed5d6c2?
        = null

    public var pullRequests: InlineWebhookIssueCommentE365aIssueAllOf1PullRequestsX50ff04ca? = null

    public var repositoryHooks: InlineWebhookIssueCommentE365aIssueAllOf1RepositoryHooksXc24c73ec? =
        null

    public var repositoryProjects:
        InlineWebhookIssueCommentE365aIssueAllOf1RepositoryProjectsX82f63e13? = null

    public var secretScanningAlerts:
        InlineWebhookIssueCommentE365aIssueAllOf1SecretScanningAlertsXff3362c6? = null

    public var secrets:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppSecretsXb53f6d4e? = null

    public var securityEvents: InlineWebhookIssueCommentE365aIssueAllOf1SecurityEventsX24d3b2b3? =
        null

    public var securityScanningAlert:
        InlineWebhookIssueCommentE365aIssueAllOf1SecurityScanningAlertX9dad9008? = null

    public var singleFile: InlineWebhookIssueCommentE365aIssueAllOf1SingleFileX3c02754e? = null

    public var statuses:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssueCommentE365aIssueAllOf1VulnerabilityAlertsX7213823d? = null

    public var workflows:
        InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppWorkflowsX2702c012? = null

    public fun build(): InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b = InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b must be a JSON object")
      return InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppActionsXe94e22ab>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1AdministrationXe7a50335>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppChecksX6e695b45>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1ContentReferencesXb0603d77>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppContentsXfbfcec80>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1DeploymentsX2c4233ff>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1DiscussionsX7aac414a>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppEmailsX1e643e81>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1EnvironmentsXe709404e>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppIssuesX8039afe8>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppKeysX57682cb7>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppMembersX2020384c>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppMetadataX205ec2cf>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1OrganizationAdministca9fX694196ff>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1OrganizationHooksXa7286f71>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1OrganizationPackagesX732b8b7d>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1OrganizationPlanXe6bc483a>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1OrganizationProjectsXdd175b3a>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1OrganizationSecretsX94fd6cbf>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1OrganizationSelfHost148fXe3074585>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1OrganizationUserBlockingX817c57df>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppPackagesX9dd4d32d>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppPagesX1ed5d6c2>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PullRequestsX50ff04ca>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1RepositoryHooksXc24c73ec>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1RepositoryProjectsX82f63e13>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1SecretScanningAlertsXff3362c6>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppSecretsXb53f6d4e>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1SecurityEventsX24d3b2b3>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1SecurityScanningAlertX9dad9008>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1SingleFileX3c02754e>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppStatusesX6d005976>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1VulnerabilityAlertsX7213823d>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentE365aIssueAllOf1PerformedViaGithubAppWorkflowsX2702c012>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b")
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

public fun inlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b(block: InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b.Builder.() -> Unit): InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b = InlineWebhookIssueCommentE365aIssueAllOf1PermissionsXd9d6a82b.build(block)
