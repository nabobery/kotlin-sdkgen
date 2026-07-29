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
 * The exemption requested via 3DS and accepted by the issuer at authentication time.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details_charge/properties/exemption_indicator
 */
@Serializable(with = InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da.Serializer::class)
public sealed class InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low_risk`.
   */
  public data object LowRisk : InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da() {
    public override val `value`: String = "low_risk"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da()

  public companion object {
    public fun fromValue(`value`: String): InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da = when (value) {
      LowRisk.value -> LowRisk
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThreeDSecureDetailsChargeExemptionIndicatorX4cc808da) {
      encoder.encodeString(value.value)
    }
  }
}
