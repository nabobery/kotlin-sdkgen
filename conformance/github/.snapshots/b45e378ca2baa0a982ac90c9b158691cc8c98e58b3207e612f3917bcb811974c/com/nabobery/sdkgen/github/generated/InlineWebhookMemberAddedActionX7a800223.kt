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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-member-added/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-member-added/properties/action
 */
@Serializable(with = InlineWebhookMemberAddedActionX7a800223.Serializer::class)
public sealed class InlineWebhookMemberAddedActionX7a800223 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `added`.
   */
  public data object Added : InlineWebhookMemberAddedActionX7a800223() {
    public override val `value`: String = "added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMemberAddedActionX7a800223()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMemberAddedActionX7a800223 = when (value) {
      Added.value -> Added
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMemberAddedActionX7a800223> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMemberAddedActionX7a800223", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMemberAddedActionX7a800223 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberAddedActionX7a800223) {
      encoder.encodeString(value.value)
    }
  }
}
