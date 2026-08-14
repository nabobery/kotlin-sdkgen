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
 * sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/permissions/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/permissions/items
 */
@Serializable(with = InlineFinancialConnectionsAccountPermissionsItemXe49614b2.Serializer::class)
public sealed class InlineFinancialConnectionsAccountPermissionsItemXe49614b2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineFinancialConnectionsAccountPermissionsItemXe49614b2() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineFinancialConnectionsAccountPermissionsItemXe49614b2() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `payment_method`.
   */
  public data object PaymentMethod : InlineFinancialConnectionsAccountPermissionsItemXe49614b2() {
    public override val `value`: String = "payment_method"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineFinancialConnectionsAccountPermissionsItemXe49614b2() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsAccountPermissionsItemXe49614b2()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsAccountPermissionsItemXe49614b2 = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      PaymentMethod.value -> PaymentMethod
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountPermissionsItemXe49614b2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountPermissionsItemXe49614b2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountPermissionsItemXe49614b2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountPermissionsItemXe49614b2) {
      encoder.encodeString(value.value)
    }
  }
}
