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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_issue/p
 * roperties/performed_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1.Serializer::class)
public class InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1(
  public val actions: InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426? = null,
  public val administration:
      InlineWebhookIssuesTransferredChangesNewIssueAdministrationXf7c246b3? = null,
  public val checks: InlineWebhookIssuesTransferredChangesNewIssueChecksX5e5a9d12? = null,
  public val contentReferences:
      InlineWebhookIssuesTransferredChangesNewIssueContentReferencesX1565bf77? = null,
  public val contents: InlineWebhookIssuesTransferredChangesNewIssueContentsX144e7e18? = null,
  public val deployments: InlineWebhookIssuesTransferredChangesNewIssueDeploymentsX34897477? = null,
  public val discussions: InlineWebhookIssuesTransferredChangesNewIssueDiscussionsX4cf3368a? = null,
  public val emails: InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2? = null,
  public val environments:
      InlineWebhookIssuesTransferredChangesNewIssueEnvironmentsXe70d9cf7? = null,
  public val issues: InlineWebhookIssuesTransferredChangesNewIssueIssuesX74c159ee? = null,
  public val keys:
      InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8? = null,
  public val members: InlineWebhookIssuesTransferredChangesNewIssueMembersXf8a65117? = null,
  public val metadata: InlineWebhookIssuesTransferredChangesNewIssueMetadataXe1db9035? = null,
  public val organizationAdministration:
      InlineWebhookIssuesTransferredChangesNewIssueOrganizationAdministca9fX8e1e2af8? = null,
  public val organizationHooks:
      InlineWebhookIssuesTransferredChangesNewIssueOrganizationHooksX5a67769f? = null,
  public val organizationPackages:
      InlineWebhookIssuesTransferredChangesNewIssueOrganizationPackagesX5f29bad7? = null,
  public val organizationPlan:
      InlineWebhookIssuesTransferredChangesNewIssueOrganizationPlanXcda1d67d? = null,
  public val organizationProjects:
      InlineWebhookIssuesTransferredChangesNewIssueOrganizationProjectsX5a13a5fd? = null,
  public val organizationSecrets:
      InlineWebhookIssuesTransferredChangesNewIssueOrganizationSecretsX7aca6154? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesTransferredChangesNewIssueOrganizationSelfHost148fXd85b5477? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesTransferredChangesNewIssueOrganizationUserBlockingX57c81052? = null,
  public val packages: InlineWebhookIssuesTransferredChangesNewIssuePackagesX91db41e8? = null,
  public val pages:
      InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppPagesX9c9b1b50? = null,
  public val pullRequests:
      InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348? = null,
  public val repositoryHooks:
      InlineWebhookIssuesTransferredChangesNewIssueRepositoryHooksX33ebdb77? = null,
  public val repositoryProjects:
      InlineWebhookIssuesTransferredChangesNewIssueRepositoryProjectsX1b4ddd71? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesTransferredChangesNewIssueSecretScanningAlertsXc87fc46f? = null,
  public val secrets: InlineWebhookIssuesTransferredChangesNewIssueSecretsXbb402338? = null,
  public val securityEvents:
      InlineWebhookIssuesTransferredChangesNewIssueSecurityEventsX8d0ec1e9? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesTransferredChangesNewIssueSecurityScanningAlertX69a0455e? = null,
  public val singleFile: InlineWebhookIssuesTransferredChangesNewIssueSingleFileX0a86cdaf? = null,
  public val statuses: InlineWebhookIssuesTransferredChangesNewIssueStatusesX5c3989a4? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesTransferredChangesNewIssueVulnerabilityAlertsX9b85ef19? = null,
  public val workflows: InlineWebhookIssuesTransferredChangesNewIssueWorkflowsXb793ed96? = null,
) {
  public class Builder {
    public var actions: InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426? = null

    public var administration: InlineWebhookIssuesTransferredChangesNewIssueAdministrationXf7c246b3?
        = null

    public var checks: InlineWebhookIssuesTransferredChangesNewIssueChecksX5e5a9d12? = null

    public var contentReferences:
        InlineWebhookIssuesTransferredChangesNewIssueContentReferencesX1565bf77? = null

    public var contents: InlineWebhookIssuesTransferredChangesNewIssueContentsX144e7e18? = null

    public var deployments: InlineWebhookIssuesTransferredChangesNewIssueDeploymentsX34897477? =
        null

    public var discussions: InlineWebhookIssuesTransferredChangesNewIssueDiscussionsX4cf3368a? =
        null

    public var emails: InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2? = null

    public var environments: InlineWebhookIssuesTransferredChangesNewIssueEnvironmentsXe70d9cf7? =
        null

    public var issues: InlineWebhookIssuesTransferredChangesNewIssueIssuesX74c159ee? = null

    public var keys:
        InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8? = null

    public var members: InlineWebhookIssuesTransferredChangesNewIssueMembersXf8a65117? = null

    public var metadata: InlineWebhookIssuesTransferredChangesNewIssueMetadataXe1db9035? = null

    public var organizationAdministration:
        InlineWebhookIssuesTransferredChangesNewIssueOrganizationAdministca9fX8e1e2af8? = null

    public var organizationHooks:
        InlineWebhookIssuesTransferredChangesNewIssueOrganizationHooksX5a67769f? = null

    public var organizationPackages:
        InlineWebhookIssuesTransferredChangesNewIssueOrganizationPackagesX5f29bad7? = null

    public var organizationPlan:
        InlineWebhookIssuesTransferredChangesNewIssueOrganizationPlanXcda1d67d? = null

    public var organizationProjects:
        InlineWebhookIssuesTransferredChangesNewIssueOrganizationProjectsX5a13a5fd? = null

    public var organizationSecrets:
        InlineWebhookIssuesTransferredChangesNewIssueOrganizationSecretsX7aca6154? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesTransferredChangesNewIssueOrganizationSelfHost148fXd85b5477? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesTransferredChangesNewIssueOrganizationUserBlockingX57c81052? = null

    public var packages: InlineWebhookIssuesTransferredChangesNewIssuePackagesX91db41e8? = null

    public var pages:
        InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppPagesX9c9b1b50? = null

    public var pullRequests: InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348? =
        null

    public var repositoryHooks:
        InlineWebhookIssuesTransferredChangesNewIssueRepositoryHooksX33ebdb77? = null

    public var repositoryProjects:
        InlineWebhookIssuesTransferredChangesNewIssueRepositoryProjectsX1b4ddd71? = null

    public var secretScanningAlerts:
        InlineWebhookIssuesTransferredChangesNewIssueSecretScanningAlertsXc87fc46f? = null

    public var secrets: InlineWebhookIssuesTransferredChangesNewIssueSecretsXbb402338? = null

    public var securityEvents: InlineWebhookIssuesTransferredChangesNewIssueSecurityEventsX8d0ec1e9?
        = null

    public var securityScanningAlert:
        InlineWebhookIssuesTransferredChangesNewIssueSecurityScanningAlertX69a0455e? = null

    public var singleFile: InlineWebhookIssuesTransferredChangesNewIssueSingleFileX0a86cdaf? = null

    public var statuses: InlineWebhookIssuesTransferredChangesNewIssueStatusesX5c3989a4? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssuesTransferredChangesNewIssueVulnerabilityAlertsX9b85ef19? = null

    public var workflows: InlineWebhookIssuesTransferredChangesNewIssueWorkflowsXb793ed96? = null

    public fun build(): InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1 = InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1 must be a JSON object")
      return InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueActionsX80862426>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueAdministrationXf7c246b3>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueChecksX5e5a9d12>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueContentReferencesX1565bf77>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueContentsX144e7e18>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueDeploymentsX34897477>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueDiscussionsX4cf3368a>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueEmailsX85d9e6c2>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueEnvironmentsXe70d9cf7>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueIssuesX74c159ee>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppKeysX6c03cbc8>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueMembersXf8a65117>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueMetadataXe1db9035>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueOrganizationAdministca9fX8e1e2af8>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueOrganizationHooksX5a67769f>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueOrganizationPackagesX5f29bad7>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueOrganizationPlanXcda1d67d>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueOrganizationProjectsX5a13a5fd>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueOrganizationSecretsX7aca6154>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueOrganizationSelfHost148fXd85b5477>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueOrganizationUserBlockingX57c81052>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssuePackagesX91db41e8>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssuePerformedViaGithubAppPagesX9c9b1b50>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssuePullRequestsX85808348>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueRepositoryHooksX33ebdb77>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueRepositoryProjectsX1b4ddd71>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueSecretScanningAlertsXc87fc46f>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueSecretsXbb402338>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueSecurityEventsX8d0ec1e9>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueSecurityScanningAlertX69a0455e>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueSingleFileX0a86cdaf>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueStatusesX5c3989a4>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueVulnerabilityAlertsX9b85ef19>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesTransferredChangesNewIssueWorkflowsXb793ed96>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1")
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

public fun inlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1(block: InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1.Builder.() -> Unit): InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1 = InlineWebhookIssuesTransferredChangesNewIssuePermissionsXa58c65e1.build(block)
