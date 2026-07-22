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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews~1{review_id}~1dismissals/
 * put/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews~1{review_id}~1dismissals/
 * put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c.Serializer::class)
public class InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c(
  /**
   * The message for the pull request review dismissal
   */
  public val message: String,
  public val event: InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099? = null,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public var event: InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099? = null

    public fun build(): InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c {
      check(messageValue != null) { "message is required" }
      return InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c(
        message = message,
        event = event,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c(
        message = message,
        event = rawObject["event"]?.let { json.decodeFromJsonElement<InlineReposPullsReviewsDismissalsPutRequestJsonEventX06473099>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
        value.event?.let { put("event", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c(block: InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c.Builder.() -> Unit): InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c = InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPullsReviewsDismissalsPutRequestJsonX9929ec9c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
