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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn/properties/action
 */
@Serializable(with = InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7.Serializer::class)
public sealed class InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `withdrawn`.
   */
  public data object Withdrawn : InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7() {
    public override val `value`: String = "withdrawn"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7 = when (value) {
      Withdrawn.value -> Withdrawn
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7) {
      encoder.encodeString(value.value)
    }
  }
}
