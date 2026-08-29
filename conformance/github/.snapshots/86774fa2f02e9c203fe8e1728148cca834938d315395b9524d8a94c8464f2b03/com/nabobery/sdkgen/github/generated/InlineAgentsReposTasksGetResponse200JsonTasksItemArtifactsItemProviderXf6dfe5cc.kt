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
 * Provider namespace
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema/properties/tasks/items/properties/artifacts/items/properties/provider
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemProviderXf6dfe5cc.Serializer::class)
public sealed class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemProviderXf6dfe5cc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `github`.
   */
  public data object Github : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemProviderXf6dfe5cc() {
    public override val `value`: String = "github"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemProviderXf6dfe5cc()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemProviderXf6dfe5cc = when (value) {
      Github.value -> Github
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemProviderXf6dfe5cc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemProviderXf6dfe5cc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemProviderXf6dfe5cc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemProviderXf6dfe5cc) {
      encoder.encodeString(value.value)
    }
  }
}
