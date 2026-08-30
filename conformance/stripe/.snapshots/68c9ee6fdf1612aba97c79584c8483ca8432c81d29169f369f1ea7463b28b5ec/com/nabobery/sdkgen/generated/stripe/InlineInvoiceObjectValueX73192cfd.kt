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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/object
 */
@Serializable(with = InlineInvoiceObjectValueX73192cfd.Serializer::class)
public sealed class InlineInvoiceObjectValueX73192cfd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice`.
   */
  public data object Invoice : InlineInvoiceObjectValueX73192cfd() {
    public override val `value`: String = "invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceObjectValueX73192cfd()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceObjectValueX73192cfd = when (value) {
      Invoice.value -> Invoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceObjectValueX73192cfd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoiceObjectValueX73192cfd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceObjectValueX73192cfd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceObjectValueX73192cfd) {
      encoder.encodeString(value.value)
    }
  }
}
