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
 * The type of parent that generated this invoice item
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoice_item_parents_invoice_item_parent/prope
 * rties/type
 */
@Serializable(with = InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4.Serializer::class)
public sealed class InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `subscription_details`.
   */
  public data object SubscriptionDetails : InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4() {
    public override val `value`: String = "subscription_details"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4 = when (value) {
      SubscriptionDetails.value -> SubscriptionDetails
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceInvoiceItemParentsInvoiceItemParentTypeX0bce03c4) {
      encoder.encodeString(value.value)
    }
  }
}
