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
 * subscription at the end of the cycle using the default source attached to the customer. When sending an invoice,
 * Stripe will email your customer an invoice with payment instructions and mark the subscription as `active`. Defaults
 * to `charge_automatically`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/collection_method
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43 = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormCollectionMethodXaaab4e43) {
      encoder.encodeString(value.value)
    }
  }
}
