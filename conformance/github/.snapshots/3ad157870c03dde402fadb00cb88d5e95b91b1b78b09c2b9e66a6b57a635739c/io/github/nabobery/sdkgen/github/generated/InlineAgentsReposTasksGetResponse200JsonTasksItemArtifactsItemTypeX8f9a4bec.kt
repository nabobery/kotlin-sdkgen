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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema/properties/tasks/items/properties/artifacts/items/properties/type
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec.Serializer::class)
public sealed class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec() {
    public override val `value`: String = "branch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec = when (value) {
      Pull.value -> Pull
      Branch.value -> Branch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemTypeX8f9a4bec) {
      encoder.encodeString(value.value)
    }
  }
}
