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
 * ks/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment/properties/_lin
 * ks/properties/self
 */
@Serializable(with = InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e.Serializer::class)
public class InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e {
      check(hrefValue != null) { "href is required" }
      return InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e(block: InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e.Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e = InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentLinksSelfX024ff06e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
