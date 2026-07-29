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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1invoice_payments/get/parameters/7/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoice_payments/get/parameters/7/schema
 */
@Serializable(with = InlineV1InvoicePaymentsGetParameterX6fbcf43a.Serializer::class)
public sealed class InlineV1InvoicePaymentsGetParameterX6fbcf43a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1InvoicePaymentsGetParameterX6fbcf43a() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineV1InvoicePaymentsGetParameterX6fbcf43a() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `paid`.
   */
  public data object Paid : InlineV1InvoicePaymentsGetParameterX6fbcf43a() {
    public override val `value`: String = "paid"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicePaymentsGetParameterX6fbcf43a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicePaymentsGetParameterX6fbcf43a = when (value) {
      Canceled.value -> Canceled
      Open.value -> Open
      Paid.value -> Paid
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicePaymentsGetParameterX6fbcf43a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicePaymentsGetParameterX6fbcf43a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicePaymentsGetParameterX6fbcf43a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicePaymentsGetParameterX6fbcf43a) {
      encoder.encodeString(value.value)
    }
  }
}
