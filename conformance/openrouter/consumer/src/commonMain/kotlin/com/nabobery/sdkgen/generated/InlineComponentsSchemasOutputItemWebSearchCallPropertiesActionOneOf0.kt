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
 */
@Serializable(with = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0.Serializer::class)
public class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0(
  public val query: String,
  public val type:
      InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0PropertiesType,
  public val queries: List<String>? = null,
  public val sources: List<WebSearchSource>? = null,
) {
  public class Builder {
    private var queryValue: String? = null

    public var query: String
      get() = requireNotNull(queryValue) { "query is required" }
      set(`value`) {
        queryValue = value
      }

    private var typeValue:
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0PropertiesType? = null

    public var type:
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var queries: List<String>? = null

    public var sources: List<WebSearchSource>? = null

    public fun build(): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0 {
      check(queryValue != null) { "query is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0(
        query = query,
        type = type,
        queries = queries,
        sources = sources,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0 must be a " +
          "JSON object")
      val query = json.decodeRequired<String>(raw, "query")
      val type = json
        .decodeRequired<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0PropertiesType>(raw, "type")
      return InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0(
        query = query,
        type = type,
        queries = raw["queries"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        sources = raw["sources"]?.let { json.decodeFromJsonElement<List<WebSearchSource>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0")
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

public fun inlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0(block: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0.Builder.() -> Unit): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0 = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
