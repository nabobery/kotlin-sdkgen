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
 * Structured information about a refusal
 */
@Serializable(with = AnthropicRefusalStopDetails.Serializer::class)
public class AnthropicRefusalStopDetails(
  public val category: InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory?,
  public val explanation: String?,
  public val type: InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var categoryState:
        FieldState<InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var category: InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory?
      get() = categoryState.valueOrNull()
      set(`value`) {
        categoryState = value.toNullableFieldState()
      }

    private var explanationState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var explanation: String?
      get() = explanationState.valueOrNull()
      set(`value`) {
        explanationState = value.toNullableFieldState()
      }

    public fun build(): AnthropicRefusalStopDetails {
      check(typeValue != null) { "type is required" }
      check(categoryState !== FieldState.Absent) { "category is required, even when null" }
      check(explanationState !== FieldState.Absent) { "explanation is required, even when null" }
      return AnthropicRefusalStopDetails(
        category = categoryState.valueOrNull(),
        explanation = explanationState.valueOrNull(),
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicRefusalStopDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicRefusalStopDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicRefusalStopDetails {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicRefusalStopDetails")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicRefusalStopDetails must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesType>(raw, "type")
      if (!raw.containsKey("category")) {
        throw SerializationException("AnthropicRefusalStopDetails is missing required property 'category'")
      }
      val category = raw["category"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory?>(requireNotNull(element)) }
      if (!raw.containsKey("explanation")) {
        throw SerializationException("AnthropicRefusalStopDetails is missing required property 'explanation'")
      }
      val explanation = raw["explanation"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicRefusalStopDetails(
        category = category,
        explanation = explanation,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicRefusalStopDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicRefusalStopDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("category", value.category?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("explanation", value.explanation?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicRefusalStopDetails(block: AnthropicRefusalStopDetails.Builder.() ->
  Unit): AnthropicRefusalStopDetails = AnthropicRefusalStopDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicRefusalStopDetails is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicRefusalStopDetails property '" + name + "' is not nullable")
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
