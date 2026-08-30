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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_link_account_session_filters/properties/ac
 * count_subcategories/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_link_account_session_filters/properties/ac
 * count_subcategories/items
 */
@Serializable(with = InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421.Serializer::class)
public sealed class InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `credit_card`.
   */
  public data object CreditCard : InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421() {
    public override val `value`: String = "credit_card"
  }

  /**
   * Documented value. Wire value: `line_of_credit`.
   */
  public data object LineOfCredit : InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421() {
    public override val `value`: String = "line_of_credit"
  }

  /**
   * Documented value. Wire value: `mortgage`.
   */
  public data object Mortgage : InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421() {
    public override val `value`: String = "mortgage"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421()

  public companion object {
    public fun fromValue(`value`: String): InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421 = when (value) {
      Checking.value -> Checking
      CreditCard.value -> CreditCard
      LineOfCredit.value -> LineOfCredit
      Mortgage.value -> Mortgage
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421) {
      encoder.encodeString(value.value)
    }
  }
}
