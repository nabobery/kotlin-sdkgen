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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/timeline-committed-event/properties/tree.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-committed-event/properties/tree
 */
@Serializable(with = InlineTimelineCommittedEventTreeXb337075b.Serializer::class)
public class InlineTimelineCommittedEventTreeXb337075b(
  /**
   * SHA for the commit
   */
  public val sha: String,
  public val url: String,
) {
  public class Builder {
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

    public fun build(): InlineTimelineCommittedEventTreeXb337075b {
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      return InlineTimelineCommittedEventTreeXb337075b(
        sha = sha,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTimelineCommittedEventTreeXb337075b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineTimelineCommittedEventTreeXb337075b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTimelineCommittedEventTreeXb337075b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTimelineCommittedEventTreeXb337075b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTimelineCommittedEventTreeXb337075b must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineTimelineCommittedEventTreeXb337075b(
        sha = sha,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTimelineCommittedEventTreeXb337075b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTimelineCommittedEventTreeXb337075b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTimelineCommittedEventTreeXb337075b(block: InlineTimelineCommittedEventTreeXb337075b.Builder.() -> Unit): InlineTimelineCommittedEventTreeXb337075b = InlineTimelineCommittedEventTreeXb337075b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTimelineCommittedEventTreeXb337075b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
