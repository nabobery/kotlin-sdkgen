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
 * If `reversal`, this line item reverses an earlier transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction_line_item/properties/type
 */
@Serializable(with = InlineTaxTransactionLineItemTypeX1a97aa4a.Serializer::class)
public sealed class InlineTaxTransactionLineItemTypeX1a97aa4a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reversal`.
   */
  public data object Reversal : InlineTaxTransactionLineItemTypeX1a97aa4a() {
    public override val `value`: String = "reversal"
  }

  /**
   * Documented value. Wire value: `transaction`.
   */
  public data object Transaction : InlineTaxTransactionLineItemTypeX1a97aa4a() {
    public override val `value`: String = "transaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxTransactionLineItemTypeX1a97aa4a()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxTransactionLineItemTypeX1a97aa4a = when (value) {
      Reversal.value -> Reversal
      Transaction.value -> Transaction
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxTransactionLineItemTypeX1a97aa4a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxTransactionLineItemTypeX1a97aa4a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxTransactionLineItemTypeX1a97aa4a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxTransactionLineItemTypeX1a97aa4a) {
      encoder.encodeString(value.value)
    }
  }
}
