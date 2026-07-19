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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlock.
 */
@Serializable(with = AnthropicDocumentBlock.Serializer::class)
public class AnthropicDocumentBlock internal constructor(
  public val source: InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource,
  public val title: String?,
  public val type: InlineComponentsSchemasAnthropicDocumentBlockPropertiesType,
  private val citationsState: FieldState<AnthropicCitationsConfig?>,
) {
  public val citations: AnthropicCitationsConfig?
    get() = citationsState.valueOrNull()

  public constructor(
    source: InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource,
    title: String?,
    type: InlineComponentsSchemasAnthropicDocumentBlockPropertiesType,
  ) : this(source = source,
  title = title,
  type = type,
  citationsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `citations`.
   */
  public fun citationsPresence(): FieldPresence = citationsState.presence

  public class Builder {
    private var sourceValue: InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource? = null

    public var source: InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicDocumentBlockPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicDocumentBlockPropertiesType
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

    private var citationsState: FieldState<AnthropicCitationsConfig?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var citations: AnthropicCitationsConfig?
      get() = citationsState.valueOrNull()
      set(`value`) {
        citationsState = value.toNullableFieldState()
      }

    /**
     * Omits `citations` from serialized output.
     */
    public fun unsetCitations() {
      citationsState = FieldState.Absent
    }

    public fun build(): AnthropicDocumentBlock {
      check(sourceValue != null) { "source is required" }
      check(typeValue != null) { "type is required" }
      check(titleState !== FieldState.Absent) { "title is required, even when null" }
      return AnthropicDocumentBlock(
        source = source,
        title = titleState.valueOrNull(),
        type = type,
        citationsState = citationsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicDocumentBlock = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicDocumentBlock> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicDocumentBlock {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicDocumentBlock")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicDocumentBlock must be a JSON object")
      val source = json.decodeRequired<InlineComponentsSchemasAnthropicDocumentBlockPropertiesSource>(raw, "source")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicDocumentBlockPropertiesType>(raw, "type")
      if (!raw.containsKey("title")) {
        throw SerializationException("AnthropicDocumentBlock is missing required property 'title'")
      }
      val title = raw["title"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicDocumentBlock(
        source = source,
        title = title,
        type = type,
        citationsState = json.decodeOptional(raw, "citations", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicDocumentBlock) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicDocumentBlock")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("source", json.encodeToJsonElement(value.source))
        put("title", value.title?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
        putState("citations", value.citationsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicDocumentBlock(block: AnthropicDocumentBlock.Builder.() -> Unit): AnthropicDocumentBlock =
  AnthropicDocumentBlock.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicDocumentBlock is missing required property '" +
    name + "'")
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
    if (!nullable) throw SerializationException("AnthropicDocumentBlock property '" + name + "' is not nullable")
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
