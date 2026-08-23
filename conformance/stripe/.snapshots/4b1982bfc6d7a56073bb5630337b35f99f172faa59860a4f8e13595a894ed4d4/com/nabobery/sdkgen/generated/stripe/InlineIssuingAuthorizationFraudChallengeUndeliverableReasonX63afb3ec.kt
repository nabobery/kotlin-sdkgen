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
 * If the challenge is not deliverable, the reason why.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fraud_challenge/properties/undeliverable_reaso
 * n
 */
@Serializable(with = InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec.Serializer::class)
public sealed class InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `no_phone_number`.
   */
  public data object NoPhoneNumber : InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec() {
    public override val `value`: String = "no_phone_number"
  }

  /**
   * Documented value. Wire value: `unsupported_phone_number`.
   */
  public data object UnsupportedPhoneNumber : InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec() {
    public override val `value`: String = "unsupported_phone_number"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec = when (value) {
      NoPhoneNumber.value -> NoPhoneNumber
      UnsupportedPhoneNumber.value -> UnsupportedPhoneNumber
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFraudChallengeUndeliverableReasonX63afb3ec) {
      encoder.encodeString(value.value)
    }
  }
}
