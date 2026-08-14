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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-created/properties/action
 */
@Serializable(with = InlineWebhookProjectCardCreatedActionXdf78e7a8.Serializer::class)
public sealed class InlineWebhookProjectCardCreatedActionXdf78e7a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookProjectCardCreatedActionXdf78e7a8() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectCardCreatedActionXdf78e7a8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectCardCreatedActionXdf78e7a8 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardCreatedActionXdf78e7a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectCardCreatedActionXdf78e7a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardCreatedActionXdf78e7a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardCreatedActionXdf78e7a8) {
      encoder.encodeString(value.value)
    }
  }
}
