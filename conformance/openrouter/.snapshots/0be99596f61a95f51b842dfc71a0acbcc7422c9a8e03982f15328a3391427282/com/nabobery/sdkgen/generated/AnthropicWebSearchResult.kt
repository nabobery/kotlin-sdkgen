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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchResult
 */
@Serializable(with = AnthropicWebSearchResult.Serializer::class)
public class AnthropicWebSearchResult(
  public val encryptedContent: String,
  public val pageAge: String?,
  public val title: String,
  public val type: InlineAnthropicWebSearchResultTypeXd607578b,
  public val url: String,
) {
  public class Builder {
    private var encryptedContentValue: String? = null

    public var encryptedContent: String
      get() = requireNotNull(encryptedContentValue) { "encryptedContent is required" }
      set(`value`) {
        encryptedContentValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var typeValue: InlineAnthropicWebSearchResultTypeXd607578b? = null

    public var type: InlineAnthropicWebSearchResultTypeXd607578b
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

    private var pageAgeState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pageAge: String?
      get() = pageAgeState.valueOrNull()
      set(`value`) {
        pageAgeState = value.toNullableFieldState()
      }

    public fun build(): AnthropicWebSearchResult {
      check(encryptedContentValue != null) { "encryptedContent is required" }
      check(titleValue != null) { "title is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(pageAgeState !== FieldState.Absent) { "pageAge is required, even when null" }
      return AnthropicWebSearchResult(
        encryptedContent = encryptedContent,
        pageAge = pageAgeState.valueOrNull(),
        title = title,
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicWebSearchResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicWebSearchResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicWebSearchResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicWebSearchResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicWebSearchResult must be a JSON object")
      val encryptedContent = json.decodeRequired<String>(rawObject, "encrypted_content")
      val title = json.decodeRequired<String>(rawObject, "title")
      val type = json.decodeRequired<InlineAnthropicWebSearchResultTypeXd607578b>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("page_age")) {
        throw SerializationException("AnthropicWebSearchResult is missing required property 'page_age'")
      }
      val pageAge = rawObject["page_age"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicWebSearchResult(
        encryptedContent = encryptedContent,
        pageAge = pageAge,
        title = title,
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicWebSearchResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicWebSearchResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_content", value.encryptedContent)
        put("page_age", value.pageAge?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("title", value.title)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicWebSearchResult(block: AnthropicWebSearchResult.Builder.() -> Unit): AnthropicWebSearchResult = AnthropicWebSearchResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicWebSearchResult is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicWebSearchResult property '" + name + "' is not nullable")
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
