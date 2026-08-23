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
 * The hosted compute service the network configuration supports.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/network-configuration/properties/compute_service
 */
@Serializable(with = InlineNetworkConfigurationComputeServiceXcf2e9ec3.Serializer::class)
public sealed class InlineNetworkConfigurationComputeServiceXcf2e9ec3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineNetworkConfigurationComputeServiceXcf2e9ec3() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `actions`.
   */
  public data object Actions : InlineNetworkConfigurationComputeServiceXcf2e9ec3() {
    public override val `value`: String = "actions"
  }

  /**
   * Documented value. Wire value: `codespaces`.
   */
  public data object Codespaces : InlineNetworkConfigurationComputeServiceXcf2e9ec3() {
    public override val `value`: String = "codespaces"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNetworkConfigurationComputeServiceXcf2e9ec3()

  public companion object {
    public fun fromValue(`value`: String): InlineNetworkConfigurationComputeServiceXcf2e9ec3 = when (value) {
      None.value -> None
      Actions.value -> Actions
      Codespaces.value -> Codespaces
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNetworkConfigurationComputeServiceXcf2e9ec3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNetworkConfigurationComputeServiceXcf2e9ec3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNetworkConfigurationComputeServiceXcf2e9ec3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNetworkConfigurationComputeServiceXcf2e9ec3) {
      encoder.encodeString(value.value)
    }
  }
}
