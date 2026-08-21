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
 * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay this
 * invoice using the default source attached to the customer. When sending an invoice, Stripe will email this invoice to
 * the customer with payment instructions.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/collection_method
 */
@Serializable(with = InlineInvoiceCollectionMethodX6027ccc9.Serializer::class)
public sealed class InlineInvoiceCollectionMethodX6027ccc9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineInvoiceCollectionMethodX6027ccc9() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineInvoiceCollectionMethodX6027ccc9() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceCollectionMethodX6027ccc9()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceCollectionMethodX6027ccc9 = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceCollectionMethodX6027ccc9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoiceCollectionMethodX6027ccc9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceCollectionMethodX6027ccc9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceCollectionMethodX6027ccc9) {
      encoder.encodeString(value.value)
    }
  }
}
