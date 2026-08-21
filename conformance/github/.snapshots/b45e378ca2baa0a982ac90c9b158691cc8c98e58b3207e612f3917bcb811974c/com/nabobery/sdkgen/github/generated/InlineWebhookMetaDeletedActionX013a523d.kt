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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted/properties/action
 */
@Serializable(with = InlineWebhookMetaDeletedActionX013a523d.Serializer::class)
public sealed class InlineWebhookMetaDeletedActionX013a523d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookMetaDeletedActionX013a523d() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMetaDeletedActionX013a523d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMetaDeletedActionX013a523d = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMetaDeletedActionX013a523d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMetaDeletedActionX013a523d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMetaDeletedActionX013a523d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMetaDeletedActionX013a523d) {
      encoder.encodeString(value.value)
    }
  }
}
