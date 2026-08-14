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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properties/start/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properties/start/properties/type
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_item_period_start`.
   */
  public data object MaxItemPeriodStart : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e() {
    public override val `value`: String = "max_item_period_start"
  }

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e() {
    public override val `value`: String = "now"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e = when (value) {
      MaxItemPeriodStart.value -> MaxItemPeriodStart
      Now.value -> Now
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeX674f511e) {
      encoder.encodeString(value.value)
    }
  }
}
