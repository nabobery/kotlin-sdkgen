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
 * Either `charge_automatically` or `send_invoice`. This field can be updated only on `draft` invoices.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/collection_method
 */
@Serializable(with = InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c) {
      encoder.encodeString(value.value)
    }
  }
}
