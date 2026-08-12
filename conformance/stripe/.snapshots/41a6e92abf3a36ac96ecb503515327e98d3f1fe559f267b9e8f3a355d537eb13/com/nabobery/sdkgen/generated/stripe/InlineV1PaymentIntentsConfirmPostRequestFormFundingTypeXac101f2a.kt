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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/funding_t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/funding_t
 * ype
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormFundingTypeXac101f2a.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormFundingTypeXac101f2a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_transfer`.
   */
  public data object BankTransfer : InlineV1PaymentIntentsConfirmPostRequestFormFundingTypeXac101f2a() {
    public override val `value`: String = "bank_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormFundingTypeXac101f2a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormFundingTypeXac101f2a = when (value) {
      BankTransfer.value -> BankTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormFundingTypeXac101f2a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormFundingTypeXac101f2a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormFundingTypeXac101f2a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormFundingTypeXac101f2a) {
      encoder.encodeString(value.value)
    }
  }
}
