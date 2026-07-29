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
 * Whether to save the payment method after a payment is completed for a one-time invoice or a subscription invoice when
 * the customer already has a default payment method on the hosted invoice page.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/account_invoices_settings/properties/hosted_payment_method_save
 */
@Serializable(with = InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523.Serializer::class)
public sealed class InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523() {
    public override val `value`: String = "never"
  }

  /**
   * Documented value. Wire value: `offer`.
   */
  public data object Offer : InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523() {
    public override val `value`: String = "offer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523 = when (value) {
      Always.value -> Always
      Never.value -> Never
      Offer.value -> Offer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523) {
      encoder.encodeString(value.value)
    }
  }
}
