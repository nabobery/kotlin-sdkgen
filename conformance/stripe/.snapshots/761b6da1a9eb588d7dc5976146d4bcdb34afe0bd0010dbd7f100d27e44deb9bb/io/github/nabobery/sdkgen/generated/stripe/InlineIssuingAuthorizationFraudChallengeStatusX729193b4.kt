package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The status of the fraud challenge.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fraud_challenge/properties/status
 */
@Serializable(with = InlineIssuingAuthorizationFraudChallengeStatusX729193b4.Serializer::class)
public sealed class InlineIssuingAuthorizationFraudChallengeStatusX729193b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineIssuingAuthorizationFraudChallengeStatusX729193b4() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineIssuingAuthorizationFraudChallengeStatusX729193b4() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineIssuingAuthorizationFraudChallengeStatusX729193b4() {
    public override val `value`: String = "rejected"
  }

  /**
   * Documented value. Wire value: `undeliverable`.
   */
  public data object Undeliverable : InlineIssuingAuthorizationFraudChallengeStatusX729193b4() {
    public override val `value`: String = "undeliverable"
  }

  /**
   * Documented value. Wire value: `verified`.
   */
  public data object Verified : InlineIssuingAuthorizationFraudChallengeStatusX729193b4() {
    public override val `value`: String = "verified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationFraudChallengeStatusX729193b4()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationFraudChallengeStatusX729193b4 = when (value) {
      Expired.value -> Expired
      Pending.value -> Pending
      Rejected.value -> Rejected
      Undeliverable.value -> Undeliverable
      Verified.value -> Verified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationFraudChallengeStatusX729193b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationFraudChallengeStatusX729193b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFraudChallengeStatusX729193b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFraudChallengeStatusX729193b4) {
      encoder.encodeString(value.value)
    }
  }
}
