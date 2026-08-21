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
 * The network rails used. See the [docs](https://docs.stripe.com/treasury/money-movement/timelines) to learn more about
 * money movement timelines for each network type.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/inbound_transfers_payment_method_details_us_bank_account/properties/
 * network
 */
@Serializable(with = InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023.Serializer::class)
public sealed class InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023() {
    public override val `value`: String = "ach"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023()

  public companion object {
    public fun fromValue(`value`: String): InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023 = when (value) {
      Ach.value -> Ach
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023) {
      encoder.encodeString(value.value)
    }
  }
}
