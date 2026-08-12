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
 * Requested routing priority
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_card_present_routing/properties/requested_pri
 * ority
 */
@Serializable(with = InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b.Serializer::class)
public sealed class InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `domestic`.
   */
  public data object Domestic : InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b() {
    public override val `value`: String = "domestic"
  }

  /**
   * Documented value. Wire value: `international`.
   */
  public data object International : InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b() {
    public override val `value`: String = "international"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b = when (value) {
      Domestic.value -> Domestic
      International.value -> International
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b) {
      encoder.encodeString(value.value)
    }
  }
}
