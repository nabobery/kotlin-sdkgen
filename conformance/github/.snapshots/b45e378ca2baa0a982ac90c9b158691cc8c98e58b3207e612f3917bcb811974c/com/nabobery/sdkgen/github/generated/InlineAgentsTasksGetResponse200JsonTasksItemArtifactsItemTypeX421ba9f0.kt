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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema/properties/tas
 * ks/items/properties/artifacts/items/properties/type
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0.Serializer::class)
public sealed class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0() {
    public override val `value`: String = "branch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0 = when (value) {
      Pull.value -> Pull
      Branch.value -> Branch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemTypeX421ba9f0) {
      encoder.encodeString(value.value)
    }
  }
}
