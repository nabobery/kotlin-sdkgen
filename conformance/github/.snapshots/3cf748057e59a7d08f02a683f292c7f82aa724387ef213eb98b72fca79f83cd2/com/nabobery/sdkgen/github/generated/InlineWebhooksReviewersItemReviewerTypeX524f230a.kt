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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_reviewers/items/properties/reviewer/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_reviewers/items/properties/reviewer/properties/type
 */
@Serializable(with = InlineWebhooksReviewersItemReviewerTypeX524f230a.Serializer::class)
public sealed class InlineWebhooksReviewersItemReviewerTypeX524f230a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksReviewersItemReviewerTypeX524f230a() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksReviewersItemReviewerTypeX524f230a() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksReviewersItemReviewerTypeX524f230a() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReviewersItemReviewerTypeX524f230a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReviewersItemReviewerTypeX524f230a = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksReviewersItemReviewerTypeX524f230a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksReviewersItemReviewerTypeX524f230a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewersItemReviewerTypeX524f230a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewersItemReviewerTypeX524f230a) {
      encoder.encodeString(value.value)
    }
  }
}
