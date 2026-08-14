package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-copilot-code-review/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-copilot-code-review/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df.Serializer::class)
public class InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df(
  /**
   * Copilot automatically reviews draft pull requests before they are marked as ready for review.
   */
  public val reviewDraftPullRequests: Boolean? = null,
  /**
   * Copilot automatically reviews each new push to the pull request.
   */
  public val reviewOnPush: Boolean? = null,
) {
  public class Builder {
    /**
     * Copilot automatically reviews draft pull requests before they are marked as ready for review.
     */
    public var reviewDraftPullRequests: Boolean? = null

    /**
     * Copilot automatically reviews each new push to the pull request.
     */
    public var reviewOnPush: Boolean? = null

    public fun build(): InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df = InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df(
      reviewDraftPullRequests = reviewDraftPullRequests,
      reviewOnPush = reviewOnPush,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df must be a JSON object")
      return InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df(
        reviewDraftPullRequests = rawObject["review_draft_pull_requests"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        reviewOnPush = rawObject["review_on_push"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reviewDraftPullRequests?.let { put("review_draft_pull_requests", json.encodeToJsonElement(it)) }
        value.reviewOnPush?.let { put("review_on_push", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleCopilotCodeReviewParametersX966bc8df(block: InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df.Builder.() -> Unit): InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df = InlineRepositoryRuleCopilotCodeReviewParametersX966bc8df.build(block)
