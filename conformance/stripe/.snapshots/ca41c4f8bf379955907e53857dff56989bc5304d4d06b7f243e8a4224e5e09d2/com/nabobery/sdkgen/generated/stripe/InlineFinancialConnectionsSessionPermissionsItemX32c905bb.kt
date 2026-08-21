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
 * sdkgen://source/openapi.json#/components/schemas/financial_connections.session/properties/permissions/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.session/properties/permissions/items
 */
@Serializable(with = InlineFinancialConnectionsSessionPermissionsItemX32c905bb.Serializer::class)
public sealed class InlineFinancialConnectionsSessionPermissionsItemX32c905bb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineFinancialConnectionsSessionPermissionsItemX32c905bb() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineFinancialConnectionsSessionPermissionsItemX32c905bb() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `payment_method`.
   */
  public data object PaymentMethod : InlineFinancialConnectionsSessionPermissionsItemX32c905bb() {
    public override val `value`: String = "payment_method"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineFinancialConnectionsSessionPermissionsItemX32c905bb() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsSessionPermissionsItemX32c905bb()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsSessionPermissionsItemX32c905bb = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      PaymentMethod.value -> PaymentMethod
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsSessionPermissionsItemX32c905bb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsSessionPermissionsItemX32c905bb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsSessionPermissionsItemX32c905bb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsSessionPermissionsItemX32c905bb) {
      encoder.encodeString(value.value)
    }
  }
}
