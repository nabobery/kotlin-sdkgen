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
 * A short machine-readable string giving the reason for the verification failure.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_email_report_error/properties/code
 */
@Serializable(with = InlineGelatoEmailReportErrorCodeXba5e0df5.Serializer::class)
public sealed class InlineGelatoEmailReportErrorCodeXba5e0df5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `email_unverified_other`.
   */
  public data object EmailUnverifiedOther : InlineGelatoEmailReportErrorCodeXba5e0df5() {
    public override val `value`: String = "email_unverified_other"
  }

  /**
   * Documented value. Wire value: `email_verification_declined`.
   */
  public data object EmailVerificationDeclined : InlineGelatoEmailReportErrorCodeXba5e0df5() {
    public override val `value`: String = "email_verification_declined"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoEmailReportErrorCodeXba5e0df5()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoEmailReportErrorCodeXba5e0df5 = when (value) {
      EmailUnverifiedOther.value -> EmailUnverifiedOther
      EmailVerificationDeclined.value -> EmailVerificationDeclined
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoEmailReportErrorCodeXba5e0df5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoEmailReportErrorCodeXba5e0df5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoEmailReportErrorCodeXba5e0df5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoEmailReportErrorCodeXba5e0df5) {
      encoder.encodeString(value.value)
    }
  }
}
