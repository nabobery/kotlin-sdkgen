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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/app/
 * properties/permissions
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583.Serializer::class)
public class InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583(
  public val actions:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsActionsX27d7b1c5? = null,
  public val administration:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsAdministrationXf66b15a9? = null,
  public val checks:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsChecksXc3a58a96? = null,
  public val contentReferences:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1? = null,
  public val contents:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsContentsX12331349? = null,
  public val deployments:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsDeploymentsX9bbb9556? = null,
  public val discussions:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsDiscussionsX9ee99469? = null,
  public val emails:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsEmailsX96ce0801? = null,
  public val environments:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsEnvironmentsX1c9e8e75? = null,
  public val issues:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsIssuesX4011b32d? = null,
  public val keys: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsKeysX4e958383? = null,
  public val members:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsMembersX45f8308d? = null,
  public val metadata:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsMetadataXc3479a49? = null,
  public val organizationAdministration:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationAdministca9fX33dca8dc? = null,
  public val organizationHooks:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsOrganizationHooksXd9368efe? = null,
  public val organizationPackages:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationPackagesXcecc8690? = null,
  public val organizationPlan:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsOrganizationPlanX4d01549d? = null,
  public val organizationProjects:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationProjectsX761a0bc5? = null,
  public val organizationSecrets:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationSecretsX063bce11? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationSelfHost148fX15d8118b? = null,
  public val organizationUserBlocking:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationUserBlockingXda6828ff? = null,
  public val packages:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPackagesX9a39ee3f? = null,
  public val pages: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d? = null,
  public val pullRequests:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPullRequestsXd6da5620? = null,
  public val repositoryHooks:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068? = null,
  public val repositoryProjects:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67? = null,
  public val secretScanningAlerts:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppSecretScanningAlertsX5164b3af? = null,
  public val secrets:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsSecretsX69bb8034? = null,
  public val securityEvents:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsSecurityEventsX5bb1ccfd? = null,
  public val securityScanningAlert:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppSecurityScanningAlertX8808d671? = null,
  public val singleFile:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsSingleFileXd1fbd6fb? = null,
  public val statuses:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsStatusesXc5eb8992? = null,
  public val vulnerabilityAlerts:
      InlineWebhookCheckSuiteComf2d7CheckSuiteAppVulnerabilityAlertsX9db0db35? = null,
  public val workflows:
      InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsWorkflowsX6e503f41? = null,
) {
  public class Builder {
    public var actions: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsActionsX27d7b1c5? =
        null

    public var administration:
        InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsAdministrationXf66b15a9? = null

    public var checks: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsChecksXc3a58a96? =
        null

    public var contentReferences:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1? = null

    public var contents: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsContentsX12331349?
        = null

    public var deployments:
        InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsDeploymentsX9bbb9556? = null

    public var discussions:
        InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsDiscussionsX9ee99469? = null

    public var emails: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsEmailsX96ce0801? =
        null

    public var environments:
        InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsEnvironmentsX1c9e8e75? = null

    public var issues: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsIssuesX4011b32d? =
        null

    public var keys: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsKeysX4e958383? = null

    public var members: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsMembersX45f8308d? =
        null

    public var metadata: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsMetadataXc3479a49?
        = null

    public var organizationAdministration:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationAdministca9fX33dca8dc? = null

    public var organizationHooks:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsOrganizationHooksXd9368efe? = null

    public var organizationPackages:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationPackagesXcecc8690? = null

    public var organizationPlan:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsOrganizationPlanX4d01549d? = null

    public var organizationProjects:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationProjectsX761a0bc5? = null

    public var organizationSecrets:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationSecretsX063bce11? = null

    public var organizationSelfHostedRunners:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationSelfHost148fX15d8118b? = null

    public var organizationUserBlocking:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationUserBlockingXda6828ff? = null

    public var packages: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPackagesX9a39ee3f?
        = null

    public var pages: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d? = null

    public var pullRequests:
        InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPullRequestsXd6da5620? = null

    public var repositoryHooks:
        InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068? = null

    public var repositoryProjects:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67? = null

    public var secretScanningAlerts:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppSecretScanningAlertsX5164b3af? = null

    public var secrets: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsSecretsX69bb8034? =
        null

    public var securityEvents:
        InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsSecurityEventsX5bb1ccfd? = null

    public var securityScanningAlert:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppSecurityScanningAlertX8808d671? = null

    public var singleFile:
        InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsSingleFileXd1fbd6fb? = null

    public var statuses: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsStatusesXc5eb8992?
        = null

    public var vulnerabilityAlerts:
        InlineWebhookCheckSuiteComf2d7CheckSuiteAppVulnerabilityAlertsX9db0db35? = null

    public var workflows:
        InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsWorkflowsX6e503f41? = null

    public fun build(): InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583 = InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583 must be a JSON object")
      return InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsActionsX27d7b1c5>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsAdministrationXf66b15a9>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsChecksXc3a58a96>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsContentReferencesX02be72f1>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsContentsX12331349>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsDeploymentsX9bbb9556>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsDiscussionsX9ee99469>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsEmailsX96ce0801>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsEnvironmentsX1c9e8e75>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsIssuesX4011b32d>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsKeysX4e958383>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsMembersX45f8308d>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsMetadataXc3479a49>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationAdministca9fX33dca8dc>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsOrganizationHooksXd9368efe>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationPackagesXcecc8690>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppPermissionsOrganizationPlanX4d01549d>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationProjectsX761a0bc5>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationSecretsX063bce11>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationSelfHost148fX15d8118b>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppOrganizationUserBlockingXda6828ff>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPackagesX9a39ee3f>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPagesXb994986d>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsPullRequestsXd6da5620>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsRepositoryHooksXb977a068>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppRepositoryProjectsX13737b67>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppSecretScanningAlertsX5164b3af>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsSecretsX69bb8034>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsSecurityEventsX5bb1ccfd>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppSecurityScanningAlertX8808d671>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsSingleFileXd1fbd6fb>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsStatusesXc5eb8992>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteComf2d7CheckSuiteAppVulnerabilityAlertsX9db0db35>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsWorkflowsX6e503f41>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583")
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

public fun inlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583(block: InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583.Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583 = InlineWebhookCheckSuiteCompletedCheckSuiteAppPermissionsXbb1bb583.build(block)
