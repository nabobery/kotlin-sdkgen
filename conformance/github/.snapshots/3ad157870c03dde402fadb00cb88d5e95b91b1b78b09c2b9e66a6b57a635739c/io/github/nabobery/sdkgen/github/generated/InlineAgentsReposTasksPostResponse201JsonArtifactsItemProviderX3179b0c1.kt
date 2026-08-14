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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema/properties/artifacts/items/properties/provider
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonArtifactsItemProviderX3179b0c1.Serializer::class)
public sealed class InlineAgentsReposTasksPostResponse201JsonArtifactsItemProviderX3179b0c1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `github`.
   */
  public data object Github : InlineAgentsReposTasksPostResponse201JsonArtifactsItemProviderX3179b0c1() {
    public override val `value`: String = "github"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksPostResponse201JsonArtifactsItemProviderX3179b0c1()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksPostResponse201JsonArtifactsItemProviderX3179b0c1 = when (value) {
      Github.value -> Github
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonArtifactsItemProviderX3179b0c1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse201JsonArtifactsItemProviderX3179b0c1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonArtifactsItemProviderX3179b0c1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonArtifactsItemProviderX3179b0c1) {
      encoder.encodeString(value.value)
    }
  }
}
