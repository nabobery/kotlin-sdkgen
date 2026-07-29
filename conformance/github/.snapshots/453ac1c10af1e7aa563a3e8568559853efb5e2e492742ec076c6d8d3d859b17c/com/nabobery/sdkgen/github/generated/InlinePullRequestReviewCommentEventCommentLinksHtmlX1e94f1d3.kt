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
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment/properties/_lin
 * ks/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment/properties/_lin
 * ks/properties/html
 */
@Serializable(with = InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3.Serializer::class)
public class InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3(
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3 {
      check(hrefValue != null) { "href is required" }
      return InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3(block: InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3.Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3 = InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentLinksHtmlX1e94f1d3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
