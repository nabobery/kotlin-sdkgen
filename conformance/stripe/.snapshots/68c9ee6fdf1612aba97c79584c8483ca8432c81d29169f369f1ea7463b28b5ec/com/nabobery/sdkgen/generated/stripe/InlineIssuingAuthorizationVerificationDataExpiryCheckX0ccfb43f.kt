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
 * Whether the cardholder provided an expiry date and if it matched Stripe’s record.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_verification_data/properties/expiry_check
 */
@Serializable(with = InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f.Serializer::class)
public sealed class InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `match`.
   */
  public data object Match : InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f() {
    public override val `value`: String = "match"
  }

  /**
   * Documented value. Wire value: `mismatch`.
   */
  public data object Mismatch : InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f() {
    public override val `value`: String = "mismatch"
  }

  /**
   * Documented value. Wire value: `not_provided`.
   */
  public data object NotProvided : InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f() {
    public override val `value`: String = "not_provided"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f = when (value) {
      Match.value -> Match
      Mismatch.value -> Mismatch
      NotProvided.value -> NotProvided
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationVerificationDataExpiryCheckX0ccfb43f) {
      encoder.encodeString(value.value)
    }
  }
}
