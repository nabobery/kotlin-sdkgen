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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/performed_via_git
 * hub_app/properties/permissions
 */
@Serializable(with = InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5.Serializer::class)
public class InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5(
  public val actions:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd? = null,
  public val administration:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppAdministrationX0b4ac943? = null,
  public val checks:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsChecksX47028a4e? = null,
  public val contentReferences:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppContentReferencesX9e53b9f3? = null,
  public val contents:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsContentsXf59a26a0? = null,
  public val deployments:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733? = null,
  public val discussions:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb? = null,
  public val emails:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsEmailsXe23a8dde? = null,
  public val environments:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppEnvironmentsX476ca09f? = null,
  public val issues:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsIssuesX116b333f? = null,
  public val keys:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsKeysX277ae576? = null,
  public val members:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMembersX5d363ff7? = null,
  public val metadata:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481? = null,
  public val organizationAdministration:
      InlineWebhookIssuesDeletedIssueOrganizationAdministca9fXc0699d17? = null,
  public val organizationHooks:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppOrganizationHooksX32b3e66e? = null,
  public val organizationPackages:
      InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca? = null,
  public val organizationPlan:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppOrganizationPlanX83e7dfee? = null,
  public val organizationProjects:
      InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410? = null,
  public val organizationSecrets:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppOrganizationSecretsX6246145d? = null,
  public val organizationSelfHostedRunners:
      InlineWebhookIssuesDeletedIssueOrganizationSelfHost148fX02feacad? = null,
  public val organizationUserBlocking:
      InlineWebhookIssuesDeletedIssueOrganizationUserBlockingX718bcd10? = null,
  public val packages:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsPackagesXb01a4b62? = null,
  public val pages:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsPagesXafd51fc5? = null,
  public val pullRequests:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPullRequestsXc470f726? = null,
  public val repositoryHooks:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryHooksXd0c21aa5? = null,
  public val repositoryProjects:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9? = null,
  public val secretScanningAlerts:
      InlineWebhookIssuesDeletedIssueSecretScanningAlertsX66a45869? = null,
  public val secrets:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsSecretsXf05ef983? = null,
  public val securityEvents:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppSecurityEventsX00e35522? = null,
  public val securityScanningAlert:
      InlineWebhookIssuesDeletedIssueSecurityScanningAlertXf2995f51? = null,
  public val singleFile:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppSingleFileX93023ca6? = null,
  public val statuses:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsStatusesX858ecdbf? = null,
  public val vulnerabilityAlerts:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppVulnerabilityAlertsXec712dd4? = null,
  public val workflows:
      InlineWebhookIssuesDeletedIssuePerformedViaGithubAppWorkflowsX341e4e21? = null,
) {
  public class Builder {
    public var actions:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd? = null

    public var administration:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppAdministrationX0b4ac943? = null

    public var checks:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsChecksX47028a4e? = null

    public var contentReferences:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppContentReferencesX9e53b9f3? = null

    public var contents:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsContentsXf59a26a0? = null

    public var deployments:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733? = null

    public var discussions:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb? = null

    public var emails:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsEmailsXe23a8dde? = null

    public var environments:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppEnvironmentsX476ca09f? = null

    public var issues:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsIssuesX116b333f? = null

    public var keys: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsKeysX277ae576? =
        null

    public var members:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMembersX5d363ff7? = null

    public var metadata:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481? = null

    public var organizationAdministration:
        InlineWebhookIssuesDeletedIssueOrganizationAdministca9fXc0699d17? = null

    public var organizationHooks:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppOrganizationHooksX32b3e66e? = null

    public var organizationPackages: InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca? =
        null

    public var organizationPlan:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppOrganizationPlanX83e7dfee? = null

    public var organizationProjects: InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410? =
        null

    public var organizationSecrets:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppOrganizationSecretsX6246145d? = null

    public var organizationSelfHostedRunners:
        InlineWebhookIssuesDeletedIssueOrganizationSelfHost148fX02feacad? = null

    public var organizationUserBlocking:
        InlineWebhookIssuesDeletedIssueOrganizationUserBlockingX718bcd10? = null

    public var packages:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsPackagesXb01a4b62? = null

    public var pages: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsPagesXafd51fc5?
        = null

    public var pullRequests:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPullRequestsXc470f726? = null

    public var repositoryHooks:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryHooksXd0c21aa5? = null

    public var repositoryProjects:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9? = null

    public var secretScanningAlerts: InlineWebhookIssuesDeletedIssueSecretScanningAlertsX66a45869? =
        null

    public var secrets:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsSecretsXf05ef983? = null

    public var securityEvents:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppSecurityEventsX00e35522? = null

    public var securityScanningAlert: InlineWebhookIssuesDeletedIssueSecurityScanningAlertXf2995f51?
        = null

    public var singleFile: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppSingleFileX93023ca6?
        = null

    public var statuses:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsStatusesX858ecdbf? = null

    public var vulnerabilityAlerts:
        InlineWebhookIssuesDeletedIssuePerformedViaGithubAppVulnerabilityAlertsXec712dd4? = null

    public var workflows: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppWorkflowsX341e4e21? =
        null

    public fun build(): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5 = InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5 must be a JSON object")
      return InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsActionsXaa3cbfbd>(it) },
        administration = rawObject["administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppAdministrationX0b4ac943>(it) },
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsChecksX47028a4e>(it) },
        contentReferences = rawObject["content_references"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppContentReferencesX9e53b9f3>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsContentsXf59a26a0>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDeploymentsX464b0733>(it) },
        discussions = rawObject["discussions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppDiscussionsXbcb842cb>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsEmailsXe23a8dde>(it) },
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppEnvironmentsX476ca09f>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsIssuesX116b333f>(it) },
        keys = rawObject["keys"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsKeysX277ae576>(it) },
        members = rawObject["members"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMembersX5d363ff7>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsMetadataX0983c481>(it) },
        organizationAdministration = rawObject["organization_administration"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssueOrganizationAdministca9fXc0699d17>(it) },
        organizationHooks = rawObject["organization_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppOrganizationHooksX32b3e66e>(it) },
        organizationPackages = rawObject["organization_packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssueOrganizationPackagesXc39796ca>(it) },
        organizationPlan = rawObject["organization_plan"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppOrganizationPlanX83e7dfee>(it) },
        organizationProjects = rawObject["organization_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssueOrganizationProjectsX81657410>(it) },
        organizationSecrets = rawObject["organization_secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppOrganizationSecretsX6246145d>(it) },
        organizationSelfHostedRunners = rawObject["organization_self_hosted_runners"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssueOrganizationSelfHost148fX02feacad>(it) },
        organizationUserBlocking = rawObject["organization_user_blocking"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssueOrganizationUserBlockingX718bcd10>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsPackagesXb01a4b62>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsPagesXafd51fc5>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPullRequestsXc470f726>(it) },
        repositoryHooks = rawObject["repository_hooks"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryHooksXd0c21aa5>(it) },
        repositoryProjects = rawObject["repository_projects"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppRepositoryProjectsX94274bb9>(it) },
        secretScanningAlerts = rawObject["secret_scanning_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssueSecretScanningAlertsX66a45869>(it) },
        secrets = rawObject["secrets"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsSecretsXf05ef983>(it) },
        securityEvents = rawObject["security_events"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppSecurityEventsX00e35522>(it) },
        securityScanningAlert = rawObject["security_scanning_alert"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssueSecurityScanningAlertXf2995f51>(it) },
        singleFile = rawObject["single_file"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppSingleFileX93023ca6>(it) },
        statuses = rawObject["statuses"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsStatusesX858ecdbf>(it) },
        vulnerabilityAlerts = rawObject["vulnerability_alerts"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppVulnerabilityAlertsXec712dd4>(it) },
        workflows = rawObject["workflows"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesDeletedIssuePerformedViaGithubAppWorkflowsX341e4e21>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5")
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

public fun inlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5(block: InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5.Builder.() -> Unit): InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5 = InlineWebhookIssuesDeletedIssuePerformedViaGithubAppPermissionsXda7efcb5.build(block)
