package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/timeline-reviewed-event/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-reviewed-event/properties/_links
 */
@Serializable(with = InlineTimelineReviewedEventLinksX23bbde05.Serializer::class)
public class InlineTimelineReviewedEventLinksX23bbde05(
  public val html: InlineTimelineReviewedEventLinksHtmlX8f939348,
  public val pullRequest: InlineTimelineReviewedEventLinksPullRequestX3325e81b,
) {
  public class Builder {
    private var htmlValue: InlineTimelineReviewedEventLinksHtmlX8f939348? = null

    public var html: InlineTimelineReviewedEventLinksHtmlX8f939348
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue: InlineTimelineReviewedEventLinksPullRequestX3325e81b? = null

    public var pullRequest: InlineTimelineReviewedEventLinksPullRequestX3325e81b
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    public fun build(): InlineTimelineReviewedEventLinksX23bbde05 {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      return InlineTimelineReviewedEventLinksX23bbde05(
        html = html,
        pullRequest = pullRequest,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTimelineReviewedEventLinksX23bbde05 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTimelineReviewedEventLinksX23bbde05> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTimelineReviewedEventLinksX23bbde05 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTimelineReviewedEventLinksX23bbde05")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTimelineReviewedEventLinksX23bbde05 must be a JSON object")
      val html = json.decodeRequired<InlineTimelineReviewedEventLinksHtmlX8f939348>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlineTimelineReviewedEventLinksPullRequestX3325e81b>(rawObject, "pull_request")
      return InlineTimelineReviewedEventLinksX23bbde05(
        html = html,
        pullRequest = pullRequest,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTimelineReviewedEventLinksX23bbde05) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTimelineReviewedEventLinksX23bbde05")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", json.encodeToJsonElement(value.html))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTimelineReviewedEventLinksX23bbde05(block: InlineTimelineReviewedEventLinksX23bbde05.Builder.() -> Unit): InlineTimelineReviewedEventLinksX23bbde05 = InlineTimelineReviewedEventLinksX23bbde05.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTimelineReviewedEventLinksX23bbde05 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
