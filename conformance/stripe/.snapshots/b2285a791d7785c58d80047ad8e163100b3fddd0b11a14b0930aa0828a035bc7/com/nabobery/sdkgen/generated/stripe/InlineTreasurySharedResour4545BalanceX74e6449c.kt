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
 * Set when `type` is `balance`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_shared_resource_initiating_payment_method_details_initiatin
 * g_payment_method_details/properties/balance
 */
@Serializable(with = InlineTreasurySharedResour4545BalanceX74e6449c.Serializer::class)
public sealed class InlineTreasurySharedResour4545BalanceX74e6449c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payments`.
   */
  public data object Payments : InlineTreasurySharedResour4545BalanceX74e6449c() {
    public override val `value`: String = "payments"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasurySharedResour4545BalanceX74e6449c()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasurySharedResour4545BalanceX74e6449c = when (value) {
      Payments.value -> Payments
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasurySharedResour4545BalanceX74e6449c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasurySharedResour4545BalanceX74e6449c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasurySharedResour4545BalanceX74e6449c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasurySharedResour4545BalanceX74e6449c) {
      encoder.encodeString(value.value)
    }
  }
}
