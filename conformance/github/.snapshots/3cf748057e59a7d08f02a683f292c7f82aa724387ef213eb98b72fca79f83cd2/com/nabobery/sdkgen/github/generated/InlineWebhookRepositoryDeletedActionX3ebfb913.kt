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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-deleted/properties/action
 */
@Serializable(with = InlineWebhookRepositoryDeletedActionX3ebfb913.Serializer::class)
public sealed class InlineWebhookRepositoryDeletedActionX3ebfb913 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookRepositoryDeletedActionX3ebfb913() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryDeletedActionX3ebfb913()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryDeletedActionX3ebfb913 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryDeletedActionX3ebfb913> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookRepositoryDeletedActionX3ebfb913", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryDeletedActionX3ebfb913 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryDeletedActionX3ebfb913) {
      encoder.encodeString(value.value)
    }
  }
}
