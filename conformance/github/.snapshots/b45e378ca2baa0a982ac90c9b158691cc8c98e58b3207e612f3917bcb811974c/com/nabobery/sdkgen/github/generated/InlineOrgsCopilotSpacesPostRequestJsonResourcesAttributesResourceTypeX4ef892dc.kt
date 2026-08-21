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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces/post/requestBody/content/application~1json/schema/p
 * roperties/resources_attributes/items/properties/resource_type
 */
@Serializable(with = InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc.Serializer::class)
public sealed class InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `github_file`.
   */
  public data object GithubFile : InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc() {
    public override val `value`: String = "github_file"
  }

  /**
   * Documented value. Wire value: `free_text`.
   */
  public data object FreeText : InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc() {
    public override val `value`: String = "free_text"
  }

  /**
   * Documented value. Wire value: `github_issue`.
   */
  public data object GithubIssue : InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc() {
    public override val `value`: String = "github_issue"
  }

  /**
   * Documented value. Wire value: `github_pull_request`.
   */
  public data object GithubPullRequest : InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc() {
    public override val `value`: String = "github_pull_request"
  }

  /**
   * Documented value. Wire value: `media_content`.
   */
  public data object MediaContent : InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc() {
    public override val `value`: String = "media_content"
  }

  /**
   * Documented value. Wire value: `uploaded_text_file`.
   */
  public data object UploadedTextFile : InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc() {
    public override val `value`: String = "uploaded_text_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc = when (value) {
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

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesPostRequestJsonResourcesAttributesResourceTypeX4ef892dc) {
      encoder.encodeString(value.value)
    }
  }
}
