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
 * The entity that requested the exemption, either the acquiring merchant or the Issuing user.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_authentication_exemption/properties/claimed_by
 */
@Serializable(with = InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb.Serializer::class)
public sealed class InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `acquirer`.
   */
  public data object Acquirer : InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb() {
    public override val `value`: String = "acquirer"
  }

  /**
   * Documented value. Wire value: `issuer`.
   */
  public data object Issuer : InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb() {
    public override val `value`: String = "issuer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb = when (value) {
      Acquirer.value -> Acquirer
      Issuer.value -> Issuer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationAuthenticationExemptionClaimedByX1e9173cb) {
      encoder.encodeString(value.value)
    }
  }
}
