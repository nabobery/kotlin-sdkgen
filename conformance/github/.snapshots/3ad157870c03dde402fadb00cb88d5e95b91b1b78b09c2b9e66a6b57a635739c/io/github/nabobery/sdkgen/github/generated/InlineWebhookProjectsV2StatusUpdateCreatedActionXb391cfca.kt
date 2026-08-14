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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-created/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2StatusUpdateCreatedActionXb391cfca.Serializer::class)
public sealed class InlineWebhookProjectsV2StatusUpdateCreatedActionXb391cfca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookProjectsV2StatusUpdateCreatedActionXb391cfca() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2StatusUpdateCreatedActionXb391cfca()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2StatusUpdateCreatedActionXb391cfca = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2StatusUpdateCreatedActionXb391cfca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2StatusUpdateCreatedActionXb391cfca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2StatusUpdateCreatedActionXb391cfca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2StatusUpdateCreatedActionXb391cfca) {
      encoder.encodeString(value.value)
    }
  }
}
