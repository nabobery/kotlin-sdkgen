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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/action
 */
@Serializable(with = InlineWebhookPackageUpdatedActionX6c46706b.Serializer::class)
public sealed class InlineWebhookPackageUpdatedActionX6c46706b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineWebhookPackageUpdatedActionX6c46706b() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPackageUpdatedActionX6c46706b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPackageUpdatedActionX6c46706b = when (value) {
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPackageUpdatedActionX6c46706b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPackageUpdatedActionX6c46706b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPackageUpdatedActionX6c46706b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackageUpdatedActionX6c46706b) {
      encoder.encodeString(value.value)
    }
  }
}
