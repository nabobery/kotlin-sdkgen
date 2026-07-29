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
 * Indicates whether or not the authorized amount can be over-captured.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_card_details_api_resource_ente
 * rprise_features_overcapture_overcapture/properties/status
 */
@Serializable(with = InlinePaymentFlowsPrivateP67a2StatusX2dda32c1.Serializer::class)
public sealed class InlinePaymentFlowsPrivateP67a2StatusX2dda32c1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `available`.
   */
  public data object Available : InlinePaymentFlowsPrivateP67a2StatusX2dda32c1() {
    public override val `value`: String = "available"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlinePaymentFlowsPrivateP67a2StatusX2dda32c1() {
    public override val `value`: String = "unavailable"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentFlowsPrivateP67a2StatusX2dda32c1()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentFlowsPrivateP67a2StatusX2dda32c1 = when (value) {
      Available.value -> Available
      Unavailable.value -> Unavailable
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentFlowsPrivateP67a2StatusX2dda32c1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivateP67a2StatusX2dda32c1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivateP67a2StatusX2dda32c1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsPrivateP67a2StatusX2dda32c1) {
      encoder.encodeString(value.value)
    }
  }
}
