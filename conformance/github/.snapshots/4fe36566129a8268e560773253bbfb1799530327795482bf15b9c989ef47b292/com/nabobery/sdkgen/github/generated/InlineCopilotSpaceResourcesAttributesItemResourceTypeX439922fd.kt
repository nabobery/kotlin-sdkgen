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
 * sdkgen://source/openapi.yaml#/components/schemas/copilot-space/properties/resources_attributes/items/properties/resou
 * rce_type
 */
@Serializable(with = InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd.Serializer::class)
public sealed class InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `github_file`.
   */
  public data object GithubFile : InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd() {
    public override val `value`: String = "github_file"
  }

  /**
   * Documented value. Wire value: `free_text`.
   */
  public data object FreeText : InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd() {
    public override val `value`: String = "free_text"
  }

  /**
   * Documented value. Wire value: `github_issue`.
   */
  public data object GithubIssue : InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd() {
    public override val `value`: String = "github_issue"
  }

  /**
   * Documented value. Wire value: `github_pull_request`.
   */
  public data object GithubPullRequest : InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd() {
    public override val `value`: String = "github_pull_request"
  }

  /**
   * Documented value. Wire value: `media_content`.
   */
  public data object MediaContent : InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd() {
    public override val `value`: String = "media_content"
  }

  /**
   * Documented value. Wire value: `uploaded_text_file`.
   */
  public data object UploadedTextFile : InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd() {
    public override val `value`: String = "uploaded_text_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd = when (value) {
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

  internal object Serializer : KSerializer<InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceResourcesAttributesItemResourceTypeX439922fd) {
      encoder.encodeString(value.value)
    }
  }
}
