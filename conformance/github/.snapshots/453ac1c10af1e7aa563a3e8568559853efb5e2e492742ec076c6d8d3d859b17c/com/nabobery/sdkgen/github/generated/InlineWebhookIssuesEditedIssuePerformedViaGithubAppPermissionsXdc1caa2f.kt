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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/performed_via_gith
 * ub_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f.Serializer::class)
public class InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f(
  public val actions:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsActionsXe6c0997b? = null,
  public val administration:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppAdministrationX7d246bcd? = null,
  public val checks:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e? = null,
  public val contentReferences:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618? = null,
  public val contents:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsContentsX32ea32cb? = null,
  public val deployments:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppDeploymentsX3074664e? = null,
  public val discussions:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppDiscussionsX1fdbe62f? = null,
  public val emails:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsEmailsX6daf0476? = null,
  public val environments:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppEnvironmentsXf2e92921? = null,
  public val issues:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsIssuesXa6b55c1e? = null,
  public val keys:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsKeysX3b11dbfe? = null,
  public val members:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMembersXe86a238c? = null,
  public val metadata:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22? = null,
  public val organizationAdministration:
      InlineWebhookIssuesEditedIssueOrganizationAdministca9fX3073cc70? = null,
  public val organizationHooks:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationHooksX7595bdcc? = null,
  public val organizationPackages:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b? = null,
  public val organizationPlan:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPlanX0deb54fe? = null,
  public val organizationProjects:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationProjectsX1b05d749? = null,
  public val organizationSecrets:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationSecretsXeedb5de5? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesEditedIssueOrganizationSelfHost148fX27912734? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesEditedIssueOrganizationUserBlockingXb1aacf06? = null,
  public val packages:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f? = null,
  public val pages:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPagesXf9a6f64e? = null,
  public val pullRequests:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPullRequestsX2041f0f5? = null,
  public val repositoryHooks:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppRepositoryHooksXb0d6eb24? = null,
  public val repositoryProjects:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppRepositoryProjectsX644c417a? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppSecretScanningAlertsXd2a75f42? = null,
  public val secrets:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsSecretsX5f7650a3? = null,
  public val securityEvents:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppSecurityEventsXcc7bfcbf? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesEditedIssueSecurityScanningAlertX718a8a20? = null,
  public val singleFile:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppSingleFileX77cdcb2f? = null,
  public val statuses:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsStatusesXc62147c0? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppVulnerabilityAlertsX41a0513e? = null,
  public val workflows:
      InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsWorkflowsX403201c6? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsActionsXe6c0997b? = null

    public var administration:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppAdministrationX7d246bcd? = null

    public var checks:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e? = null

    public var contentReferences:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618? = null

    public var contents:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsContentsX32ea32cb? = null

    public var deployments: InlineWebhookIssuesEditedIssuePerformedViaGithubAppDeploymentsX3074664e?
        = null

    public var discussions: InlineWebhookIssuesEditedIssuePerformedViaGithubAppDiscussionsX1fdbe62f?
        = null

    public var emails:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsEmailsX6daf0476? = null

    public var environments:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppEnvironmentsXf2e92921? = null

    public var issues:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsIssuesXa6b55c1e? = null

    public var keys: InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsKeysX3b11dbfe? =
        null

    public var members:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMembersXe86a238c? = null

    public var metadata:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22? = null

    public var organizationAdministration:
        InlineWebhookIssuesEditedIssueOrganizationAdministca9fX3073cc70? = null

    public var organizationHooks:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationHooksX7595bdcc? = null

    public var organizationPackages:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b? = null

    public var organizationPlan:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPlanX0deb54fe? = null

    public var organizationProjects:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationProjectsX1b05d749? = null

    public var organizationSecrets:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationSecretsXeedb5de5? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesEditedIssueOrganizationSelfHost148fX27912734? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesEditedIssueOrganizationUserBlockingXb1aacf06? = null

    public var packages:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f? = null

    public var pages: InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPagesXf9a6f64e?
        = null

    public var pullRequests:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPullRequestsX2041f0f5? = null

    public var repositoryHooks:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppRepositoryHooksXb0d6eb24? = null

    public var repositoryProjects:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppRepositoryProjectsX644c417a? = null

    public var secretScanningAlerts:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppSecretScanningAlertsXd2a75f42? = null

    public var secrets:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsSecretsX5f7650a3? = null

    public var securityEvents:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppSecurityEventsXcc7bfcbf? = null

    public var securityScanningAlert: InlineWebhookIssuesEditedIssueSecurityScanningAlertX718a8a20?
        = null

    public var singleFile: InlineWebhookIssuesEditedIssuePerformedViaGithubAppSingleFileX77cdcb2f? =
        null

    public var statuses:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsStatusesXc62147c0? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppVulnerabilityAlertsX41a0513e? = null

    public var workflows:
        InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsWorkflowsX403201c6? = null

    public fun build(): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f = InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f must be a JSON object")
      return InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsActionsXe6c0997b>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppAdministrationX7d246bcd>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsChecksXb724a20e>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppContentReferencesXc25fd618>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsContentsX32ea32cb>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppDeploymentsX3074664e>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppDiscussionsX1fdbe62f>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsEmailsX6daf0476>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppEnvironmentsXf2e92921>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsIssuesXa6b55c1e>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsKeysX3b11dbfe>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMembersXe86a238c>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsMetadataX89e35e22>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssueOrganizationAdministca9fX3073cc70>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationHooksX7595bdcc>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPackagesX9b17944b>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationPlanX0deb54fe>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationProjectsX1b05d749>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppOrganizationSecretsXeedb5de5>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssueOrganizationSelfHost148fX27912734>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssueOrganizationUserBlockingXb1aacf06>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPackagesX7e7c9d9f>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsPagesXf9a6f64e>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPullRequestsX2041f0f5>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppRepositoryHooksXb0d6eb24>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppRepositoryProjectsX644c417a>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppSecretScanningAlertsXd2a75f42>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsSecretsX5f7650a3>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppSecurityEventsXcc7bfcbf>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssueSecurityScanningAlertX718a8a20>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppSingleFileX77cdcb2f>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsStatusesXc62147c0>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppVulnerabilityAlertsX41a0513e>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsWorkflowsX403201c6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f")
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

public fun inlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f(block: InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f.Builder.() -> Unit): InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f = InlineWebhookIssuesEditedIssuePerformedViaGithubAppPermissionsXdc1caa2f.build(block)
