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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5) {
      encoder.encodeString(value.value)
    }
  }
}
