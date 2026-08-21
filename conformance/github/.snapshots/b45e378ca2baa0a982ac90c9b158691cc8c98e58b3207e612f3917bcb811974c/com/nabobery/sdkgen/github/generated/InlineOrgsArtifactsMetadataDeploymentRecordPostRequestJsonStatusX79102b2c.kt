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
 * The status of the artifact. Can be either deployed or decommissioned.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record/post/requestBody/content/ap
 * plication~1json/schema/properties/status
 */
@Serializable(with = InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c.Serializer::class)
public sealed class InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deployed`.
   */
  public data object Deployed : InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c() {
    public override val `value`: String = "deployed"
  }

  /**
   * Documented value. Wire value: `decommissioned`.
   */
  public data object Decommissioned : InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c() {
    public override val `value`: String = "decommissioned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c = when (value) {
      Deployed.value -> Deployed
      Decommissioned.value -> Decommissioned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataDeploymentRecordPostRequestJsonStatusX79102b2c) {
      encoder.encodeString(value.value)
    }
  }
}
