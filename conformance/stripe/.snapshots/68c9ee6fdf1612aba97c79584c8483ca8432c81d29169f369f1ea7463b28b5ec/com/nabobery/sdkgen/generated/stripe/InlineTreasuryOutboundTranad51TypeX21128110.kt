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
 * The US bank account network used to send funds.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_outbound_transfers_resource_outbound_transfer_resource_trac
 * king_details/properties/type
 */
@Serializable(with = InlineTreasuryOutboundTranad51TypeX21128110.Serializer::class)
public sealed class InlineTreasuryOutboundTranad51TypeX21128110 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineTreasuryOutboundTranad51TypeX21128110() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `us_domestic_wire`.
   */
  public data object UsDomesticWire : InlineTreasuryOutboundTranad51TypeX21128110() {
    public override val `value`: String = "us_domestic_wire"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryOutboundTranad51TypeX21128110()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryOutboundTranad51TypeX21128110 = when (value) {
      Ach.value -> Ach
      UsDomesticWire.value -> UsDomesticWire
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundTranad51TypeX21128110> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryOutboundTranad51TypeX21128110", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundTranad51TypeX21128110 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundTranad51TypeX21128110) {
      encoder.encodeString(value.value)
    }
  }
}
