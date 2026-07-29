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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/artifact-deployment-record/properties/runtime_risks/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/artifact-deployment-record/properties/runtime_risks/items
 */
@Serializable(with = InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a.Serializer::class)
public sealed class InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `critical-resource`.
   */
  public data object CriticalResource : InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a() {
    public override val `value`: String = "critical-resource"
  }

  /**
   * Documented value. Wire value: `internet-exposed`.
   */
  public data object InternetExposed : InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a() {
    public override val `value`: String = "internet-exposed"
  }

  /**
   * Documented value. Wire value: `lateral-movement`.
   */
  public data object LateralMovement : InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a() {
    public override val `value`: String = "lateral-movement"
  }

  /**
   * Documented value. Wire value: `sensitive-data`.
   */
  public data object SensitiveData : InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a() {
    public override val `value`: String = "sensitive-data"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a()

  public companion object {
    public fun fromValue(`value`: String): InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a = when (value) {
      CriticalResource.value -> CriticalResource
      InternetExposed.value -> InternetExposed
      LateralMovement.value -> LateralMovement
      SensitiveData.value -> SensitiveData
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineArtifactDeploymentRecordRuntimeRisksItemX48865d3a) {
      encoder.encodeString(value.value)
    }
  }
}
