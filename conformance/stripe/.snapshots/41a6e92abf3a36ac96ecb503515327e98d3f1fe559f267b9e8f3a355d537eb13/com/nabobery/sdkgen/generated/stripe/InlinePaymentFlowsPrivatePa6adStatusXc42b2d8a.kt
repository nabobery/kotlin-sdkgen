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
 * Indicates whether or not the incremental authorization feature is supported.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_card_details_api_resource_ente
 * rprise_features_incremental_authorization_incremental_authorization/properties/status
 */
@Serializable(with = InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a.Serializer::class)
public sealed class InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `available`.
   */
  public data object Available : InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a() {
    public override val `value`: String = "available"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a() {
    public override val `value`: String = "unavailable"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a = when (value) {
      Available.value -> Available
      Unavailable.value -> Unavailable
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsPrivatePa6adStatusXc42b2d8a) {
      encoder.encodeString(value.value)
    }
  }
}
