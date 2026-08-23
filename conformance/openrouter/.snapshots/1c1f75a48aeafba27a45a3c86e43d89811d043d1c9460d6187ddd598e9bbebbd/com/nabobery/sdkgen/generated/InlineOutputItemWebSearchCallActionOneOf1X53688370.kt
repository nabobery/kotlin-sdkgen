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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/0
 */
@Serializable(with = InlineOutputItemWebSearchCallActionOneOf1X53688370.Serializer::class)
public class InlineOutputItemWebSearchCallActionOneOf1X53688370(
  public val query: String,
  public val type: InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba,
  queries: List<String>? = null,
  sources: List<WebSearchSource>? = null,
) {
  public val queries: List<String>? = queries?.let { collection0 -> collection0.toList() }

  public val sources: List<WebSearchSource>? = sources?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var queryValue: String? = null

    public var query: String
      get() = requireNotNull(queryValue) { "query is required" }
      set(`value`) {
        queryValue = value
      }

    private var typeValue: InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba? = null

    public var type: InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var queriesValue: List<String>? = null

    public var queries: List<String>?
      get() = queriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        queriesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var sourcesValue: List<WebSearchSource>? = null

    public var sources: List<WebSearchSource>?
      get() = sourcesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        sourcesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOutputItemWebSearchCallActionOneOf1X53688370 {
      check(queryValue != null) { "query is required" }
      check(typeValue != null) { "type is required" }
      return InlineOutputItemWebSearchCallActionOneOf1X53688370(
        query = query,
        type = type,
        queries = queries,
        sources = sources,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputItemWebSearchCallActionOneOf1X53688370 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputItemWebSearchCallActionOneOf1X53688370> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputItemWebSearchCallActionOneOf1X53688370 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputItemWebSearchCallActionOneOf1X53688370")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputItemWebSearchCallActionOneOf1X53688370 must be a JSON object")
      val query = json.decodeRequired<String>(rawObject, "query")
      val type = json.decodeRequired<InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba>(rawObject, "type")
      return InlineOutputItemWebSearchCallActionOneOf1X53688370(
        query = query,
        type = type,
        queries = rawObject["queries"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        sources = rawObject["sources"]?.let { json.decodeFromJsonElement<List<WebSearchSource>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemWebSearchCallActionOneOf1X53688370) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputItemWebSearchCallActionOneOf1X53688370")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("query", value.query)
        put("type", json.encodeToJsonElement(value.type))
        value.queries?.let { put("queries", json.encodeToJsonElement(it)) }
        value.sources?.let { put("sources", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputItemWebSearchCallActionOneOf1X53688370(block: InlineOutputItemWebSearchCallActionOneOf1X53688370.Builder.() -> Unit): InlineOutputItemWebSearchCallActionOneOf1X53688370 = InlineOutputItemWebSearchCallActionOneOf1X53688370.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputItemWebSearchCallActionOneOf1X53688370 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
