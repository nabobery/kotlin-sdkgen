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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review_comment/properties/author_association
 */
@Serializable(with = InlineWebhooksReviewCommentAuthorAssociationX15fdf57b.Serializer::class)
public sealed class InlineWebhooksReviewCommentAuthorAssociationX15fdf57b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhooksReviewCommentAuthorAssociationX15fdf57b() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhooksReviewCommentAuthorAssociationX15fdf57b() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhooksReviewCommentAuthorAssociationX15fdf57b() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhooksReviewCommentAuthorAssociationX15fdf57b() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhooksReviewCommentAuthorAssociationX15fdf57b() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhooksReviewCommentAuthorAssociationX15fdf57b() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhooksReviewCommentAuthorAssociationX15fdf57b() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhooksReviewCommentAuthorAssociationX15fdf57b() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReviewCommentAuthorAssociationX15fdf57b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReviewCommentAuthorAssociationX15fdf57b = when (value) {
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

  internal object Serializer : KSerializer<InlineWebhooksReviewCommentAuthorAssociationX15fdf57b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksReviewCommentAuthorAssociationX15fdf57b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewCommentAuthorAssociationX15fdf57b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewCommentAuthorAssociationX15fdf57b) {
      encoder.encodeString(value.value)
    }
  }
}
