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
 * The network rails used. See the [docs](https://docs.stripe.com/treasury/money-movement/timelines) to learn more about
 * money movement timelines for each network type.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/outbound_transfers_payment_method_details_us_bank_account/properties
 * /network
 */
@Serializable(with = InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b.Serializer::class)
public sealed class InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `us_domestic_wire`.
   */
  public data object UsDomesticWire : InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b() {
    public override val `value`: String = "us_domestic_wire"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b()

  public companion object {
    public fun fromValue(`value`: String): InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b = when (value) {
      Ach.value -> Ach
      UsDomesticWire.value -> UsDomesticWire
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutboundTransfersPaymentMethodDetailsUsBankAccountNetworkXd1e3ae2b) {
      encoder.encodeString(value.value)
    }
  }
}
