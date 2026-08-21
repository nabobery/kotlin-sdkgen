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
 * The type of resource to create.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1resources/post/requestBody/content
 * /application~1json/schema/properties/resource_type
 */
@Serializable(with = InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab.Serializer::class)
public sealed class InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `github_file`.
   */
  public data object GithubFile : InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab() {
    public override val `value`: String = "github_file"
  }

  /**
   * Documented value. Wire value: `free_text`.
   */
  public data object FreeText : InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab() {
    public override val `value`: String = "free_text"
  }

  /**
   * Documented value. Wire value: `github_issue`.
   */
  public data object GithubIssue : InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab() {
    public override val `value`: String = "github_issue"
  }

  /**
   * Documented value. Wire value: `github_pull_request`.
   */
  public data object GithubPullRequest : InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab() {
    public override val `value`: String = "github_pull_request"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab = when (value) {
      Repository.value -> Repository
      GithubFile.value -> GithubFile
      FreeText.value -> FreeText
      GithubIssue.value -> GithubIssue
      GithubPullRequest.value -> GithubPullRequest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesResourcesPostRequestJsonResourceTypeX581d61ab) {
      encoder.encodeString(value.value)
    }
  }
}
