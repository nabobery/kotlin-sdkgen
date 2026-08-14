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
 * The specific exemption claimed for this authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_authentication_exemption/properties/type
 */
@Serializable(with = InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416.Serializer::class)
public sealed class InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low_value_transaction`.
   */
  public data object LowValueTransaction : InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416() {
    public override val `value`: String = "low_value_transaction"
  }

  /**
   * Documented value. Wire value: `transaction_risk_analysis`.
   */
  public data object TransactionRiskAnalysis : InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416() {
    public override val `value`: String = "transaction_risk_analysis"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416 = when (value) {
      LowValueTransaction.value -> LowValueTransaction
      TransactionRiskAnalysis.value -> TransactionRiskAnalysis
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationAuthenticationExemptionTypeXf06bd416) {
      encoder.encodeString(value.value)
    }
  }
}
