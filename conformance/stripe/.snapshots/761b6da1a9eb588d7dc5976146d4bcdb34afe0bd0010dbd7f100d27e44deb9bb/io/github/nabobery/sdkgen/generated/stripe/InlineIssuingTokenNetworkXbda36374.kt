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
 * The token service provider / card network associated with the token.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.token/properties/network
 */
@Serializable(with = InlineIssuingTokenNetworkXbda36374.Serializer::class)
public sealed class InlineIssuingTokenNetworkXbda36374 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlineIssuingTokenNetworkXbda36374() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlineIssuingTokenNetworkXbda36374() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingTokenNetworkXbda36374()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingTokenNetworkXbda36374 = when (value) {
      Mastercard.value -> Mastercard
      Visa.value -> Visa
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTokenNetworkXbda36374> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingTokenNetworkXbda36374", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingTokenNetworkXbda36374 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTokenNetworkXbda36374) {
      encoder.encodeString(value.value)
    }
  }
}
