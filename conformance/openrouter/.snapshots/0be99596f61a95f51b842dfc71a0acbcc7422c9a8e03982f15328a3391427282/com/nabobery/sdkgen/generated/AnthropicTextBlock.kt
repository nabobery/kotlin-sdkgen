package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextBlock.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextBlock
 */
@Serializable(with = AnthropicTextBlock.Serializer::class)
public class AnthropicTextBlock(
  citations: List<AnthropicTextCitation>?,
  public val text: String,
  public val type: InlineAnthropicTextBlockTypeXbd960bad,
) {
  public val citations: List<AnthropicTextCitation>? =
      citations?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineAnthropicTextBlockTypeXbd960bad? = null

    public var type: InlineAnthropicTextBlockTypeXbd960bad
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var citationsState: FieldState<List<AnthropicTextCitation>?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var citations: List<AnthropicTextCitation>?
      get() = citationsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        citationsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    public fun build(): AnthropicTextBlock {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      check(citationsState !== FieldState.Absent) { "citations is required, even when null" }
      return AnthropicTextBlock(
        citations = citationsState.valueOrNull(),
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicTextBlock = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicTextBlock> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicTextBlock {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextBlock")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicTextBlock must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlineAnthropicTextBlockTypeXbd960bad>(rawObject, "type")
      if (!rawObject.containsKey("citations")) {
        throw SerializationException("AnthropicTextBlock is missing required property 'citations'")
      }
      val citations = rawObject["citations"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<AnthropicTextCitation>?>(requireNotNull(element)) }
      return AnthropicTextBlock(
        citations = citations,
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicTextBlock) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicTextBlock")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("citations", value.citations?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicTextBlock(block: AnthropicTextBlock.Builder.() -> Unit): AnthropicTextBlock = AnthropicTextBlock.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicTextBlock is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("AnthropicTextBlock property '" + name + "' is not nullable")
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
