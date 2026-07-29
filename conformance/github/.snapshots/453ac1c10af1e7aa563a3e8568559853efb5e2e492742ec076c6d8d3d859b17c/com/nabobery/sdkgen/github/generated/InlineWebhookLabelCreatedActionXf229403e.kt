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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-label-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-label-created/properties/action
 */
@Serializable(with = InlineWebhookLabelCreatedActionXf229403e.Serializer::class)
public sealed class InlineWebhookLabelCreatedActionXf229403e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookLabelCreatedActionXf229403e() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookLabelCreatedActionXf229403e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookLabelCreatedActionXf229403e = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookLabelCreatedActionXf229403e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookLabelCreatedActionXf229403e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookLabelCreatedActionXf229403e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookLabelCreatedActionXf229403e) {
      encoder.encodeString(value.value)
    }
  }
}
