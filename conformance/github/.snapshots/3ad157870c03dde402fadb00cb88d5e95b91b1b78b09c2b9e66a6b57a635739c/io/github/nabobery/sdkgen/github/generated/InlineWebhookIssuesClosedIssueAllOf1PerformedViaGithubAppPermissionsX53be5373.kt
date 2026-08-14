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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/0/properties/performed_
 * via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373.Serializer::class)
public class InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373(
  public val actions:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppActionsX9b041f00? = null,
  public val administration:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppAdministrationX8c5b0941? = null,
  public val checks:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppChecksX219c523c? = null,
  public val contentReferences:
      InlineWebhookIssuesClosedIssueAllOf1ContentReferencesX52431b70? = null,
  public val contents:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppContentsX652d089b? = null,
  public val deployments:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppDeploymentsX2cb73b40? = null,
  public val discussions:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppDiscussionsX058dc86f? = null,
  public val emails:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppEmailsX540d4bf2? = null,
  public val environments:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppEnvironmentsX4d1af34e? = null,
  public val issues:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppIssuesX2152238c? = null,
  public val keys: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppKeysX346f3dc5? = null,
  public val members:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppMembersXdab1c7f6? = null,
  public val metadata:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppMetadataX550263de? = null,
  public val organizationAdministration:
      InlineWebhookIssuesClosedIssueAllOf1OrganizationAdministca9fX1a07344a? = null,
  public val organizationHooks:
      InlineWebhookIssuesClosedIssueAllOf1OrganizationHooksXee43e2f5? = null,
  public val organizationPackages:
      InlineWebhookIssuesClosedIssueAllOf1OrganizationPackagesX9784cce5? = null,
  public val organizationPlan:
      InlineWebhookIssuesClosedIssueAllOf1OrganizationPlanXb45bd69b? = null,
  public val organizationProjects:
      InlineWebhookIssuesClosedIssueAllOf1OrganizationProjectsX0449f135? = null,
  public val organizationSecrets:
      InlineWebhookIssuesClosedIssueAllOf1OrganizationSecretsXbd9020c0? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesClosedIssueAllOf1OrganizationSelfHost148fXddecf89f? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesClosedIssueAllOf1OrganizationUserBlockingXe6ac8ad8? = null,
  public val packages:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPackagesXe1bcc40e? = null,
  public val pages: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPagesX2a3c1f12? = null,
  public val pullRequests:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPullRequestsXc9b2b08c? = null,
  public val repositoryHooks: InlineWebhookIssuesClosedIssueAllOf1RepositoryHooksX47e276f8? = null,
  public val repositoryProjects:
      InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesClosedIssueAllOf1SecretScanningAlertsX96336f9c? = null,
  public val secrets:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppSecretsX775193a5? = null,
  public val securityEvents:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppSecurityEventsX068ebe54? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesClosedIssueAllOf1SecurityScanningAlertX529f123c? = null,
  public val singleFile:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppSingleFileXd60ebe39? = null,
  public val statuses:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesClosedIssueAllOf1VulnerabilityAlertsXb1f0e02d? = null,
  public val workflows:
      InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4? = null,
) {
  public class Builder {
    public var actions: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppActionsX9b041f00? =
        null

    public var administration:
        InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppAdministrationX8c5b0941? = null

    public var checks: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppChecksX219c523c? =
        null

    public var contentReferences: InlineWebhookIssuesClosedIssueAllOf1ContentReferencesX52431b70? =
        null

    public var contents: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppContentsX652d089b?
        = null

    public var deployments:
        InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppDeploymentsX2cb73b40? = null

    public var discussions:
        InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppDiscussionsX058dc86f? = null

    public var emails: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppEmailsX540d4bf2? =
        null

    public var environments:
        InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppEnvironmentsX4d1af34e? = null

    public var issues: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppIssuesX2152238c? =
        null

    public var keys: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppKeysX346f3dc5? = null

    public var members: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppMembersXdab1c7f6? =
        null

    public var metadata: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppMetadataX550263de?
        = null

    public var organizationAdministration:
        InlineWebhookIssuesClosedIssueAllOf1OrganizationAdministca9fX1a07344a? = null

    public var organizationHooks: InlineWebhookIssuesClosedIssueAllOf1OrganizationHooksXee43e2f5? =
        null

    public var organizationPackages:
        InlineWebhookIssuesClosedIssueAllOf1OrganizationPackagesX9784cce5? = null

    public var organizationPlan: InlineWebhookIssuesClosedIssueAllOf1OrganizationPlanXb45bd69b? =
        null

    public var organizationProjects:
        InlineWebhookIssuesClosedIssueAllOf1OrganizationProjectsX0449f135? = null

    public var organizationSecrets:
        InlineWebhookIssuesClosedIssueAllOf1OrganizationSecretsXbd9020c0? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesClosedIssueAllOf1OrganizationSelfHost148fXddecf89f? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesClosedIssueAllOf1OrganizationUserBlockingXe6ac8ad8? = null

    public var packages: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPackagesXe1bcc40e?
        = null

    public var pages: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPagesX2a3c1f12? =
        null

    public var pullRequests:
        InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPullRequestsXc9b2b08c? = null

    public var repositoryHooks: InlineWebhookIssuesClosedIssueAllOf1RepositoryHooksX47e276f8? = null

    public var repositoryProjects: InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f?
        = null

    public var secretScanningAlerts:
        InlineWebhookIssuesClosedIssueAllOf1SecretScanningAlertsX96336f9c? = null

    public var secrets: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppSecretsX775193a5? =
        null

    public var securityEvents:
        InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppSecurityEventsX068ebe54? = null

    public var securityScanningAlert:
        InlineWebhookIssuesClosedIssueAllOf1SecurityScanningAlertX529f123c? = null

    public var singleFile:
        InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppSingleFileXd60ebe39? = null

    public var statuses: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d?
        = null

    public var vulnerabilityAlerts:
        InlineWebhookIssuesClosedIssueAllOf1VulnerabilityAlertsXb1f0e02d? = null

    public var workflows:
        InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4? = null

    public fun build(): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373 = InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373 must be a JSON object")
      return InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppActionsX9b041f00>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppAdministrationX8c5b0941>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppChecksX219c523c>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1ContentReferencesX52431b70>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppContentsX652d089b>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppDeploymentsX2cb73b40>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppDiscussionsX058dc86f>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppEmailsX540d4bf2>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppEnvironmentsX4d1af34e>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppIssuesX2152238c>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppKeysX346f3dc5>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppMembersXdab1c7f6>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppMetadataX550263de>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1OrganizationAdministca9fX1a07344a>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1OrganizationHooksXee43e2f5>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1OrganizationPackagesX9784cce5>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1OrganizationPlanXb45bd69b>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1OrganizationProjectsX0449f135>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1OrganizationSecretsXbd9020c0>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1OrganizationSelfHost148fXddecf89f>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1OrganizationUserBlockingXe6ac8ad8>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPackagesXe1bcc40e>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPagesX2a3c1f12>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPullRequestsXc9b2b08c>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1RepositoryHooksX47e276f8>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1RepositoryProjectsX6d7adc4f>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1SecretScanningAlertsX96336f9c>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppSecretsX775193a5>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppSecurityEventsX068ebe54>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1SecurityScanningAlertX529f123c>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppSingleFileXd60ebe39>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppStatusesX1d98642d>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1VulnerabilityAlertsXb1f0e02d>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppWorkflowsX00d55ee4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373")
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

public fun inlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373(block: InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373.Builder.() -> Unit): InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373 = InlineWebhookIssuesClosedIssueAllOf1PerformedViaGithubAppPermissionsX53be5373.build(block)
