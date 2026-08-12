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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}/put/requestBody/content/application
 * ~1json/schema/properties/resources_attributes/items/properties/resource_type
 */
@Serializable(with = InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02.Serializer::class)
public sealed class InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `github_file`.
   */
  public data object GithubFile : InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02() {
    public override val `value`: String = "github_file"
  }

  /**
   * Documented value. Wire value: `free_text`.
   */
  public data object FreeText : InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02() {
    public override val `value`: String = "free_text"
  }

  /**
   * Documented value. Wire value: `github_issue`.
   */
  public data object GithubIssue : InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02() {
    public override val `value`: String = "github_issue"
  }

  /**
   * Documented value. Wire value: `github_pull_request`.
   */
  public data object GithubPullRequest : InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02() {
    public override val `value`: String = "github_pull_request"
  }

  /**
   * Documented value. Wire value: `media_content`.
   */
  public data object MediaContent : InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02() {
    public override val `value`: String = "media_content"
  }

  /**
   * Documented value. Wire value: `uploaded_text_file`.
   */
  public data object UploadedTextFile : InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02() {
    public override val `value`: String = "uploaded_text_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02 = when (value) {
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

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesPutRequestJsonResourcesAttributesResourceTypeXa05ceb02) {
      encoder.encodeString(value.value)
    }
  }
}
