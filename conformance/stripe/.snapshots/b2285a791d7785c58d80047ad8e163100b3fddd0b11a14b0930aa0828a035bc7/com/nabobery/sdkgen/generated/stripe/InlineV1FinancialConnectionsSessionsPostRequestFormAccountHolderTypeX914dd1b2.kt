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
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/account_holder/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/account_holder/properties/type
 */
@Serializable(with = InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2.Serializer::class)
public sealed class InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `customer`.
   */
  public data object Customer : InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2() {
    public override val `value`: String = "customer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2 = when (value) {
      Account.value -> Account
      Customer.value -> Customer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FinancialConnectionsSessionsPostRequestFormAccountHolderTypeX914dd1b2) {
      encoder.encodeString(value.value)
    }
  }
}
