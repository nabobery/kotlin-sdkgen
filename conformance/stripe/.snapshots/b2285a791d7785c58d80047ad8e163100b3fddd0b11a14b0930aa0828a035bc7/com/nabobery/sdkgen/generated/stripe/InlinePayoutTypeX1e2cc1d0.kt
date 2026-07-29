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
 * Can be `bank_account` or `card`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/type
 */
@Serializable(with = InlinePayoutTypeX1e2cc1d0.Serializer::class)
public sealed class InlinePayoutTypeX1e2cc1d0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account`.
   */
  public data object BankAccount : InlinePayoutTypeX1e2cc1d0() {
    public override val `value`: String = "bank_account"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlinePayoutTypeX1e2cc1d0() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePayoutTypeX1e2cc1d0()

  public companion object {
    public fun fromValue(`value`: String): InlinePayoutTypeX1e2cc1d0 = when (value) {
      BankAccount.value -> BankAccount
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePayoutTypeX1e2cc1d0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePayoutTypeX1e2cc1d0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePayoutTypeX1e2cc1d0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePayoutTypeX1e2cc1d0) {
      encoder.encodeString(value.value)
    }
  }
}
