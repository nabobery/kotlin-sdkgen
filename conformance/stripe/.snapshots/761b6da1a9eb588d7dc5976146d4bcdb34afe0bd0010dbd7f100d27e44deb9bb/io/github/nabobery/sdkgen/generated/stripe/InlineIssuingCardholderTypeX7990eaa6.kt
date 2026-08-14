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
 * One of `individual` or `company`. See [Choose a cardholder
 * type](https://docs.stripe.com/issuing/other/choose-cardholder) for more details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.cardholder/properties/type
 */
@Serializable(with = InlineIssuingCardholderTypeX7990eaa6.Serializer::class)
public sealed class InlineIssuingCardholderTypeX7990eaa6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineIssuingCardholderTypeX7990eaa6() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineIssuingCardholderTypeX7990eaa6() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardholderTypeX7990eaa6()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardholderTypeX7990eaa6 = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardholderTypeX7990eaa6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderTypeX7990eaa6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderTypeX7990eaa6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderTypeX7990eaa6) {
      encoder.encodeString(value.value)
    }
  }
}
