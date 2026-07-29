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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/ap
 * p/properties/permissions
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df.Serializer::class)
public class InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df(
  public val actions:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsActionsX580297eb? = null,
  public val administration:
      InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5? = null,
  public val artifactMetadata:
      InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsArtifactMetadataX35ad6098? = null,
  public val attestations:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsAttestationsX57d896f7? = null,
  public val checks:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsChecksX17645f38? = null,
  public val codeQuality:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsCodeQualityX88a74551? = null,
  public val contentReferences:
      InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsContentReferencesX6ad33cb7? = null,
  public val contents:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be? = null,
  public val copilotRequests:
      InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsCopilotRequestsX79eb05ca? = null,
  public val deployments:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsDeploymentsX22286f97? = null,
  public val discussions:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsDiscussionsXff09232b? = null,
  public val drives:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsDrivesX33b83276? = null,
  public val emails:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsEmailsX8c9b9e3a? = null,
  public val environments:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsEnvironmentsX9ca64b5c? = null,
  public val issues:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsIssuesX63145546? = null,
  public val keys: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f? = null,
  public val members:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1? = null,
  public val mergeQueues:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMergeQueuesXd2f8064d? = null,
  public val metadata:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMetadataX7c97e1a6? = null,
  public val models:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831? = null,
  public val organizationAdministration:
      InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationAdministca9fX92ebeb6d? = null,
  public val organizationHooks:
      InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsOrganizationHooksX86f60dbe? = null,
  public val organizationPackages:
      InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a? = null,
  public val organizationPlan:
      InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsOrganizationPlanX6705d3bb? = null,
  public val organizationProjects:
      InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f? = null,
  public val organizationSecrets:
      InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationSecretsX10e0ac56? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationSelfHost148fXec856958? = null,
  public val organizationUserBlocking:
      InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationUserBlockingXb02cc4d1? = null,
  public val packages:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsPackagesXc635a768? = null,
  public val pages:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsPagesXa7a0a6df? = null,
  public val pullRequests:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsPullRequestsX8d2371cc? = null,
  public val repositoryHooks:
      InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsRepositoryHooksX41af0623? = null,
  public val repositoryProjects:
      InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8? = null,
  public val secretScanningAlerts:
      InlineWebhookCheckSuiteRera134CheckSuiteAppSecretScanningAlertsXf85cca84? = null,
  public val secrets:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe? = null,
  public val securityEvents:
      InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsSecurityEventsXf0f0ab94? = null,
  public val securityScanningAlert:
      InlineWebhookCheckSuiteRera134CheckSuiteAppSecurityScanningAlertXe6b810e8? = null,
  public val singleFile:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSingleFileX2f33dde7? = null,
  public val statuses:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsStatusesXef6b32a2? = null,
  public val vulnerabilityAlerts:
      InlineWebhookCheckSuiteRera134CheckSuiteAppVulnerabilityAlertsX5eb140be? = null,
  public val workflows:
      InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsWorkflowsXb23dc019? = null,
) {
  public class Builder {
    public var actions: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsActionsX580297eb?
        = null

    public var administration:
        InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5? = null

    public var artifactMetadata:
        InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsArtifactMetadataX35ad6098? = null

    public var attestations:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsAttestationsX57d896f7? = null

    public var checks: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsChecksX17645f38? =
        null

    public var codeQuality:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsCodeQualityX88a74551? = null

    public var contentReferences:
        InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsContentReferencesX6ad33cb7? = null

    public var contents:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be? = null

    public var copilotRequests:
        InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsCopilotRequestsX79eb05ca? = null

    public var deployments:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsDeploymentsX22286f97? = null

    public var discussions:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsDiscussionsXff09232b? = null

    public var drives: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsDrivesX33b83276? =
        null

    public var emails: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsEmailsX8c9b9e3a? =
        null

    public var environments:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsEnvironmentsX9ca64b5c? = null

    public var issues: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsIssuesX63145546? =
        null

    public var keys: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f? = null

    public var members: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1?
        = null

    public var mergeQueues:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMergeQueuesXd2f8064d? = null

    public var metadata:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMetadataX7c97e1a6? = null

    public var models: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831? =
        null

    public var organizationAdministration:
        InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationAdministca9fX92ebeb6d? = null

    public var organizationHooks:
        InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsOrganizationHooksX86f60dbe? = null

    public var organizationPackages:
        InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a? = null

    public var organizationPlan:
        InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsOrganizationPlanX6705d3bb? = null

    public var organizationProjects:
        InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f? = null

    public var organizationSecrets:
        InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationSecretsX10e0ac56? = null

    public var organizationSelfHostedRunners:
        InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationSelfHost148fXec856958? = null

    public var organizationUserBlocking:
        InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationUserBlockingXb02cc4d1? = null

    public var packages:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsPackagesXc635a768? = null

    public var pages: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsPagesXa7a0a6df? =
        null

    public var pullRequests:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsPullRequestsX8d2371cc? = null

    public var repositoryHooks:
        InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsRepositoryHooksX41af0623? = null

    public var repositoryProjects:
        InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8? = null

    public var secretScanningAlerts:
        InlineWebhookCheckSuiteRera134CheckSuiteAppSecretScanningAlertsXf85cca84? = null

    public var secrets: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe?
        = null

    public var securityEvents:
        InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsSecurityEventsXf0f0ab94? = null

    public var securityScanningAlert:
        InlineWebhookCheckSuiteRera134CheckSuiteAppSecurityScanningAlertXe6b810e8? = null

    public var singleFile:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSingleFileX2f33dde7? = null

    public var statuses:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsStatusesXef6b32a2? = null

    public var vulnerabilityAlerts:
        InlineWebhookCheckSuiteRera134CheckSuiteAppVulnerabilityAlertsX5eb140be? = null

    public var workflows:
        InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsWorkflowsXb23dc019? = null

    public fun build(): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df = InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df must be a JSON object")
      return InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsActionsX580297eb>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsAdministrationX1b47c8f5>(it) },
        artifactMetadata = rawObject["artifact_metadata"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsArtifactMetadataX35ad6098>(it) },
        attestations = rawObject["attestations"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsAttestationsX57d896f7>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsChecksX17645f38>(it) },
        codeQuality = rawObject["code_quality"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsCodeQualityX88a74551>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsContentReferencesX6ad33cb7>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsContentsX177169be>(it) },
        copilotRequests = rawObject["copilot_requests"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsCopilotRequestsX79eb05ca>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsDeploymentsX22286f97>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsDiscussionsXff09232b>(it) },
        drives = rawObject["drives"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsDrivesX33b83276>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsEmailsX8c9b9e3a>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsEnvironmentsX9ca64b5c>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsIssuesX63145546>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsKeysX07de116f>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMembersXbe6382a1>(it) },
        mergeQueues = rawObject["merge_queues"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMergeQueuesXd2f8064d>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsMetadataX7c97e1a6>(it) },
        models = rawObject["models"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsModelsXe7981831>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationAdministca9fX92ebeb6d>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsOrganizationHooksX86f60dbe>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationPackagesXcbb8259a>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsOrganizationPlanX6705d3bb>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationProjectsX5b964f4f>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationSecretsX10e0ac56>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationSelfHost148fXec856958>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppOrganizationUserBlockingXb02cc4d1>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsPackagesXc635a768>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsPagesXa7a0a6df>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsPullRequestsX8d2371cc>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsRepositoryHooksX41af0623>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppRepositoryProjectsXa8eea3a8>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppSecretScanningAlertsXf85cca84>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSecretsXdbbccafe>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppPermissionsSecurityEventsXf0f0ab94>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppSecurityScanningAlertXe6b810e8>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsSingleFileX2f33dde7>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsStatusesXef6b32a2>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRera134CheckSuiteAppVulnerabilityAlertsX5eb140be>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsWorkflowsXb23dc019>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df")
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

public fun inlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df(block: InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df.Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df = InlineWebhookCheckSuiteRerequestedCheckSuiteAppPermissionsX9a2037df.build(block)
