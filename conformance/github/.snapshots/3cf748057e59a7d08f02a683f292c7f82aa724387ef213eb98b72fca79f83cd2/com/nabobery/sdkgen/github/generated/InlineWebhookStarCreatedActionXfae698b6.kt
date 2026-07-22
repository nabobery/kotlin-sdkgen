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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-star-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-star-created/properties/action
 */
@Serializable(with = InlineWebhookStarCreatedActionXfae698b6.Serializer::class)
public sealed class InlineWebhookStarCreatedActionXfae698b6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookStarCreatedActionXfae698b6() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookStarCreatedActionXfae698b6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookStarCreatedActionXfae698b6 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookStarCreatedActionXfae698b6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookStarCreatedActionXfae698b6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookStarCreatedActionXfae698b6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStarCreatedActionXfae698b6) {
      encoder.encodeString(value.value)
    }
  }
}
