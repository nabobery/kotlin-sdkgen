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
 * The type of the resource.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space-resource/properties/resource_type
 */
@Serializable(with = InlineCopilotSpaceResourceResourceTypeX117bcc1c.Serializer::class)
public sealed class InlineCopilotSpaceResourceResourceTypeX117bcc1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineCopilotSpaceResourceResourceTypeX117bcc1c() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `github_file`.
   */
  public data object GithubFile : InlineCopilotSpaceResourceResourceTypeX117bcc1c() {
    public override val `value`: String = "github_file"
  }

  /**
   * Documented value. Wire value: `free_text`.
   */
  public data object FreeText : InlineCopilotSpaceResourceResourceTypeX117bcc1c() {
    public override val `value`: String = "free_text"
  }

  /**
   * Documented value. Wire value: `github_issue`.
   */
  public data object GithubIssue : InlineCopilotSpaceResourceResourceTypeX117bcc1c() {
    public override val `value`: String = "github_issue"
  }

  /**
   * Documented value. Wire value: `github_pull_request`.
   */
  public data object GithubPullRequest : InlineCopilotSpaceResourceResourceTypeX117bcc1c() {
    public override val `value`: String = "github_pull_request"
  }

  /**
   * Documented value. Wire value: `media_content`.
   */
  public data object MediaContent : InlineCopilotSpaceResourceResourceTypeX117bcc1c() {
    public override val `value`: String = "media_content"
  }

  /**
   * Documented value. Wire value: `uploaded_text_file`.
   */
  public data object UploadedTextFile : InlineCopilotSpaceResourceResourceTypeX117bcc1c() {
    public override val `value`: String = "uploaded_text_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotSpaceResourceResourceTypeX117bcc1c()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotSpaceResourceResourceTypeX117bcc1c = when (value) {
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

  public object Serializer : KSerializer<InlineCopilotSpaceResourceResourceTypeX117bcc1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCopilotSpaceResourceResourceTypeX117bcc1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceResourceResourceTypeX117bcc1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceResourceResourceTypeX117bcc1c) {
      encoder.encodeString(value.value)
    }
  }
}
