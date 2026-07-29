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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-member-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-member-edited/properties/action
 */
@Serializable(with = InlineWebhookMemberEditedActionX7d5ee843.Serializer::class)
public sealed class InlineWebhookMemberEditedActionX7d5ee843 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookMemberEditedActionX7d5ee843() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMemberEditedActionX7d5ee843()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMemberEditedActionX7d5ee843 = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMemberEditedActionX7d5ee843> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMemberEditedActionX7d5ee843", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMemberEditedActionX7d5ee843 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberEditedActionX7d5ee843) {
      encoder.encodeString(value.value)
    }
  }
}
