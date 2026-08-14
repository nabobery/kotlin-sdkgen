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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/app/
 * properties/permissions
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511.Serializer::class)
public class InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511(
  public val actions:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsActionsX5d3ef0c2? = null,
  public val administration:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsAdministrationX442c83e2? = null,
  public val artifactMetadata:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e? = null,
  public val attestations:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsAttestationsX905786ca? = null,
  public val checks:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsChecksX044e3a2f? = null,
  public val codeQuality:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad? = null,
  public val contentReferences:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsContentReferencesX62b9991d? = null,
  public val contents:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsContentsX81d455cb? = null,
  public val copilotRequests:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCopilotRequestsX136911ae? = null,
  public val deployments:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8? = null,
  public val discussions:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDiscussionsX8af6c477? = null,
  public val drives:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDrivesX5457d839? = null,
  public val emails:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsEmailsX258f1a09? = null,
  public val environments:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsEnvironmentsXe99320f4? = null,
  public val issues:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805? = null,
  public val keys: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsKeysX0b0d04d5? = null,
  public val members:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsMembersXdcdcbc3b? = null,
  public val mergeQueues:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsMergeQueuesX36ffaa12? = null,
  public val metadata:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsMetadataXe548a21f? = null,
  public val models:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsModelsX2f31b5e0? = null,
  public val organizationAdministration:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationAdministca9fX3232e051? = null,
  public val organizationHooks:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6? = null,
  public val organizationPackages:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationPackagesX6f5c9e5c? = null,
  public val organizationPlan:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationPlanX7ead71a1? = null,
  public val organizationProjects:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationProjectsX3b94ab9a? = null,
  public val organizationSecrets:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationSecretsX4444c330? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationSelfHost148fX12a274c3? = null,
  public val organizationUserBlocking:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationUserBlockingXab97ccb2? = null,
  public val packages:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsPackagesX59d1ebfd? = null,
  public val pages: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsPagesXfc85a152? = null,
  public val pullRequests:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsPullRequestsX1f176283? = null,
  public val repositoryHooks:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038? = null,
  public val repositoryProjects:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1? = null,
  public val secretScanningAlerts:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppSecretScanningAlertsX00e53e03? = null,
  public val secrets:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsSecretsXd5a1034f? = null,
  public val securityEvents:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsSecurityEventsX75f1bd2a? = null,
  public val securityScanningAlert:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppSecurityScanningAlertXad3f2d2f? = null,
  public val singleFile:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsSingleFileX1ebad01e? = null,
  public val statuses:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsStatusesX76a8d940? = null,
  public val vulnerabilityAlerts:
      InlineWebhookCheckSuiteReqdc23CheckSuiteAppVulnerabilityAlertsXbe19b3f7? = null,
  public val workflows:
      InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsWorkflowsX57072369? = null,
) {
  public class Builder {
    public var actions: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsActionsX5d3ef0c2? =
        null

    public var administration:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsAdministrationX442c83e2? = null

    public var artifactMetadata:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e? = null

    public var attestations:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsAttestationsX905786ca? = null

    public var checks: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsChecksX044e3a2f? =
        null

    public var codeQuality:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad? = null

    public var contentReferences:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsContentReferencesX62b9991d? = null

    public var contents: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsContentsX81d455cb?
        = null

    public var copilotRequests:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCopilotRequestsX136911ae? = null

    public var deployments:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8? = null

    public var discussions:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDiscussionsX8af6c477? = null

    public var drives: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDrivesX5457d839? =
        null

    public var emails: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsEmailsX258f1a09? =
        null

    public var environments:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsEnvironmentsXe99320f4? = null

    public var issues: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805? =
        null

    public var keys: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsKeysX0b0d04d5? = null

    public var members: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsMembersXdcdcbc3b? =
        null

    public var mergeQueues:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsMergeQueuesX36ffaa12? = null

    public var metadata: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsMetadataXe548a21f?
        = null

    public var models: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsModelsX2f31b5e0? =
        null

    public var organizationAdministration:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationAdministca9fX3232e051? = null

    public var organizationHooks:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6? = null

    public var organizationPackages:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationPackagesX6f5c9e5c? = null

    public var organizationPlan:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationPlanX7ead71a1? = null

    public var organizationProjects:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationProjectsX3b94ab9a? = null

    public var organizationSecrets:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationSecretsX4444c330? = null

    public var organizationSelfHostedRunners:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationSelfHost148fX12a274c3? = null

    public var organizationUserBlocking:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationUserBlockingXab97ccb2? = null

    public var packages: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsPackagesX59d1ebfd?
        = null

    public var pages: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsPagesXfc85a152? = null

    public var pullRequests:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsPullRequestsX1f176283? = null

    public var repositoryHooks:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038? = null

    public var repositoryProjects:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1? = null

    public var secretScanningAlerts:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppSecretScanningAlertsX00e53e03? = null

    public var secrets: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsSecretsXd5a1034f? =
        null

    public var securityEvents:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsSecurityEventsX75f1bd2a? = null

    public var securityScanningAlert:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppSecurityScanningAlertXad3f2d2f? = null

    public var singleFile:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsSingleFileX1ebad01e? = null

    public var statuses: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsStatusesX76a8d940?
        = null

    public var vulnerabilityAlerts:
        InlineWebhookCheckSuiteReqdc23CheckSuiteAppVulnerabilityAlertsXbe19b3f7? = null

    public var workflows:
        InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsWorkflowsX57072369? = null

    public fun build(): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511 = InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511(
      actions = actions,
      administration = administration,
      artifactMetadata = artifactMetadata,
      attestations = attestations,
      checks = checks,
      codeQuality = codeQuality,
      contentReferences = contentReferences,
      contents = contents,
      copilotRequests = copilotRequests,
      deployments = deployments,
      discussions = discussions,
      drives = drives,
      emails = emails,
      environments = environments,
      issues = issues,
      keys = keys,
      members = members,
      mergeQueues = mergeQueues,
      metadata = metadata,
      models = models,
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
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511 must be a JSON object")
      return InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsActionsX5d3ef0c2>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsAdministrationX442c83e2>(it) },
        artifactMetadata = rawObject["artifact_metadata"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsArtifactMetadataX72fc907e>(it) },
        attestations = rawObject["attestations"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsAttestationsX905786ca>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsChecksX044e3a2f>(it) },
        codeQuality = rawObject["code_quality"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCodeQualityX5d98ecad>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsContentReferencesX62b9991d>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsContentsX81d455cb>(it) },
        copilotRequests = rawObject["copilot_requests"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCopilotRequestsX136911ae>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDeploymentsX390102c8>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDiscussionsX8af6c477>(it) },
        drives = rawObject["drives"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsDrivesX5457d839>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsEmailsX258f1a09>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsEnvironmentsXe99320f4>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsIssuesX2fba9805>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsKeysX0b0d04d5>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsMembersXdcdcbc3b>(it) },
        mergeQueues = rawObject["merge_queues"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsMergeQueuesX36ffaa12>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsMetadataXe548a21f>(it) },
        models = rawObject["models"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsModelsX2f31b5e0>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationAdministca9fX3232e051>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationHooksX531084d6>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationPackagesX6f5c9e5c>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppPermissionsOrganizationPlanX7ead71a1>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationProjectsX3b94ab9a>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationSecretsX4444c330>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationSelfHost148fX12a274c3>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppOrganizationUserBlockingXab97ccb2>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsPackagesX59d1ebfd>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsPagesXfc85a152>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsPullRequestsX1f176283>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsRepositoryHooksXf9edb038>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppRepositoryProjectsX9060e3d1>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppSecretScanningAlertsX00e53e03>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsSecretsXd5a1034f>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsSecurityEventsX75f1bd2a>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppSecurityScanningAlertXad3f2d2f>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsSingleFileX1ebad01e>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsStatusesX76a8d940>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteReqdc23CheckSuiteAppVulnerabilityAlertsXbe19b3f7>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsWorkflowsX57072369>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.actions?.let { put("actions", json.encodeToJsonElement(it)) }
        value.administration?.let { put("administration", json.encodeToJsonElement(it)) }
        value.artifactMetadata?.let { put("artifact_metadata", json.encodeToJsonElement(it)) }
        value.attestations?.let { put("attestations", json.encodeToJsonElement(it)) }
        value.checks?.let { put("checks", json.encodeToJsonElement(it)) }
        value.codeQuality?.let { put("code_quality", json.encodeToJsonElement(it)) }
        value.contentReferences?.let { put("content_references", json.encodeToJsonElement(it)) }
        value.contents?.let { put("contents", json.encodeToJsonElement(it)) }
        value.copilotRequests?.let { put("copilot_requests", json.encodeToJsonElement(it)) }
        value.deployments?.let { put("deployments", json.encodeToJsonElement(it)) }
        value.discussions?.let { put("discussions", json.encodeToJsonElement(it)) }
        value.drives?.let { put("drives", json.encodeToJsonElement(it)) }
        value.emails?.let { put("emails", json.encodeToJsonElement(it)) }
        value.environments?.let { put("environments", json.encodeToJsonElement(it)) }
        value.issues?.let { put("issues", json.encodeToJsonElement(it)) }
        value.keys?.let { put("keys", json.encodeToJsonElement(it)) }
        value.members?.let { put("members", json.encodeToJsonElement(it)) }
        value.mergeQueues?.let { put("merge_queues", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.models?.let { put("models", json.encodeToJsonElement(it)) }
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

public fun inlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511(block: InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511.Builder.() -> Unit): InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511 = InlineWebhookCheckSuiteRequestedCheckSuiteAppPermissionsX49164511.build(block)
