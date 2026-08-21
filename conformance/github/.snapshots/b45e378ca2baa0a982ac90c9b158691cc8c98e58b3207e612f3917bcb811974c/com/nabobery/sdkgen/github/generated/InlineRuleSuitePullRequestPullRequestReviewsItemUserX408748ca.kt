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
 * The user who submitted the review.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite-pull-request/properties/pull_request/properties/reviews/i
 * tems/properties/user
 */
@Serializable(with = InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca.Serializer::class)
public class InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca(
  /**
   * The unique identifier of the user.
   */
  public val id: Int? = null,
  /**
   * The handle for the GitHub user account.
   */
  public val login: String? = null,
  /**
   * The type of the user.
   */
  public val type: String? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the user.
     */
    public var id: Int? = null

    /**
     * The handle for the GitHub user account.
     */
    public var login: String? = null

    /**
     * The type of the user.
     */
    public var type: String? = null

    public fun build(): InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca = InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca(
      id = id,
      login = login,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca must be a JSON object")
      return InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        login = rawObject["login"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.login?.let { put("login", it) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca(block: InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca.Builder.() -> Unit): InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca = InlineRuleSuitePullRequestPullRequestReviewsItemUserX408748ca.build(block)
