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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-deleted/properties/action
 */
@Serializable(with = InlineWebhookProjectDeletedActionX9dd31170.Serializer::class)
public sealed class InlineWebhookProjectDeletedActionX9dd31170 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookProjectDeletedActionX9dd31170() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectDeletedActionX9dd31170()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectDeletedActionX9dd31170 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectDeletedActionX9dd31170> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectDeletedActionX9dd31170", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectDeletedActionX9dd31170 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectDeletedActionX9dd31170) {
      encoder.encodeString(value.value)
    }
  }
}
