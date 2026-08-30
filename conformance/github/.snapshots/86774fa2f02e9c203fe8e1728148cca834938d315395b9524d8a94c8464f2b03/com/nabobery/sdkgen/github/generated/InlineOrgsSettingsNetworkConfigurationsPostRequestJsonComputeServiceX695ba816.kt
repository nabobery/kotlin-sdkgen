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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1network-configurations/post/requestBody/content/applicat
 * ion~1json/schema/properties/compute_service
 */
@Serializable(with = InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816.Serializer::class)
public sealed class InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `actions`.
   */
  public data object Actions : InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816() {
    public override val `value`: String = "actions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816 = when (value) {
      None.value -> None
      Actions.value -> Actions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816) {
      encoder.encodeString(value.value)
    }
  }
}
