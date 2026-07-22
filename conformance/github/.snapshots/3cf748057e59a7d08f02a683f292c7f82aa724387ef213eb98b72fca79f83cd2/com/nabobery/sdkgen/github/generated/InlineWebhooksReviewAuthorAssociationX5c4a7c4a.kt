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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review/properties/author_association
 */
@Serializable(with = InlineWebhooksReviewAuthorAssociationX5c4a7c4a.Serializer::class)
public sealed class InlineWebhooksReviewAuthorAssociationX5c4a7c4a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhooksReviewAuthorAssociationX5c4a7c4a() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhooksReviewAuthorAssociationX5c4a7c4a() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhooksReviewAuthorAssociationX5c4a7c4a() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhooksReviewAuthorAssociationX5c4a7c4a() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhooksReviewAuthorAssociationX5c4a7c4a() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhooksReviewAuthorAssociationX5c4a7c4a() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhooksReviewAuthorAssociationX5c4a7c4a() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhooksReviewAuthorAssociationX5c4a7c4a() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReviewAuthorAssociationX5c4a7c4a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReviewAuthorAssociationX5c4a7c4a = when (value) {
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

  public object Serializer : KSerializer<InlineWebhooksReviewAuthorAssociationX5c4a7c4a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksReviewAuthorAssociationX5c4a7c4a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewAuthorAssociationX5c4a7c4a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewAuthorAssociationX5c4a7c4a) {
      encoder.encodeString(value.value)
    }
  }
}
