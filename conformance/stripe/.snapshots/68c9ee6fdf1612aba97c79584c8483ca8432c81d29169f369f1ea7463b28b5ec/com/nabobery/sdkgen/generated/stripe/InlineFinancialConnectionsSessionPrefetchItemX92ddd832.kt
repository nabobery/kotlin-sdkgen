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
 * sdkgen://source/openapi.json#/components/schemas/financial_connections.session/properties/prefetch/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.session/properties/prefetch/items
 */
@Serializable(with = InlineFinancialConnectionsSessionPrefetchItemX92ddd832.Serializer::class)
public sealed class InlineFinancialConnectionsSessionPrefetchItemX92ddd832 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineFinancialConnectionsSessionPrefetchItemX92ddd832() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineFinancialConnectionsSessionPrefetchItemX92ddd832() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineFinancialConnectionsSessionPrefetchItemX92ddd832() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsSessionPrefetchItemX92ddd832()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsSessionPrefetchItemX92ddd832 = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsSessionPrefetchItemX92ddd832> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsSessionPrefetchItemX92ddd832", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsSessionPrefetchItemX92ddd832 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsSessionPrefetchItemX92ddd832) {
      encoder.encodeString(value.value)
    }
  }
}
