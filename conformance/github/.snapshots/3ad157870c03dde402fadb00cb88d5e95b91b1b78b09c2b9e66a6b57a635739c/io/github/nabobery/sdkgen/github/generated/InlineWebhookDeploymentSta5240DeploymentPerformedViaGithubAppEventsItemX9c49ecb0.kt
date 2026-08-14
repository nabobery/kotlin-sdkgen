package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment/properties/p
 * erformed_via_github_app/properties/events/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment/properties/p
 * erformed_via_github_app/properties/events/items
 */
@Serializable(with = InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0.Serializer::class)
public sealed class InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch_protection_rule`.
   */
  public data object BranchProtectionRule : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "branch_protection_rule"
  }

  /**
   * Documented value. Wire value: `check_run`.
   */
  public data object CheckRun : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "check_run"
  }

  /**
   * Documented value. Wire value: `check_suite`.
   */
  public data object CheckSuite : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "check_suite"
  }

  /**
   * Documented value. Wire value: `code_scanning_alert`.
   */
  public data object CodeScanningAlert : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "code_scanning_alert"
  }

  /**
   * Documented value. Wire value: `commit_comment`.
   */
  public data object CommitComment : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "commit_comment"
  }

  /**
   * Documented value. Wire value: `content_reference`.
   */
  public data object ContentReference : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "content_reference"
  }

  /**
   * Documented value. Wire value: `create`.
   */
  public data object Create : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "create"
  }

  /**
   * Documented value. Wire value: `delete`.
   */
  public data object Delete : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "delete"
  }

  /**
   * Documented value. Wire value: `deployment`.
   */
  public data object Deployment : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "deployment"
  }

  /**
   * Documented value. Wire value: `deployment_review`.
   */
  public data object DeploymentReview : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "deployment_review"
  }

  /**
   * Documented value. Wire value: `deployment_status`.
   */
  public data object DeploymentStatus : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "deployment_status"
  }

  /**
   * Documented value. Wire value: `deploy_key`.
   */
  public data object DeployKey : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "deploy_key"
  }

  /**
   * Documented value. Wire value: `discussion`.
   */
  public data object Discussion : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "discussion"
  }

  /**
   * Documented value. Wire value: `discussion_comment`.
   */
  public data object DiscussionComment : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "discussion_comment"
  }

  /**
   * Documented value. Wire value: `fork`.
   */
  public data object Fork : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "fork"
  }

  /**
   * Documented value. Wire value: `gollum`.
   */
  public data object Gollum : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "gollum"
  }

  /**
   * Documented value. Wire value: `issues`.
   */
  public data object Issues : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "issues"
  }

  /**
   * Documented value. Wire value: `issue_comment`.
   */
  public data object IssueComment : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "issue_comment"
  }

  /**
   * Documented value. Wire value: `label`.
   */
  public data object Label : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "label"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `membership`.
   */
  public data object Membership : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "membership"
  }

  /**
   * Documented value. Wire value: `milestone`.
   */
  public data object Milestone : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "milestone"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `org_block`.
   */
  public data object OrgBlock : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "org_block"
  }

  /**
   * Documented value. Wire value: `page_build`.
   */
  public data object PageBuild : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "page_build"
  }

  /**
   * Documented value. Wire value: `project`.
   */
  public data object Project : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "project"
  }

  /**
   * Documented value. Wire value: `project_card`.
   */
  public data object ProjectCard : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "project_card"
  }

  /**
   * Documented value. Wire value: `project_column`.
   */
  public data object ProjectColumn : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "project_column"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `pull_request`.
   */
  public data object PullRequest : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "pull_request"
  }

  /**
   * Documented value. Wire value: `pull_request_review`.
   */
  public data object PullRequestReview : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "pull_request_review"
  }

  /**
   * Documented value. Wire value: `pull_request_review_comment`.
   */
  public data object PullRequestReviewComment : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "pull_request_review_comment"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `registry_package`.
   */
  public data object RegistryPackage : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "registry_package"
  }

  /**
   * Documented value. Wire value: `release`.
   */
  public data object Release : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "release"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `repository_dispatch`.
   */
  public data object RepositoryDispatch : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "repository_dispatch"
  }

  /**
   * Documented value. Wire value: `secret_scanning_alert`.
   */
  public data object SecretScanningAlert : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "secret_scanning_alert"
  }

  /**
   * Documented value. Wire value: `star`.
   */
  public data object Star : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "star"
  }

  /**
   * Documented value. Wire value: `status`.
   */
  public data object Status : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "status"
  }

  /**
   * Documented value. Wire value: `team`.
   */
  public data object Team : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "team"
  }

  /**
   * Documented value. Wire value: `team_add`.
   */
  public data object TeamAdd : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "team_add"
  }

  /**
   * Documented value. Wire value: `watch`.
   */
  public data object Watch : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "watch"
  }

  /**
   * Documented value. Wire value: `workflow_dispatch`.
   */
  public data object WorkflowDispatch : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "workflow_dispatch"
  }

  /**
   * Documented value. Wire value: `workflow_run`.
   */
  public data object WorkflowRun : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "workflow_run"
  }

  /**
   * Documented value. Wire value: `merge_queue_entry`.
   */
  public data object MergeQueueEntry : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "merge_queue_entry"
  }

  /**
   * Documented value. Wire value: `workflow_job`.
   */
  public data object WorkflowJob : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "workflow_job"
  }

  /**
   * Documented value. Wire value: `pull_request_review_thread`.
   */
  public data object PullRequestReviewThread : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "pull_request_review_thread"
  }

  /**
   * Documented value. Wire value: `secret_scanning_alert_location`.
   */
  public data object SecretScanningAlertLocation : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "secret_scanning_alert_location"
  }

  /**
   * Documented value. Wire value: `merge_group`.
   */
  public data object MergeGroup : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0() {
    public override val `value`: String = "merge_group"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0 = when (value) {
      BranchProtectionRule.value -> BranchProtectionRule
      CheckRun.value -> CheckRun
      CheckSuite.value -> CheckSuite
      CodeScanningAlert.value -> CodeScanningAlert
      CommitComment.value -> CommitComment
      ContentReference.value -> ContentReference
      Create.value -> Create
      Delete.value -> Delete
      Deployment.value -> Deployment
      DeploymentReview.value -> DeploymentReview
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
      Milestone.value -> Milestone
      Organization.value -> Organization
      OrgBlock.value -> OrgBlock
      PageBuild.value -> PageBuild
      Project.value -> Project
      ProjectCard.value -> ProjectCard
      ProjectColumn.value -> ProjectColumn
      Public.value -> Public
      PullRequest.value -> PullRequest
      PullRequestReview.value -> PullRequestReview
      PullRequestReviewComment.value -> PullRequestReviewComment
      Push.value -> Push
      RegistryPackage.value -> RegistryPackage
      Release.value -> Release
      Repository.value -> Repository
      RepositoryDispatch.value -> RepositoryDispatch
      SecretScanningAlert.value -> SecretScanningAlert
      Star.value -> Star
      Status.value -> Status
      Team.value -> Team
      TeamAdd.value -> TeamAdd
      Watch.value -> Watch
      WorkflowDispatch.value -> WorkflowDispatch
      WorkflowRun.value -> WorkflowRun
      MergeQueueEntry.value -> MergeQueueEntry
      WorkflowJob.value -> WorkflowJob
      PullRequestReviewThread.value -> PullRequestReviewThread
      SecretScanningAlertLocation.value -> SecretScanningAlertLocation
      MergeGroup.value -> MergeGroup
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentSta5240DeploymentPerformedViaGithubAppEventsItemX9c49ecb0) {
      encoder.encodeString(value.value)
    }
  }
}
