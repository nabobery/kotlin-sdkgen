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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-reordered/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-reordered/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2ItemReorderedActionX8e6c38c9.Serializer::class)
public sealed class InlineWebhookProjectsV2ItemReorderedActionX8e6c38c9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reordered`.
   */
  public data object Reordered : InlineWebhookProjectsV2ItemReorderedActionX8e6c38c9() {
    public override val `value`: String = "reordered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2ItemReorderedActionX8e6c38c9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2ItemReorderedActionX8e6c38c9 = when (value) {
      Reordered.value -> Reordered
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2ItemReorderedActionX8e6c38c9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2ItemReorderedActionX8e6c38c9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemReorderedActionX8e6c38c9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemReorderedActionX8e6c38c9) {
      encoder.encodeString(value.value)
    }
  }
}
