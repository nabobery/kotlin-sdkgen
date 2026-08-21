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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b.Serializer::class)
public class InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b(
  public val actions:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppActionsXa2c529cf? = null,
  public val administration:
      InlineWebhookIssueCommentD1026IssueAllOf1AdministrationXd24e28d1? = null,
  public val checks:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppChecksX19250d0a? = null,
  public val contentReferences:
      InlineWebhookIssueCommentD1026IssueAllOf1ContentReferencesX87394215? = null,
  public val contents:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppContentsXaceb480b? = null,
  public val deployments: InlineWebhookIssueCommentD1026IssueAllOf1DeploymentsX635e23b7? = null,
  public val discussions: InlineWebhookIssueCommentD1026IssueAllOf1DiscussionsXe47b8e41? = null,
  public val emails:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppEmailsX2ed8bcae? = null,
  public val environments: InlineWebhookIssueCommentD1026IssueAllOf1EnvironmentsX1f878158? = null,
  public val issues:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppIssuesX6cd74d45? = null,
  public val keys:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b? = null,
  public val members:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppMembersX10c6b749? = null,
  public val metadata:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppMetadataXd7bca24c? = null,
  public val organizationAdministration:
      InlineWebhookIssueCommentD1026IssueAllOf1OrganizationAdministca9fX5098ea35? = null,
  public val organizationHooks:
      InlineWebhookIssueCommentD1026IssueAllOf1OrganizationHooksXe2fc1dbd? = null,
  public val organizationPackages:
      InlineWebhookIssueCommentD1026IssueAllOf1OrganizationPackagesXcb3f1ea7? = null,
  public val organizationPlan:
      InlineWebhookIssueCommentD1026IssueAllOf1OrganizationPlanXfb8e261e? = null,
  public val organizationProjects:
      InlineWebhookIssueCommentD1026IssueAllOf1OrganizationProjectsX3ea0f9e8? = null,
  public val organizationSecrets:
      InlineWebhookIssueCommentD1026IssueAllOf1OrganizationSecretsX5dba8b81? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssueCommentD1026IssueAllOf1OrganizationSelfHost148fX42ce4802? = null,
  public val organizationUserBlocking:
      InlineWebhookIssueCommentD1026IssueAllOf1OrganizationUserBlockingX83d7f47c? = null,
  public val packages:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppPackagesX567910d8? = null,
  public val pages:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppPagesXe3528d23? = null,
  public val pullRequests: InlineWebhookIssueCommentD1026IssueAllOf1PullRequestsXe1fb96a3? = null,
  public val repositoryHooks:
      InlineWebhookIssueCommentD1026IssueAllOf1RepositoryHooksX15f2e0a5? = null,
  public val repositoryProjects:
      InlineWebhookIssueCommentD1026IssueAllOf1RepositoryProjectsX88cbe5cb? = null,
  public val secretScanningAlerts:
      InlineWebhookIssueCommentD1026IssueAllOf1SecretScanningAlertsX593fd44f? = null,
  public val secrets:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppSecretsXd6ac9870? = null,
  public val securityEvents:
      InlineWebhookIssueCommentD1026IssueAllOf1SecurityEventsXb72f0602? = null,
  public val securityScanningAlert:
      InlineWebhookIssueCommentD1026IssueAllOf1SecurityScanningAlertX101947d5? = null,
  public val singleFile: InlineWebhookIssueCommentD1026IssueAllOf1SingleFileXfbef326e? = null,
  public val statuses:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppStatusesX50968629? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssueCommentD1026IssueAllOf1VulnerabilityAlertsXb6d224c4? = null,
  public val workflows:
      InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppWorkflowsX671abbb1? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppActionsXa2c529cf? = null

    public var administration: InlineWebhookIssueCommentD1026IssueAllOf1AdministrationXd24e28d1? =
        null

    public var checks:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppChecksX19250d0a? = null

    public var contentReferences:
        InlineWebhookIssueCommentD1026IssueAllOf1ContentReferencesX87394215? = null

    public var contents:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppContentsXaceb480b? = null

    public var deployments: InlineWebhookIssueCommentD1026IssueAllOf1DeploymentsX635e23b7? = null

    public var discussions: InlineWebhookIssueCommentD1026IssueAllOf1DiscussionsXe47b8e41? = null

    public var emails:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppEmailsX2ed8bcae? = null

    public var environments: InlineWebhookIssueCommentD1026IssueAllOf1EnvironmentsX1f878158? = null

    public var issues:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppIssuesX6cd74d45? = null

    public var keys: InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b? =
        null

    public var members:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppMembersX10c6b749? = null

    public var metadata:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppMetadataXd7bca24c? = null

    public var organizationAdministration:
        InlineWebhookIssueCommentD1026IssueAllOf1OrganizationAdministca9fX5098ea35? = null

    public var organizationHooks:
        InlineWebhookIssueCommentD1026IssueAllOf1OrganizationHooksXe2fc1dbd? = null

    public var organizationPackages:
        InlineWebhookIssueCommentD1026IssueAllOf1OrganizationPackagesXcb3f1ea7? = null

    public var organizationPlan: InlineWebhookIssueCommentD1026IssueAllOf1OrganizationPlanXfb8e261e?
        = null

    public var organizationProjects:
        InlineWebhookIssueCommentD1026IssueAllOf1OrganizationProjectsX3ea0f9e8? = null

    public var organizationSecrets:
        InlineWebhookIssueCommentD1026IssueAllOf1OrganizationSecretsX5dba8b81? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssueCommentD1026IssueAllOf1OrganizationSelfHost148fX42ce4802? = null

    public var organizationUserBlocking:
        InlineWebhookIssueCommentD1026IssueAllOf1OrganizationUserBlockingX83d7f47c? = null

    public var packages:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppPackagesX567910d8? = null

    public var pages: InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppPagesXe3528d23?
        = null

    public var pullRequests: InlineWebhookIssueCommentD1026IssueAllOf1PullRequestsXe1fb96a3? = null

    public var repositoryHooks: InlineWebhookIssueCommentD1026IssueAllOf1RepositoryHooksX15f2e0a5? =
        null

    public var repositoryProjects:
        InlineWebhookIssueCommentD1026IssueAllOf1RepositoryProjectsX88cbe5cb? = null

    public var secretScanningAlerts:
        InlineWebhookIssueCommentD1026IssueAllOf1SecretScanningAlertsX593fd44f? = null

    public var secrets:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppSecretsXd6ac9870? = null

    public var securityEvents: InlineWebhookIssueCommentD1026IssueAllOf1SecurityEventsXb72f0602? =
        null

    public var securityScanningAlert:
        InlineWebhookIssueCommentD1026IssueAllOf1SecurityScanningAlertX101947d5? = null

    public var singleFile: InlineWebhookIssueCommentD1026IssueAllOf1SingleFileXfbef326e? = null

    public var statuses:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppStatusesX50968629? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssueCommentD1026IssueAllOf1VulnerabilityAlertsXb6d224c4? = null

    public var workflows:
        InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppWorkflowsX671abbb1? = null

    public fun build(): InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b = InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b must be a JSON object")
      return InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppActionsXa2c529cf>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1AdministrationXd24e28d1>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppChecksX19250d0a>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1ContentReferencesX87394215>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppContentsXaceb480b>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1DeploymentsX635e23b7>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1DiscussionsXe47b8e41>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppEmailsX2ed8bcae>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1EnvironmentsX1f878158>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppIssuesX6cd74d45>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppKeysXc5bfc85b>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppMembersX10c6b749>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppMetadataXd7bca24c>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1OrganizationAdministca9fX5098ea35>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1OrganizationHooksXe2fc1dbd>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1OrganizationPackagesXcb3f1ea7>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1OrganizationPlanXfb8e261e>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1OrganizationProjectsX3ea0f9e8>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1OrganizationSecretsX5dba8b81>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1OrganizationSelfHost148fX42ce4802>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1OrganizationUserBlockingX83d7f47c>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppPackagesX567910d8>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppPagesXe3528d23>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PullRequestsXe1fb96a3>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1RepositoryHooksX15f2e0a5>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1RepositoryProjectsX88cbe5cb>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1SecretScanningAlertsX593fd44f>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppSecretsXd6ac9870>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1SecurityEventsXb72f0602>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1SecurityScanningAlertX101947d5>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1SingleFileXfbef326e>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppStatusesX50968629>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1VulnerabilityAlertsXb6d224c4>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentD1026IssueAllOf1PerformedViaGithubAppWorkflowsX671abbb1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b")
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

public fun inlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b(block: InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b.Builder.() -> Unit): InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b = InlineWebhookIssueCommentD1026IssueAllOf1PermissionsXe59c6d8b.build(block)
