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
 * The deployment status of the artifact.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record~1cluster~1{cluster}/post/re
 * questBody/content/application~1json/schema/properties/deployments/items/properties/status
 */
@Serializable(with = InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b.Serializer::class)
public sealed class InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deployed`.
   */
  public data object Deployed : InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b() {
    public override val `value`: String = "deployed"
  }

  /**
   * Documented value. Wire value: `decommissioned`.
   */
  public data object Decommissioned : InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b() {
    public override val `value`: String = "decommissioned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b = when (value) {
      Deployed.value -> Deployed
      Decommissioned.value -> Decommissioned
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemStatusX3001c54b) {
      encoder.encodeString(value.value)
    }
  }
}
