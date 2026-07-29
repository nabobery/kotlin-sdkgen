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
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1refresh/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/features/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1refresh/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/features/items
 */
@Serializable(with = InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c.Serializer::class)
public sealed class InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balance`.
   */
  public data object Balance : InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c() {
    public override val `value`: String = "balance"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c = when (value) {
      Balance.value -> Balance
      Ownership.value -> Ownership
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FinancialConnectionsAccountsRefreshPostRequestFormFeaturesItemXf9dfe27c) {
      encoder.encodeString(value.value)
    }
  }
}
