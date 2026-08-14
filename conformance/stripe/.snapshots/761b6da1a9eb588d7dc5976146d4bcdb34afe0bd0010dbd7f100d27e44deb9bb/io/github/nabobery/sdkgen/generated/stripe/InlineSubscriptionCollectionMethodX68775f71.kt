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
 * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay this
 * subscription at the end of the cycle using the default source attached to the customer. When sending an invoice,
 * Stripe will email your customer an invoice with payment instructions and mark the subscription as `active`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/collection_method
 */
@Serializable(with = InlineSubscriptionCollectionMethodX68775f71.Serializer::class)
public sealed class InlineSubscriptionCollectionMethodX68775f71 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineSubscriptionCollectionMethodX68775f71() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineSubscriptionCollectionMethodX68775f71() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionCollectionMethodX68775f71()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionCollectionMethodX68775f71 = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionCollectionMethodX68775f71> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionCollectionMethodX68775f71", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionCollectionMethodX68775f71 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionCollectionMethodX68775f71) {
      encoder.encodeString(value.value)
    }
  }
}
