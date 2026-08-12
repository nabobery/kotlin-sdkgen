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
 * The outcome of the 3D Secure authentication request.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_three_d_secure/properties/result
 */
@Serializable(with = InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3.Serializer::class)
public sealed class InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `attempt_acknowledged`.
   */
  public data object AttemptAcknowledged : InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3() {
    public override val `value`: String = "attempt_acknowledged"
  }

  /**
   * Documented value. Wire value: `authenticated`.
   */
  public data object Authenticated : InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3() {
    public override val `value`: String = "authenticated"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3 = when (value) {
      AttemptAcknowledged.value -> AttemptAcknowledged
      Authenticated.value -> Authenticated
      Failed.value -> Failed
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3) {
      encoder.encodeString(value.value)
    }
  }
}
