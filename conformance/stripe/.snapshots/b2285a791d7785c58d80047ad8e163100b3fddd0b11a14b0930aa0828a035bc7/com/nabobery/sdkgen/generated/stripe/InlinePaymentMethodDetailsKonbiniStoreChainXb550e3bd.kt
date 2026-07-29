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
 * The name of the convenience store chain where the payment was completed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_konbini_store/properties/chain
 */
@Serializable(with = InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd.Serializer::class)
public sealed class InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `familymart`.
   */
  public data object Familymart : InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd() {
    public override val `value`: String = "familymart"
  }

  /**
   * Documented value. Wire value: `lawson`.
   */
  public data object Lawson : InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd() {
    public override val `value`: String = "lawson"
  }

  /**
   * Documented value. Wire value: `ministop`.
   */
  public data object Ministop : InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd() {
    public override val `value`: String = "ministop"
  }

  /**
   * Documented value. Wire value: `seicomart`.
   */
  public data object Seicomart : InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd() {
    public override val `value`: String = "seicomart"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd = when (value) {
      Familymart.value -> Familymart
      Lawson.value -> Lawson
      Ministop.value -> Ministop
      Seicomart.value -> Seicomart
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsKonbiniStoreChainXb550e3bd) {
      encoder.encodeString(value.value)
    }
  }
}
