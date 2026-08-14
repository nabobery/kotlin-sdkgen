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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-converted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-converted/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd.Serializer::class)
public sealed class InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `converted`.
   */
  public data object Converted : InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd() {
    public override val `value`: String = "converted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd = when (value) {
      Converted.value -> Converted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd) {
      encoder.encodeString(value.value)
    }
  }
}
