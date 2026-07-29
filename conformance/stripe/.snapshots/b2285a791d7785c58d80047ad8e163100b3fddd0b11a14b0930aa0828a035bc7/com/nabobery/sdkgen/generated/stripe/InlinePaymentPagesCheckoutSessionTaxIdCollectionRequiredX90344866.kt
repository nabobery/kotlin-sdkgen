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
 * Indicates whether a tax ID is required on the payment page
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_tax_id_collection/properties/required
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_supported`.
   */
  public data object IfSupported : InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866() {
    public override val `value`: String = "if_supported"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866 = when (value) {
      IfSupported.value -> IfSupported
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866) {
      encoder.encodeString(value.value)
    }
  }
}
