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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-updated/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-updated/properties/action
 */
@Serializable(with = InlineWebhookSecurityAdvisoryUpdatedActionXe0603f6f.Serializer::class)
public sealed class InlineWebhookSecurityAdvisoryUpdatedActionXe0603f6f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineWebhookSecurityAdvisoryUpdatedActionXe0603f6f() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecurityAdvisoryUpdatedActionXe0603f6f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecurityAdvisoryUpdatedActionXe0603f6f = when (value) {
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecurityAdvisoryUpdatedActionXe0603f6f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSecurityAdvisoryUpdatedActionXe0603f6f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAdvisoryUpdatedActionXe0603f6f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAdvisoryUpdatedActionXe0603f6f) {
      encoder.encodeString(value.value)
    }
  }
}
