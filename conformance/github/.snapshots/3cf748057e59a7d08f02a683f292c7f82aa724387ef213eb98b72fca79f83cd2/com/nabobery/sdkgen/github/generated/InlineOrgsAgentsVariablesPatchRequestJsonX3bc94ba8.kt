package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1variables~1{name}/patch/requestBody/content/application~1j
 * son/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1variables~1{name}/patch/requestBody/content/application~1j
 * son/schema
 */
@Serializable(with = InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8.Serializer::class)
public class InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8 internal constructor(
  private val nameState: FieldState<String>,
  private val selectedRepositoryIdsState: FieldState<List<Int>>,
  private val valueState: FieldState<String>,
  private val visibilityState:
      FieldState<InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a>,
) {
  /**
   * The name of the variable.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * An array of repository ids that can access the organization variable. You can only provide a list of repository ids
   * when the `visibility` is set to `selected`.
   */
  public val selectedRepositoryIds: List<Int>?
    get() = selectedRepositoryIdsState.valueOrNull()

  /**
   * The value of the variable.
   */
  public val `value`: String?
    get() = valueState.valueOrNull()

  /**
   * The type of repositories in the organization that can access the variable. `selected` means only the repositories
   * specified by `selected_repository_ids` can access the variable.
   */
  public val visibility: InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a?
    get() = visibilityState.valueOrNull()

  public constructor() : this(nameState = FieldState.Absent,
  selectedRepositoryIdsState = FieldState.Absent,
  valueState = FieldState.Absent,
  visibilityState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `selected_repository_ids`.
   */
  public fun selectedRepositoryIdsPresence(): FieldPresence = selectedRepositoryIdsState.presence

  /**
   * Returns the wire presence of `value`.
   */
  public fun valuePresence(): FieldPresence = valueState.presence

  /**
   * Returns the wire presence of `visibility`.
   */
  public fun visibilityPresence(): FieldPresence = visibilityState.presence

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

    private var selectedRepositoryIdsState: FieldState<List<Int>> = FieldState.Absent

    /**
     * An array of repository ids that can access the organization variable. You can only provide a list of repository
     * ids when the `visibility` is set to `selected`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "selectedRepositoryIds is not nullable; call unsetSelectedRepositoryIds() to omit it" }
        selectedRepositoryIdsState = FieldState.Value(present)
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

    private var visibilityState:
        FieldState<InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a> = FieldState.Absent

    /**
     * The type of repositories in the organization that can access the variable. `selected` means only the repositories
     * specified by `selected_repository_ids` can access the variable.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var visibility: InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a?
      get() = visibilityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "visibility is not nullable; call unsetVisibility() to omit it" }
        visibilityState = FieldState.Value(present)
      }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `selected_repository_ids` from serialized output.
     */
    public fun unsetSelectedRepositoryIds() {
      selectedRepositoryIdsState = FieldState.Absent
    }

    /**
     * Omits `value` from serialized output.
     */
    public fun unsetValue() {
      valueState = FieldState.Absent
    }

    /**
     * Omits `visibility` from serialized output.
     */
    public fun unsetVisibility() {
      visibilityState = FieldState.Absent
    }

    public fun build(): InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8 = InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8(
      nameState = nameState,
      selectedRepositoryIdsState = selectedRepositoryIdsState,
      valueState = valueState,
      visibilityState = visibilityState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8 must be a JSON object")
      return InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8(
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        selectedRepositoryIdsState = json.decodeOptional(rawObject, "selected_repository_ids", nullable = false),
        valueState = json.decodeOptional(rawObject, "value", nullable = false),
        visibilityState = json.decodeOptional(rawObject, "visibility", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("selected_repository_ids", value.selectedRepositoryIdsState, json::encodeToJsonElement)
        putState("value", value.valueState, json::encodeToJsonElement)
        putState("visibility", value.visibilityState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8(block: InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8.Builder.() -> Unit): InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8 = InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8 property '" + name + "' is not nullable")
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
