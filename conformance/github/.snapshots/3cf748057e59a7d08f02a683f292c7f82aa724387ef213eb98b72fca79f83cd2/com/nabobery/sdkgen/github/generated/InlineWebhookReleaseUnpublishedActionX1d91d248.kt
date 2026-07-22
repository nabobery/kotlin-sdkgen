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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-unpublished/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-unpublished/properties/action
 */
@Serializable(with = InlineWebhookReleaseUnpublishedActionX1d91d248.Serializer::class)
public sealed class InlineWebhookReleaseUnpublishedActionX1d91d248 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unpublished`.
   */
  public data object Unpublished : InlineWebhookReleaseUnpublishedActionX1d91d248() {
    public override val `value`: String = "unpublished"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleaseUnpublishedActionX1d91d248()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleaseUnpublishedActionX1d91d248 = when (value) {
      Unpublished.value -> Unpublished
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookReleaseUnpublishedActionX1d91d248> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookReleaseUnpublishedActionX1d91d248", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseUnpublishedActionX1d91d248 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseUnpublishedActionX1d91d248) {
      encoder.encodeString(value.value)
    }
  }
}
