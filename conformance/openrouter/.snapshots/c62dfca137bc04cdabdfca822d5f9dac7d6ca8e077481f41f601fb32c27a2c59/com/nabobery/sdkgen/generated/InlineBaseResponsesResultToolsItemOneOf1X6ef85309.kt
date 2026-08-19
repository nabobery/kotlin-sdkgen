package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Function tool definition
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseResponsesResult/properties/tools/items/oneOf/0
 */
@Serializable(with = InlineBaseResponsesResultToolsItemOneOf1X6ef85309.Serializer::class)
public class InlineBaseResponsesResultToolsItemOneOf1X6ef85309 internal constructor(
  public val name: String,
  parameters: Map<String, JsonElement?>?,
  public val type: InlineFunctionToolTypeX23edb1b8,
  private val descriptionState: FieldState<String?>,
  private val strictState: FieldState<Boolean?>,
) {
  public val parameters: Map<String, JsonElement?>? =
      parameters?.let { collection0 -> collection0.toMap() }

  public val description: String?
    get() = descriptionState.valueOrNull()

  public val strict: Boolean?
    get() = strictState.valueOrNull()

  public constructor(
    name: String,
    parameters: Map<String, JsonElement?>?,
    type: InlineFunctionToolTypeX23edb1b8,
  ) : this(name = name,
  parameters = parameters,
  type = type,
  descriptionState = FieldState.Absent,
  strictState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `strict`.
   */
  public fun strictPresence(): FieldPresence = strictState.presence

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineFunctionToolTypeX23edb1b8? = null

    public var type: InlineFunctionToolTypeX23edb1b8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var parametersState: FieldState<Map<String, JsonElement?>?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var parameters: Map<String, JsonElement?>?
      get() = parametersState.valueOrNull()?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        parametersState = value?.let { collection0 -> collection0.toMap() }.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var strictState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var strict: Boolean?
      get() = strictState.valueOrNull()
      set(`value`) {
        strictState = value.toNullableFieldState()
      }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `strict` from serialized output.
     */
    public fun unsetStrict() {
      strictState = FieldState.Absent
    }

    public fun build(): InlineBaseResponsesResultToolsItemOneOf1X6ef85309 {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      check(parametersState !== FieldState.Absent) { "parameters is required, even when null" }
      return InlineBaseResponsesResultToolsItemOneOf1X6ef85309(
        name = name,
        parameters = parametersState.valueOrNull(),
        type = type,
        descriptionState = descriptionState,
        strictState = strictState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBaseResponsesResultToolsItemOneOf1X6ef85309 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBaseResponsesResultToolsItemOneOf1X6ef85309> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBaseResponsesResultToolsItemOneOf1X6ef85309 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBaseResponsesResultToolsItemOneOf1X6ef85309")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBaseResponsesResultToolsItemOneOf1X6ef85309 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineFunctionToolTypeX23edb1b8>(rawObject, "type")
      if (!rawObject.containsKey("parameters")) {
        throw SerializationException("InlineBaseResponsesResultToolsItemOneOf1X6ef85309 is missing required property 'parameters'")
      }
      val parameters = rawObject["parameters"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, JsonElement?>?>(requireNotNull(element)) }
      return InlineBaseResponsesResultToolsItemOneOf1X6ef85309(
        name = name,
        parameters = parameters,
        type = type,
        descriptionState = json.decodeOptional(rawObject, "description", nullable = true),
        strictState = json.decodeOptional(rawObject, "strict", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBaseResponsesResultToolsItemOneOf1X6ef85309) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBaseResponsesResultToolsItemOneOf1X6ef85309")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("parameters", value.parameters?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("strict", value.strictState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBaseResponsesResultToolsItemOneOf1X6ef85309(block: InlineBaseResponsesResultToolsItemOneOf1X6ef85309.Builder.() -> Unit): InlineBaseResponsesResultToolsItemOneOf1X6ef85309 = InlineBaseResponsesResultToolsItemOneOf1X6ef85309.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBaseResponsesResultToolsItemOneOf1X6ef85309 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineBaseResponsesResultToolsItemOneOf1X6ef85309 property '" + name + "' is not nullable")
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
