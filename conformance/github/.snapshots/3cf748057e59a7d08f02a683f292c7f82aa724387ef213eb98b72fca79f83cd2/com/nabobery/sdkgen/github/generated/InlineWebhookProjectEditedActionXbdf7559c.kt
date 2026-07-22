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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-edited/properties/action
 */
@Serializable(with = InlineWebhookProjectEditedActionXbdf7559c.Serializer::class)
public sealed class InlineWebhookProjectEditedActionXbdf7559c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookProjectEditedActionXbdf7559c() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectEditedActionXbdf7559c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectEditedActionXbdf7559c = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectEditedActionXbdf7559c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectEditedActionXbdf7559c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectEditedActionXbdf7559c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectEditedActionXbdf7559c) {
      encoder.encodeString(value.value)
    }
  }
}
