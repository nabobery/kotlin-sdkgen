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
 * Specifies whether the `amount` includes taxes. If `tax_behavior=inclusive`, then the amount includes taxes.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction_line_item/properties/tax_behavior
 */
@Serializable(with = InlineTaxTransactionLineItemTaxBehaviorXe0d015ed.Serializer::class)
public sealed class InlineTaxTransactionLineItemTaxBehaviorXe0d015ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineTaxTransactionLineItemTaxBehaviorXe0d015ed() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineTaxTransactionLineItemTaxBehaviorXe0d015ed() {
    public override val `value`: String = "inclusive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxTransactionLineItemTaxBehaviorXe0d015ed()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxTransactionLineItemTaxBehaviorXe0d015ed = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxTransactionLineItemTaxBehaviorXe0d015ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxTransactionLineItemTaxBehaviorXe0d015ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxTransactionLineItemTaxBehaviorXe0d015ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxTransactionLineItemTaxBehaviorXe0d015ed) {
      encoder.encodeString(value.value)
    }
  }
}
