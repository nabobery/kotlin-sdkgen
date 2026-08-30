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
 * The network that the token is associated with. An additional hash is included with a name matching this value,
 * containing tokenization data specific to the card network.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_network_token_network_data/properties/type
 */
@Serializable(with = InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa.Serializer::class)
public sealed class InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa = when (value) {
      Mastercard.value -> Mastercard
      Visa.value -> Visa
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingNetworkTokenNetworkDataTypeXd429eeaa) {
      encoder.encodeString(value.value)
    }
  }
}
