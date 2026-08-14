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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/thread/prop
 * erties/comments/items/properties/author_association
 */
@Serializable(with = InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e.Serializer::class)
public sealed class InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5e87ThreadCommentsItemAuthorAssociationX01bc4b6e) {
      encoder.encodeString(value.value)
    }
  }
}
