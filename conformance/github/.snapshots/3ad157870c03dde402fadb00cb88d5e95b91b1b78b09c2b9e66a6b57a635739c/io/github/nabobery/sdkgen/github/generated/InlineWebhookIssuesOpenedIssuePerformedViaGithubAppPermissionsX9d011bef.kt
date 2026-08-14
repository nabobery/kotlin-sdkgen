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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef.Serializer::class)
public class InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef(
  public val actions:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsActionsXe022f068? = null,
  public val administration:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppAdministrationX56a45d00? = null,
  public val checks:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsChecksX5ce75489? = null,
  public val contentReferences:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppContentReferencesX7d5e1a25? = null,
  public val contents:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsContentsX76a0a53b? = null,
  public val deployments:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppDeploymentsX5f8aa14c? = null,
  public val discussions:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppDiscussionsX547ec77c? = null,
  public val emails:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7? = null,
  public val environments:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppEnvironmentsX3c642e4c? = null,
  public val issues:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631? = null,
  public val keys:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a? = null,
  public val members:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsMembersX15448150? = null,
  public val metadata:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsMetadataX8a3ec83a? = null,
  public val organizationAdministration:
      InlineWebhookIssuesOpenedIssueOrganizationAdministca9fXdb86e834? = null,
  public val organizationHooks:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationHooksXc2d4c680? = null,
  public val organizationPackages:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationPackagesX995a4456? = null,
  public val organizationPlan:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationPlanXb5d1a95e? = null,
  public val organizationProjects:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationProjectsX66044efe? = null,
  public val organizationSecrets:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationSecretsX27c17b20? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesOpenedIssueOrganizationSelfHost148fX3fafbdb0? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesOpenedIssueOrganizationUserBlockingX84ca58c3? = null,
  public val packages:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9? = null,
  public val pages:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPagesXeed0ff9c? = null,
  public val pullRequests:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da? = null,
  public val repositoryHooks:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppRepositoryHooksXf824bf9e? = null,
  public val repositoryProjects:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppRepositoryProjectsX7aef0006? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppSecretScanningAlertsX51f50563? = null,
  public val secrets:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsSecretsX60dd3091? = null,
  public val securityEvents:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppSecurityEventsXa2bdb9d8? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesOpenedIssueSecurityScanningAlertX0d483678? = null,
  public val singleFile:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppSingleFileXd0370dc2? = null,
  public val statuses:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsStatusesX9a8aa866? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppVulnerabilityAlertsXe80652fb? = null,
  public val workflows:
      InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsWorkflowsX6083ff14? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsActionsXe022f068? = null

    public var administration:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppAdministrationX56a45d00? = null

    public var checks:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsChecksX5ce75489? = null

    public var contentReferences:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppContentReferencesX7d5e1a25? = null

    public var contents:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsContentsX76a0a53b? = null

    public var deployments: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppDeploymentsX5f8aa14c?
        = null

    public var discussions: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppDiscussionsX547ec77c?
        = null

    public var emails:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7? = null

    public var environments:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppEnvironmentsX3c642e4c? = null

    public var issues:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631? = null

    public var keys: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a? =
        null

    public var members:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsMembersX15448150? = null

    public var metadata:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsMetadataX8a3ec83a? = null

    public var organizationAdministration:
        InlineWebhookIssuesOpenedIssueOrganizationAdministca9fXdb86e834? = null

    public var organizationHooks:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationHooksXc2d4c680? = null

    public var organizationPackages:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationPackagesX995a4456? = null

    public var organizationPlan:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationPlanXb5d1a95e? = null

    public var organizationProjects:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationProjectsX66044efe? = null

    public var organizationSecrets:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationSecretsX27c17b20? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesOpenedIssueOrganizationSelfHost148fX3fafbdb0? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesOpenedIssueOrganizationUserBlockingX84ca58c3? = null

    public var packages:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9? = null

    public var pages: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPagesXeed0ff9c?
        = null

    public var pullRequests:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da? = null

    public var repositoryHooks:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppRepositoryHooksXf824bf9e? = null

    public var repositoryProjects:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppRepositoryProjectsX7aef0006? = null

    public var secretScanningAlerts:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppSecretScanningAlertsX51f50563? = null

    public var secrets:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsSecretsX60dd3091? = null

    public var securityEvents:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppSecurityEventsXa2bdb9d8? = null

    public var securityScanningAlert: InlineWebhookIssuesOpenedIssueSecurityScanningAlertX0d483678?
        = null

    public var singleFile: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppSingleFileXd0370dc2? =
        null

    public var statuses:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsStatusesX9a8aa866? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppVulnerabilityAlertsXe80652fb? = null

    public var workflows:
        InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsWorkflowsX6083ff14? = null

    public fun build(): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef = InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef must be a JSON object")
      return InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsActionsXe022f068>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppAdministrationX56a45d00>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsChecksX5ce75489>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppContentReferencesX7d5e1a25>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsContentsX76a0a53b>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppDeploymentsX5f8aa14c>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppDiscussionsX547ec77c>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsEmailsXf65e21f7>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppEnvironmentsX3c642e4c>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsIssuesX2626e631>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsKeysX655bf16a>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsMembersX15448150>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsMetadataX8a3ec83a>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssueOrganizationAdministca9fXdb86e834>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationHooksXc2d4c680>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationPackagesX995a4456>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationPlanXb5d1a95e>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationProjectsX66044efe>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppOrganizationSecretsX27c17b20>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssueOrganizationSelfHost148fX3fafbdb0>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssueOrganizationUserBlockingX84ca58c3>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPackagesXb6048bb9>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsPagesXeed0ff9c>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPullRequestsX602156da>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppRepositoryHooksXf824bf9e>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppRepositoryProjectsX7aef0006>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppSecretScanningAlertsX51f50563>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsSecretsX60dd3091>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppSecurityEventsXa2bdb9d8>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssueSecurityScanningAlertX0d483678>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppSingleFileXd0370dc2>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsStatusesX9a8aa866>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppVulnerabilityAlertsXe80652fb>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsWorkflowsX6083ff14>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef")
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

public fun inlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef(block: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef.Builder.() -> Unit): InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef = InlineWebhookIssuesOpenedIssuePerformedViaGithubAppPermissionsX9d011bef.build(block)
