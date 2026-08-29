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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-converted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-converted/properties/action
 */
@Serializable(with = InlineWebhookProjectCardConvertedActionX5826ae5c.Serializer::class)
public sealed class InlineWebhookProjectCardConvertedActionX5826ae5c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `converted`.
   */
  public data object Converted : InlineWebhookProjectCardConvertedActionX5826ae5c() {
    public override val `value`: String = "converted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectCardConvertedActionX5826ae5c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectCardConvertedActionX5826ae5c = when (value) {
      Converted.value -> Converted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardConvertedActionX5826ae5c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectCardConvertedActionX5826ae5c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardConvertedActionX5826ae5c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardConvertedActionX5826ae5c) {
      encoder.encodeString(value.value)
    }
  }
}
