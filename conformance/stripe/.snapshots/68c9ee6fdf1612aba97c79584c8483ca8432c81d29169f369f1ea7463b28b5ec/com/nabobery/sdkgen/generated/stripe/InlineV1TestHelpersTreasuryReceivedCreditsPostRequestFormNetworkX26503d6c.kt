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
 * Specifies the network rails to be used. If not set, will default to the PaymentMethod's preferred network. See the
 * [docs](https://docs.stripe.com/treasury/money-movement/timelines) to learn more about money movement timelines for
 * each network type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_credits/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/network
 */
@Serializable(with = InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c.Serializer::class)
public sealed class InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `us_domestic_wire`.
   */
  public data object UsDomesticWire : InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c() {
    public override val `value`: String = "us_domestic_wire"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c = when (value) {
      Ach.value -> Ach
      UsDomesticWire.value -> UsDomesticWire
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormNetworkX26503d6c) {
      encoder.encodeString(value.value)
    }
  }
}
