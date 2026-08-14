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
 * The AmazonPay dispute type, chargeback or claim
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_payment_method_details_amazon_pay/properties/dispute_type
 */
@Serializable(with = InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39.Serializer::class)
public sealed class InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `chargeback`.
   */
  public data object Chargeback : InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39() {
    public override val `value`: String = "chargeback"
  }

  /**
   * Documented value. Wire value: `claim`.
   */
  public data object Claim : InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39() {
    public override val `value`: String = "claim"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39 = when (value) {
      Chargeback.value -> Chargeback
      Claim.value -> Claim
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39) {
      encoder.encodeString(value.value)
    }
  }
}
