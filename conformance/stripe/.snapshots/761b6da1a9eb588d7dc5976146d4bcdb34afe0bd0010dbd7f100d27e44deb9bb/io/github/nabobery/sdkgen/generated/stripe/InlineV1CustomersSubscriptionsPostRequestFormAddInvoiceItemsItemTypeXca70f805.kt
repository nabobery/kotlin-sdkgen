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
 * es/start/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properti
 * es/start/properties/type
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_item_period_start`.
   */
  public data object MaxItemPeriodStart : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805() {
    public override val `value`: String = "max_item_period_start"
  }

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805() {
    public override val `value`: String = "now"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805 = when (value) {
      MaxItemPeriodStart.value -> MaxItemPeriodStart
      Now.value -> Now
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805) {
      encoder.encodeString(value.value)
    }
  }
}
