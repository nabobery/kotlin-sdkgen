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
 * The hosted compute service to use for the network configuration.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1network-configurations~1{network_configuration_id}/patch
 * /requestBody/content/application~1json/schema/properties/compute_service
 */
@Serializable(with = InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913.Serializer::class)
public sealed class InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `actions`.
   */
  public data object Actions : InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913() {
    public override val `value`: String = "actions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913 = when (value) {
      None.value -> None
      Actions.value -> Actions
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913) {
      encoder.encodeString(value.value)
    }
  }
}
