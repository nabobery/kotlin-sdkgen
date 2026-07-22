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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784.Serializer::class)
public class InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784(
  public val actions:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c? = null,
  public val administration:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881? = null,
  public val checks:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsChecksXa73870b0? = null,
  public val contentReferences:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppContentReferencesX7b1d3104? = null,
  public val contents:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsContentsX96de4850? = null,
  public val deployments:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86? = null,
  public val discussions:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppDiscussionsX53a6ef4b? = null,
  public val emails:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsEmailsX641bb064? = null,
  public val environments:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppEnvironmentsXe35438f1? = null,
  public val issues:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsIssuesX0d7c4b6b? = null,
  public val keys:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsKeysX51da3a4a? = null,
  public val members:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsMembersX73613716? = null,
  public val metadata:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsMetadataX2c80895d? = null,
  public val organizationAdministration:
      InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5? = null,
  public val organizationHooks:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationHooksXe60ed367? = null,
  public val organizationPackages:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationPackagesX4e5c8311? = null,
  public val organizationPlan:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationPlanXd222abca? = null,
  public val organizationProjects:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationProjectsX049b41c7? = null,
  public val organizationSecrets:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationSecretsX3c6c47e5? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesLockedIssueOrganizationSelfHost148fX35a2e3a4? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesLockedIssueOrganizationUserBlockingX1d32bf74? = null,
  public val packages:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsPackagesX378c60cc? = null,
  public val pages:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsPagesXb542e5b5? = null,
  public val pullRequests:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3? = null,
  public val repositoryHooks:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppRepositoryHooksX8c21e318? = null,
  public val repositoryProjects:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppRepositoryProjectsXd0714e93? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppSecretScanningAlertsX54abbbda? = null,
  public val secrets:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsSecretsX1e5a3c66? = null,
  public val securityEvents:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppSecurityEventsXaddfbbe0? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesLockedIssueSecurityScanningAlertX789a171c? = null,
  public val singleFile:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppSingleFileX733f1bd2? = null,
  public val statuses:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsStatusesXf5668495? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppVulnerabilityAlertsX079cbc03? = null,
  public val workflows:
      InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsWorkflowsX3639b564? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c? = null

    public var administration:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881? = null

    public var checks:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsChecksXa73870b0? = null

    public var contentReferences:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppContentReferencesX7b1d3104? = null

    public var contents:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsContentsX96de4850? = null

    public var deployments: InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86?
        = null

    public var discussions: InlineWebhookIssuesLockedIssuePerformedViaGithubAppDiscussionsX53a6ef4b?
        = null

    public var emails:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsEmailsX641bb064? = null

    public var environments:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppEnvironmentsXe35438f1? = null

    public var issues:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsIssuesX0d7c4b6b? = null

    public var keys: InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsKeysX51da3a4a? =
        null

    public var members:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsMembersX73613716? = null

    public var metadata:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsMetadataX2c80895d? = null

    public var organizationAdministration:
        InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5? = null

    public var organizationHooks:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationHooksXe60ed367? = null

    public var organizationPackages:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationPackagesX4e5c8311? = null

    public var organizationPlan:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationPlanXd222abca? = null

    public var organizationProjects:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationProjectsX049b41c7? = null

    public var organizationSecrets:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationSecretsX3c6c47e5? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesLockedIssueOrganizationSelfHost148fX35a2e3a4? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesLockedIssueOrganizationUserBlockingX1d32bf74? = null

    public var packages:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsPackagesX378c60cc? = null

    public var pages: InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsPagesXb542e5b5?
        = null

    public var pullRequests:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3? = null

    public var repositoryHooks:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppRepositoryHooksX8c21e318? = null

    public var repositoryProjects:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppRepositoryProjectsXd0714e93? = null

    public var secretScanningAlerts:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppSecretScanningAlertsX54abbbda? = null

    public var secrets:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsSecretsX1e5a3c66? = null

    public var securityEvents:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppSecurityEventsXaddfbbe0? = null

    public var securityScanningAlert: InlineWebhookIssuesLockedIssueSecurityScanningAlertX789a171c?
        = null

    public var singleFile: InlineWebhookIssuesLockedIssuePerformedViaGithubAppSingleFileX733f1bd2? =
        null

    public var statuses:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsStatusesXf5668495? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppVulnerabilityAlertsX079cbc03? = null

    public var workflows:
        InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsWorkflowsX3639b564? = null

    public fun build(): InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784 = InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784 must be a JSON object")
      return InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsActionsX5e5f5d1c>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppAdministrationXf7380881>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsChecksXa73870b0>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppContentReferencesX7b1d3104>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsContentsX96de4850>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppDeploymentsX20a06d86>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppDiscussionsX53a6ef4b>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsEmailsX641bb064>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppEnvironmentsXe35438f1>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsIssuesX0d7c4b6b>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsKeysX51da3a4a>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsMembersX73613716>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsMetadataX2c80895d>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssueOrganizationAdministca9fX747087c5>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationHooksXe60ed367>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationPackagesX4e5c8311>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationPlanXd222abca>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationProjectsX049b41c7>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppOrganizationSecretsX3c6c47e5>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssueOrganizationSelfHost148fX35a2e3a4>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssueOrganizationUserBlockingX1d32bf74>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsPackagesX378c60cc>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsPagesXb542e5b5>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPullRequestsX1162a2d3>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppRepositoryHooksX8c21e318>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppRepositoryProjectsXd0714e93>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppSecretScanningAlertsX54abbbda>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsSecretsX1e5a3c66>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppSecurityEventsXaddfbbe0>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssueSecurityScanningAlertX789a171c>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppSingleFileX733f1bd2>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsStatusesXf5668495>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppVulnerabilityAlertsX079cbc03>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsWorkflowsX3639b564>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784")
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

public fun inlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784(block: InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784.Builder.() -> Unit): InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784 = InlineWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsX06b2c784.build(block)
