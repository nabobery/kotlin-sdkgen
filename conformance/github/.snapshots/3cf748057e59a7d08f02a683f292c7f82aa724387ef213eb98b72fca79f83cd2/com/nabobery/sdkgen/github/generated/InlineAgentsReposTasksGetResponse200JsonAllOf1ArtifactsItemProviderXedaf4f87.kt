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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/0/properties/artifacts/items/properties/provider
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemProviderXedaf4f87.Serializer::class)
public sealed class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemProviderXedaf4f87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `github`.
   */
  public data object Github : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemProviderXedaf4f87() {
    public override val `value`: String = "github"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemProviderXedaf4f87()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemProviderXedaf4f87 = when (value) {
      Github.value -> Github
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemProviderXedaf4f87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemProviderXedaf4f87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemProviderXedaf4f87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemProviderXedaf4f87) {
      encoder.encodeString(value.value)
    }
  }
}
