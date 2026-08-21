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
 * State of the release asset.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased/properties/release/properties/assets/ite
 * ms/properties/state
 */
@Serializable(with = InlineWebhookReleasePrereleasedReleaseAssetsItemStateXb4a9e496.Serializer::class)
public sealed class InlineWebhookReleasePrereleasedReleaseAssetsItemStateXb4a9e496 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `uploaded`.
   */
  public data object Uploaded : InlineWebhookReleasePrereleasedReleaseAssetsItemStateXb4a9e496() {
    public override val `value`: String = "uploaded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleasePrereleasedReleaseAssetsItemStateXb4a9e496()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleasePrereleasedReleaseAssetsItemStateXb4a9e496 = when (value) {
      Uploaded.value -> Uploaded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookReleasePrereleasedReleaseAssetsItemStateXb4a9e496> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookReleasePrereleasedReleaseAssetsItemStateXb4a9e496", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleasePrereleasedReleaseAssetsItemStateXb4a9e496 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleasePrereleasedReleaseAssetsItemStateXb4a9e496) {
      encoder.encodeString(value.value)
    }
  }
}
