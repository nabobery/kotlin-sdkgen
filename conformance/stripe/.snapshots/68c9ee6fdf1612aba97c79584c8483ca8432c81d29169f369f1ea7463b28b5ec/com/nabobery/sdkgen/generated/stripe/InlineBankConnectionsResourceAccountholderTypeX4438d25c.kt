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
 * Type of account holder that this account belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_accountholder/properties/type
 */
@Serializable(with = InlineBankConnectionsResourceAccountholderTypeX4438d25c.Serializer::class)
public sealed class InlineBankConnectionsResourceAccountholderTypeX4438d25c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineBankConnectionsResourceAccountholderTypeX4438d25c() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `customer`.
   */
  public data object Customer : InlineBankConnectionsResourceAccountholderTypeX4438d25c() {
    public override val `value`: String = "customer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankConnectionsResourceAccountholderTypeX4438d25c()

  public companion object {
    public fun fromValue(`value`: String): InlineBankConnectionsResourceAccountholderTypeX4438d25c = when (value) {
      Account.value -> Account
      Customer.value -> Customer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBankConnectionsResourceAccountholderTypeX4438d25c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResourceAccountholderTypeX4438d25c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceAccountholderTypeX4438d25c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResourceAccountholderTypeX4438d25c) {
      encoder.encodeString(value.value)
    }
  }
}
