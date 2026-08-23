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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/exchange_rate/properties/object
 */
@Serializable(with = InlineExchangeRateObjectValueX019430be.Serializer::class)
public sealed class InlineExchangeRateObjectValueX019430be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exchange_rate`.
   */
  public data object ExchangeRate : InlineExchangeRateObjectValueX019430be() {
    public override val `value`: String = "exchange_rate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineExchangeRateObjectValueX019430be()

  public companion object {
    public fun fromValue(`value`: String): InlineExchangeRateObjectValueX019430be = when (value) {
      ExchangeRate.value -> ExchangeRate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineExchangeRateObjectValueX019430be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineExchangeRateObjectValueX019430be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineExchangeRateObjectValueX019430be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineExchangeRateObjectValueX019430be) {
      encoder.encodeString(value.value)
    }
  }
}
