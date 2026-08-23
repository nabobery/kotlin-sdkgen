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
 * sdkgen://source/openapi.yaml#/components/schemas/timeline-committed-event/properties/parents/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-committed-event/properties/parents/items
 */
@Serializable(with = InlineTimelineCommittedEventParentsItemX56555918.Serializer::class)
public class InlineTimelineCommittedEventParentsItemX56555918(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * SHA for the commit
   */
  public val sha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineTimelineCommittedEventParentsItemX56555918 {
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      return InlineTimelineCommittedEventParentsItemX56555918(
        htmlUrl = htmlUrl,
        sha = sha,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTimelineCommittedEventParentsItemX56555918 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTimelineCommittedEventParentsItemX56555918> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTimelineCommittedEventParentsItemX56555918 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTimelineCommittedEventParentsItemX56555918")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTimelineCommittedEventParentsItemX56555918 must be a JSON object")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineTimelineCommittedEventParentsItemX56555918(
        htmlUrl = htmlUrl,
        sha = sha,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTimelineCommittedEventParentsItemX56555918) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTimelineCommittedEventParentsItemX56555918")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html_url", value.htmlUrl)
        put("sha", value.sha)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTimelineCommittedEventParentsItemX56555918(block: InlineTimelineCommittedEventParentsItemX56555918.Builder.() -> Unit): InlineTimelineCommittedEventParentsItemX56555918 = InlineTimelineCommittedEventParentsItemX56555918.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTimelineCommittedEventParentsItemX56555918 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
