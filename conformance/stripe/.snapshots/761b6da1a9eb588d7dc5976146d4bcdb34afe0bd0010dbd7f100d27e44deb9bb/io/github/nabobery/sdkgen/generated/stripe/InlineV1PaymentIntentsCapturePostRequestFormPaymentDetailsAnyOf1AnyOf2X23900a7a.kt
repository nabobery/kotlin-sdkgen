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
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0/properties/customer_reference/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0/properties/customer_reference/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2X23900a7a.Serializer::class)
public sealed class InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2X23900a7a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2X23900a7a() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2X23900a7a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2X23900a7a = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2X23900a7a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2X23900a7a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2X23900a7a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2X23900a7a) {
      encoder.encodeString(value.value)
    }
  }
}
