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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/action
 */
@Serializable(with = InlineWebhookReleaseEditedActionX692a0bdc.Serializer::class)
public sealed class InlineWebhookReleaseEditedActionX692a0bdc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookReleaseEditedActionX692a0bdc() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleaseEditedActionX692a0bdc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleaseEditedActionX692a0bdc = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookReleaseEditedActionX692a0bdc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookReleaseEditedActionX692a0bdc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseEditedActionX692a0bdc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseEditedActionX692a0bdc) {
      encoder.encodeString(value.value)
    }
  }
}
