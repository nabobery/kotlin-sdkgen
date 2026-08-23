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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-deleted/properties/action
 */
@Serializable(with = InlineWebhookReleaseDeletedActionX24a00bdf.Serializer::class)
public sealed class InlineWebhookReleaseDeletedActionX24a00bdf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookReleaseDeletedActionX24a00bdf() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleaseDeletedActionX24a00bdf()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleaseDeletedActionX24a00bdf = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookReleaseDeletedActionX24a00bdf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookReleaseDeletedActionX24a00bdf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseDeletedActionX24a00bdf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseDeletedActionX24a00bdf) {
      encoder.encodeString(value.value)
    }
  }
}
