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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchBlock.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchBlock
 */
@Serializable(with = AnthropicWebFetchBlock.Serializer::class)
public class AnthropicWebFetchBlock(
  public val content: AnthropicDocumentBlock,
  public val retrievedAt: String?,
  public val type: InlineAnthropicWebFetchBlockTypeX712efb12,
  public val url: String,
) {
  public class Builder {
    private var contentValue: AnthropicDocumentBlock? = null

    public var content: AnthropicDocumentBlock
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var typeValue: InlineAnthropicWebFetchBlockTypeX712efb12? = null

    public var type: InlineAnthropicWebFetchBlockTypeX712efb12
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

    private var retrievedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var retrievedAt: String?
      get() = retrievedAtState.valueOrNull()
      set(`value`) {
        retrievedAtState = value.toNullableFieldState()
      }

    public fun build(): AnthropicWebFetchBlock {
      check(contentValue != null) { "content is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(retrievedAtState !== FieldState.Absent) { "retrievedAt is required, even when null" }
      return AnthropicWebFetchBlock(
        content = content,
        retrievedAt = retrievedAtState.valueOrNull(),
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicWebFetchBlock = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicWebFetchBlock> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicWebFetchBlock {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicWebFetchBlock")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicWebFetchBlock must be a JSON object")
      val content = json.decodeRequired<AnthropicDocumentBlock>(rawObject, "content")
      val type = json.decodeRequired<InlineAnthropicWebFetchBlockTypeX712efb12>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("retrieved_at")) {
        throw SerializationException("AnthropicWebFetchBlock is missing required property 'retrieved_at'")
      }
      val retrievedAt = rawObject["retrieved_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicWebFetchBlock(
        content = content,
        retrievedAt = retrievedAt,
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicWebFetchBlock) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicWebFetchBlock")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("retrieved_at", value.retrievedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicWebFetchBlock(block: AnthropicWebFetchBlock.Builder.() -> Unit): AnthropicWebFetchBlock = AnthropicWebFetchBlock.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicWebFetchBlock is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicWebFetchBlock property '" + name + "' is not nullable")
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
