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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-created/properties/action
 */
@Serializable(with = InlineWebhookProjectColumnCreatedActionXfcdf9ab6.Serializer::class)
public sealed class InlineWebhookProjectColumnCreatedActionXfcdf9ab6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookProjectColumnCreatedActionXfcdf9ab6() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectColumnCreatedActionXfcdf9ab6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectColumnCreatedActionXfcdf9ab6 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectColumnCreatedActionXfcdf9ab6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectColumnCreatedActionXfcdf9ab6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectColumnCreatedActionXfcdf9ab6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectColumnCreatedActionXfcdf9ab6) {
      encoder.encodeString(value.value)
    }
  }
}
