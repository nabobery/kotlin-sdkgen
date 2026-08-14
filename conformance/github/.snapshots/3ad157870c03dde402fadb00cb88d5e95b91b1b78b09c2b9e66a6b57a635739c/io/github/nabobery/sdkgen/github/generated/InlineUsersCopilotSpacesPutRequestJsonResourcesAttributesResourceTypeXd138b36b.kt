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
 * The type of resource.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}/put/requestBody/content/appli
 * cation~1json/schema/properties/resources_attributes/items/properties/resource_type
 */
@Serializable(with = InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b.Serializer::class)
public sealed class InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `github_file`.
   */
  public data object GithubFile : InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b() {
    public override val `value`: String = "github_file"
  }

  /**
   * Documented value. Wire value: `free_text`.
   */
  public data object FreeText : InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b() {
    public override val `value`: String = "free_text"
  }

  /**
   * Documented value. Wire value: `github_issue`.
   */
  public data object GithubIssue : InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b() {
    public override val `value`: String = "github_issue"
  }

  /**
   * Documented value. Wire value: `github_pull_request`.
   */
  public data object GithubPullRequest : InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b() {
    public override val `value`: String = "github_pull_request"
  }

  /**
   * Documented value. Wire value: `media_content`.
   */
  public data object MediaContent : InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b() {
    public override val `value`: String = "media_content"
  }

  /**
   * Documented value. Wire value: `uploaded_text_file`.
   */
  public data object UploadedTextFile : InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b() {
    public override val `value`: String = "uploaded_text_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b = when (value) {
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

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXd138b36b) {
      encoder.encodeString(value.value)
    }
  }
}
