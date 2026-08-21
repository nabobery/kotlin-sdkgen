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
 * The blockchain network that the transaction was sent on.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_crypto/properties/network
 */
@Serializable(with = InlinePaymentMethodDetailsCryptoNetworkX8770091f.Serializer::class)
public sealed class InlinePaymentMethodDetailsCryptoNetworkX8770091f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `base`.
   */
  public data object Base : InlinePaymentMethodDetailsCryptoNetworkX8770091f() {
    public override val `value`: String = "base"
  }

  /**
   * Documented value. Wire value: `ethereum`.
   */
  public data object Ethereum : InlinePaymentMethodDetailsCryptoNetworkX8770091f() {
    public override val `value`: String = "ethereum"
  }

  /**
   * Documented value. Wire value: `polygon`.
   */
  public data object Polygon : InlinePaymentMethodDetailsCryptoNetworkX8770091f() {
    public override val `value`: String = "polygon"
  }

  /**
   * Documented value. Wire value: `solana`.
   */
  public data object Solana : InlinePaymentMethodDetailsCryptoNetworkX8770091f() {
    public override val `value`: String = "solana"
  }

  /**
   * Documented value. Wire value: `sui`.
   */
  public data object Sui : InlinePaymentMethodDetailsCryptoNetworkX8770091f() {
    public override val `value`: String = "sui"
  }

  /**
   * Documented value. Wire value: `tempo`.
   */
  public data object Tempo : InlinePaymentMethodDetailsCryptoNetworkX8770091f() {
    public override val `value`: String = "tempo"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsCryptoNetworkX8770091f()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsCryptoNetworkX8770091f = when (value) {
      Base.value -> Base
      Ethereum.value -> Ethereum
      Polygon.value -> Polygon
      Solana.value -> Solana
      Sui.value -> Sui
      Tempo.value -> Tempo
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCryptoNetworkX8770091f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsCryptoNetworkX8770091f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCryptoNetworkX8770091f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCryptoNetworkX8770091f) {
      encoder.encodeString(value.value)
    }
  }
}
