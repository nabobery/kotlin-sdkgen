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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/performed_via_github_app/properties/permis
 * sions
 */
@Serializable(with = InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1.Serializer::class)
public class InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1(
  public val actions: InlineWebhooksIssuePerformedViaGithubAppPermissionsActionsX1c8f300a? = null,
  public val administration:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029? = null,
  public val checks: InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3? = null,
  public val contentReferences:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsContentReferencesX0eef3fcf? = null,
  public val contents: InlineWebhooksIssuePerformedViaGithubAppPermissionsContentsXffe28a78? = null,
  public val deployments:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsDeploymentsX52807619? = null,
  public val discussions:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsDiscussionsX90755ec6? = null,
  public val emails: InlineWebhooksIssuePerformedViaGithubAppPermissionsEmailsX84b64bc9? = null,
  public val environments:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsEnvironmentsXc946fcc9? = null,
  public val issues: InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b? = null,
  public val keys: InlineWebhooksIssuePerformedViaGithubAppPermissionsKeysXe798c162? = null,
  public val members: InlineWebhooksIssuePerformedViaGithubAppPermissionsMembersXb6e87439? = null,
  public val metadata: InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb? = null,
  public val organizationAdministration:
      InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb? = null,
  public val organizationHooks:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationHooksX60ce218c? = null,
  public val organizationPackages:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationPackagesX16ba31cc? = null,
  public val organizationPlan:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationPlanX1213b512? = null,
  public val organizationProjects:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationProjectsXb89839cf? = null,
  public val organizationSecrets:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationSecretsXd6793909? = null,
  public val organizationSelfHostedRunners:
      InlineWebhooksIssuePerformedViaGithubAppOrganizationSelfHost148fXbe837ba0? = null,
  public val organizationUserBlocking:
      InlineWebhooksIssuePerformedViaGithubAppOrganizationUserBlockingXd7a44d11? = null,
  public val packages: InlineWebhooksIssuePerformedViaGithubAppPermissionsPackagesXc5f74c6d? = null,
  public val pages: InlineWebhooksIssuePerformedViaGithubAppPermissionsPagesXa2c3e33c? = null,
  public val pullRequests:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsPullRequestsX4ca632f8? = null,
  public val repositoryHooks:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsRepositoryHooksX7a317479? = null,
  public val repositoryProjects:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsRepositoryProjectsX13b6a800? = null,
  public val secretScanningAlerts:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsSecretScanningAlertsX6ac1ef7c? = null,
  public val secrets: InlineWebhooksIssuePerformedViaGithubAppPermissionsSecretsX4bb3ea9c? = null,
  public val securityEvents:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsSecurityEventsXf9a2fc01? = null,
  public val securityScanningAlert:
      InlineWebhooksIssuePerformedViaGithubAppSecurityScanningAlertXba178754? = null,
  public val singleFile:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsSingleFileXe6fa7bc0? = null,
  public val statuses: InlineWebhooksIssuePerformedViaGithubAppPermissionsStatusesX81f6f98b? = null,
  public val vulnerabilityAlerts:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsVulnerabilityAlertsX495ea983? = null,
  public val workflows:
      InlineWebhooksIssuePerformedViaGithubAppPermissionsWorkflowsX99650f39? = null,
) {
  public class Builder {
    public var actions: InlineWebhooksIssuePerformedViaGithubAppPermissionsActionsX1c8f300a? = null

    public var administration:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029? = null

    public var checks: InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3? = null

    public var contentReferences:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsContentReferencesX0eef3fcf? = null

    public var contents: InlineWebhooksIssuePerformedViaGithubAppPermissionsContentsXffe28a78? =
        null

    public var deployments: InlineWebhooksIssuePerformedViaGithubAppPermissionsDeploymentsX52807619?
        = null

    public var discussions: InlineWebhooksIssuePerformedViaGithubAppPermissionsDiscussionsX90755ec6?
        = null

    public var emails: InlineWebhooksIssuePerformedViaGithubAppPermissionsEmailsX84b64bc9? = null

    public var environments:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsEnvironmentsXc946fcc9? = null

    public var issues: InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b? = null

    public var keys: InlineWebhooksIssuePerformedViaGithubAppPermissionsKeysXe798c162? = null

    public var members: InlineWebhooksIssuePerformedViaGithubAppPermissionsMembersXb6e87439? = null

    public var metadata: InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb? =
        null

    public var organizationAdministration:
        InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb? = null

    public var organizationHooks:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationHooksX60ce218c? = null

    public var organizationPackages:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationPackagesX16ba31cc? = null

    public var organizationPlan:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationPlanX1213b512? = null

    public var organizationProjects:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationProjectsXb89839cf? = null

    public var organizationSecrets:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationSecretsXd6793909? = null

    public var organizationSelfHostedRunners:
        InlineWebhooksIssuePerformedViaGithubAppOrganizationSelfHost148fXbe837ba0? = null

    public var organizationUserBlocking:
        InlineWebhooksIssuePerformedViaGithubAppOrganizationUserBlockingXd7a44d11? = null

    public var packages: InlineWebhooksIssuePerformedViaGithubAppPermissionsPackagesXc5f74c6d? =
        null

    public var pages: InlineWebhooksIssuePerformedViaGithubAppPermissionsPagesXa2c3e33c? = null

    public var pullRequests:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsPullRequestsX4ca632f8? = null

    public var repositoryHooks:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsRepositoryHooksX7a317479? = null

    public var repositoryProjects:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsRepositoryProjectsX13b6a800? = null

    public var secretScanningAlerts:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsSecretScanningAlertsX6ac1ef7c? = null

    public var secrets: InlineWebhooksIssuePerformedViaGithubAppPermissionsSecretsX4bb3ea9c? = null

    public var securityEvents:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsSecurityEventsXf9a2fc01? = null

    public var securityScanningAlert:
        InlineWebhooksIssuePerformedViaGithubAppSecurityScanningAlertXba178754? = null

    public var singleFile: InlineWebhooksIssuePerformedViaGithubAppPermissionsSingleFileXe6fa7bc0? =
        null

    public var statuses: InlineWebhooksIssuePerformedViaGithubAppPermissionsStatusesX81f6f98b? =
        null

    public var vulnerabilityAlerts:
        InlineWebhooksIssuePerformedViaGithubAppPermissionsVulnerabilityAlertsX495ea983? = null

    public var workflows: InlineWebhooksIssuePerformedViaGithubAppPermissionsWorkflowsX99650f39? =
        null

    public fun build(): InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1 = InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1(
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
    public fun build(block: Builder.() -> Unit): InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1 must be a JSON object")
      return InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsActionsX1c8f300a>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsAdministrationXfc16c029>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsChecksXb15025c3>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsContentReferencesX0eef3fcf>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsContentsXffe28a78>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsDeploymentsX52807619>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsDiscussionsX90755ec6>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsEmailsX84b64bc9>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsEnvironmentsXc946fcc9>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsIssuesX07f6ce7b>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsKeysXe798c162>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsMembersXb6e87439>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsMetadataX0df13ebb>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppOrganizationAdministca9fX301e84eb>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationHooksX60ce218c>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationPackagesX16ba31cc>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationPlanX1213b512>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationProjectsXb89839cf>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsOrganizationSecretsXd6793909>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppOrganizationSelfHost148fXbe837ba0>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppOrganizationUserBlockingXd7a44d11>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsPackagesXc5f74c6d>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsPagesXa2c3e33c>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsPullRequestsX4ca632f8>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsRepositoryHooksX7a317479>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsRepositoryProjectsX13b6a800>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsSecretScanningAlertsX6ac1ef7c>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsSecretsX4bb3ea9c>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsSecurityEventsXf9a2fc01>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppSecurityScanningAlertXba178754>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsSingleFileXe6fa7bc0>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsStatusesX81f6f98b>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsVulnerabilityAlertsX495ea983>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhooksIssuePerformedViaGithubAppPermissionsWorkflowsX99650f39>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1")
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

public fun inlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1(block: InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1.Builder.() -> Unit): InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1 = InlineWebhooksIssuePerformedViaGithubAppPermissionsXd1882dd1.build(block)
