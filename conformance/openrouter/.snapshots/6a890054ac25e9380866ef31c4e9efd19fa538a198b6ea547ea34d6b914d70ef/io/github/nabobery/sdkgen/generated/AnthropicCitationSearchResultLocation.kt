package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationSearchResultLocation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationSearchResultLocation
 */
@Serializable(with = AnthropicCitationSearchResultLocation.Serializer::class)
public class AnthropicCitationSearchResultLocation(
  public val citedText: String,
  public val endBlockIndex: Int,
  public val searchResultIndex: Int,
  public val source: String,
  public val startBlockIndex: Int,
  public val title: String?,
  public val type: InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9,
) {
  public class Builder {
    private var citedTextValue: String? = null

    public var citedText: String
      get() = requireNotNull(citedTextValue) { "citedText is required" }
      set(`value`) {
        citedTextValue = value
      }

    private var endBlockIndexValue: Int? = null

    public var endBlockIndex: Int
      get() = requireNotNull(endBlockIndexValue) { "endBlockIndex is required" }
      set(`value`) {
        endBlockIndexValue = value
      }

    private var searchResultIndexValue: Int? = null

    public var searchResultIndex: Int
      get() = requireNotNull(searchResultIndexValue) { "searchResultIndex is required" }
      set(`value`) {
        searchResultIndexValue = value
      }

    private var sourceValue: String? = null

    public var source: String
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var startBlockIndexValue: Int? = null

    public var startBlockIndex: Int
      get() = requireNotNull(startBlockIndexValue) { "startBlockIndex is required" }
      set(`value`) {
        startBlockIndexValue = value
      }

    private var typeValue: InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9? = null

    public var type: InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var titleState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var title: String?
      get() = titleState.valueOrNull()
      set(`value`) {
        titleState = value.toNullableFieldState()
      }

    public fun build(): AnthropicCitationSearchResultLocation {
      check(citedTextValue != null) { "citedText is required" }
      check(endBlockIndexValue != null) { "endBlockIndex is required" }
      check(searchResultIndexValue != null) { "searchResultIndex is required" }
      check(sourceValue != null) { "source is required" }
      check(startBlockIndexValue != null) { "startBlockIndex is required" }
      check(typeValue != null) { "type is required" }
      check(titleState !== FieldState.Absent) { "title is required, even when null" }
      return AnthropicCitationSearchResultLocation(
        citedText = citedText,
        endBlockIndex = endBlockIndex,
        searchResultIndex = searchResultIndex,
        source = source,
        startBlockIndex = startBlockIndex,
        title = titleState.valueOrNull(),
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCitationSearchResultLocation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCitationSearchResultLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCitationSearchResultLocation {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCitationSearchResultLocation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCitationSearchResultLocation must be a JSON object")
      val citedText = json.decodeRequired<String>(rawObject, "cited_text")
      val endBlockIndex = json.decodeRequired<Int>(rawObject, "end_block_index")
      val searchResultIndex = json.decodeRequired<Int>(rawObject, "search_result_index")
      val source = json.decodeRequired<String>(rawObject, "source")
      val startBlockIndex = json.decodeRequired<Int>(rawObject, "start_block_index")
      val type = json.decodeRequired<InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9>(rawObject, "type")
      if (!rawObject.containsKey("title")) {
        throw SerializationException("AnthropicCitationSearchResultLocation is missing required property 'title'")
      }
      val title = rawObject["title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicCitationSearchResultLocation(
        citedText = citedText,
        endBlockIndex = endBlockIndex,
        searchResultIndex = searchResultIndex,
        source = source,
        startBlockIndex = startBlockIndex,
        title = title,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCitationSearchResultLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCitationSearchResultLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cited_text", value.citedText)
        put("end_block_index", json.encodeToJsonElement(value.endBlockIndex))
        put("search_result_index", json.encodeToJsonElement(value.searchResultIndex))
        put("source", value.source)
        put("start_block_index", json.encodeToJsonElement(value.startBlockIndex))
        put("title", value.title?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCitationSearchResultLocation(block: AnthropicCitationSearchResultLocation.Builder.() -> Unit): AnthropicCitationSearchResultLocation = AnthropicCitationSearchResultLocation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCitationSearchResultLocation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("AnthropicCitationSearchResultLocation property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
