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
 * How the author is associated with the repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/author_association
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42.Serializer::class)
public sealed class InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42 = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestAuthorAssociationX2b48ca42) {
      encoder.encodeString(value.value)
    }
  }
}
