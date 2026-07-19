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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/10.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10.Serializer::class)
public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 internal constructor(
  public val content: String?,
  public val type:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10Pra15a6989,
  private val cacheControlState: FieldState<AnthropicCacheControlDirective>,
) {
  public val cacheControl: AnthropicCacheControlDirective?
    get() = cacheControlState.valueOrNull()

  public constructor(content: String?,
    type: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10Pra15a6989) : this(content =
      content,
  type = type,
  cacheControlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `cache_control`.
   */
  public fun cacheControlPresence(): FieldPresence = cacheControlState.presence

  public class Builder {
    private var typeValue:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10Pra15a6989? =
        null

    public var type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10Pra15a6989
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var contentState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var content: String?
      get() = contentState.valueOrNull()
      set(`value`) {
        contentState = value.toNullableFieldState()
      }

    private var cacheControlState: FieldState<AnthropicCacheControlDirective> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var cacheControl: AnthropicCacheControlDirective?
      get() = cacheControlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "cacheControl is not nullable; call unsetCacheControl() to omit it" }
        cacheControlState = FieldState.Value(present)
      }

    /**
     * Omits `cache_control` from serialized output.
     */
    public fun unsetCacheControl() {
      cacheControlState = FieldState.Absent
    }

    public fun build(): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 {
      check(typeValue != null) { "type is required" }
      check(contentState !== FieldState.Absent) { "content is required, even when null" }
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10(
        content = contentState.valueOrNull(),
        type = type,
        cacheControlState = cacheControlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 " +
          "must be a JSON object")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10Pra15a6989>(raw,
          "type")
      if (!raw.containsKey("content")) {
        throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 " +
          "is missing required property 'content'")
      }
      val content = raw["content"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10(
        content = content,
        type = type,
        cacheControlState = json.decodeOptional(raw, "cache_control", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
        putState("cache_control", value.cacheControlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10(block: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10.Builder.() -> Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 is " +
      "missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 " +
      "property '" + name + "' is not nullable")
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
