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
 * The method used to process this payment method offline. Only deferred is allowed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_present_offline/properties/type
 */
@Serializable(with = InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8.Serializer::class)
public sealed class InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deferred`.
   */
  public data object Deferred : InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8() {
    public override val `value`: String = "deferred"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8 = when (value) {
      Deferred.value -> Deferred
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8) {
      encoder.encodeString(value.value)
    }
  }
}
