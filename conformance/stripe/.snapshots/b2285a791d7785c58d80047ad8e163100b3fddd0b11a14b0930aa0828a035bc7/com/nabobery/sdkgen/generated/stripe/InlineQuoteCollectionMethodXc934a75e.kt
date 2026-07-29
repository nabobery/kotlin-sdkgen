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
 * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay invoices at
 * the end of the subscription cycle or on finalization using the default payment method attached to the subscription or
 * customer. When sending an invoice, Stripe will email your customer an invoice with payment instructions and mark the
 * subscription as `active`. Defaults to `charge_automatically`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/collection_method
 */
@Serializable(with = InlineQuoteCollectionMethodXc934a75e.Serializer::class)
public sealed class InlineQuoteCollectionMethodXc934a75e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineQuoteCollectionMethodXc934a75e() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineQuoteCollectionMethodXc934a75e() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineQuoteCollectionMethodXc934a75e()

  public companion object {
    public fun fromValue(`value`: String): InlineQuoteCollectionMethodXc934a75e = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineQuoteCollectionMethodXc934a75e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineQuoteCollectionMethodXc934a75e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineQuoteCollectionMethodXc934a75e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineQuoteCollectionMethodXc934a75e) {
      encoder.encodeString(value.value)
    }
  }
}
