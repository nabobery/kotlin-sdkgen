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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1invoices/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoices/get/parameters/0/schema
 */
@Serializable(with = InlineV1InvoicesGetParameterX615bb39b.Serializer::class)
public sealed class InlineV1InvoicesGetParameterX615bb39b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineV1InvoicesGetParameterX615bb39b() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineV1InvoicesGetParameterX615bb39b() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesGetParameterX615bb39b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesGetParameterX615bb39b = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesGetParameterX615bb39b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesGetParameterX615bb39b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesGetParameterX615bb39b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesGetParameterX615bb39b) {
      encoder.encodeString(value.value)
    }
  }
}
