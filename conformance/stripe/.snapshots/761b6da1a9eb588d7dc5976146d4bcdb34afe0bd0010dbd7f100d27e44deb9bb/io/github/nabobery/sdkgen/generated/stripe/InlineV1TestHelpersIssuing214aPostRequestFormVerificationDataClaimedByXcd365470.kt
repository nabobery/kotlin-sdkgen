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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/authentication_exemption/properties/claimed_by.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/authentication_exemption/properties/claimed_by
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470.Serializer::class)
public sealed class InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `acquirer`.
   */
  public data object Acquirer : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470() {
    public override val `value`: String = "acquirer"
  }

  /**
   * Documented value. Wire value: `issuer`.
   */
  public data object Issuer : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470() {
    public override val `value`: String = "issuer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470 = when (value) {
      Acquirer.value -> Acquirer
      Issuer.value -> Issuer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataClaimedByXcd365470) {
      encoder.encodeString(value.value)
    }
  }
}
