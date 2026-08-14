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
 * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay invoices at
 * the end of the subscription cycle or at invoice finalization using the default payment method attached to the
 * subscription or customer. When sending an invoice, Stripe will email your customer an invoice with payment
 * instructions and mark the subscription as `active`. Defaults to `charge_automatically`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/collection_method
 */
@Serializable(with = InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8 = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8) {
      encoder.encodeString(value.value)
    }
  }
}
