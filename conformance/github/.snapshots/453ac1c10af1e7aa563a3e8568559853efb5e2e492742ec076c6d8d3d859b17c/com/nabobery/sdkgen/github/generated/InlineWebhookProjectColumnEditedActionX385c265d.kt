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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-edited/properties/action
 */
@Serializable(with = InlineWebhookProjectColumnEditedActionX385c265d.Serializer::class)
public sealed class InlineWebhookProjectColumnEditedActionX385c265d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookProjectColumnEditedActionX385c265d() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectColumnEditedActionX385c265d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectColumnEditedActionX385c265d = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectColumnEditedActionX385c265d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectColumnEditedActionX385c265d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectColumnEditedActionX385c265d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectColumnEditedActionX385c265d) {
      encoder.encodeString(value.value)
    }
  }
}
