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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_invoice/properties/object
 */
@Serializable(with = InlineDeletedInvoiceObjectValueXaf8c3dcd.Serializer::class)
public sealed class InlineDeletedInvoiceObjectValueXaf8c3dcd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice`.
   */
  public data object Invoice : InlineDeletedInvoiceObjectValueXaf8c3dcd() {
    public override val `value`: String = "invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedInvoiceObjectValueXaf8c3dcd()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedInvoiceObjectValueXaf8c3dcd = when (value) {
      Invoice.value -> Invoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedInvoiceObjectValueXaf8c3dcd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedInvoiceObjectValueXaf8c3dcd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedInvoiceObjectValueXaf8c3dcd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedInvoiceObjectValueXaf8c3dcd) {
      encoder.encodeString(value.value)
    }
  }
}
