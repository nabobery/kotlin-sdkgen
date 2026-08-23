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
 * For authenticated transactions: how the customer was authenticated by
 * the issuing bank.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details/properties/authentication_flow
 */
@Serializable(with = InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0.Serializer::class)
public sealed class InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `challenge`.
   */
  public data object Challenge : InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0() {
    public override val `value`: String = "challenge"
  }

  /**
   * Documented value. Wire value: `frictionless`.
   */
  public data object Frictionless : InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0() {
    public override val `value`: String = "frictionless"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0()

  public companion object {
    public fun fromValue(`value`: String): InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0 = when (value) {
      Challenge.value -> Challenge
      Frictionless.value -> Frictionless
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThreeDSecureDetailsAuthenticationFlowXb45f3ee0) {
      encoder.encodeString(value.value)
    }
  }
}
