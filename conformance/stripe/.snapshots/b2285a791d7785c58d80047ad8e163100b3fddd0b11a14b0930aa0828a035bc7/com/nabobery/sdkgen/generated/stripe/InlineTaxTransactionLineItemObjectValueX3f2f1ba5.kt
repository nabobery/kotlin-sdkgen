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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction_line_item/properties/object
 */
@Serializable(with = InlineTaxTransactionLineItemObjectValueX3f2f1ba5.Serializer::class)
public sealed class InlineTaxTransactionLineItemObjectValueX3f2f1ba5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax.transaction_line_item`.
   */
  public data object TaxTransactionLineItem : InlineTaxTransactionLineItemObjectValueX3f2f1ba5() {
    public override val `value`: String = "tax.transaction_line_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxTransactionLineItemObjectValueX3f2f1ba5()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxTransactionLineItemObjectValueX3f2f1ba5 = when (value) {
      TaxTransactionLineItem.value -> TaxTransactionLineItem
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxTransactionLineItemObjectValueX3f2f1ba5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxTransactionLineItemObjectValueX3f2f1ba5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxTransactionLineItemObjectValueX3f2f1ba5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxTransactionLineItemObjectValueX3f2f1ba5) {
      encoder.encodeString(value.value)
    }
  }
}
