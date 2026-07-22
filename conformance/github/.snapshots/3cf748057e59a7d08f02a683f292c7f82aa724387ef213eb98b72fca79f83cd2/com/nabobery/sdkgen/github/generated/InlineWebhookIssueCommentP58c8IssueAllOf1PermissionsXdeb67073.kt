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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/per
 * formed_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073.Serializer::class)
public class InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073(
  public val actions:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppActionsX652b5a2e? = null,
  public val administration:
      InlineWebhookIssueCommentP58c8IssueAllOf1AdministrationX2bb2f08e? = null,
  public val checks:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppChecksX6d87669e? = null,
  public val contentReferences:
      InlineWebhookIssueCommentP58c8IssueAllOf1ContentReferencesXb0191782? = null,
  public val contents:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppContentsX4354e661? = null,
  public val deployments: InlineWebhookIssueCommentP58c8IssueAllOf1DeploymentsX204e4e04? = null,
  public val discussions: InlineWebhookIssueCommentP58c8IssueAllOf1DiscussionsX0eed940b? = null,
  public val emails:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppEmailsXc419c931? = null,
  public val environments: InlineWebhookIssueCommentP58c8IssueAllOf1EnvironmentsX92a3f9ef? = null,
  public val issues:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppIssuesXa90e3da9? = null,
  public val keys:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppKeysX9bfac24d? = null,
  public val members:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppMembersX04ed7348? = null,
  public val metadata:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppMetadataX55f5153e? = null,
  public val organizationAdministration:
      InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationAdministca9fXc184cc43? = null,
  public val organizationHooks:
      InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationHooksX0ba69ea4? = null,
  public val organizationPackages:
      InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationPackagesX25b8acd0? = null,
  public val organizationPlan:
      InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationPlanXdf899842? = null,
  public val organizationProjects:
      InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationProjectsX03b41862? = null,
  public val organizationSecrets:
      InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationSecretsX5e11de50? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationSelfHost148fX897078f3? = null,
  public val organizationUserBlocking:
      InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationUserBlockingX6265237d? = null,
  public val packages:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPackagesX6e6a8ef7? = null,
  public val pages:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b? = null,
  public val pullRequests: InlineWebhookIssueCommentP58c8IssueAllOf1PullRequestsXf4b1e4b2? = null,
  public val repositoryHooks:
      InlineWebhookIssueCommentP58c8IssueAllOf1RepositoryHooksXcbf1c725? = null,
  public val repositoryProjects:
      InlineWebhookIssueCommentP58c8IssueAllOf1RepositoryProjectsX96f49ea9? = null,
  public val secretScanningAlerts:
      InlineWebhookIssueCommentP58c8IssueAllOf1SecretScanningAlertsX7634cd01? = null,
  public val secrets:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppSecretsXb10674ba? = null,
  public val securityEvents:
      InlineWebhookIssueCommentP58c8IssueAllOf1SecurityEventsXc0b0d255? = null,
  public val securityScanningAlert:
      InlineWebhookIssueCommentP58c8IssueAllOf1SecurityScanningAlertXf1dbd160? = null,
  public val singleFile: InlineWebhookIssueCommentP58c8IssueAllOf1SingleFileX35181bf3? = null,
  public val statuses:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppStatusesXa6516758? = null,
  public val teamDiscussions:
      InlineWebhookIssueCommentP58c8IssueAllOf1TeamDiscussionsX66438e0a? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssueCommentP58c8IssueAllOf1VulnerabilityAlertsX896d7935? = null,
  public val workflows:
      InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppWorkflowsX39fa2a15? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppActionsX652b5a2e? = null

    public var administration: InlineWebhookIssueCommentP58c8IssueAllOf1AdministrationX2bb2f08e? =
        null

    public var checks:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppChecksX6d87669e? = null

    public var contentReferences:
        InlineWebhookIssueCommentP58c8IssueAllOf1ContentReferencesXb0191782? = null

    public var contents:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppContentsX4354e661? = null

    public var deployments: InlineWebhookIssueCommentP58c8IssueAllOf1DeploymentsX204e4e04? = null

    public var discussions: InlineWebhookIssueCommentP58c8IssueAllOf1DiscussionsX0eed940b? = null

    public var emails:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppEmailsXc419c931? = null

    public var environments: InlineWebhookIssueCommentP58c8IssueAllOf1EnvironmentsX92a3f9ef? = null

    public var issues:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppIssuesXa90e3da9? = null

    public var keys: InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppKeysX9bfac24d? =
        null

    public var members:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppMembersX04ed7348? = null

    public var metadata:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppMetadataX55f5153e? = null

    public var organizationAdministration:
        InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationAdministca9fXc184cc43? = null

    public var organizationHooks:
        InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationHooksX0ba69ea4? = null

    public var organizationPackages:
        InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationPackagesX25b8acd0? = null

    public var organizationPlan: InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationPlanXdf899842?
        = null

    public var organizationProjects:
        InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationProjectsX03b41862? = null

    public var organizationSecrets:
        InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationSecretsX5e11de50? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationSelfHost148fX897078f3? = null

    public var organizationUserBlocking:
        InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationUserBlockingX6265237d? = null

    public var packages:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPackagesX6e6a8ef7? = null

    public var pages: InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b?
        = null

    public var pullRequests: InlineWebhookIssueCommentP58c8IssueAllOf1PullRequestsXf4b1e4b2? = null

    public var repositoryHooks: InlineWebhookIssueCommentP58c8IssueAllOf1RepositoryHooksXcbf1c725? =
        null

    public var repositoryProjects:
        InlineWebhookIssueCommentP58c8IssueAllOf1RepositoryProjectsX96f49ea9? = null

    public var secretScanningAlerts:
        InlineWebhookIssueCommentP58c8IssueAllOf1SecretScanningAlertsX7634cd01? = null

    public var secrets:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppSecretsXb10674ba? = null

    public var securityEvents: InlineWebhookIssueCommentP58c8IssueAllOf1SecurityEventsXc0b0d255? =
        null

    public var securityScanningAlert:
        InlineWebhookIssueCommentP58c8IssueAllOf1SecurityScanningAlertXf1dbd160? = null

    public var singleFile: InlineWebhookIssueCommentP58c8IssueAllOf1SingleFileX35181bf3? = null

    public var statuses:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppStatusesXa6516758? = null

    public var teamDiscussions: InlineWebhookIssueCommentP58c8IssueAllOf1TeamDiscussionsX66438e0a? =
        null

    public var vulnerabilityAlerts:
        InlineWebhookIssueCommentP58c8IssueAllOf1VulnerabilityAlertsX896d7935? = null

    public var workflows:
        InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppWorkflowsX39fa2a15? = null

    public fun build(): InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073 = InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073(
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
      teamDiscussions = teamDiscussions,
      vulnerabilityAlerts = vulnerabilityAlerts,
      workflows = workflows,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073 must be a JSON object")
      return InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppActionsX652b5a2e>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1AdministrationX2bb2f08e>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppChecksX6d87669e>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1ContentReferencesXb0191782>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppContentsX4354e661>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1DeploymentsX204e4e04>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1DiscussionsX0eed940b>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppEmailsXc419c931>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1EnvironmentsX92a3f9ef>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppIssuesXa90e3da9>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppKeysX9bfac24d>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppMembersX04ed7348>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppMetadataX55f5153e>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationAdministca9fXc184cc43>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationHooksX0ba69ea4>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationPackagesX25b8acd0>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationPlanXdf899842>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationProjectsX03b41862>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationSecretsX5e11de50>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationSelfHost148fX897078f3>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1OrganizationUserBlockingX6265237d>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPackagesX6e6a8ef7>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppPagesX8d55b18b>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PullRequestsXf4b1e4b2>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1RepositoryHooksXcbf1c725>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1RepositoryProjectsX96f49ea9>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1SecretScanningAlertsX7634cd01>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppSecretsXb10674ba>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1SecurityEventsXc0b0d255>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1SecurityScanningAlertXf1dbd160>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1SingleFileX35181bf3>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppStatusesXa6516758>(it) },
        teamDiscussions = rawObject["team_discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1TeamDiscussionsX66438e0a>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1VulnerabilityAlertsX896d7935>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentP58c8IssueAllOf1PerformedViaGithubAppWorkflowsX39fa2a15>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073")
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
        value.teamDiscussions?.let { put("team_discussions", json.encodeToJsonElement(it)) }
        value.vulnerabilityAlerts?.let { put("vulnerability_alerts", json.encodeToJsonElement(it)) }
        value.workflows?.let { put("workflows", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073(block: InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073.Builder.() -> Unit): InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073 = InlineWebhookIssueCommentP58c8IssueAllOf1PermissionsXdeb67073.build(block)
