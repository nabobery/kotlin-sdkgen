package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1variables~1{name}/patch/requestBody/content/app
 * lication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1variables~1{name}/patch/requestBody/content/app
 * lication~1json/schema
 */
@Serializable(with = InlineReposAgentsVariablesPatchRequestJsonX5337d0f3.Serializer::class)
public class InlineReposAgentsVariablesPatchRequestJsonX5337d0f3 internal constructor(
  private val nameState: FieldState<String>,
  private val valueState: FieldState<String>,
) {
  /**
   * The name of the variable.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * The value of the variable.
   */
  public val `value`: String?
    get() = valueState.valueOrNull()

  public constructor() : this(nameState = FieldState.Absent,
  valueState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `value`.
   */
  public fun valuePresence(): FieldPresence = valueState.presence

  public class Builder {
    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The name of the variable.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var valueState: FieldState<String> = FieldState.Absent

    /**
     * The value of the variable.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var `value`: String?
      get() = valueState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "value is not nullable; call unsetValue() to omit it" }
        valueState = FieldState.Value(present)
      }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `value` from serialized output.
     */
    public fun unsetValue() {
      valueState = FieldState.Absent
    }

    public fun build(): InlineReposAgentsVariablesPatchRequestJsonX5337d0f3 = InlineReposAgentsVariablesPatchRequestJsonX5337d0f3(
      nameState = nameState,
      valueState = valueState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAgentsVariablesPatchRequestJsonX5337d0f3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposAgentsVariablesPatchRequestJsonX5337d0f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAgentsVariablesPatchRequestJsonX5337d0f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAgentsVariablesPatchRequestJsonX5337d0f3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAgentsVariablesPatchRequestJsonX5337d0f3 must be a JSON object")
      return InlineReposAgentsVariablesPatchRequestJsonX5337d0f3(
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        valueState = json.decodeOptional(rawObject, "value", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAgentsVariablesPatchRequestJsonX5337d0f3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAgentsVariablesPatchRequestJsonX5337d0f3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("value", value.valueState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAgentsVariablesPatchRequestJsonX5337d0f3(block: InlineReposAgentsVariablesPatchRequestJsonX5337d0f3.Builder.() -> Unit): InlineReposAgentsVariablesPatchRequestJsonX5337d0f3 = InlineReposAgentsVariablesPatchRequestJsonX5337d0f3.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposAgentsVariablesPatchRequestJsonX5337d0f3 property '" + name + "' is not nullable")
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
