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
 * If `category` is `cash`, one of:
 *
 * - `checking`
 * - `savings`
 * - `other`
 *
 * If `category` is `credit`, one of:
 *
 * - `mortgage`
 * - `line_of_credit`
 * - `credit_card`
 * - `other`
 *
 * If `category` is `investment` or `other`, this will be `other`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/subcategory
 */
@Serializable(with = InlineFinancialConnectionsAccountSubcategoryX5a1e63f2.Serializer::class)
public sealed class InlineFinancialConnectionsAccountSubcategoryX5a1e63f2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineFinancialConnectionsAccountSubcategoryX5a1e63f2() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `credit_card`.
   */
  public data object CreditCard : InlineFinancialConnectionsAccountSubcategoryX5a1e63f2() {
    public override val `value`: String = "credit_card"
  }

  /**
   * Documented value. Wire value: `line_of_credit`.
   */
  public data object LineOfCredit : InlineFinancialConnectionsAccountSubcategoryX5a1e63f2() {
    public override val `value`: String = "line_of_credit"
  }

  /**
   * Documented value. Wire value: `mortgage`.
   */
  public data object Mortgage : InlineFinancialConnectionsAccountSubcategoryX5a1e63f2() {
    public override val `value`: String = "mortgage"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineFinancialConnectionsAccountSubcategoryX5a1e63f2() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineFinancialConnectionsAccountSubcategoryX5a1e63f2() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsAccountSubcategoryX5a1e63f2()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsAccountSubcategoryX5a1e63f2 = when (value) {
      Checking.value -> Checking
      CreditCard.value -> CreditCard
      LineOfCredit.value -> LineOfCredit
      Mortgage.value -> Mortgage
      Other.value -> Other
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountSubcategoryX5a1e63f2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountSubcategoryX5a1e63f2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountSubcategoryX5a1e63f2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountSubcategoryX5a1e63f2) {
      encoder.encodeString(value.value)
    }
  }
}
