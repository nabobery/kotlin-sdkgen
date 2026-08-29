package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/commit/properties/verifi
 * cation/properties/reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/commit/properties/verifi
 * cation/properties/reason
 */
@Serializable(with = InlineWebhookStatusCommitCommitVerificationReasonX05704592.Serializer::class)
public sealed class InlineWebhookStatusCommitCommitVerificationReasonX05704592 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `expired_key`.
   */
  public data object ExpiredKey : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "expired_key"
  }

  /**
   * Documented value. Wire value: `not_signing_key`.
   */
  public data object NotSigningKey : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "not_signing_key"
  }

  /**
   * Documented value. Wire value: `gpgverify_error`.
   */
  public data object GpgverifyError : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "gpgverify_error"
  }

  /**
   * Documented value. Wire value: `gpgverify_unavailable`.
   */
  public data object GpgverifyUnavailable : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "gpgverify_unavailable"
  }

  /**
   * Documented value. Wire value: `unsigned`.
   */
  public data object Unsigned : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "unsigned"
  }

  /**
   * Documented value. Wire value: `unknown_signature_type`.
   */
  public data object UnknownSignatureType : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "unknown_signature_type"
  }

  /**
   * Documented value. Wire value: `no_user`.
   */
  public data object NoUser : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "no_user"
  }

  /**
   * Documented value. Wire value: `unverified_email`.
   */
  public data object UnverifiedEmail : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "unverified_email"
  }

  /**
   * Documented value. Wire value: `bad_email`.
   */
  public data object BadEmail : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "bad_email"
  }

  /**
   * Documented value. Wire value: `unknown_key`.
   */
  public data object UnknownKey : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "unknown_key"
  }

  /**
   * Documented value. Wire value: `malformed_signature`.
   */
  public data object MalformedSignature : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "malformed_signature"
  }

  /**
   * Documented value. Wire value: `invalid`.
   */
  public data object Invalid : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "invalid"
  }

  /**
   * Documented value. Wire value: `valid`.
   */
  public data object Valid : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "valid"
  }

  /**
   * Documented value. Wire value: `bad_cert`.
   */
  public data object BadCert : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "bad_cert"
  }

  /**
   * Documented value. Wire value: `ocsp_pending`.
   */
  public data object OcspPending : InlineWebhookStatusCommitCommitVerificationReasonX05704592() {
    public override val `value`: String = "ocsp_pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookStatusCommitCommitVerificationReasonX05704592()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookStatusCommitCommitVerificationReasonX05704592 = when (value) {
      ExpiredKey.value -> ExpiredKey
      NotSigningKey.value -> NotSigningKey
      GpgverifyError.value -> GpgverifyError
      GpgverifyUnavailable.value -> GpgverifyUnavailable
      Unsigned.value -> Unsigned
      UnknownSignatureType.value -> UnknownSignatureType
      NoUser.value -> NoUser
      UnverifiedEmail.value -> UnverifiedEmail
      BadEmail.value -> BadEmail
      UnknownKey.value -> UnknownKey
      MalformedSignature.value -> MalformedSignature
      Invalid.value -> Invalid
      Valid.value -> Valid
      BadCert.value -> BadCert
      OcspPending.value -> OcspPending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookStatusCommitCommitVerificationReasonX05704592> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookStatusCommitCommitVerificationReasonX05704592", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookStatusCommitCommitVerificationReasonX05704592 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStatusCommitCommitVerificationReasonX05704592) {
      encoder.encodeString(value.value)
    }
  }
}
