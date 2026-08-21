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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-closed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-closed/properties/action
 */
@Serializable(with = InlineWebhookProjectClosedActionX1c6b8e07.Serializer::class)
public sealed class InlineWebhookProjectClosedActionX1c6b8e07 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookProjectClosedActionX1c6b8e07() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectClosedActionX1c6b8e07()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectClosedActionX1c6b8e07 = when (value) {
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectClosedActionX1c6b8e07> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectClosedActionX1c6b8e07", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectClosedActionX1c6b8e07 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectClosedActionX1c6b8e07) {
      encoder.encodeString(value.value)
    }
  }
}
