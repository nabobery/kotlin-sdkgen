package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted/properties/hook/properties/events/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted/properties/hook/properties/events/items
 */
@Serializable(with = InlineWebhookMetaDeletedHookEventsItemXc9816294.Serializer::class)
public sealed class InlineWebhookMetaDeletedHookEventsItemXc9816294 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `*`.
   */
  public data object Value : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "*"
  }

  /**
   * Documented value. Wire value: `branch_protection_rule`.
   */
  public data object BranchProtectionRule : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "branch_protection_rule"
  }

  /**
   * Documented value. Wire value: `check_run`.
   */
  public data object CheckRun : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "check_run"
  }

  /**
   * Documented value. Wire value: `check_suite`.
   */
  public data object CheckSuite : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "check_suite"
  }

  /**
   * Documented value. Wire value: `code_scanning_alert`.
   */
  public data object CodeScanningAlert : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "code_scanning_alert"
  }

  /**
   * Documented value. Wire value: `commit_comment`.
   */
  public data object CommitComment : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "commit_comment"
  }

  /**
   * Documented value. Wire value: `create`.
   */
  public data object Create : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "create"
  }

  /**
   * Documented value. Wire value: `delete`.
   */
  public data object Delete : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "delete"
  }

  /**
   * Documented value. Wire value: `deployment`.
   */
  public data object Deployment : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "deployment"
  }

  /**
   * Documented value. Wire value: `deployment_status`.
   */
  public data object DeploymentStatus : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "deployment_status"
  }

  /**
   * Documented value. Wire value: `deploy_key`.
   */
  public data object DeployKey : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "deploy_key"
  }

  /**
   * Documented value. Wire value: `discussion`.
   */
  public data object Discussion : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "discussion"
  }

  /**
   * Documented value. Wire value: `discussion_comment`.
   */
  public data object DiscussionComment : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "discussion_comment"
  }

  /**
   * Documented value. Wire value: `fork`.
   */
  public data object Fork : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "fork"
  }

  /**
   * Documented value. Wire value: `gollum`.
   */
  public data object Gollum : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "gollum"
  }

  /**
   * Documented value. Wire value: `issues`.
   */
  public data object Issues : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "issues"
  }

  /**
   * Documented value. Wire value: `issue_comment`.
   */
  public data object IssueComment : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "issue_comment"
  }

  /**
   * Documented value. Wire value: `label`.
   */
  public data object Label : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "label"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `membership`.
   */
  public data object Membership : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "membership"
  }

  /**
   * Documented value. Wire value: `meta`.
   */
  public data object Meta : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "meta"
  }

  /**
   * Documented value. Wire value: `milestone`.
   */
  public data object Milestone : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "milestone"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `org_block`.
   */
  public data object OrgBlock : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "org_block"
  }

  /**
   * Documented value. Wire value: `package`.
   */
  public data object PackageValue : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "package"
  }

  /**
   * Documented value. Wire value: `page_build`.
   */
  public data object PageBuild : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "page_build"
  }

  /**
   * Documented value. Wire value: `project`.
   */
  public data object Project : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "project"
  }

  /**
   * Documented value. Wire value: `project_card`.
   */
  public data object ProjectCard : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "project_card"
  }

  /**
   * Documented value. Wire value: `project_column`.
   */
  public data object ProjectColumn : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "project_column"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `pull_request`.
   */
  public data object PullRequest : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "pull_request"
  }

  /**
   * Documented value. Wire value: `pull_request_review`.
   */
  public data object PullRequestReview : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "pull_request_review"
  }

  /**
   * Documented value. Wire value: `pull_request_review_comment`.
   */
  public data object PullRequestReviewComment : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "pull_request_review_comment"
  }

  /**
   * Documented value. Wire value: `pull_request_review_thread`.
   */
  public data object PullRequestReviewThread : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "pull_request_review_thread"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `registry_package`.
   */
  public data object RegistryPackage : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "registry_package"
  }

  /**
   * Documented value. Wire value: `release`.
   */
  public data object Release : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "release"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `repository_import`.
   */
  public data object RepositoryImport : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "repository_import"
  }

  /**
   * Documented value. Wire value: `repository_vulnerability_alert`.
   */
  public data object RepositoryVulnerabilityAlert : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "repository_vulnerability_alert"
  }

  /**
   * Documented value. Wire value: `secret_scanning_alert`.
   */
  public data object SecretScanningAlert : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "secret_scanning_alert"
  }

  /**
   * Documented value. Wire value: `secret_scanning_alert_location`.
   */
  public data object SecretScanningAlertLocation : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "secret_scanning_alert_location"
  }

  /**
   * Documented value. Wire value: `security_and_analysis`.
   */
  public data object SecurityAndAnalysis : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "security_and_analysis"
  }

  /**
   * Documented value. Wire value: `star`.
   */
  public data object Star : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "star"
  }

  /**
   * Documented value. Wire value: `status`.
   */
  public data object Status : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "status"
  }

  /**
   * Documented value. Wire value: `team`.
   */
  public data object Team : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "team"
  }

  /**
   * Documented value. Wire value: `team_add`.
   */
  public data object TeamAdd : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "team_add"
  }

  /**
   * Documented value. Wire value: `watch`.
   */
  public data object Watch : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "watch"
  }

  /**
   * Documented value. Wire value: `workflow_job`.
   */
  public data object WorkflowJob : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "workflow_job"
  }

  /**
   * Documented value. Wire value: `workflow_run`.
   */
  public data object WorkflowRun : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "workflow_run"
  }

  /**
   * Documented value. Wire value: `repository_dispatch`.
   */
  public data object RepositoryDispatch : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "repository_dispatch"
  }

  /**
   * Documented value. Wire value: `projects_v2_item`.
   */
  public data object ProjectsV2Item : InlineWebhookMetaDeletedHookEventsItemXc9816294() {
    public override val `value`: String = "projects_v2_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMetaDeletedHookEventsItemXc9816294()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMetaDeletedHookEventsItemXc9816294 = when (value) {
      Value.value -> Value
      BranchProtectionRule.value -> BranchProtectionRule
      CheckRun.value -> CheckRun
      CheckSuite.value -> CheckSuite
      CodeScanningAlert.value -> CodeScanningAlert
      CommitComment.value -> CommitComment
      Create.value -> Create
      Delete.value -> Delete
      Deployment.value -> Deployment
      DeploymentStatus.value -> DeploymentStatus
      DeployKey.value -> DeployKey
      Discussion.value -> Discussion
      DiscussionComment.value -> DiscussionComment
      Fork.value -> Fork
      Gollum.value -> Gollum
      Issues.value -> Issues
      IssueComment.value -> IssueComment
      Label.value -> Label
      Member.value -> Member
      Membership.value -> Membership
      Meta.value -> Meta
      Milestone.value -> Milestone
      Organization.value -> Organization
      OrgBlock.value -> OrgBlock
      PackageValue.value -> PackageValue
      PageBuild.value -> PageBuild
      Project.value -> Project
      ProjectCard.value -> ProjectCard
      ProjectColumn.value -> ProjectColumn
      Public.value -> Public
      PullRequest.value -> PullRequest
      PullRequestReview.value -> PullRequestReview
      PullRequestReviewComment.value -> PullRequestReviewComment
      PullRequestReviewThread.value -> PullRequestReviewThread
      Push.value -> Push
      RegistryPackage.value -> RegistryPackage
      Release.value -> Release
      Repository.value -> Repository
      RepositoryImport.value -> RepositoryImport
      RepositoryVulnerabilityAlert.value -> RepositoryVulnerabilityAlert
      SecretScanningAlert.value -> SecretScanningAlert
      SecretScanningAlertLocation.value -> SecretScanningAlertLocation
      SecurityAndAnalysis.value -> SecurityAndAnalysis
      Star.value -> Star
      Status.value -> Status
      Team.value -> Team
      TeamAdd.value -> TeamAdd
      Watch.value -> Watch
      WorkflowJob.value -> WorkflowJob
      WorkflowRun.value -> WorkflowRun
      RepositoryDispatch.value -> RepositoryDispatch
      ProjectsV2Item.value -> ProjectsV2Item
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMetaDeletedHookEventsItemXc9816294> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMetaDeletedHookEventsItemXc9816294", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMetaDeletedHookEventsItemXc9816294 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMetaDeletedHookEventsItemXc9816294) {
      encoder.encodeString(value.value)
    }
  }
}
