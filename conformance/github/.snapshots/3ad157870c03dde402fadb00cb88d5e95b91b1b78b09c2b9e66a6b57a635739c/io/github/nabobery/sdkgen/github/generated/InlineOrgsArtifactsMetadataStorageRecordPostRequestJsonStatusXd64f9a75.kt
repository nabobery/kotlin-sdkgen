package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The status of the artifact (e.g., active, inactive).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1storage-record/post/requestBody/content/appli
 * cation~1json/schema/properties/status
 */
@Serializable(with = InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75.Serializer::class)
public sealed class InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `eol`.
   */
  public data object Eol : InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75() {
    public override val `value`: String = "eol"
  }

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75 = when (value) {
      Active.value -> Active
      Eol.value -> Eol
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataStorageRecordPostRequestJsonStatusXd64f9a75) {
      encoder.encodeString(value.value)
    }
  }
}
