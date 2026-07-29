package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
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
 * The pull request associated with the rule evaluation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suite-pull-request/properties/pull_request
 */
@Serializable(with = InlineRuleSuitePullRequestPullRequestX2e7d19fe.Serializer::class)
public class InlineRuleSuitePullRequestPullRequestX2e7d19fe(
  /**
   * The unique identifier of the pull request.
   */
  public val id: Int? = null,
  /**
   * The number of the pull request.
   */
  public val number: Int? = null,
  reviews: List<InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1>? = null,
  /**
   * The user who created the pull request.
   */
  public val user: InlineRuleSuitePullRequestPullRequestUserXfc994745? = null,
) {
  /**
   * The reviews associated with the pull request.
   */
  public val reviews: List<InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1>? =
      reviews?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The unique identifier of the pull request.
     */
    public var id: Int? = null

    /**
     * The number of the pull request.
     */
    public var number: Int? = null

    private var reviewsValue: List<InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1>? =
        null

    /**
     * The reviews associated with the pull request.
     */
    public var reviews: List<InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1>?
      get() = reviewsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        reviewsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The user who created the pull request.
     */
    public var user: InlineRuleSuitePullRequestPullRequestUserXfc994745? = null

    public fun build(): InlineRuleSuitePullRequestPullRequestX2e7d19fe = InlineRuleSuitePullRequestPullRequestX2e7d19fe(
      id = id,
      number = number,
      reviews = reviews,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRuleSuitePullRequestPullRequestX2e7d19fe = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRuleSuitePullRequestPullRequestX2e7d19fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRuleSuitePullRequestPullRequestX2e7d19fe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRuleSuitePullRequestPullRequestX2e7d19fe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRuleSuitePullRequestPullRequestX2e7d19fe must be a JSON object")
      return InlineRuleSuitePullRequestPullRequestX2e7d19fe(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        number = rawObject["number"]?.let { json.decodeFromJsonElement<Int>(it) },
        reviews = rawObject["reviews"]?.let { json.decodeFromJsonElement<List<InlineRuleSuitePullRequestPullRequestReviewsItemX13d84cd1>>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<InlineRuleSuitePullRequestPullRequestUserXfc994745>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuitePullRequestPullRequestX2e7d19fe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRuleSuitePullRequestPullRequestX2e7d19fe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.number?.let { put("number", json.encodeToJsonElement(it)) }
        value.reviews?.let { put("reviews", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRuleSuitePullRequestPullRequestX2e7d19fe(block: InlineRuleSuitePullRequestPullRequestX2e7d19fe.Builder.() -> Unit): InlineRuleSuitePullRequestPullRequestX2e7d19fe = InlineRuleSuitePullRequestPullRequestX2e7d19fe.build(block)
