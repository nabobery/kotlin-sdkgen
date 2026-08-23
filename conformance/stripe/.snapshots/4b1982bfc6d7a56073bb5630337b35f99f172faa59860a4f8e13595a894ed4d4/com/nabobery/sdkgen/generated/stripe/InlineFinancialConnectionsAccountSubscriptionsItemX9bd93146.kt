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
 * sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/subscriptions/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/subscriptions/items
 */
@Serializable(with = InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146.Serializer::class)
public sealed class InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146 = when (value) {
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146) {
      encoder.encodeString(value.value)
    }
  }
}
