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
 * Type of artifact. Available Values: `pull`, `branch`.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/0/properties/artifacts/items/properties/type
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae.Serializer::class)
public sealed class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae() {
    public override val `value`: String = "branch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae = when (value) {
      Pull.value -> Pull
      Branch.value -> Branch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemTypeXa3d975ae) {
      encoder.encodeString(value.value)
    }
  }
}
