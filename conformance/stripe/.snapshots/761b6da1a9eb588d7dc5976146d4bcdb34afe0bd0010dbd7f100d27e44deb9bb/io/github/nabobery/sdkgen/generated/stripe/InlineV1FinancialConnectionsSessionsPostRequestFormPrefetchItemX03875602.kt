package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/prefetch/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/prefetch/items
 */
@Serializable(with = InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602.Serializer::class)
public sealed class InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602 = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FinancialConnectionsSessionsPostRequestFormPrefetchItemX03875602) {
      encoder.encodeString(value.value)
    }
  }
}
