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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_reviewers/items/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_reviewers/items/properties/type
 */
@Serializable(with = InlineWebhooksReviewersItemTypeX84e46881.Serializer::class)
public sealed class InlineWebhooksReviewersItemTypeX84e46881 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksReviewersItemTypeX84e46881() {
    public override val `value`: String = "User"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReviewersItemTypeX84e46881()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReviewersItemTypeX84e46881 = when (value) {
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksReviewersItemTypeX84e46881> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksReviewersItemTypeX84e46881", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewersItemTypeX84e46881 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewersItemTypeX84e46881) {
      encoder.encodeString(value.value)
    }
  }
}
