package io.github.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_release/properties/assets/items/properties/state
 */
@Serializable(with = InlineWebhooksReleaseAssetsItemStateXb33639ee.Serializer::class)
public sealed class InlineWebhooksReleaseAssetsItemStateXb33639ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `uploaded`.
   */
  public data object Uploaded : InlineWebhooksReleaseAssetsItemStateXb33639ee() {
    public override val `value`: String = "uploaded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReleaseAssetsItemStateXb33639ee()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReleaseAssetsItemStateXb33639ee = when (value) {
      Uploaded.value -> Uploaded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksReleaseAssetsItemStateXb33639ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksReleaseAssetsItemStateXb33639ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReleaseAssetsItemStateXb33639ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReleaseAssetsItemStateXb33639ee) {
      encoder.encodeString(value.value)
    }
  }
}
