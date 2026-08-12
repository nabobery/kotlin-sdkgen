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
 * How the author is associated with the repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/review/properties/a
 * uthor_association
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd.Serializer::class)
public sealed class InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd = when (value) {
      Collaborator.value -> Collaborator
      Contributor.value -> Contributor
      FirstTimer.value -> FirstTimer
      FirstTimeContributor.value -> FirstTimeContributor
      Mannequin.value -> Mannequin
      Member.value -> Member
      None.value -> None
      Owner.value -> Owner
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd) {
      encoder.encodeString(value.value)
    }
  }
}
