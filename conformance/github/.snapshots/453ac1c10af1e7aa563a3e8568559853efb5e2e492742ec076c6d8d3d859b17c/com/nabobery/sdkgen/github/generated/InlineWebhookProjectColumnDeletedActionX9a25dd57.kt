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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-deleted/properties/action
 */
@Serializable(with = InlineWebhookProjectColumnDeletedActionX9a25dd57.Serializer::class)
public sealed class InlineWebhookProjectColumnDeletedActionX9a25dd57 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookProjectColumnDeletedActionX9a25dd57() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectColumnDeletedActionX9a25dd57()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectColumnDeletedActionX9a25dd57 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectColumnDeletedActionX9a25dd57> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectColumnDeletedActionX9a25dd57", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectColumnDeletedActionX9a25dd57 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectColumnDeletedActionX9a25dd57) {
      encoder.encodeString(value.value)
    }
  }
}
