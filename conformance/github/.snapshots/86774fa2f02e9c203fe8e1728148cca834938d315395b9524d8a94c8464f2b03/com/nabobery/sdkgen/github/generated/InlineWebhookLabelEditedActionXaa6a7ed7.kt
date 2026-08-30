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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited/properties/action
 */
@Serializable(with = InlineWebhookLabelEditedActionXaa6a7ed7.Serializer::class)
public sealed class InlineWebhookLabelEditedActionXaa6a7ed7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookLabelEditedActionXaa6a7ed7() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookLabelEditedActionXaa6a7ed7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookLabelEditedActionXaa6a7ed7 = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookLabelEditedActionXaa6a7ed7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookLabelEditedActionXaa6a7ed7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookLabelEditedActionXaa6a7ed7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookLabelEditedActionXaa6a7ed7) {
      encoder.encodeString(value.value)
    }
  }
}
