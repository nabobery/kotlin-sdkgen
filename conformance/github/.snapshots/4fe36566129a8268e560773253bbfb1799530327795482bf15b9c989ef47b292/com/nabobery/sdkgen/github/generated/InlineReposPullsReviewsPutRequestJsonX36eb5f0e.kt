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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews~1{review_id}/put/requestB
 * ody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1reviews~1{review_id}/put/requestB
 * ody/content/application~1json/schema
 */
@Serializable(with = InlineReposPullsReviewsPutRequestJsonX36eb5f0e.Serializer::class)
public class InlineReposPullsReviewsPutRequestJsonX36eb5f0e(
  /**
   * The body text of the pull request review.
   */
  public val body: String,
) {
  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    public fun build(): InlineReposPullsReviewsPutRequestJsonX36eb5f0e {
      check(bodyValue != null) { "body is required" }
      return InlineReposPullsReviewsPutRequestJsonX36eb5f0e(
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsReviewsPutRequestJsonX36eb5f0e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPullsReviewsPutRequestJsonX36eb5f0e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsReviewsPutRequestJsonX36eb5f0e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsReviewsPutRequestJsonX36eb5f0e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsReviewsPutRequestJsonX36eb5f0e must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      return InlineReposPullsReviewsPutRequestJsonX36eb5f0e(
        body = body,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsReviewsPutRequestJsonX36eb5f0e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsReviewsPutRequestJsonX36eb5f0e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsReviewsPutRequestJsonX36eb5f0e(block: InlineReposPullsReviewsPutRequestJsonX36eb5f0e.Builder.() -> Unit): InlineReposPullsReviewsPutRequestJsonX36eb5f0e = InlineReposPullsReviewsPutRequestJsonX36eb5f0e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPullsReviewsPutRequestJsonX36eb5f0e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
