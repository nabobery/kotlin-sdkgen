package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews~1{review_id}~1events/post
 * /requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews~1{review_id}~1events/post
 * /requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposPullsReviewsEventsPostRequestJsonX992628ca.Serializer::class)
public class InlineReposPullsReviewsEventsPostRequestJsonX992628ca(
  /**
   * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When
   * you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to
   * `PENDING`, which means you will need to re-submit the pull request review using a review action.
   */
  public val event: InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9,
  /**
   * The body text of the pull request review
   */
  public val body: String? = null,
) {
  public class Builder {
    private var eventValue: InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9? = null

    public var event: InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9
      get() = requireNotNull(eventValue) { "event is required" }
      set(`value`) {
        eventValue = value
      }

    /**
     * The body text of the pull request review
     */
    public var body: String? = null

    public fun build(): InlineReposPullsReviewsEventsPostRequestJsonX992628ca {
      check(eventValue != null) { "event is required" }
      return InlineReposPullsReviewsEventsPostRequestJsonX992628ca(
        event = event,
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsReviewsEventsPostRequestJsonX992628ca = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPullsReviewsEventsPostRequestJsonX992628ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsReviewsEventsPostRequestJsonX992628ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsReviewsEventsPostRequestJsonX992628ca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsReviewsEventsPostRequestJsonX992628ca must be a JSON object")
      val event = json.decodeRequired<InlineReposPullsReviewsEventsPostRequestJsonEventXecba16a9>(rawObject, "event")
      return InlineReposPullsReviewsEventsPostRequestJsonX992628ca(
        event = event,
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsReviewsEventsPostRequestJsonX992628ca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsReviewsEventsPostRequestJsonX992628ca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("event", json.encodeToJsonElement(value.event))
        value.body?.let { put("body", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsReviewsEventsPostRequestJsonX992628ca(block: InlineReposPullsReviewsEventsPostRequestJsonX992628ca.Builder.() -> Unit): InlineReposPullsReviewsEventsPostRequestJsonX992628ca = InlineReposPullsReviewsEventsPostRequestJsonX992628ca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPullsReviewsEventsPostRequestJsonX992628ca is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
