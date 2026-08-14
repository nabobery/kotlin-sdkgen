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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/timeline-reviewed-event/properties/_links/properties/pull_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/timeline-reviewed-event/properties/_links/properties/pull_request
 */
@Serializable(with = InlineTimelineReviewedEventLinksPullRequestX3325e81b.Serializer::class)
public class InlineTimelineReviewedEventLinksPullRequestX3325e81b(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineTimelineReviewedEventLinksPullRequestX3325e81b {
      check(hrefValue != null) { "href is required" }
      return InlineTimelineReviewedEventLinksPullRequestX3325e81b(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTimelineReviewedEventLinksPullRequestX3325e81b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTimelineReviewedEventLinksPullRequestX3325e81b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTimelineReviewedEventLinksPullRequestX3325e81b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTimelineReviewedEventLinksPullRequestX3325e81b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTimelineReviewedEventLinksPullRequestX3325e81b must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineTimelineReviewedEventLinksPullRequestX3325e81b(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTimelineReviewedEventLinksPullRequestX3325e81b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTimelineReviewedEventLinksPullRequestX3325e81b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTimelineReviewedEventLinksPullRequestX3325e81b(block: InlineTimelineReviewedEventLinksPullRequestX3325e81b.Builder.() -> Unit): InlineTimelineReviewedEventLinksPullRequestX3325e81b = InlineTimelineReviewedEventLinksPullRequestX3325e81b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTimelineReviewedEventLinksPullRequestX3325e81b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
