package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/payment_details/properties/customer_reference/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/payment_details/properties/customer_reference/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xc39f784b.Serializer::class)
public sealed class InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xc39f784b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xc39f784b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xc39f784b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xc39f784b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xc39f784b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xc39f784b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xc39f784b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xc39f784b) {
      encoder.encodeString(value.value)
    }
  }
}
