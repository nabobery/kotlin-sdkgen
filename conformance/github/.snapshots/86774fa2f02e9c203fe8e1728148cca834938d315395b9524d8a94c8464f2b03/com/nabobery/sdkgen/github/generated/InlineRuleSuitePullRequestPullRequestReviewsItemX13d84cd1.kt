package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
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
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite-pull-request/properties/pull_request/properties/reviews/i
 * tems.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite-pull-request/properties/pull_request/properties/reviews/i
 * tems
 */
@Serializable(with = InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1.Serializer::class)
public class InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1(
  /**
   * The unique identifier of the review.
   */
  public val id: Int? = null,
  /**
   * The state of the review.
   */
  public val state: String? = null,
  /**
   * The user who submitted the review.
   */
  public val user: InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the review.
     */
    public var id: Int? = null

    /**
     * The state of the review.
     */
    public var state: String? = null

    /**
     * The user who submitted the review.
     */
    public var user: InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca? = null

    public fun build(): InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1 = InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1(
      id = id,
      state = state,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1 must be a JSON object")
      return InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", it) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1(block: InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1.Builder.() -> Unit): InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1 = InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1.build(block)
