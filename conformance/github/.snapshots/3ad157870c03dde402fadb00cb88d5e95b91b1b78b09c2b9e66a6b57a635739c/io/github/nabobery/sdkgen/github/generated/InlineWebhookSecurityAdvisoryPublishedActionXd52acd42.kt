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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-published/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-published/properties/action
 */
@Serializable(with = InlineWebhookSecurityAdvisoryPublishedActionXd52acd42.Serializer::class)
public sealed class InlineWebhookSecurityAdvisoryPublishedActionXd52acd42 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineWebhookSecurityAdvisoryPublishedActionXd52acd42() {
    public override val `value`: String = "published"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecurityAdvisoryPublishedActionXd52acd42()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecurityAdvisoryPublishedActionXd52acd42 = when (value) {
      Published.value -> Published
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecurityAdvisoryPublishedActionXd52acd42> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSecurityAdvisoryPublishedActionXd52acd42", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAdvisoryPublishedActionXd52acd42 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAdvisoryPublishedActionXd52acd42) {
      encoder.encodeString(value.value)
    }
  }
}
