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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_payment/properties/object
 */
@Serializable(with = InlineInvoicePaymentObjectValueX4efe6dee.Serializer::class)
public sealed class InlineInvoicePaymentObjectValueX4efe6dee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice_payment`.
   */
  public data object InvoicePayment : InlineInvoicePaymentObjectValueX4efe6dee() {
    public override val `value`: String = "invoice_payment"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicePaymentObjectValueX4efe6dee()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicePaymentObjectValueX4efe6dee = when (value) {
      InvoicePayment.value -> InvoicePayment
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicePaymentObjectValueX4efe6dee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentObjectValueX4efe6dee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentObjectValueX4efe6dee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentObjectValueX4efe6dee) {
      encoder.encodeString(value.value)
    }
  }
}
