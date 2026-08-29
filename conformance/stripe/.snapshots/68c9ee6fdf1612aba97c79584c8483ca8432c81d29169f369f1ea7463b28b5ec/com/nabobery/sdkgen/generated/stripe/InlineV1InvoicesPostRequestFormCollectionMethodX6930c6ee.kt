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
 * the customer with payment instructions. Defaults to `charge_automatically`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/collection_method
 */
@Serializable(with = InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee) {
      encoder.encodeString(value.value)
    }
  }
}
