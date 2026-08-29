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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/performed_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f.Serializer::class)
public class InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f(
  public val actions:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppActionsX2fb21395? = null,
  public val administration:
      InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3? = null,
  public val checks:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppChecksXad59ebee? = null,
  public val contentReferences:
      InlineWebhookIssuesOpenedChangesOldIssueContentReferencesX6ba35208? = null,
  public val contents:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppContentsX08308fc1? = null,
  public val deployments: InlineWebhookIssuesOpenedChangesOldIssueDeploymentsX04627af2? = null,
  public val discussions: InlineWebhookIssuesOpenedChangesOldIssueDiscussionsX21318ea4? = null,
  public val emails:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874? = null,
  public val environments: InlineWebhookIssuesOpenedChangesOldIssueEnvironmentsX17768598? = null,
  public val issues:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppIssuesX5404cfdd? = null,
  public val keys:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527? = null,
  public val members:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppMembersX492d28ef? = null,
  public val metadata:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppMetadataX0ed470cf? = null,
  public val organizationAdministration:
      InlineWebhookIssuesOpenedChangesOldIssueOrganizationAdministca9fX32749a1f? = null,
  public val organizationHooks:
      InlineWebhookIssuesOpenedChangesOldIssueOrganizationHooksX63d8283f? = null,
  public val organizationPackages:
      InlineWebhookIssuesOpenedChangesOldIssueOrganizationPackagesX466059d5? = null,
  public val organizationPlan:
      InlineWebhookIssuesOpenedChangesOldIssueOrganizationPlanX39ea7364? = null,
  public val organizationProjects:
      InlineWebhookIssuesOpenedChangesOldIssueOrganizationProjectsXedcade2c? = null,
  public val organizationSecrets:
      InlineWebhookIssuesOpenedChangesOldIssueOrganizationSecretsX2eca416c? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesOpenedChangesOldIssueOrganizationSelfHost148fXb8964073? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesOpenedChangesOldIssueOrganizationUserBlockingXd0964196? = null,
  public val packages:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppPackagesX87a47222? = null,
  public val pages:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppPagesXaed2a420? = null,
  public val pullRequests: InlineWebhookIssuesOpenedChangesOldIssuePullRequestsXbd90c680? = null,
  public val repositoryHooks:
      InlineWebhookIssuesOpenedChangesOldIssueRepositoryHooksX856199a2? = null,
  public val repositoryProjects:
      InlineWebhookIssuesOpenedChangesOldIssueRepositoryProjectsXe3a14b2d? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesOpenedChangesOldIssueSecretScanningAlertsX2eea2ff2? = null,
  public val secrets:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238? = null,
  public val securityEvents:
      InlineWebhookIssuesOpenedChangesOldIssueSecurityEventsXf15d9610? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesOpenedChangesOldIssueSecurityScanningAlertXb3c31a9f? = null,
  public val singleFile:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSingleFileX7f06612d? = null,
  public val statuses:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppStatusesX3c48ee51? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesOpenedChangesOldIssueVulnerabilityAlertsXd98656ac? = null,
  public val workflows:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppWorkflowsX62e63122? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppActionsX2fb21395? = null

    public var administration: InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3? =
        null

    public var checks: InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppChecksXad59ebee?
        = null

    public var contentReferences:
        InlineWebhookIssuesOpenedChangesOldIssueContentReferencesX6ba35208? = null

    public var contents:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppContentsX08308fc1? = null

    public var deployments: InlineWebhookIssuesOpenedChangesOldIssueDeploymentsX04627af2? = null

    public var discussions: InlineWebhookIssuesOpenedChangesOldIssueDiscussionsX21318ea4? = null

    public var emails: InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874?
        = null

    public var environments: InlineWebhookIssuesOpenedChangesOldIssueEnvironmentsX17768598? = null

    public var issues: InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppIssuesX5404cfdd?
        = null

    public var keys: InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527? =
        null

    public var members:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppMembersX492d28ef? = null

    public var metadata:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppMetadataX0ed470cf? = null

    public var organizationAdministration:
        InlineWebhookIssuesOpenedChangesOldIssueOrganizationAdministca9fX32749a1f? = null

    public var organizationHooks:
        InlineWebhookIssuesOpenedChangesOldIssueOrganizationHooksX63d8283f? = null

    public var organizationPackages:
        InlineWebhookIssuesOpenedChangesOldIssueOrganizationPackagesX466059d5? = null

    public var organizationPlan: InlineWebhookIssuesOpenedChangesOldIssueOrganizationPlanX39ea7364?
        = null

    public var organizationProjects:
        InlineWebhookIssuesOpenedChangesOldIssueOrganizationProjectsXedcade2c? = null

    public var organizationSecrets:
        InlineWebhookIssuesOpenedChangesOldIssueOrganizationSecretsX2eca416c? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesOpenedChangesOldIssueOrganizationSelfHost148fXb8964073? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesOpenedChangesOldIssueOrganizationUserBlockingXd0964196? = null

    public var packages:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppPackagesX87a47222? = null

    public var pages: InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppPagesXaed2a420? =
        null

    public var pullRequests: InlineWebhookIssuesOpenedChangesOldIssuePullRequestsXbd90c680? = null

    public var repositoryHooks: InlineWebhookIssuesOpenedChangesOldIssueRepositoryHooksX856199a2? =
        null

    public var repositoryProjects:
        InlineWebhookIssuesOpenedChangesOldIssueRepositoryProjectsXe3a14b2d? = null

    public var secretScanningAlerts:
        InlineWebhookIssuesOpenedChangesOldIssueSecretScanningAlertsX2eea2ff2? = null

    public var secrets:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238? = null

    public var securityEvents: InlineWebhookIssuesOpenedChangesOldIssueSecurityEventsXf15d9610? =
        null

    public var securityScanningAlert:
        InlineWebhookIssuesOpenedChangesOldIssueSecurityScanningAlertXb3c31a9f? = null

    public var singleFile:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSingleFileX7f06612d? = null

    public var statuses:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppStatusesX3c48ee51? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssuesOpenedChangesOldIssueVulnerabilityAlertsXd98656ac? = null

    public var workflows:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppWorkflowsX62e63122? = null

    public fun build(): InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f = InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f must be a JSON object")
      return InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppActionsX2fb21395>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueAdministrationX26310af3>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppChecksXad59ebee>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueContentReferencesX6ba35208>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppContentsX08308fc1>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueDeploymentsX04627af2>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueDiscussionsX21318ea4>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppEmailsX35e6d874>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueEnvironmentsX17768598>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppIssuesX5404cfdd>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppKeysX0aa7b527>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppMembersX492d28ef>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppMetadataX0ed470cf>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueOrganizationAdministca9fX32749a1f>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueOrganizationHooksX63d8283f>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueOrganizationPackagesX466059d5>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueOrganizationPlanX39ea7364>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueOrganizationProjectsXedcade2c>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueOrganizationSecretsX2eca416c>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueOrganizationSelfHost148fXb8964073>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueOrganizationUserBlockingXd0964196>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppPackagesX87a47222>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppPagesXaed2a420>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePullRequestsXbd90c680>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueRepositoryHooksX856199a2>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueRepositoryProjectsXe3a14b2d>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueSecretScanningAlertsX2eea2ff2>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSecretsX3d4b2238>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueSecurityEventsXf15d9610>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueSecurityScanningAlertXb3c31a9f>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppSingleFileX7f06612d>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppStatusesX3c48ee51>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueVulnerabilityAlertsXd98656ac>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppWorkflowsX62e63122>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f")
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

public fun inlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f(block: InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f.Builder.() -> Unit): InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f = InlineWebhookIssuesOpenedChangesOldIssuePermissionsXb0b3a19f.build(block)
