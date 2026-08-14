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
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/authentication_exemption/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/authentication_exemption/properties/type
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158.Serializer::class)
public sealed class InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low_value_transaction`.
   */
  public data object LowValueTransaction : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158() {
    public override val `value`: String = "low_value_transaction"
  }

  /**
   * Documented value. Wire value: `transaction_risk_analysis`.
   */
  public data object TransactionRiskAnalysis : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158() {
    public override val `value`: String = "transaction_risk_analysis"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158 = when (value) {
      LowValueTransaction.value -> LowValueTransaction
      TransactionRiskAnalysis.value -> TransactionRiskAnalysis
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataTypeX7d264158) {
      encoder.encodeString(value.value)
    }
  }
}
