package com.nabobery.sdkgen.generated

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
 * The search action performed, matching OpenAI web_search_call.action shape. Includes the query the model issued and
 * optional source URLs returned by the search provider.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/action
 */
@Serializable(with = InlineOutputWebSearchServerToolItemActionX89d03dde.Serializer::class)
public class InlineOutputWebSearchServerToolItemActionX89d03dde(
  public val query: String,
  public val type: InlineOutputWebSearchServerToolItemActionTypeX26658207,
  sources: List<InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8>? = null,
) {
  public val sources: List<InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8>? =
      sources?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var queryValue: String? = null

    public var query: String
      get() = requireNotNull(queryValue) { "query is required" }
      set(`value`) {
        queryValue = value
      }

    private var typeValue: InlineOutputWebSearchServerToolItemActionTypeX26658207? = null

    public var type: InlineOutputWebSearchServerToolItemActionTypeX26658207
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var sourcesValue: List<InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8>? =
        null

    public var sources: List<InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8>?
      get() = sourcesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        sourcesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOutputWebSearchServerToolItemActionX89d03dde {
      check(queryValue != null) { "query is required" }
      check(typeValue != null) { "type is required" }
      return InlineOutputWebSearchServerToolItemActionX89d03dde(
        query = query,
        type = type,
        sources = sources,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputWebSearchServerToolItemActionX89d03dde = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputWebSearchServerToolItemActionX89d03dde> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputWebSearchServerToolItemActionX89d03dde {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputWebSearchServerToolItemActionX89d03dde")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputWebSearchServerToolItemActionX89d03dde must be a JSON object")
      val query = json.decodeRequired<String>(rawObject, "query")
      val type = json.decodeRequired<InlineOutputWebSearchServerToolItemActionTypeX26658207>(rawObject, "type")
      return InlineOutputWebSearchServerToolItemActionX89d03dde(
        query = query,
        type = type,
        sources = rawObject["sources"]?.let { json.decodeFromJsonElement<List<InlineOutputWebSearchServerToolItemActionSourcesItemX3582f5d8>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputWebSearchServerToolItemActionX89d03dde) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputWebSearchServerToolItemActionX89d03dde")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("query", value.query)
        put("type", json.encodeToJsonElement(value.type))
        value.sources?.let { put("sources", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputWebSearchServerToolItemActionX89d03dde(block: InlineOutputWebSearchServerToolItemActionX89d03dde.Builder.() -> Unit): InlineOutputWebSearchServerToolItemActionX89d03dde = InlineOutputWebSearchServerToolItemActionX89d03dde.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputWebSearchServerToolItemActionX89d03dde is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
