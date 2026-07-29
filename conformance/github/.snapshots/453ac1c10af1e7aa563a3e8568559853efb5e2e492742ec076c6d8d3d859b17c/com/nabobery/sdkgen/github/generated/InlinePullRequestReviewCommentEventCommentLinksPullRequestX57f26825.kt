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
 * ks/properties/pull_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment/properties/_lin
 * ks/properties/pull_request
 */
@Serializable(with = InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825.Serializer::class)
public class InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825(
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

    public fun build(): InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825 {
      check(hrefValue != null) { "href is required" }
      return InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825(block: InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825.Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825 = InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentLinksPullRequestX57f26825 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
