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
 * The type of Git ref object deleted in the repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-delete/properties/ref_type
 */
@Serializable(with = InlineWebhookDeleteRefTypeX906d8e51.Serializer::class)
public sealed class InlineWebhookDeleteRefTypeX906d8e51 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tag`.
   */
  public data object Tag : InlineWebhookDeleteRefTypeX906d8e51() {
    public override val `value`: String = "tag"
  }

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineWebhookDeleteRefTypeX906d8e51() {
    public override val `value`: String = "branch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeleteRefTypeX906d8e51()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeleteRefTypeX906d8e51 = when (value) {
      Tag.value -> Tag
      Branch.value -> Branch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeleteRefTypeX906d8e51> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeleteRefTypeX906d8e51", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeleteRefTypeX906d8e51 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeleteRefTypeX906d8e51) {
      encoder.encodeString(value.value)
    }
  }
}
