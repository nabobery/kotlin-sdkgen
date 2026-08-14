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
 * The location type. Because secrets may be found in different types of resources (ie. code, comments, issues, pull
 * requests, discussions), this field identifies the type of resource where the secret was found.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location/properties/type
 */
@Serializable(with = InlineSecretScanningLocationTypeX6977c1df.Serializer::class)
public sealed class InlineSecretScanningLocationTypeX6977c1df {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `commit`.
   */
  public data object Commit : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "commit"
  }

  /**
   * Documented value. Wire value: `wiki_commit`.
   */
  public data object WikiCommit : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "wiki_commit"
  }

  /**
   * Documented value. Wire value: `issue_title`.
   */
  public data object IssueTitle : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "issue_title"
  }

  /**
   * Documented value. Wire value: `issue_body`.
   */
  public data object IssueBody : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "issue_body"
  }

  /**
   * Documented value. Wire value: `issue_comment`.
   */
  public data object IssueComment : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "issue_comment"
  }

  /**
   * Documented value. Wire value: `discussion_title`.
   */
  public data object DiscussionTitle : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "discussion_title"
  }

  /**
   * Documented value. Wire value: `discussion_body`.
   */
  public data object DiscussionBody : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "discussion_body"
  }

  /**
   * Documented value. Wire value: `discussion_comment`.
   */
  public data object DiscussionComment : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "discussion_comment"
  }

  /**
   * Documented value. Wire value: `pull_request_title`.
   */
  public data object PullRequestTitle : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "pull_request_title"
  }

  /**
   * Documented value. Wire value: `pull_request_body`.
   */
  public data object PullRequestBody : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "pull_request_body"
  }

  /**
   * Documented value. Wire value: `pull_request_comment`.
   */
  public data object PullRequestComment : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "pull_request_comment"
  }

  /**
   * Documented value. Wire value: `pull_request_review`.
   */
  public data object PullRequestReview : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "pull_request_review"
  }

  /**
   * Documented value. Wire value: `pull_request_review_comment`.
   */
  public data object PullRequestReviewComment : InlineSecretScanningLocationTypeX6977c1df() {
    public override val `value`: String = "pull_request_review_comment"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningLocationTypeX6977c1df()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningLocationTypeX6977c1df = when (value) {
      Commit.value -> Commit
      WikiCommit.value -> WikiCommit
      IssueTitle.value -> IssueTitle
      IssueBody.value -> IssueBody
      IssueComment.value -> IssueComment
      DiscussionTitle.value -> DiscussionTitle
      DiscussionBody.value -> DiscussionBody
      DiscussionComment.value -> DiscussionComment
      PullRequestTitle.value -> PullRequestTitle
      PullRequestBody.value -> PullRequestBody
      PullRequestComment.value -> PullRequestComment
      PullRequestReview.value -> PullRequestReview
      PullRequestReviewComment.value -> PullRequestReviewComment
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningLocationTypeX6977c1df> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecretScanningLocationTypeX6977c1df", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningLocationTypeX6977c1df = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningLocationTypeX6977c1df) {
      encoder.encodeString(value.value)
    }
  }
}
