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
 * Origin of the refund
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/origin
 */
@Serializable(with = InlineV1ChargesRefundsPostRequestFormOriginX4a79114c.Serializer::class)
public sealed class InlineV1ChargesRefundsPostRequestFormOriginX4a79114c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `customer_balance`.
   */
  public data object CustomerBalance : InlineV1ChargesRefundsPostRequestFormOriginX4a79114c() {
    public override val `value`: String = "customer_balance"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ChargesRefundsPostRequestFormOriginX4a79114c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ChargesRefundsPostRequestFormOriginX4a79114c = when (value) {
      CustomerBalance.value -> CustomerBalance
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesRefundsPostRequestFormOriginX4a79114c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ChargesRefundsPostRequestFormOriginX4a79114c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ChargesRefundsPostRequestFormOriginX4a79114c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesRefundsPostRequestFormOriginX4a79114c) {
      encoder.encodeString(value.value)
    }
  }
}
