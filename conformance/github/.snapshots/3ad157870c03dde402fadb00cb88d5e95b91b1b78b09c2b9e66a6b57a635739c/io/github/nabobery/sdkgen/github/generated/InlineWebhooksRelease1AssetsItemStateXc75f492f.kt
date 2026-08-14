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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_release_1/properties/assets/items/properties/state
 */
@Serializable(with = InlineWebhooksRelease1AssetsItemStateXc75f492f.Serializer::class)
public sealed class InlineWebhooksRelease1AssetsItemStateXc75f492f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `uploaded`.
   */
  public data object Uploaded : InlineWebhooksRelease1AssetsItemStateXc75f492f() {
    public override val `value`: String = "uploaded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRelease1AssetsItemStateXc75f492f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRelease1AssetsItemStateXc75f492f = when (value) {
      Uploaded.value -> Uploaded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksRelease1AssetsItemStateXc75f492f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksRelease1AssetsItemStateXc75f492f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRelease1AssetsItemStateXc75f492f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRelease1AssetsItemStateXc75f492f) {
      encoder.encodeString(value.value)
    }
  }
}
