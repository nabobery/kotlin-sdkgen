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
 * Indicates whether or not multiple captures are supported.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_card_details_api_resource_mult
 * icapture/properties/status
 */
@Serializable(with = InlinePaymentFlowsPrivatePefbaStatusXf7fb8417.Serializer::class)
public sealed class InlinePaymentFlowsPrivatePefbaStatusXf7fb8417 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `available`.
   */
  public data object Available : InlinePaymentFlowsPrivatePefbaStatusXf7fb8417() {
    public override val `value`: String = "available"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlinePaymentFlowsPrivatePefbaStatusXf7fb8417() {
    public override val `value`: String = "unavailable"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentFlowsPrivatePefbaStatusXf7fb8417()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentFlowsPrivatePefbaStatusXf7fb8417 = when (value) {
      Available.value -> Available
      Unavailable.value -> Unavailable
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentFlowsPrivatePefbaStatusXf7fb8417> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivatePefbaStatusXf7fb8417", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivatePefbaStatusXf7fb8417 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsPrivatePefbaStatusXf7fb8417) {
      encoder.encodeString(value.value)
    }
  }
}
