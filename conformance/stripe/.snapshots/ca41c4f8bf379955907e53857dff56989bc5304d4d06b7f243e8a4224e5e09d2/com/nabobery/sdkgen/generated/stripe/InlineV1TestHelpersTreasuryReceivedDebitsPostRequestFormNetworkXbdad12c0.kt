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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_debits/post/requestBody/content/applicatio
 * n~1x-www-form-urlencoded/schema/properties/network
 */
@Serializable(with = InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormNetworkXbdad12c0.Serializer::class)
public sealed class InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormNetworkXbdad12c0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormNetworkXbdad12c0() {
    public override val `value`: String = "ach"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormNetworkXbdad12c0()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormNetworkXbdad12c0 = when (value) {
      Ach.value -> Ach
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormNetworkXbdad12c0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormNetworkXbdad12c0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormNetworkXbdad12c0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormNetworkXbdad12c0) {
      encoder.encodeString(value.value)
    }
  }
}
