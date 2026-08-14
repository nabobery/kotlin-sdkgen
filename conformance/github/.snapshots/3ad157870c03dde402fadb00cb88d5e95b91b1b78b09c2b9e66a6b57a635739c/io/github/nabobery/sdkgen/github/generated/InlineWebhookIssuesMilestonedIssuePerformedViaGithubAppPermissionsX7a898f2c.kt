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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/performed_via_
 * github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c.Serializer::class)
public class InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c(
  public val actions:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppActionsX100a2525? = null,
  public val administration:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppAdministrationXb918cbb3? = null,
  public val checks: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef? = null,
  public val contentReferences:
      InlineWebhookIssuesMilestonedIssueContentReferencesXb221e3d2? = null,
  public val contents:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppContentsX7dfd3ffb? = null,
  public val deployments:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDeploymentsXa7cbfbfe? = null,
  public val discussions:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1? = null,
  public val emails: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppEmailsX7750e4ca? = null,
  public val environments:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppEnvironmentsX174d93cb? = null,
  public val issues: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppIssuesX7a794545? = null,
  public val keys:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsKeysXc3fa623b? = null,
  public val members:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppMembersX110f20d4? = null,
  public val metadata:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppMetadataX2d63ba8e? = null,
  public val organizationAdministration:
      InlineWebhookIssuesMilestonedIssueOrganizationAdministca9fX4632d076? = null,
  public val organizationHooks:
      InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0? = null,
  public val organizationPackages:
      InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed? = null,
  public val organizationPlan:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppOrganizationPlanX4e7ffd96? = null,
  public val organizationProjects:
      InlineWebhookIssuesMilestonedIssueOrganizationProjectsXcec2cccc? = null,
  public val organizationSecrets:
      InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesMilestonedIssueOrganizationSelfHost148fX75389c1f? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesMilestonedIssueOrganizationUserBlockingX927e1195? = null,
  public val packages:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPackagesX9fd33e9c? = null,
  public val pages:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsPagesXd0c8fe87? = null,
  public val pullRequests:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083? = null,
  public val repositoryHooks:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b? = null,
  public val repositoryProjects:
      InlineWebhookIssuesMilestonedIssueRepositoryProjectsXa0ff3f70? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesMilestonedIssueSecretScanningAlertsX7fdf928c? = null,
  public val secrets:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppSecretsXe8ad5270? = null,
  public val securityEvents:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppSecurityEventsXa364323a? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesMilestonedIssueSecurityScanningAlertX4d38659f? = null,
  public val singleFile:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppSingleFileX6b3ed3b9? = null,
  public val statuses:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppStatusesX54eb02f2? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesMilestonedIssueVulnerabilityAlertsX853e1411? = null,
  public val workflows:
      InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppWorkflowsXb40bf505? = null,
) {
  public class Builder {
    public var actions: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppActionsX100a2525? =
        null

    public var administration:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppAdministrationXb918cbb3? = null

    public var checks: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef? =
        null

    public var contentReferences: InlineWebhookIssuesMilestonedIssueContentReferencesXb221e3d2? =
        null

    public var contents: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppContentsX7dfd3ffb? =
        null

    public var deployments:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDeploymentsXa7cbfbfe? = null

    public var discussions:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1? = null

    public var emails: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppEmailsX7750e4ca? =
        null

    public var environments:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppEnvironmentsX174d93cb? = null

    public var issues: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppIssuesX7a794545? =
        null

    public var keys:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsKeysXc3fa623b? = null

    public var members: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppMembersX110f20d4? =
        null

    public var metadata: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppMetadataX2d63ba8e? =
        null

    public var organizationAdministration:
        InlineWebhookIssuesMilestonedIssueOrganizationAdministca9fX4632d076? = null

    public var organizationHooks: InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0? =
        null

    public var organizationPackages:
        InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed? = null

    public var organizationPlan:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppOrganizationPlanX4e7ffd96? = null

    public var organizationProjects:
        InlineWebhookIssuesMilestonedIssueOrganizationProjectsXcec2cccc? = null

    public var organizationSecrets: InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de?
        = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesMilestonedIssueOrganizationSelfHost148fX75389c1f? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesMilestonedIssueOrganizationUserBlockingX927e1195? = null

    public var packages: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPackagesX9fd33e9c? =
        null

    public var pages:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsPagesXd0c8fe87? = null

    public var pullRequests:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083? = null

    public var repositoryHooks:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b? = null

    public var repositoryProjects: InlineWebhookIssuesMilestonedIssueRepositoryProjectsXa0ff3f70? =
        null

    public var secretScanningAlerts:
        InlineWebhookIssuesMilestonedIssueSecretScanningAlertsX7fdf928c? = null

    public var secrets: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppSecretsXe8ad5270? =
        null

    public var securityEvents:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppSecurityEventsXa364323a? = null

    public var securityScanningAlert:
        InlineWebhookIssuesMilestonedIssueSecurityScanningAlertX4d38659f? = null

    public var singleFile:
        InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppSingleFileX6b3ed3b9? = null

    public var statuses: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppStatusesX54eb02f2? =
        null

    public var vulnerabilityAlerts: InlineWebhookIssuesMilestonedIssueVulnerabilityAlertsX853e1411?
        = null

    public var workflows: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppWorkflowsXb40bf505?
        = null

    public fun build(): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c = InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c must be a JSON object")
      return InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppActionsX100a2525>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppAdministrationXb918cbb3>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppChecksX422ae4ef>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueContentReferencesXb221e3d2>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppContentsX7dfd3ffb>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDeploymentsXa7cbfbfe>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppDiscussionsX49d458f1>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppEmailsX7750e4ca>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppEnvironmentsX174d93cb>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppIssuesX7a794545>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsKeysXc3fa623b>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppMembersX110f20d4>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppMetadataX2d63ba8e>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueOrganizationAdministca9fX4632d076>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueOrganizationHooksX0be284c0>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueOrganizationPackagesXb49306ed>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppOrganizationPlanX4e7ffd96>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueOrganizationProjectsXcec2cccc>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueOrganizationSecretsX140f85de>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueOrganizationSelfHost148fX75389c1f>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueOrganizationUserBlockingX927e1195>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPackagesX9fd33e9c>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsPagesXd0c8fe87>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPullRequestsX1d4f7083>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppRepositoryHooksXc52cc16b>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueRepositoryProjectsXa0ff3f70>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueSecretScanningAlertsX7fdf928c>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppSecretsXe8ad5270>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppSecurityEventsXa364323a>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueSecurityScanningAlertX4d38659f>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppSingleFileX6b3ed3b9>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppStatusesX54eb02f2>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueVulnerabilityAlertsX853e1411>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppWorkflowsXb40bf505>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c")
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

public fun inlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c(block: InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c.Builder.() -> Unit): InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c = InlineWebhookIssuesMilestonedIssuePerformedViaGithubAppPermissionsX7a898f2c.build(block)
