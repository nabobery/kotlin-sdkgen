package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * erformed_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a.Serializer::class)
public class InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a(
  public val actions:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppActionsXf396d4d1? = null,
  public val administration:
      InlineWebhookIssueCommentUe6d8IssueAllOf1AdministrationXa5fce846? = null,
  public val checks:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppChecksX0a414a32? = null,
  public val contentReferences:
      InlineWebhookIssueCommentUe6d8IssueAllOf1ContentReferencesX4dc4bae9? = null,
  public val contents:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppContentsX24c0bb57? = null,
  public val deployments: InlineWebhookIssueCommentUe6d8IssueAllOf1DeploymentsXbfba896e? = null,
  public val discussions: InlineWebhookIssueCommentUe6d8IssueAllOf1DiscussionsXa1297ad1? = null,
  public val emails:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppEmailsX041ba9ed? = null,
  public val environments: InlineWebhookIssueCommentUe6d8IssueAllOf1EnvironmentsXcc8f41c1? = null,
  public val issues:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppIssuesXe0cbb7b8? = null,
  public val keys:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppKeysXe9db898d? = null,
  public val members:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppMembersX4311b3d8? = null,
  public val metadata:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppMetadataXa15a7bc2? = null,
  public val organizationAdministration:
      InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationAdministca9fXd3ed3a70? = null,
  public val organizationHooks:
      InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8? = null,
  public val organizationPackages:
      InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationPackagesX7b9651f4? = null,
  public val organizationPlan:
      InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationPlanXc40fca4f? = null,
  public val organizationProjects:
      InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b? = null,
  public val organizationSecrets:
      InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationSecretsX4ef9ed83? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationSelfHost148fX090c1764? = null,
  public val organizationUserBlocking:
      InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationUserBlockingX591e1d86? = null,
  public val packages:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppPackagesXdfa2ed91? = null,
  public val pages:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppPagesXae2f2d57? = null,
  public val pullRequests: InlineWebhookIssueCommentUe6d8IssueAllOf1PullRequestsX2a90e945? = null,
  public val repositoryHooks:
      InlineWebhookIssueCommentUe6d8IssueAllOf1RepositoryHooksX33855cd7? = null,
  public val repositoryProjects:
      InlineWebhookIssueCommentUe6d8IssueAllOf1RepositoryProjectsX14a362da? = null,
  public val secretScanningAlerts:
      InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048? = null,
  public val secrets:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppSecretsXcf7ce227? = null,
  public val securityEvents:
      InlineWebhookIssueCommentUe6d8IssueAllOf1SecurityEventsXd556369e? = null,
  public val securityScanningAlert:
      InlineWebhookIssueCommentUe6d8IssueAllOf1SecurityScanningAlertX23f09c71? = null,
  public val singleFile: InlineWebhookIssueCommentUe6d8IssueAllOf1SingleFileX8a75b2e6? = null,
  public val statuses:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppStatusesX0dfc3e9d? = null,
  public val teamDiscussions:
      InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssueCommentUe6d8IssueAllOf1VulnerabilityAlertsXd5c51ea0? = null,
  public val workflows:
      InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppWorkflowsX86d582f5? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppActionsXf396d4d1? = null

    public var administration: InlineWebhookIssueCommentUe6d8IssueAllOf1AdministrationXa5fce846? =
        null

    public var checks:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppChecksX0a414a32? = null

    public var contentReferences:
        InlineWebhookIssueCommentUe6d8IssueAllOf1ContentReferencesX4dc4bae9? = null

    public var contents:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppContentsX24c0bb57? = null

    public var deployments: InlineWebhookIssueCommentUe6d8IssueAllOf1DeploymentsXbfba896e? = null

    public var discussions: InlineWebhookIssueCommentUe6d8IssueAllOf1DiscussionsXa1297ad1? = null

    public var emails:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppEmailsX041ba9ed? = null

    public var environments: InlineWebhookIssueCommentUe6d8IssueAllOf1EnvironmentsXcc8f41c1? = null

    public var issues:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppIssuesXe0cbb7b8? = null

    public var keys: InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppKeysXe9db898d? =
        null

    public var members:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppMembersX4311b3d8? = null

    public var metadata:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppMetadataXa15a7bc2? = null

    public var organizationAdministration:
        InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationAdministca9fXd3ed3a70? = null

    public var organizationHooks:
        InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8? = null

    public var organizationPackages:
        InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationPackagesX7b9651f4? = null

    public var organizationPlan: InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationPlanXc40fca4f?
        = null

    public var organizationProjects:
        InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b? = null

    public var organizationSecrets:
        InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationSecretsX4ef9ed83? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationSelfHost148fX090c1764? = null

    public var organizationUserBlocking:
        InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationUserBlockingX591e1d86? = null

    public var packages:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppPackagesXdfa2ed91? = null

    public var pages: InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppPagesXae2f2d57?
        = null

    public var pullRequests: InlineWebhookIssueCommentUe6d8IssueAllOf1PullRequestsX2a90e945? = null

    public var repositoryHooks: InlineWebhookIssueCommentUe6d8IssueAllOf1RepositoryHooksX33855cd7? =
        null

    public var repositoryProjects:
        InlineWebhookIssueCommentUe6d8IssueAllOf1RepositoryProjectsX14a362da? = null

    public var secretScanningAlerts:
        InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048? = null

    public var secrets:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppSecretsXcf7ce227? = null

    public var securityEvents: InlineWebhookIssueCommentUe6d8IssueAllOf1SecurityEventsXd556369e? =
        null

    public var securityScanningAlert:
        InlineWebhookIssueCommentUe6d8IssueAllOf1SecurityScanningAlertX23f09c71? = null

    public var singleFile: InlineWebhookIssueCommentUe6d8IssueAllOf1SingleFileX8a75b2e6? = null

    public var statuses:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppStatusesX0dfc3e9d? = null

    public var teamDiscussions: InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc? =
        null

    public var vulnerabilityAlerts:
        InlineWebhookIssueCommentUe6d8IssueAllOf1VulnerabilityAlertsXd5c51ea0? = null

    public var workflows:
        InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppWorkflowsX86d582f5? = null

    public fun build(): InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a = InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a must be a JSON object")
      return InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppActionsXf396d4d1>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1AdministrationXa5fce846>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppChecksX0a414a32>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1ContentReferencesX4dc4bae9>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppContentsX24c0bb57>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1DeploymentsXbfba896e>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1DiscussionsXa1297ad1>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppEmailsX041ba9ed>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1EnvironmentsXcc8f41c1>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppIssuesXe0cbb7b8>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppKeysXe9db898d>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppMembersX4311b3d8>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppMetadataXa15a7bc2>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationAdministca9fXd3ed3a70>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationHooksX9b077ed8>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationPackagesX7b9651f4>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationPlanXc40fca4f>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationProjectsX2590cf0b>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationSecretsX4ef9ed83>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationSelfHost148fX090c1764>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1OrganizationUserBlockingX591e1d86>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppPackagesXdfa2ed91>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppPagesXae2f2d57>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PullRequestsX2a90e945>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1RepositoryHooksX33855cd7>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1RepositoryProjectsX14a362da>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1SecretScanningAlertsX8592d048>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppSecretsXcf7ce227>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1SecurityEventsXd556369e>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1SecurityScanningAlertX23f09c71>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1SingleFileX8a75b2e6>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppStatusesX0dfc3e9d>(it) },
        teamDiscussions = rawObject["team_discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1TeamDiscussionsXd4d35dbc>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1VulnerabilityAlertsXd5c51ea0>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssueCommentUe6d8IssueAllOf1PerformedViaGithubAppWorkflowsX86d582f5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a")
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

public fun inlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a(block: InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a.Builder.() -> Unit): InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a = InlineWebhookIssueCommentUe6d8IssueAllOf1PermissionsX3bc2660a.build(block)
