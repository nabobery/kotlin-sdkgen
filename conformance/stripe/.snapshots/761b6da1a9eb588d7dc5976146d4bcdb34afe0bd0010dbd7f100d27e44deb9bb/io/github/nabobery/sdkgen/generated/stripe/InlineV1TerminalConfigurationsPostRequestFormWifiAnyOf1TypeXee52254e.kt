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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/wifi/anyOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/wifi/anyOf/0/properties/type
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e.Serializer::class)
public sealed class InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise_eap_peap`.
   */
  public data object EnterpriseEapPeap : InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e() {
    public override val `value`: String = "enterprise_eap_peap"
  }

  /**
   * Documented value. Wire value: `enterprise_eap_tls`.
   */
  public data object EnterpriseEapTls : InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e() {
    public override val `value`: String = "enterprise_eap_tls"
  }

  /**
   * Documented value. Wire value: `personal_psk`.
   */
  public data object PersonalPsk : InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e() {
    public override val `value`: String = "personal_psk"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e = when (value) {
      EnterpriseEapPeap.value -> EnterpriseEapPeap
      EnterpriseEapTls.value -> EnterpriseEapTls
      PersonalPsk.value -> PersonalPsk
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormWifiAnyOf1TypeXee52254e) {
      encoder.encodeString(value.value)
    }
  }
}
