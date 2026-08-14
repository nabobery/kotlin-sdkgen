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
 * Type of artifact. Available Values: `pull`, `branch`.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema/properties/artifacts/items/properties/type
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf.Serializer::class)
public sealed class InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf() {
    public override val `value`: String = "branch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf = when (value) {
      Pull.value -> Pull
      Branch.value -> Branch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonArtifactsItemTypeXeade59bf) {
      encoder.encodeString(value.value)
    }
  }
}
