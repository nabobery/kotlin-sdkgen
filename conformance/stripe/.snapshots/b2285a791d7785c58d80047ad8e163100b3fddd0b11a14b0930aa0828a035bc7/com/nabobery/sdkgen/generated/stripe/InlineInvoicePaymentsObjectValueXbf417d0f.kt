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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/payments/properties/object
 */
@Serializable(with = InlineInvoicePaymentsObjectValueXbf417d0f.Serializer::class)
public sealed class InlineInvoicePaymentsObjectValueXbf417d0f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineInvoicePaymentsObjectValueXbf417d0f() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicePaymentsObjectValueXbf417d0f()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicePaymentsObjectValueXbf417d0f = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoicePaymentsObjectValueXbf417d0f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentsObjectValueXbf417d0f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentsObjectValueXbf417d0f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentsObjectValueXbf417d0f) {
      encoder.encodeString(value.value)
    }
  }
}
