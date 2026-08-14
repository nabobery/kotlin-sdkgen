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
 * The banking network used for this funding.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_funded_t
 * ransaction_resource_bank_transfer_resource_us_bank_transfer/properties/network
 */
@Serializable(with = InlineCustomerBalanceResou92ceNetworkXf0248876.Serializer::class)
public sealed class InlineCustomerBalanceResou92ceNetworkXf0248876 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineCustomerBalanceResou92ceNetworkXf0248876() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `domestic_wire_us`.
   */
  public data object DomesticWireUs : InlineCustomerBalanceResou92ceNetworkXf0248876() {
    public override val `value`: String = "domestic_wire_us"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : InlineCustomerBalanceResou92ceNetworkXf0248876() {
    public override val `value`: String = "swift"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerBalanceResou92ceNetworkXf0248876()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerBalanceResou92ceNetworkXf0248876 = when (value) {
      Ach.value -> Ach
      DomesticWireUs.value -> DomesticWireUs
      Swift.value -> Swift
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerBalanceResou92ceNetworkXf0248876> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCustomerBalanceResou92ceNetworkXf0248876", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceResou92ceNetworkXf0248876 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceResou92ceNetworkXf0248876) {
      encoder.encodeString(value.value)
    }
  }
}
