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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/0/properties/artifacts/items/properties/type
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365.Serializer::class)
public sealed class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365() {
    public override val `value`: String = "branch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365 = when (value) {
      Pull.value -> Pull
      Branch.value -> Branch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemTypeX02ed0365) {
      encoder.encodeString(value.value)
    }
  }
}
