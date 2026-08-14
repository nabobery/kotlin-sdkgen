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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f.Serializer::class)
public class InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f(
  public val actions:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsActionsXea42429d? = null,
  public val administration:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppAdministrationXf3935ccf? = null,
  public val checks:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsChecksXe46e5382? = null,
  public val contentReferences:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppContentReferencesX9912143a? = null,
  public val contents:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsContentsX4fd454f2? = null,
  public val deployments:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9? = null,
  public val discussions:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDiscussionsXce673e6a? = null,
  public val emails:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsEmailsX44f6660a? = null,
  public val environments:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEnvironmentsX1da5c51c? = null,
  public val issues:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsIssuesX7769e0c6? = null,
  public val keys:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsKeysXa6eea8ea? = null,
  public val members:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsMembersX54d661b9? = null,
  public val metadata:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsMetadataX96e713f1? = null,
  public val organizationAdministration:
      InlineWebhookIssuesLabeledIssueOrganizationAdministca9fX8c5f8c4f? = null,
  public val organizationHooks:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5? = null,
  public val organizationPackages:
      InlineWebhookIssuesLabeledIssueOrganizationPackagesX458c08f9? = null,
  public val organizationPlan:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationPlanX7cd65037? = null,
  public val organizationProjects:
      InlineWebhookIssuesLabeledIssueOrganizationProjectsXa0d8fd45? = null,
  public val organizationSecrets:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationSecretsX9df312b7? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesLabeledIssueOrganizationSelfHost148fX9ea3d2f6? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesLabeledIssueOrganizationUserBlockingX79de96bd? = null,
  public val packages:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsPackagesXfee6c17c? = null,
  public val pages:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsPagesXe427bb48? = null,
  public val pullRequests:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760? = null,
  public val repositoryHooks:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppRepositoryHooksXea610159? = null,
  public val repositoryProjects:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppRepositoryProjectsX9136efb4? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f? = null,
  public val secrets:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsSecretsXbf6bd2c3? = null,
  public val securityEvents:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppSecurityEventsX8855e7cd? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesLabeledIssueSecurityScanningAlertX5c93bae6? = null,
  public val singleFile:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppSingleFileX62bc9f28? = null,
  public val statuses:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppVulnerabilityAlertsXea576349? = null,
  public val workflows:
      InlineWebhookIssuesLabeledIssuePerformedViaGithubAppWorkflowsXb5b8a192? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsActionsXea42429d? = null

    public var administration:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppAdministrationXf3935ccf? = null

    public var checks:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsChecksXe46e5382? = null

    public var contentReferences:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppContentReferencesX9912143a? = null

    public var contents:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsContentsX4fd454f2? = null

    public var deployments:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9? = null

    public var discussions:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDiscussionsXce673e6a? = null

    public var emails:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsEmailsX44f6660a? = null

    public var environments:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEnvironmentsX1da5c51c? = null

    public var issues:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsIssuesX7769e0c6? = null

    public var keys: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsKeysXa6eea8ea? =
        null

    public var members:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsMembersX54d661b9? = null

    public var metadata:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsMetadataX96e713f1? = null

    public var organizationAdministration:
        InlineWebhookIssuesLabeledIssueOrganizationAdministca9fX8c5f8c4f? = null

    public var organizationHooks:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5? = null

    public var organizationPackages: InlineWebhookIssuesLabeledIssueOrganizationPackagesX458c08f9? =
        null

    public var organizationPlan:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationPlanX7cd65037? = null

    public var organizationProjects: InlineWebhookIssuesLabeledIssueOrganizationProjectsXa0d8fd45? =
        null

    public var organizationSecrets:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationSecretsX9df312b7? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesLabeledIssueOrganizationSelfHost148fX9ea3d2f6? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesLabeledIssueOrganizationUserBlockingX79de96bd? = null

    public var packages:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsPackagesXfee6c17c? = null

    public var pages: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsPagesXe427bb48?
        = null

    public var pullRequests:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760? = null

    public var repositoryHooks:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppRepositoryHooksXea610159? = null

    public var repositoryProjects:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppRepositoryProjectsX9136efb4? = null

    public var secretScanningAlerts: InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f? =
        null

    public var secrets:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsSecretsXbf6bd2c3? = null

    public var securityEvents:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppSecurityEventsX8855e7cd? = null

    public var securityScanningAlert: InlineWebhookIssuesLabeledIssueSecurityScanningAlertX5c93bae6?
        = null

    public var singleFile: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppSingleFileX62bc9f28?
        = null

    public var statuses:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssuesLabeledIssuePerformedViaGithubAppVulnerabilityAlertsXea576349? = null

    public var workflows: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppWorkflowsXb5b8a192? =
        null

    public fun build(): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f = InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f must be a JSON object")
      return InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsActionsXea42429d>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppAdministrationXf3935ccf>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsChecksXe46e5382>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppContentReferencesX9912143a>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsContentsX4fd454f2>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDeploymentsX42f84de9>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppDiscussionsXce673e6a>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsEmailsX44f6660a>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEnvironmentsX1da5c51c>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsIssuesX7769e0c6>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsKeysXa6eea8ea>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsMembersX54d661b9>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsMetadataX96e713f1>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssueOrganizationAdministca9fX8c5f8c4f>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationHooksX37e6dab5>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssueOrganizationPackagesX458c08f9>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationPlanX7cd65037>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssueOrganizationProjectsXa0d8fd45>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppOrganizationSecretsX9df312b7>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssueOrganizationSelfHost148fX9ea3d2f6>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssueOrganizationUserBlockingX79de96bd>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsPackagesXfee6c17c>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsPagesXe427bb48>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPullRequestsXde87f760>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppRepositoryHooksXea610159>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppRepositoryProjectsX9136efb4>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssueSecretScanningAlertsX17ca307f>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsSecretsXbf6bd2c3>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppSecurityEventsX8855e7cd>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssueSecurityScanningAlertX5c93bae6>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppSingleFileX62bc9f28>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsStatusesXb6bb33c5>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppVulnerabilityAlertsXea576349>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppWorkflowsXb5b8a192>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f")
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

public fun inlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f(block: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f.Builder.() -> Unit): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f = InlineWebhookIssuesLabeledIssuePerformedViaGithubAppPermissionsX16c4d96f.build(block)
