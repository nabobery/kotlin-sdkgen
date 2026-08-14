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
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/to_postal_code/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/to_postal_code/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c.Serializer::class)
public sealed class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c) {
      encoder.encodeString(value.value)
    }
  }
}
