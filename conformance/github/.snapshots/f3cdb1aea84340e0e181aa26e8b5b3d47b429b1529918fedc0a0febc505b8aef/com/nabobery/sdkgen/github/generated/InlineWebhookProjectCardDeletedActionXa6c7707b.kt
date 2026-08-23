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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-deleted/properties/action
 */
@Serializable(with = InlineWebhookProjectCardDeletedActionXa6c7707b.Serializer::class)
public sealed class InlineWebhookProjectCardDeletedActionXa6c7707b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookProjectCardDeletedActionXa6c7707b() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectCardDeletedActionXa6c7707b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectCardDeletedActionXa6c7707b = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardDeletedActionXa6c7707b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectCardDeletedActionXa6c7707b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardDeletedActionXa6c7707b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardDeletedActionXa6c7707b) {
      encoder.encodeString(value.value)
    }
  }
}
