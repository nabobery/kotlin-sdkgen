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
 */
@Serializable(with = InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction.Serializer::class)
public class InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction(
  public val query: String,
  public val type:
      InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType,
  public val sources:
      List<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSourcesItems>? = null,
) {
  public class Builder {
    private var queryValue: String? = null

    public var query: String
      get() = requireNotNull(queryValue) { "query is required" }
      set(`value`) {
        queryValue = value
      }

    private var typeValue:
        InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType? = null

    public var type:
        InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var sources:
        List<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSourcesItems>?
        = null

    public fun build(): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction {
      check(queryValue != null) { "query is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction(
        query = query,
        type = type,
        sources = sources,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction must be a " +
          "JSON object")
      val query = json.decodeRequired<String>(raw, "query")
      val type = json
        .decodeRequired<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType>(raw, "type")
      return InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction(
        query = query,
        type = type,
        sources = raw["sources"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSourcesItems>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction")
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

public fun inlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction(block: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction.Builder.() -> Unit): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction = InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
