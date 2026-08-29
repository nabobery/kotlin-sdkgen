package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationWebSearchResultLocation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationWebSearchResultLocation
 */
@Serializable(with = AnthropicCitationWebSearchResultLocation.Serializer::class)
public class AnthropicCitationWebSearchResultLocation(
  public val citedText: String,
  public val encryptedIndex: String,
  public val title: String?,
  public val type: InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2,
  public val url: String,
) {
  public class Builder {
    private var citedTextValue: String? = null

    public var citedText: String
      get() = requireNotNull(citedTextValue) { "citedText is required" }
      set(`value`) {
        citedTextValue = value
      }

    private var encryptedIndexValue: String? = null

    public var encryptedIndex: String
      get() = requireNotNull(encryptedIndexValue) { "encryptedIndex is required" }
      set(`value`) {
        encryptedIndexValue = value
      }

    private var typeValue: InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2? = null

    public var type: InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
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

    public fun build(): AnthropicCitationWebSearchResultLocation {
      check(citedTextValue != null) { "citedText is required" }
      check(encryptedIndexValue != null) { "encryptedIndex is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(titleState !== FieldState.Absent) { "title is required, even when null" }
      return AnthropicCitationWebSearchResultLocation(
        citedText = citedText,
        encryptedIndex = encryptedIndex,
        title = titleState.valueOrNull(),
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCitationWebSearchResultLocation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCitationWebSearchResultLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCitationWebSearchResultLocation {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCitationWebSearchResultLocation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCitationWebSearchResultLocation must be a JSON object")
      val citedText = json.decodeRequired<String>(rawObject, "cited_text")
      val encryptedIndex = json.decodeRequired<String>(rawObject, "encrypted_index")
      val type = json.decodeRequired<InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("title")) {
        throw SerializationException("AnthropicCitationWebSearchResultLocation is missing required property 'title'")
      }
      val title = rawObject["title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicCitationWebSearchResultLocation(
        citedText = citedText,
        encryptedIndex = encryptedIndex,
        title = title,
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCitationWebSearchResultLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCitationWebSearchResultLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cited_text", value.citedText)
        put("encrypted_index", value.encryptedIndex)
        put("title", value.title?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCitationWebSearchResultLocation(block: AnthropicCitationWebSearchResultLocation.Builder.() -> Unit): AnthropicCitationWebSearchResultLocation = AnthropicCitationWebSearchResultLocation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCitationWebSearchResultLocation is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicCitationWebSearchResultLocation property '" + name + "' is not nullable")
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
