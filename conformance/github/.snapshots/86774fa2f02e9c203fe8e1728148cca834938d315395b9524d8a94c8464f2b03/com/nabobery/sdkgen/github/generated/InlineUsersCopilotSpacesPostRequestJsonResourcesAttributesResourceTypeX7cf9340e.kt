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
 * The type of resource.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces/post/requestBody/content/application~1json/sc
 * hema/properties/resources_attributes/items/properties/resource_type
 */
@Serializable(with = InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e.Serializer::class)
public sealed class InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `github_file`.
   */
  public data object GithubFile : InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e() {
    public override val `value`: String = "github_file"
  }

  /**
   * Documented value. Wire value: `free_text`.
   */
  public data object FreeText : InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e() {
    public override val `value`: String = "free_text"
  }

  /**
   * Documented value. Wire value: `github_issue`.
   */
  public data object GithubIssue : InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e() {
    public override val `value`: String = "github_issue"
  }

  /**
   * Documented value. Wire value: `github_pull_request`.
   */
  public data object GithubPullRequest : InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e() {
    public override val `value`: String = "github_pull_request"
  }

  /**
   * Documented value. Wire value: `media_content`.
   */
  public data object MediaContent : InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e() {
    public override val `value`: String = "media_content"
  }

  /**
   * Documented value. Wire value: `uploaded_text_file`.
   */
  public data object UploadedTextFile : InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e() {
    public override val `value`: String = "uploaded_text_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e = when (value) {
      Repository.value -> Repository
      GithubFile.value -> GithubFile
      FreeText.value -> FreeText
      GithubIssue.value -> GithubIssue
      GithubPullRequest.value -> GithubPullRequest
      MediaContent.value -> MediaContent
      UploadedTextFile.value -> UploadedTextFile
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX7cf9340e) {
      encoder.encodeString(value.value)
    }
  }
}
