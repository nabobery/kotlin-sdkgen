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
 * The method by which the fraud challenge was delivered to the cardholder.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fraud_challenge/properties/channel
 */
@Serializable(with = InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f.Serializer::class)
public sealed class InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `sms`.
   */
  public data object Sms : InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f() {
    public override val `value`: String = "sms"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f = when (value) {
      Sms.value -> Sms
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFraudChallengeChannelX05ae2a0f) {
      encoder.encodeString(value.value)
    }
  }
}
