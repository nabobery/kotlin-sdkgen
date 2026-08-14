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
 * The US bank account network used to send funds.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_outbound_payments_resource_outbound_payment_resource_tracki
 * ng_details/properties/type
 */
@Serializable(with = InlineTreasuryOutboundPaym5d35TypeXf770e912.Serializer::class)
public sealed class InlineTreasuryOutboundPaym5d35TypeXf770e912 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineTreasuryOutboundPaym5d35TypeXf770e912() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `us_domestic_wire`.
   */
  public data object UsDomesticWire : InlineTreasuryOutboundPaym5d35TypeXf770e912() {
    public override val `value`: String = "us_domestic_wire"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryOutboundPaym5d35TypeXf770e912()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryOutboundPaym5d35TypeXf770e912 = when (value) {
      Ach.value -> Ach
      UsDomesticWire.value -> UsDomesticWire
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundPaym5d35TypeXf770e912> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryOutboundPaym5d35TypeXf770e912", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaym5d35TypeXf770e912 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundPaym5d35TypeXf770e912) {
      encoder.encodeString(value.value)
    }
  }
}
