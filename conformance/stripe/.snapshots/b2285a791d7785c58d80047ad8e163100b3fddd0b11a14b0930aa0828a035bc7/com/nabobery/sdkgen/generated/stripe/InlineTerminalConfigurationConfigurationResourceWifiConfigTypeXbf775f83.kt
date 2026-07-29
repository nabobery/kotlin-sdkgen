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
 * Security type of the WiFi network. The hash with the corresponding name contains the credentials for this security
 * type.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_wifi_config/properties
 * /type
 */
@Serializable(with = InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83.Serializer::class)
public sealed class InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise_eap_peap`.
   */
  public data object EnterpriseEapPeap : InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83() {
    public override val `value`: String = "enterprise_eap_peap"
  }

  /**
   * Documented value. Wire value: `enterprise_eap_tls`.
   */
  public data object EnterpriseEapTls : InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83() {
    public override val `value`: String = "enterprise_eap_tls"
  }

  /**
   * Documented value. Wire value: `personal_psk`.
   */
  public data object PersonalPsk : InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83() {
    public override val `value`: String = "personal_psk"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83 = when (value) {
      EnterpriseEapPeap.value -> EnterpriseEapPeap
      EnterpriseEapTls.value -> EnterpriseEapTls
      PersonalPsk.value -> PersonalPsk
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalConfigurationConfigurationResourceWifiConfigTypeXbf775f83) {
      encoder.encodeString(value.value)
    }
  }
}
