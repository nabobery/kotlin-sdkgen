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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/performed_via_gi
 * thub_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29.Serializer::class)
public class InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29(
  public val actions:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsActionsXa9e8da78? = null,
  public val administration:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppAdministrationX5c73f27e? = null,
  public val checks:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b? = null,
  public val contentReferences:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppContentReferencesX02d0dac2? = null,
  public val contents:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppContentsXd3b6e93b? = null,
  public val deployments:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppDeploymentsX77d50a27? = null,
  public val discussions:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppDiscussionsXe432d916? = null,
  public val emails:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsEmailsX80f562fc? = null,
  public val environments:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d? = null,
  public val issues:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsIssuesX7096c16f? = null,
  public val keys:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsKeysX39e37938? = null,
  public val members:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsMembersX346e32b2? = null,
  public val metadata:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppMetadataX1c0c4154? = null,
  public val organizationAdministration:
      InlineWebhookIssuesUnlockedIssueOrganizationAdministca9fX80959d35? = null,
  public val organizationHooks:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationHooksXef66e820? = null,
  public val organizationPackages:
      InlineWebhookIssuesUnlockedIssueOrganizationPackagesXb2fe3df9? = null,
  public val organizationPlan:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4? = null,
  public val organizationProjects:
      InlineWebhookIssuesUnlockedIssueOrganizationProjectsXa61a3e79? = null,
  public val organizationSecrets:
      InlineWebhookIssuesUnlockedIssueOrganizationSecretsXc4b5baea? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesUnlockedIssueOrganizationSelfHost148fXb92740b8? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesUnlockedIssueOrganizationUserBlockingXc5002ba3? = null,
  public val packages:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd? = null,
  public val pages:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsPagesXf6befd7f? = null,
  public val pullRequests:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPullRequestsX39f96bc3? = null,
  public val repositoryHooks:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppRepositoryHooksXb55f51ed? = null,
  public val repositoryProjects:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppRepositoryProjectsX2fee3ee5? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesUnlockedIssueSecretScanningAlertsXed6ed486? = null,
  public val secrets:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsSecretsX5fe2b099? = null,
  public val securityEvents:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSecurityEventsX11a84ca3? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesUnlockedIssueSecurityScanningAlertX20cbd0a2? = null,
  public val singleFile:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c? = null,
  public val statuses:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppStatusesXa87ed545? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesUnlockedIssueVulnerabilityAlertsX9294be4a? = null,
  public val workflows:
      InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppWorkflowsX693545ec? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsActionsXa9e8da78? = null

    public var administration:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppAdministrationX5c73f27e? = null

    public var checks:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b? = null

    public var contentReferences:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppContentReferencesX02d0dac2? = null

    public var contents: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppContentsXd3b6e93b? =
        null

    public var deployments:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppDeploymentsX77d50a27? = null

    public var discussions:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppDiscussionsXe432d916? = null

    public var emails:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsEmailsX80f562fc? = null

    public var environments:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d? = null

    public var issues:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsIssuesX7096c16f? = null

    public var keys: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsKeysX39e37938?
        = null

    public var members:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsMembersX346e32b2? = null

    public var metadata: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppMetadataX1c0c4154? =
        null

    public var organizationAdministration:
        InlineWebhookIssuesUnlockedIssueOrganizationAdministca9fX80959d35? = null

    public var organizationHooks:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationHooksXef66e820? = null

    public var organizationPackages: InlineWebhookIssuesUnlockedIssueOrganizationPackagesXb2fe3df9?
        = null

    public var organizationPlan:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4? = null

    public var organizationProjects: InlineWebhookIssuesUnlockedIssueOrganizationProjectsXa61a3e79?
        = null

    public var organizationSecrets: InlineWebhookIssuesUnlockedIssueOrganizationSecretsXc4b5baea? =
        null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesUnlockedIssueOrganizationSelfHost148fXb92740b8? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesUnlockedIssueOrganizationUserBlockingXc5002ba3? = null

    public var packages: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd? =
        null

    public var pages:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsPagesXf6befd7f? = null

    public var pullRequests:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPullRequestsX39f96bc3? = null

    public var repositoryHooks:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppRepositoryHooksXb55f51ed? = null

    public var repositoryProjects:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppRepositoryProjectsX2fee3ee5? = null

    public var secretScanningAlerts: InlineWebhookIssuesUnlockedIssueSecretScanningAlertsXed6ed486?
        = null

    public var secrets:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsSecretsX5fe2b099? = null

    public var securityEvents:
        InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSecurityEventsX11a84ca3? = null

    public var securityScanningAlert:
        InlineWebhookIssuesUnlockedIssueSecurityScanningAlertX20cbd0a2? = null

    public var singleFile: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c?
        = null

    public var statuses: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppStatusesXa87ed545? =
        null

    public var vulnerabilityAlerts: InlineWebhookIssuesUnlockedIssueVulnerabilityAlertsX9294be4a? =
        null

    public var workflows: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppWorkflowsX693545ec? =
        null

    public fun build(): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29 = InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29 must be a JSON object")
      return InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsActionsXa9e8da78>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppAdministrationX5c73f27e>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsChecksX6a6c346b>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppContentReferencesX02d0dac2>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppContentsXd3b6e93b>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppDeploymentsX77d50a27>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppDiscussionsXe432d916>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsEmailsX80f562fc>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppEnvironmentsXe33afe5d>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsIssuesX7096c16f>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsKeysX39e37938>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsMembersX346e32b2>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppMetadataX1c0c4154>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssueOrganizationAdministca9fX80959d35>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationHooksXef66e820>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssueOrganizationPackagesXb2fe3df9>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppOrganizationPlanX4464edc4>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssueOrganizationProjectsXa61a3e79>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssueOrganizationSecretsXc4b5baea>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssueOrganizationSelfHost148fXb92740b8>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssueOrganizationUserBlockingXc5002ba3>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPackagesX36910edd>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsPagesXf6befd7f>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPullRequestsX39f96bc3>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppRepositoryHooksXb55f51ed>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppRepositoryProjectsX2fee3ee5>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssueSecretScanningAlertsXed6ed486>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsSecretsX5fe2b099>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSecurityEventsX11a84ca3>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssueSecurityScanningAlertX20cbd0a2>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppSingleFileX38eae39c>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppStatusesXa87ed545>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssueVulnerabilityAlertsX9294be4a>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppWorkflowsX693545ec>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29")
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

public fun inlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29(block: InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29.Builder.() -> Unit): InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29 = InlineWebhookIssuesUnlockedIssuePerformedViaGithubAppPermissionsXe6745a29.build(block)
