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
 * sdkgen://source/openapi.json#/paths/~1v1~1refunds/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/origin
 */
@Serializable(with = InlineV1RefundsPostRequestFormOriginX66fb951a.Serializer::class)
public sealed class InlineV1RefundsPostRequestFormOriginX66fb951a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `customer_balance`.
   */
  public data object CustomerBalance : InlineV1RefundsPostRequestFormOriginX66fb951a() {
    public override val `value`: String = "customer_balance"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1RefundsPostRequestFormOriginX66fb951a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1RefundsPostRequestFormOriginX66fb951a = when (value) {
      CustomerBalance.value -> CustomerBalance
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1RefundsPostRequestFormOriginX66fb951a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1RefundsPostRequestFormOriginX66fb951a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1RefundsPostRequestFormOriginX66fb951a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1RefundsPostRequestFormOriginX66fb951a) {
      encoder.encodeString(value.value)
    }
  }
}
