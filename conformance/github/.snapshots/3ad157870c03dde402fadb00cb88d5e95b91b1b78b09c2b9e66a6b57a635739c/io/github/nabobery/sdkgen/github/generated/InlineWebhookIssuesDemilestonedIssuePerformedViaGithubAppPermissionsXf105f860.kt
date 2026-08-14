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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/performed_vi
 * a_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860.Serializer::class)
public class InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860(
  public val actions:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppActionsX85433bda? = null,
  public val administration:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppAdministrationX28fcb873? = null,
  public val checks:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppChecksXe39f9aae? = null,
  public val contentReferences:
      InlineWebhookIssuesDemilesc96cIssueContentReferencesXbc3bee51? = null,
  public val contents:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppContentsX30ce6baa? = null,
  public val deployments:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45? = null,
  public val discussions:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDiscussionsX7ec5d704? = null,
  public val emails:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755? = null,
  public val environments:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEnvironmentsXa8694ec9? = null,
  public val issues:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppIssuesXaa082ea0? = null,
  public val keys:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPermissionsKeysX58a057d2? = null,
  public val members:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMembersXa546f87c? = null,
  public val metadata:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b? = null,
  public val organizationAdministration:
      InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574? = null,
  public val organizationHooks:
      InlineWebhookIssuesDemilesc96cIssueOrganizationHooksX0cce9867? = null,
  public val organizationPackages:
      InlineWebhookIssuesDemilesc96cIssueOrganizationPackagesX4994242d? = null,
  public val organizationPlan: InlineWebhookIssuesDemilesc96cIssueOrganizationPlanXe96776db? = null,
  public val organizationProjects:
      InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2? = null,
  public val organizationSecrets:
      InlineWebhookIssuesDemilesc96cIssueOrganizationSecretsX16424380? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesDemilesc96cIssueOrganizationSelfHost148fXaa248efc? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesDemilesc96cIssueOrganizationUserBlockingX77d346ed? = null,
  public val packages:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPackagesX72641348? = null,
  public val pages: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPagesX9ee491fd? = null,
  public val pullRequests:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8? = null,
  public val repositoryHooks:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppRepositoryHooksXc02339ed? = null,
  public val repositoryProjects:
      InlineWebhookIssuesDemilesc96cIssueRepositoryProjectsX1a142bfc? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesDemilesc96cIssueSecretScanningAlertsX674945d4? = null,
  public val secrets:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppSecretsXa15d3021? = null,
  public val securityEvents:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppSecurityEventsX75819822? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesDemilesc96cIssueSecurityScanningAlertXd8e806cc? = null,
  public val singleFile:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppSingleFileXad256ecb? = null,
  public val statuses:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppStatusesX37d8a4b6? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesDemilesc96cIssueVulnerabilityAlertsX4acc42ff? = null,
  public val workflows:
      InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppWorkflowsXd7f87cb1? = null,
) {
  public class Builder {
    public var actions: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppActionsX85433bda? =
        null

    public var administration:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppAdministrationX28fcb873? = null

    public var checks: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppChecksXe39f9aae? =
        null

    public var contentReferences: InlineWebhookIssuesDemilesc96cIssueContentReferencesXbc3bee51? =
        null

    public var contents: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppContentsX30ce6baa?
        = null

    public var deployments:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45? = null

    public var discussions:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDiscussionsX7ec5d704? = null

    public var emails: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755? =
        null

    public var environments:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEnvironmentsXa8694ec9? = null

    public var issues: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppIssuesXaa082ea0? =
        null

    public var keys:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPermissionsKeysX58a057d2? = null

    public var members: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMembersXa546f87c? =
        null

    public var metadata: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b?
        = null

    public var organizationAdministration:
        InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574? = null

    public var organizationHooks: InlineWebhookIssuesDemilesc96cIssueOrganizationHooksX0cce9867? =
        null

    public var organizationPackages:
        InlineWebhookIssuesDemilesc96cIssueOrganizationPackagesX4994242d? = null

    public var organizationPlan: InlineWebhookIssuesDemilesc96cIssueOrganizationPlanXe96776db? =
        null

    public var organizationProjects:
        InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2? = null

    public var organizationSecrets: InlineWebhookIssuesDemilesc96cIssueOrganizationSecretsX16424380?
        = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesDemilesc96cIssueOrganizationSelfHost148fXaa248efc? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesDemilesc96cIssueOrganizationUserBlockingX77d346ed? = null

    public var packages: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPackagesX72641348?
        = null

    public var pages: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPagesX9ee491fd? = null

    public var pullRequests:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8? = null

    public var repositoryHooks:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppRepositoryHooksXc02339ed? = null

    public var repositoryProjects: InlineWebhookIssuesDemilesc96cIssueRepositoryProjectsX1a142bfc? =
        null

    public var secretScanningAlerts:
        InlineWebhookIssuesDemilesc96cIssueSecretScanningAlertsX674945d4? = null

    public var secrets: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppSecretsXa15d3021? =
        null

    public var securityEvents:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppSecurityEventsX75819822? = null

    public var securityScanningAlert:
        InlineWebhookIssuesDemilesc96cIssueSecurityScanningAlertXd8e806cc? = null

    public var singleFile:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppSingleFileXad256ecb? = null

    public var statuses: InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppStatusesX37d8a4b6?
        = null

    public var vulnerabilityAlerts: InlineWebhookIssuesDemilesc96cIssueVulnerabilityAlertsX4acc42ff?
        = null

    public var workflows:
        InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppWorkflowsXd7f87cb1? = null

    public fun build(): InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860 = InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860 must be a JSON object")
      return InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppActionsX85433bda>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppAdministrationX28fcb873>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppChecksXe39f9aae>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueContentReferencesXbc3bee51>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppContentsX30ce6baa>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDeploymentsX833b4c45>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppDiscussionsX7ec5d704>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEmailsXed67d755>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppEnvironmentsXa8694ec9>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppIssuesXaa082ea0>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPermissionsKeysX58a057d2>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMembersXa546f87c>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppMetadataX609e835b>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueOrganizationAdministca9fXcdb56574>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueOrganizationHooksX0cce9867>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueOrganizationPackagesX4994242d>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueOrganizationPlanXe96776db>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueOrganizationProjectsX4a0c5dc2>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueOrganizationSecretsX16424380>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueOrganizationSelfHost148fXaa248efc>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueOrganizationUserBlockingX77d346ed>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPackagesX72641348>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPagesX9ee491fd>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppPullRequestsX4865f2c8>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppRepositoryHooksXc02339ed>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueRepositoryProjectsX1a142bfc>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueSecretScanningAlertsX674945d4>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppSecretsXa15d3021>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppSecurityEventsX75819822>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueSecurityScanningAlertXd8e806cc>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppSingleFileXad256ecb>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppStatusesX37d8a4b6>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssueVulnerabilityAlertsX4acc42ff>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDemilesc96cIssuePerformedViaGithubAppWorkflowsXd7f87cb1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860")
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

public fun inlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860(block: InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860.Builder.() -> Unit): InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860 = InlineWebhookIssuesDemilestonedIssuePerformedViaGithubAppPermissionsXf105f860.build(block)
