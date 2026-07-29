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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema/properties/tas
 * ks/items/properties/artifacts/items/properties/provider
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemProviderX8e0dd9bc.Serializer::class)
public sealed class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemProviderX8e0dd9bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `github`.
   */
  public data object Github : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemProviderX8e0dd9bc() {
    public override val `value`: String = "github"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemProviderX8e0dd9bc()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemProviderX8e0dd9bc = when (value) {
      Github.value -> Github
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemProviderX8e0dd9bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemProviderX8e0dd9bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemProviderX8e0dd9bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemProviderX8e0dd9bc) {
      encoder.encodeString(value.value)
    }
  }
}
