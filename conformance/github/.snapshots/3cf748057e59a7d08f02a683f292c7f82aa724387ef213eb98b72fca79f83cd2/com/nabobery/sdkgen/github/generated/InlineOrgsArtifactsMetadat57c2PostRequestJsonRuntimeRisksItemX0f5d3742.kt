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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record/post/requestBody/content/ap
 * plication~1json/schema/properties/runtime_risks/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record/post/requestBody/content/ap
 * plication~1json/schema/properties/runtime_risks/items
 */
@Serializable(with = InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742.Serializer::class)
public sealed class InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `critical-resource`.
   */
  public data object CriticalResource : InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742() {
    public override val `value`: String = "critical-resource"
  }

  /**
   * Documented value. Wire value: `internet-exposed`.
   */
  public data object InternetExposed : InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742() {
    public override val `value`: String = "internet-exposed"
  }

  /**
   * Documented value. Wire value: `lateral-movement`.
   */
  public data object LateralMovement : InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742() {
    public override val `value`: String = "lateral-movement"
  }

  /**
   * Documented value. Wire value: `sensitive-data`.
   */
  public data object SensitiveData : InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742() {
    public override val `value`: String = "sensitive-data"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742 = when (value) {
      CriticalResource.value -> CriticalResource
      InternetExposed.value -> InternetExposed
      LateralMovement.value -> LateralMovement
      SensitiveData.value -> SensitiveData
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadat57c2PostRequestJsonRuntimeRisksItemX0f5d3742) {
      encoder.encodeString(value.value)
    }
  }
}
