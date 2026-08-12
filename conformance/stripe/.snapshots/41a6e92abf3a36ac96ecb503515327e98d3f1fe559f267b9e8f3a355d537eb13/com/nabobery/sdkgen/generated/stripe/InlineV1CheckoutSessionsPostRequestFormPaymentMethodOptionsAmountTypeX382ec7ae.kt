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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix/properties/mandate_options/properties/amount_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix/properties/mandate_options/properties/amount_type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae) {
      encoder.encodeString(value.value)
    }
  }
}
