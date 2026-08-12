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
 * If `reversal`, this transaction reverses an earlier transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction/properties/type
 */
@Serializable(with = InlineTaxTransactionTypeXc9b6780b.Serializer::class)
public sealed class InlineTaxTransactionTypeXc9b6780b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reversal`.
   */
  public data object Reversal : InlineTaxTransactionTypeXc9b6780b() {
    public override val `value`: String = "reversal"
  }

  /**
   * Documented value. Wire value: `transaction`.
   */
  public data object Transaction : InlineTaxTransactionTypeXc9b6780b() {
    public override val `value`: String = "transaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxTransactionTypeXc9b6780b()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxTransactionTypeXc9b6780b = when (value) {
      Reversal.value -> Reversal
      Transaction.value -> Transaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxTransactionTypeXc9b6780b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxTransactionTypeXc9b6780b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxTransactionTypeXc9b6780b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxTransactionTypeXc9b6780b) {
      encoder.encodeString(value.value)
    }
  }
}
