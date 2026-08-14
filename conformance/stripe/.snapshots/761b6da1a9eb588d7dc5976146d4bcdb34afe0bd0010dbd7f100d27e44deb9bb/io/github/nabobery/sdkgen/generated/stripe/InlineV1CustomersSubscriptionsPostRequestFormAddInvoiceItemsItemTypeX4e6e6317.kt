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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properti
 * es/end/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properti
 * es/end/properties/type
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `min_item_period_end`.
   */
  public data object MinItemPeriodEnd : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317() {
    public override val `value`: String = "min_item_period_end"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317 = when (value) {
      MinItemPeriodEnd.value -> MinItemPeriodEnd
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX4e6e6317) {
      encoder.encodeString(value.value)
    }
  }
}
