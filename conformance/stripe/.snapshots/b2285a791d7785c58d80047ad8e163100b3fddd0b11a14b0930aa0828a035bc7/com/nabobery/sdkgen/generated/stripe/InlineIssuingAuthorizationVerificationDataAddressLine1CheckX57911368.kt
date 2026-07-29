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
 * Whether the cardholder provided an address first line and if it matched the cardholder’s `billing.address.line1`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_verification_data/properties/address_line1_che
 * ck
 */
@Serializable(with = InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368.Serializer::class)
public sealed class InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `match`.
   */
  public data object Match : InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368() {
    public override val `value`: String = "match"
  }

  /**
   * Documented value. Wire value: `mismatch`.
   */
  public data object Mismatch : InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368() {
    public override val `value`: String = "mismatch"
  }

  /**
   * Documented value. Wire value: `not_provided`.
   */
  public data object NotProvided : InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368() {
    public override val `value`: String = "not_provided"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368 = when (value) {
      Match.value -> Match
      Mismatch.value -> Mismatch
      NotProvided.value -> NotProvided
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationVerificationDataAddressLine1CheckX57911368) {
      encoder.encodeString(value.value)
    }
  }
}
