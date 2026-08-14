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
 * Provider namespace
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/0/properties/artifacts/items/properties/provider
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemProviderX08b8a5d0.Serializer::class)
public sealed class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemProviderX08b8a5d0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `github`.
   */
  public data object Github : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemProviderX08b8a5d0() {
    public override val `value`: String = "github"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemProviderX08b8a5d0()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemProviderX08b8a5d0 = when (value) {
      Github.value -> Github
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemProviderX08b8a5d0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemProviderX08b8a5d0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemProviderX08b8a5d0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemProviderX08b8a5d0) {
      encoder.encodeString(value.value)
    }
  }
}
