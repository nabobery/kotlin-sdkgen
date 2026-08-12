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
 * The type of item to add to the project. Must be either Issue or PullRequest.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1items/post/requestBody/content/appli
 * cation~1json/schema/properties/type
 */
@Serializable(with = InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6.Serializer::class)
public sealed class InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Issue`.
   */
  public data object Issue : InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6() {
    public override val `value`: String = "Issue"
  }

  /**
   * Documented value. Wire value: `PullRequest`.
   */
  public data object PullRequest : InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6() {
    public override val `value`: String = "PullRequest"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6 = when (value) {
      Issue.value -> Issue
      PullRequest.value -> PullRequest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6) {
      encoder.encodeString(value.value)
    }
  }
}
