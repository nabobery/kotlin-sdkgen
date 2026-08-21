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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/action
 */
@Serializable(with = InlineWebhookPackagePublishedActionX5c0b8dc5.Serializer::class)
public sealed class InlineWebhookPackagePublishedActionX5c0b8dc5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineWebhookPackagePublishedActionX5c0b8dc5() {
    public override val `value`: String = "published"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPackagePublishedActionX5c0b8dc5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPackagePublishedActionX5c0b8dc5 = when (value) {
      Published.value -> Published
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPackagePublishedActionX5c0b8dc5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPackagePublishedActionX5c0b8dc5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedActionX5c0b8dc5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedActionX5c0b8dc5) {
      encoder.encodeString(value.value)
    }
  }
}
