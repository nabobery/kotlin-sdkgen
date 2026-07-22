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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record~1cluster~1{cluster}/post/re
 * questBody/content/application~1json/schema/properties/deployments/items/properties/runtime_risks/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record~1cluster~1{cluster}/post/re
 * questBody/content/application~1json/schema/properties/deployments/items/properties/runtime_risks/items
 */
@Serializable(with = InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4.Serializer::class)
public sealed class InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `critical-resource`.
   */
  public data object CriticalResource : InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4() {
    public override val `value`: String = "critical-resource"
  }

  /**
   * Documented value. Wire value: `internet-exposed`.
   */
  public data object InternetExposed : InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4() {
    public override val `value`: String = "internet-exposed"
  }

  /**
   * Documented value. Wire value: `lateral-movement`.
   */
  public data object LateralMovement : InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4() {
    public override val `value`: String = "lateral-movement"
  }

  /**
   * Documented value. Wire value: `sensitive-data`.
   */
  public data object SensitiveData : InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4() {
    public override val `value`: String = "sensitive-data"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4 = when (value) {
      CriticalResource.value -> CriticalResource
      InternetExposed.value -> InternetExposed
      LateralMovement.value -> LateralMovement
      SensitiveData.value -> SensitiveData
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemItemXfe9d79e4) {
      encoder.encodeString(value.value)
    }
  }
}
