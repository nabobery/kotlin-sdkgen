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
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment/properties/_links/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment/properties/_links/properties/html
 */
@Serializable(with = InlinePullRequestReviewCommentLinksHtmlX2b95f5cd.Serializer::class)
public class InlinePullRequestReviewCommentLinksHtmlX2b95f5cd(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
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

    public fun build(): InlinePullRequestReviewCommentLinksHtmlX2b95f5cd {
      check(hrefValue != null) { "href is required" }
      return InlinePullRequestReviewCommentLinksHtmlX2b95f5cd(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewCommentLinksHtmlX2b95f5cd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePullRequestReviewCommentLinksHtmlX2b95f5cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentLinksHtmlX2b95f5cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewCommentLinksHtmlX2b95f5cd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewCommentLinksHtmlX2b95f5cd must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlinePullRequestReviewCommentLinksHtmlX2b95f5cd(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentLinksHtmlX2b95f5cd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewCommentLinksHtmlX2b95f5cd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestReviewCommentLinksHtmlX2b95f5cd(block: InlinePullRequestReviewCommentLinksHtmlX2b95f5cd.Builder.() -> Unit): InlinePullRequestReviewCommentLinksHtmlX2b95f5cd = InlinePullRequestReviewCommentLinksHtmlX2b95f5cd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewCommentLinksHtmlX2b95f5cd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
