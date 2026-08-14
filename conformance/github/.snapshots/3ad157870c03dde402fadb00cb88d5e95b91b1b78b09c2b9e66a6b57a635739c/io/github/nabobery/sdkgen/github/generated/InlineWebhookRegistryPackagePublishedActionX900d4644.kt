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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/action
 */
@Serializable(with = InlineWebhookRegistryPackagePublishedActionX900d4644.Serializer::class)
public sealed class InlineWebhookRegistryPackagePublishedActionX900d4644 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineWebhookRegistryPackagePublishedActionX900d4644() {
    public override val `value`: String = "published"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRegistryPackagePublishedActionX900d4644()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRegistryPackagePublishedActionX900d4644 = when (value) {
      Published.value -> Published
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackagePublishedActionX900d4644> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookRegistryPackagePublishedActionX900d4644", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackagePublishedActionX900d4644 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackagePublishedActionX900d4644) {
      encoder.encodeString(value.value)
    }
  }
}
