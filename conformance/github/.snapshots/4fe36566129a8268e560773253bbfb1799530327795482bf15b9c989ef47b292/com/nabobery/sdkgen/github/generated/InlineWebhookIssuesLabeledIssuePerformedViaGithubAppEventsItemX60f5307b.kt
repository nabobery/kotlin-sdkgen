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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/events/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/performed_via_git
 * hub_app/properties/events/items
 */
@Serializable(with = InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b.Serializer::class)
public sealed class InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `branch_protection_rule`.
   */
  public data object BranchProtectionRule : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "branch_protection_rule"
  }

  /**
   * Documented value. Wire value: `check_run`.
   */
  public data object CheckRun : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "check_run"
  }

  /**
   * Documented value. Wire value: `check_suite`.
   */
  public data object CheckSuite : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "check_suite"
  }

  /**
   * Documented value. Wire value: `code_scanning_alert`.
   */
  public data object CodeScanningAlert : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "code_scanning_alert"
  }

  /**
   * Documented value. Wire value: `commit_comment`.
   */
  public data object CommitComment : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "commit_comment"
  }

  /**
   * Documented value. Wire value: `content_reference`.
   */
  public data object ContentReference : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "content_reference"
  }

  /**
   * Documented value. Wire value: `create`.
   */
  public data object Create : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "create"
  }

  /**
   * Documented value. Wire value: `delete`.
   */
  public data object Delete : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "delete"
  }

  /**
   * Documented value. Wire value: `deployment`.
   */
  public data object Deployment : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "deployment"
  }

  /**
   * Documented value. Wire value: `deployment_review`.
   */
  public data object DeploymentReview : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "deployment_review"
  }

  /**
   * Documented value. Wire value: `deployment_status`.
   */
  public data object DeploymentStatus : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "deployment_status"
  }

  /**
   * Documented value. Wire value: `deploy_key`.
   */
  public data object DeployKey : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "deploy_key"
  }

  /**
   * Documented value. Wire value: `discussion`.
   */
  public data object Discussion : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "discussion"
  }

  /**
   * Documented value. Wire value: `discussion_comment`.
   */
  public data object DiscussionComment : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "discussion_comment"
  }

  /**
   * Documented value. Wire value: `fork`.
   */
  public data object Fork : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "fork"
  }

  /**
   * Documented value. Wire value: `gollum`.
   */
  public data object Gollum : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "gollum"
  }

  /**
   * Documented value. Wire value: `issues`.
   */
  public data object Issues : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "issues"
  }

  /**
   * Documented value. Wire value: `issue_comment`.
   */
  public data object IssueComment : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "issue_comment"
  }

  /**
   * Documented value. Wire value: `label`.
   */
  public data object Label : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "label"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `membership`.
   */
  public data object Membership : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "membership"
  }

  /**
   * Documented value. Wire value: `milestone`.
   */
  public data object Milestone : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "milestone"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `org_block`.
   */
  public data object OrgBlock : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "org_block"
  }

  /**
   * Documented value. Wire value: `page_build`.
   */
  public data object PageBuild : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "page_build"
  }

  /**
   * Documented value. Wire value: `project`.
   */
  public data object Project : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "project"
  }

  /**
   * Documented value. Wire value: `project_card`.
   */
  public data object ProjectCard : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "project_card"
  }

  /**
   * Documented value. Wire value: `project_column`.
   */
  public data object ProjectColumn : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "project_column"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `pull_request`.
   */
  public data object PullRequest : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "pull_request"
  }

  /**
   * Documented value. Wire value: `pull_request_review`.
   */
  public data object PullRequestReview : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "pull_request_review"
  }

  /**
   * Documented value. Wire value: `pull_request_review_comment`.
   */
  public data object PullRequestReviewComment : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "pull_request_review_comment"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `registry_package`.
   */
  public data object RegistryPackage : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "registry_package"
  }

  /**
   * Documented value. Wire value: `release`.
   */
  public data object Release : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "release"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `repository_dispatch`.
   */
  public data object RepositoryDispatch : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "repository_dispatch"
  }

  /**
   * Documented value. Wire value: `secret_scanning_alert`.
   */
  public data object SecretScanningAlert : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "secret_scanning_alert"
  }

  /**
   * Documented value. Wire value: `star`.
   */
  public data object Star : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "star"
  }

  /**
   * Documented value. Wire value: `status`.
   */
  public data object Status : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "status"
  }

  /**
   * Documented value. Wire value: `team`.
   */
  public data object Team : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "team"
  }

  /**
   * Documented value. Wire value: `team_add`.
   */
  public data object TeamAdd : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "team_add"
  }

  /**
   * Documented value. Wire value: `watch`.
   */
  public data object Watch : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "watch"
  }

  /**
   * Documented value. Wire value: `workflow_dispatch`.
   */
  public data object WorkflowDispatch : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "workflow_dispatch"
  }

  /**
   * Documented value. Wire value: `workflow_run`.
   */
  public data object WorkflowRun : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "workflow_run"
  }

  /**
   * Documented value. Wire value: `pull_request_review_thread`.
   */
  public data object PullRequestReviewThread : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "pull_request_review_thread"
  }

  /**
   * Documented value. Wire value: `reminder`.
   */
  public data object Reminder : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b() {
    public override val `value`: String = "reminder"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b = when (value) {
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
      PullRequestReviewThread.value -> PullRequestReviewThread
      Reminder.value -> Reminder
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssuePerformedViaGithubAppEventsItemX60f5307b) {
      encoder.encodeString(value.value)
    }
  }
}
