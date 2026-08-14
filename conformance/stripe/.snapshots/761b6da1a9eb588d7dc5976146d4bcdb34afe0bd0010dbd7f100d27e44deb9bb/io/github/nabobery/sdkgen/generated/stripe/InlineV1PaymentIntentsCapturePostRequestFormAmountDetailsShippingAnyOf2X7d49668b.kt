package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/from_postal_code/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/from_postal_code/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b.Serializer::class)
public sealed class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b) {
      encoder.encodeString(value.value)
    }
  }
}
