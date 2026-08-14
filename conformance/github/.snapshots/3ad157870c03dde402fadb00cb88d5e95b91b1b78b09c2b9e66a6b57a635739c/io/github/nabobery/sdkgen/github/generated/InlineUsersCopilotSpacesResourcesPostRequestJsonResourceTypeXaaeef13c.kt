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
 * The type of resource to create.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1resources/post/requestBody/c
 * ontent/application~1json/schema/properties/resource_type
 */
@Serializable(with = InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c.Serializer::class)
public sealed class InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `github_file`.
   */
  public data object GithubFile : InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c() {
    public override val `value`: String = "github_file"
  }

  /**
   * Documented value. Wire value: `free_text`.
   */
  public data object FreeText : InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c() {
    public override val `value`: String = "free_text"
  }

  /**
   * Documented value. Wire value: `github_issue`.
   */
  public data object GithubIssue : InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c() {
    public override val `value`: String = "github_issue"
  }

  /**
   * Documented value. Wire value: `github_pull_request`.
   */
  public data object GithubPullRequest : InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c() {
    public override val `value`: String = "github_pull_request"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c = when (value) {
      Repository.value -> Repository
      GithubFile.value -> GithubFile
      FreeText.value -> FreeText
      GithubIssue.value -> GithubIssue
      GithubPullRequest.value -> GithubPullRequest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesResourcesPostRequestJsonResourceTypeXaaeef13c) {
      encoder.encodeString(value.value)
    }
  }
}
