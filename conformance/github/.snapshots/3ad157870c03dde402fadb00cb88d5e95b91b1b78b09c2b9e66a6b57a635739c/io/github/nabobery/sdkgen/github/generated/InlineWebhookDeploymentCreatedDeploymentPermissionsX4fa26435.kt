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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/deployment/properties/performe
 * d_via_github_app/properties/permissions
 */
@Serializable(with = InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435.Serializer::class)
public class InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435(
  public val actions:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppActionsX4ed72acd? = null,
  public val administration:
      InlineWebhookDeploymentCreatedDeploymentAdministrationXd14320fc? = null,
  public val checks:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppChecksXc9853998? = null,
  public val contentReferences:
      InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408? = null,
  public val contents:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppContentsX03ad5b96? = null,
  public val deployments: InlineWebhookDeploymentCreatedDeploymentDeploymentsX8c2bff66? = null,
  public val discussions: InlineWebhookDeploymentCreatedDeploymentDiscussionsXdedd4f28? = null,
  public val emails:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppEmailsXa376bc06? = null,
  public val environments: InlineWebhookDeploymentCreatedDeploymentEnvironmentsX010cf81e? = null,
  public val issues:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703? = null,
  public val keys:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppKeysX2e2bac57? = null,
  public val members:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppMembersX9be1e58d? = null,
  public val metadata:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppMetadataX4b74a958? = null,
  public val organizationAdministration:
      InlineWebhookDeploymentCreatedDeploymentOrganizationAdministca9fXc72f6371? = null,
  public val organizationHooks:
      InlineWebhookDeploymentCreatedDeploymentOrganizationHooksX1c93b1da? = null,
  public val organizationPackages:
      InlineWebhookDeploymentCreatedDeploymentOrganizationPackagesX862a056e? = null,
  public val organizationPlan:
      InlineWebhookDeploymentCreatedDeploymentOrganizationPlanXb68f2fdf? = null,
  public val organizationProjects:
      InlineWebhookDeploymentCreatedDeploymentOrganizationProjectsX509c7bd5? = null,
  public val organizationSecrets:
      InlineWebhookDeploymentCreatedDeploymentOrganizationSecretsX7e6057bf? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookDeploymentCreatedDeploymentOrganizationSelfHost148fX3811b5eb? = null,
  public val organizationUserBlocking:
      InlineWebhookDeploymentCreatedDeploymentOrganizationUserBlockingX20cb49cb? = null,
  public val packages:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppPackagesX55b7644a? = null,
  public val pages:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppPagesX8c7d51e5? = null,
  public val pullRequests: InlineWebhookDeploymentCreatedDeploymentPullRequestsX6de70365? = null,
  public val repositoryHooks:
      InlineWebhookDeploymentCreatedDeploymentRepositoryHooksXa5425ef6? = null,
  public val repositoryProjects:
      InlineWebhookDeploymentCreatedDeploymentRepositoryProjectsX7e9e850d? = null,
  public val secretScanningAlerts:
      InlineWebhookDeploymentCreatedDeploymentSecretScanningAlertsXa47b2f49? = null,
  public val secrets:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e? = null,
  public val securityEvents:
      InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1? = null,
  public val securityScanningAlert:
      InlineWebhookDeploymentCreatedDeploymentSecurityScanningAlertX81bf1ab1? = null,
  public val singleFile:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e? = null,
  public val statuses:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppStatusesXc32eaf3f? = null,
  public val vulnerabilityAlerts:
      InlineWebhookDeploymentCreatedDeploymentVulnerabilityAlertsX70e574a6? = null,
  public val workflows:
      InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppWorkflowsX59d726bb? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppActionsX4ed72acd? = null

    public var administration: InlineWebhookDeploymentCreatedDeploymentAdministrationXd14320fc? =
        null

    public var checks: InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppChecksXc9853998?
        = null

    public var contentReferences:
        InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408? = null

    public var contents:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppContentsX03ad5b96? = null

    public var deployments: InlineWebhookDeploymentCreatedDeploymentDeploymentsX8c2bff66? = null

    public var discussions: InlineWebhookDeploymentCreatedDeploymentDiscussionsXdedd4f28? = null

    public var emails: InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppEmailsXa376bc06?
        = null

    public var environments: InlineWebhookDeploymentCreatedDeploymentEnvironmentsX010cf81e? = null

    public var issues: InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703?
        = null

    public var keys: InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppKeysX2e2bac57? =
        null

    public var members:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppMembersX9be1e58d? = null

    public var metadata:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppMetadataX4b74a958? = null

    public var organizationAdministration:
        InlineWebhookDeploymentCreatedDeploymentOrganizationAdministca9fXc72f6371? = null

    public var organizationHooks:
        InlineWebhookDeploymentCreatedDeploymentOrganizationHooksX1c93b1da? = null

    public var organizationPackages:
        InlineWebhookDeploymentCreatedDeploymentOrganizationPackagesX862a056e? = null

    public var organizationPlan: InlineWebhookDeploymentCreatedDeploymentOrganizationPlanXb68f2fdf?
        = null

    public var organizationProjects:
        InlineWebhookDeploymentCreatedDeploymentOrganizationProjectsX509c7bd5? = null

    public var organizationSecrets:
        InlineWebhookDeploymentCreatedDeploymentOrganizationSecretsX7e6057bf? = null

    public var organizationSelfHostedRunners:
        InlineWebhookDeploymentCreatedDeploymentOrganizationSelfHost148fX3811b5eb? = null

    public var organizationUserBlocking:
        InlineWebhookDeploymentCreatedDeploymentOrganizationUserBlockingX20cb49cb? = null

    public var packages:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppPackagesX55b7644a? = null

    public var pages: InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppPagesX8c7d51e5? =
        null

    public var pullRequests: InlineWebhookDeploymentCreatedDeploymentPullRequestsX6de70365? = null

    public var repositoryHooks: InlineWebhookDeploymentCreatedDeploymentRepositoryHooksXa5425ef6? =
        null

    public var repositoryProjects:
        InlineWebhookDeploymentCreatedDeploymentRepositoryProjectsX7e9e850d? = null

    public var secretScanningAlerts:
        InlineWebhookDeploymentCreatedDeploymentSecretScanningAlertsXa47b2f49? = null

    public var secrets:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e? = null

    public var securityEvents: InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1? =
        null

    public var securityScanningAlert:
        InlineWebhookDeploymentCreatedDeploymentSecurityScanningAlertX81bf1ab1? = null

    public var singleFile:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e? = null

    public var statuses:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppStatusesXc32eaf3f? = null

    public var vulnerabilityAlerts:
        InlineWebhookDeploymentCreatedDeploymentVulnerabilityAlertsX70e574a6? = null

    public var workflows:
        InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppWorkflowsX59d726bb? = null

    public fun build(): InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435 = InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435 must be a JSON object")
      return InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppActionsX4ed72acd>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentAdministrationXd14320fc>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppChecksXc9853998>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentContentReferencesX55f46408>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppContentsX03ad5b96>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentDeploymentsX8c2bff66>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentDiscussionsXdedd4f28>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppEmailsXa376bc06>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentEnvironmentsX010cf81e>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppIssuesX1a20e703>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppKeysX2e2bac57>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppMembersX9be1e58d>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppMetadataX4b74a958>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentOrganizationAdministca9fXc72f6371>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentOrganizationHooksX1c93b1da>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentOrganizationPackagesX862a056e>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentOrganizationPlanXb68f2fdf>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentOrganizationProjectsX509c7bd5>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentOrganizationSecretsX7e6057bf>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentOrganizationSelfHost148fX3811b5eb>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentOrganizationUserBlockingX20cb49cb>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppPackagesX55b7644a>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppPagesX8c7d51e5>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPullRequestsX6de70365>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentRepositoryHooksXa5425ef6>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentRepositoryProjectsX7e9e850d>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentSecretScanningAlertsXa47b2f49>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSecretsXdd87a80e>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentSecurityEventsX8214cae1>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentSecurityScanningAlertX81bf1ab1>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppSingleFileXc815f87e>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppStatusesXc32eaf3f>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentVulnerabilityAlertsX70e574a6>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentCreatedDeploymentPerformedViaGithubAppWorkflowsX59d726bb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435")
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

public fun inlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435(block: InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435.Builder.() -> Unit): InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435 = InlineWebhookDeploymentCreatedDeploymentPermissionsX4fa26435.build(block)
