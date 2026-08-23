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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/assignees/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/assignees/items/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42.Serializer::class)
public sealed class InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedPullRequestAssigneesItemTypeX65342b42) {
      encoder.encodeString(value.value)
    }
  }
}
