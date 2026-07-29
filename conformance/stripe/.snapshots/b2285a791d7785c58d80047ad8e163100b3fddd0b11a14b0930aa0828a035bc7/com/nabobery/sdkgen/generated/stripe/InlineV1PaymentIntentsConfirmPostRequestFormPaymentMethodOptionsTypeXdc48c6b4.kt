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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properti
 * es/plan/anyOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properti
 * es/plan/anyOf/0/properties/type
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bonus`.
   */
  public data object Bonus : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4() {
    public override val `value`: String = "bonus"
  }

  /**
   * Documented value. Wire value: `fixed_count`.
   */
  public data object FixedCount : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4() {
    public override val `value`: String = "fixed_count"
  }

  /**
   * Documented value. Wire value: `revolving`.
   */
  public data object Revolving : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4() {
    public override val `value`: String = "revolving"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4 = when (value) {
      Bonus.value -> Bonus
      FixedCount.value -> FixedCount
      Revolving.value -> Revolving
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXdc48c6b4) {
      encoder.encodeString(value.value)
    }
  }
}
