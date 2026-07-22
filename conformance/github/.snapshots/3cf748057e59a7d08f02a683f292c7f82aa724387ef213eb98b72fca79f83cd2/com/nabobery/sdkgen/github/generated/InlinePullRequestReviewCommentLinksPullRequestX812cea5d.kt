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
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment/properties/_links/properties/pull_reques
 * t.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment/properties/_links/properties/pull_reques
 * t
 */
@Serializable(with = InlinePullRequestReviewCommentLinksPullRequestX812cea5d.Serializer::class)
public class InlinePullRequestReviewCommentLinksPullRequestX812cea5d(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlinePullRequestReviewCommentLinksPullRequestX812cea5d {
      check(hrefValue != null) { "href is required" }
      return InlinePullRequestReviewCommentLinksPullRequestX812cea5d(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewCommentLinksPullRequestX812cea5d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePullRequestReviewCommentLinksPullRequestX812cea5d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentLinksPullRequestX812cea5d {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewCommentLinksPullRequestX812cea5d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewCommentLinksPullRequestX812cea5d must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlinePullRequestReviewCommentLinksPullRequestX812cea5d(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentLinksPullRequestX812cea5d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewCommentLinksPullRequestX812cea5d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestReviewCommentLinksPullRequestX812cea5d(block: InlinePullRequestReviewCommentLinksPullRequestX812cea5d.Builder.() -> Unit): InlinePullRequestReviewCommentLinksPullRequestX812cea5d = InlinePullRequestReviewCommentLinksPullRequestX812cea5d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewCommentLinksPullRequestX812cea5d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
