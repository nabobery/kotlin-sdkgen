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
 * The network used for the ReceivedDebit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_debit/properties/network
 */
@Serializable(with = InlineTreasuryReceivedDebitNetworkX92a873d8.Serializer::class)
public sealed class InlineTreasuryReceivedDebitNetworkX92a873d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineTreasuryReceivedDebitNetworkX92a873d8() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineTreasuryReceivedDebitNetworkX92a873d8() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlineTreasuryReceivedDebitNetworkX92a873d8() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedDebitNetworkX92a873d8()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedDebitNetworkX92a873d8 = when (value) {
      Ach.value -> Ach
      Card.value -> Card
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryReceivedDebitNetworkX92a873d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedDebitNetworkX92a873d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedDebitNetworkX92a873d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedDebitNetworkX92a873d8) {
      encoder.encodeString(value.value)
    }
  }
}
