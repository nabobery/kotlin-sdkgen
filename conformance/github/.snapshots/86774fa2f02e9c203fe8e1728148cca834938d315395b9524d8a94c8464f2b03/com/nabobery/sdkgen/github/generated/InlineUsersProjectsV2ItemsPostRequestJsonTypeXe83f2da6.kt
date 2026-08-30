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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1items/post/requestBody/content
 * /application~1json/schema/properties/type
 */
@Serializable(with = InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6.Serializer::class)
public sealed class InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Issue`.
   */
  public data object Issue : InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6() {
    public override val `value`: String = "Issue"
  }

  /**
   * Documented value. Wire value: `PullRequest`.
   */
  public data object PullRequest : InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6() {
    public override val `value`: String = "PullRequest"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6 = when (value) {
      Issue.value -> Issue
      PullRequest.value -> PullRequest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6) {
      encoder.encodeString(value.value)
    }
  }
}
