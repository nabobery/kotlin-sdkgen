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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/performed_via_github_app/properties/perm
 * issions
 */
@Serializable(with = InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34.Serializer::class)
public class InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34(
  public val actions: InlineWebhooksIssue2PerformedViaGithubAppPermissionsActionsXce0cf4fa? = null,
  public val administration:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsAdministrationXb9ee4b2e? = null,
  public val checks: InlineWebhooksIssue2PerformedViaGithubAppPermissionsChecksX37e28f80? = null,
  public val contentReferences:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsContentReferencesX88ff70b3? = null,
  public val contents:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsContentsXb3276187? = null,
  public val deployments:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsDeploymentsX71e21f40? = null,
  public val discussions:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsDiscussionsXdaf53341? = null,
  public val emails: InlineWebhooksIssue2PerformedViaGithubAppPermissionsEmailsX58139805? = null,
  public val environments:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsEnvironmentsX53777b28? = null,
  public val issues: InlineWebhooksIssue2PerformedViaGithubAppPermissionsIssuesX27690e43? = null,
  public val keys: InlineWebhooksIssue2PerformedViaGithubAppPermissionsKeysX5bc4aa48? = null,
  public val members: InlineWebhooksIssue2PerformedViaGithubAppPermissionsMembersX6a18fa77? = null,
  public val metadata:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsMetadataX4f6a9a2a? = null,
  public val organizationAdministration:
      InlineWebhooksIssue2PerformedViaGithubAppOrganizationAdministca9fXfa8fedfe? = null,
  public val organizationHooks:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationHooksX94c98265? = null,
  public val organizationPackages:
      InlineWebhooksIssue2PerformedViaGithubAppOrganizationPackagesXeb485d05? = null,
  public val organizationPlan:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationPlanXb503bf62? = null,
  public val organizationProjects:
      InlineWebhooksIssue2PerformedViaGithubAppOrganizationProjectsXbb5d085b? = null,
  public val organizationSecrets:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f? = null,
  public val organizationSelfHostedRunners:
      InlineWebhooksIssue2PerformedViaGithubAppOrganizationSelfHost148fX19b5dbd3? = null,
  public val organizationUserBlocking:
      InlineWebhooksIssue2PerformedViaGithubAppOrganizationUserBlockingX12bee224? = null,
  public val packages:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6? = null,
  public val pages: InlineWebhooksIssue2PerformedViaGithubAppPermissionsPagesXf3a5d7ca? = null,
  public val pullRequests:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsPullRequestsXc9a5e2d8? = null,
  public val repositoryHooks:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsRepositoryHooksX68ec8a82? = null,
  public val repositoryProjects:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsRepositoryProjectsXd83f18c2? = null,
  public val secretScanningAlerts:
      InlineWebhooksIssue2PerformedViaGithubAppSecretScanningAlertsX93021867? = null,
  public val secrets: InlineWebhooksIssue2PerformedViaGithubAppPermissionsSecretsXb90b15bb? = null,
  public val securityEvents:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsSecurityEventsX5ed9bb1c? = null,
  public val securityScanningAlert:
      InlineWebhooksIssue2PerformedViaGithubAppSecurityScanningAlertXccc0cc0b? = null,
  public val singleFile:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsSingleFileX5ed6ab38? = null,
  public val statuses:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsStatusesXbf933767? = null,
  public val vulnerabilityAlerts:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsVulnerabilityAlertsXf434a759? = null,
  public val workflows:
      InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6? = null,
) {
  public class Builder {
    public var actions: InlineWebhooksIssue2PerformedViaGithubAppPermissionsActionsXce0cf4fa? = null

    public var administration:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsAdministrationXb9ee4b2e? = null

    public var checks: InlineWebhooksIssue2PerformedViaGithubAppPermissionsChecksX37e28f80? = null

    public var contentReferences:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsContentReferencesX88ff70b3? = null

    public var contents: InlineWebhooksIssue2PerformedViaGithubAppPermissionsContentsXb3276187? =
        null

    public var deployments:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsDeploymentsX71e21f40? = null

    public var discussions:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsDiscussionsXdaf53341? = null

    public var emails: InlineWebhooksIssue2PerformedViaGithubAppPermissionsEmailsX58139805? = null

    public var environments:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsEnvironmentsX53777b28? = null

    public var issues: InlineWebhooksIssue2PerformedViaGithubAppPermissionsIssuesX27690e43? = null

    public var keys: InlineWebhooksIssue2PerformedViaGithubAppPermissionsKeysX5bc4aa48? = null

    public var members: InlineWebhooksIssue2PerformedViaGithubAppPermissionsMembersX6a18fa77? = null

    public var metadata: InlineWebhooksIssue2PerformedViaGithubAppPermissionsMetadataX4f6a9a2a? =
        null

    public var organizationAdministration:
        InlineWebhooksIssue2PerformedViaGithubAppOrganizationAdministca9fXfa8fedfe? = null

    public var organizationHooks:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationHooksX94c98265? = null

    public var organizationPackages:
        InlineWebhooksIssue2PerformedViaGithubAppOrganizationPackagesXeb485d05? = null

    public var organizationPlan:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationPlanXb503bf62? = null

    public var organizationProjects:
        InlineWebhooksIssue2PerformedViaGithubAppOrganizationProjectsXbb5d085b? = null

    public var organizationSecrets:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f? = null

    public var organizationSelfHostedRunners:
        InlineWebhooksIssue2PerformedViaGithubAppOrganizationSelfHost148fX19b5dbd3? = null

    public var organizationUserBlocking:
        InlineWebhooksIssue2PerformedViaGithubAppOrganizationUserBlockingX12bee224? = null

    public var packages: InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6? =
        null

    public var pages: InlineWebhooksIssue2PerformedViaGithubAppPermissionsPagesXf3a5d7ca? = null

    public var pullRequests:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsPullRequestsXc9a5e2d8? = null

    public var repositoryHooks:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsRepositoryHooksX68ec8a82? = null

    public var repositoryProjects:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsRepositoryProjectsXd83f18c2? = null

    public var secretScanningAlerts:
        InlineWebhooksIssue2PerformedViaGithubAppSecretScanningAlertsX93021867? = null

    public var secrets: InlineWebhooksIssue2PerformedViaGithubAppPermissionsSecretsXb90b15bb? = null

    public var securityEvents:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsSecurityEventsX5ed9bb1c? = null

    public var securityScanningAlert:
        InlineWebhooksIssue2PerformedViaGithubAppSecurityScanningAlertXccc0cc0b? = null

    public var singleFile: InlineWebhooksIssue2PerformedViaGithubAppPermissionsSingleFileX5ed6ab38?
        = null

    public var statuses: InlineWebhooksIssue2PerformedViaGithubAppPermissionsStatusesXbf933767? =
        null

    public var vulnerabilityAlerts:
        InlineWebhooksIssue2PerformedViaGithubAppPermissionsVulnerabilityAlertsXf434a759? = null

    public var workflows: InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6? =
        null

    public fun build(): InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34 = InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34(
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
    public fun build(block: Builder.() -> Unit): InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34 must be a JSON object")
      return InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsActionsXce0cf4fa>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsAdministrationXb9ee4b2e>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsChecksX37e28f80>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsContentReferencesX88ff70b3>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsContentsXb3276187>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsDeploymentsX71e21f40>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsDiscussionsXdaf53341>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsEmailsX58139805>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsEnvironmentsX53777b28>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsIssuesX27690e43>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsKeysX5bc4aa48>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsMembersX6a18fa77>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsMetadataX4f6a9a2a>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppOrganizationAdministca9fXfa8fedfe>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationHooksX94c98265>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppOrganizationPackagesXeb485d05>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationPlanXb503bf62>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppOrganizationProjectsXbb5d085b>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsOrganizationSecretsXf801f08f>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppOrganizationSelfHost148fX19b5dbd3>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppOrganizationUserBlockingX12bee224>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsPackagesX7825c7c6>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsPagesXf3a5d7ca>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsPullRequestsXc9a5e2d8>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsRepositoryHooksX68ec8a82>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsRepositoryProjectsXd83f18c2>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppSecretScanningAlertsX93021867>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsSecretsXb90b15bb>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsSecurityEventsX5ed9bb1c>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppSecurityScanningAlertXccc0cc0b>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsSingleFileX5ed6ab38>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsStatusesXbf933767>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsVulnerabilityAlertsXf434a759>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhooksIssue2PerformedViaGithubAppPermissionsWorkflowsXd3b30fc6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34")
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

public fun inlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34(block: InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34.Builder.() -> Unit): InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34 = InlineWebhooksIssue2PerformedViaGithubAppPermissionsX2ec8aa34.build(block)
