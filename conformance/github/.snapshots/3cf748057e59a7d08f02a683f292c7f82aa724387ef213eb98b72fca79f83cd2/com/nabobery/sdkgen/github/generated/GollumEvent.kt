package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/gollum-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gollum-event
 */
@Serializable(with = GollumEvent.Serializer::class)
public class GollumEvent(
  pages: List<InlineGollumEventPagesItemX67df06a1>,
) {
  public val pages: List<InlineGollumEventPagesItemX67df06a1> = pages.toList()

  public class Builder {
    private var pagesValue: List<InlineGollumEventPagesItemX67df06a1>? = null

    public var pages: List<InlineGollumEventPagesItemX67df06a1>
      get() = requireNotNull(pagesValue) { "pages is required" }
      set(`value`) {
        pagesValue = value
      }

    public fun build(): GollumEvent {
      check(pagesValue != null) { "pages is required" }
      return GollumEvent(
        pages = pages,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GollumEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GollumEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GollumEvent {
      val jsonDecoder = decoder.requireJsonDecoder("GollumEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GollumEvent must be a JSON object")
      val pages = json.decodeRequired<List<InlineGollumEventPagesItemX67df06a1>>(rawObject, "pages")
      return GollumEvent(
        pages = pages,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GollumEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("GollumEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pages", json.encodeToJsonElement(value.pages))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gollumEvent(block: GollumEvent.Builder.() -> Unit): GollumEvent = GollumEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GollumEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
