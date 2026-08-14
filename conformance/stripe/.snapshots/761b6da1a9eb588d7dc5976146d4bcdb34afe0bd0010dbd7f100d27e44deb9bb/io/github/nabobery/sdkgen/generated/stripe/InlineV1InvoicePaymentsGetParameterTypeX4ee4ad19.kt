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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoice_payments/get/parameters/5/schema/properties/type.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoice_payments/get/parameters/5/schema/properties/type
 */
@Serializable(with = InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19.Serializer::class)
public sealed class InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_intent`.
   */
  public data object PaymentIntent : InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19() {
    public override val `value`: String = "payment_intent"
  }

  /**
   * Documented value. Wire value: `payment_record`.
   */
  public data object PaymentRecord : InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19() {
    public override val `value`: String = "payment_record"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19 = when (value) {
      PaymentIntent.value -> PaymentIntent
      PaymentRecord.value -> PaymentRecord
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19) {
      encoder.encodeString(value.value)
    }
  }
}
