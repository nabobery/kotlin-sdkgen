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
 * The rails used to send the funds.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_credit/properties/network
 */
@Serializable(with = InlineTreasuryReceivedCreditNetworkXdca8dbfb.Serializer::class)
public sealed class InlineTreasuryReceivedCreditNetworkXdca8dbfb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineTreasuryReceivedCreditNetworkXdca8dbfb() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineTreasuryReceivedCreditNetworkXdca8dbfb() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlineTreasuryReceivedCreditNetworkXdca8dbfb() {
    public override val `value`: String = "stripe"
  }

  /**
   * Documented value. Wire value: `us_domestic_wire`.
   */
  public data object UsDomesticWire : InlineTreasuryReceivedCreditNetworkXdca8dbfb() {
    public override val `value`: String = "us_domestic_wire"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedCreditNetworkXdca8dbfb()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedCreditNetworkXdca8dbfb = when (value) {
      Ach.value -> Ach
      Card.value -> Card
      Stripe.value -> Stripe
      UsDomesticWire.value -> UsDomesticWire
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryReceivedCreditNetworkXdca8dbfb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedCreditNetworkXdca8dbfb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedCreditNetworkXdca8dbfb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedCreditNetworkXdca8dbfb) {
      encoder.encodeString(value.value)
    }
  }
}
