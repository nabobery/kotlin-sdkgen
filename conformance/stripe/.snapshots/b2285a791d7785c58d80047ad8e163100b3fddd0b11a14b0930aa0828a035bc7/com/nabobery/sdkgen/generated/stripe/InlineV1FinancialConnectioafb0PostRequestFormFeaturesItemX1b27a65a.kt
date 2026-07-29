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
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1unsubscribe/post/requestBody/co
 * ntent/application~1x-www-form-urlencoded/schema/properties/features/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1accounts~1{account}~1unsubscribe/post/requestBody/co
 * ntent/application~1x-www-form-urlencoded/schema/properties/features/items
 */
@Serializable(with = InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a.Serializer::class)
public sealed class InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a = when (value) {
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FinancialConnectioafb0PostRequestFormFeaturesItemX1b27a65a) {
      encoder.encodeString(value.value)
    }
  }
}
