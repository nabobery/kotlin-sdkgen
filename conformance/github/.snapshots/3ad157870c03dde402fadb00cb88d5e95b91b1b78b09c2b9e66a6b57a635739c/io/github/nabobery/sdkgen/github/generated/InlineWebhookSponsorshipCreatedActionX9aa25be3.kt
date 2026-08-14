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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-created/properties/action
 */
@Serializable(with = InlineWebhookSponsorshipCreatedActionX9aa25be3.Serializer::class)
public sealed class InlineWebhookSponsorshipCreatedActionX9aa25be3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookSponsorshipCreatedActionX9aa25be3() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSponsorshipCreatedActionX9aa25be3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSponsorshipCreatedActionX9aa25be3 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSponsorshipCreatedActionX9aa25be3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSponsorshipCreatedActionX9aa25be3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSponsorshipCreatedActionX9aa25be3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSponsorshipCreatedActionX9aa25be3) {
      encoder.encodeString(value.value)
    }
  }
}
