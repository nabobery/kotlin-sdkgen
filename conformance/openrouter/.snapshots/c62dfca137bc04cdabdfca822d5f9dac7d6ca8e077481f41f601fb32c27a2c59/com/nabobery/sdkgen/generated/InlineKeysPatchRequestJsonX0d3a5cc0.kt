package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
 * sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/patch/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1keys~1{hash}/patch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineKeysPatchRequestJsonX0d3a5cc0.Serializer::class)
public class InlineKeysPatchRequestJsonX0d3a5cc0 internal constructor(
  private val disabledState: FieldState<Boolean>,
  private val includeByokInLimitState: FieldState<Boolean>,
  private val limitState: FieldState<Double?>,
  private val limitResetState: FieldState<InlineKeysPatchRequestJsonLimitResetXcae93884?>,
  private val nameState: FieldState<String>,
) {
  /**
   * Whether to disable the API key
   */
  public val disabled: Boolean?
    get() = disabledState.valueOrNull()

  /**
   * Whether to include BYOK usage in the limit
   */
  public val includeByokInLimit: Boolean?
    get() = includeByokInLimitState.valueOrNull()

  /**
   * New spending limit for the API key in USD
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val limit: Double?
    get() = limitState.valueOrNull()

  /**
   * New limit reset type for the API key (daily, weekly, monthly, or null for no reset). Resets happen automatically at
   * midnight UTC, and weeks are Monday through Sunday.
   */
  public val limitReset: InlineKeysPatchRequestJsonLimitResetXcae93884?
    get() = limitResetState.valueOrNull()

  /**
   * New name for the API key
   */
  public val name: String?
    get() = nameState.valueOrNull()

  public constructor() : this(disabledState = FieldState.Absent,
  includeByokInLimitState = FieldState.Absent,
  limitState = FieldState.Absent,
  limitResetState = FieldState.Absent,
  nameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `disabled`.
   */
  public fun disabledPresence(): FieldPresence = disabledState.presence

  /**
   * Returns the wire presence of `include_byok_in_limit`.
   */
  public fun includeByokInLimitPresence(): FieldPresence = includeByokInLimitState.presence

  /**
   * Returns the wire presence of `limit`.
   */
  public fun limitPresence(): FieldPresence = limitState.presence

  /**
   * Returns the wire presence of `limit_reset`.
   */
  public fun limitResetPresence(): FieldPresence = limitResetState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  public class Builder {
    private var disabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether to disable the API key
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var disabled: Boolean?
      get() = disabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "disabled is not nullable; call unsetDisabled() to omit it" }
        disabledState = FieldState.Value(present)
      }

    private var includeByokInLimitState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether to include BYOK usage in the limit
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var includeByokInLimit: Boolean?
      get() = includeByokInLimitState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "includeByokInLimit is not nullable; call unsetIncludeByokInLimit() to omit it" }
        includeByokInLimitState = FieldState.Value(present)
      }

    private var limitState: FieldState<Double?> = FieldState.Absent

    /**
     * New spending limit for the API key in USD
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var limit: Double?
      get() = limitState.valueOrNull()
      set(`value`) {
        limitState = value.toNullableFieldState()
      }

    private var limitResetState: FieldState<InlineKeysPatchRequestJsonLimitResetXcae93884?> =
        FieldState.Absent

    /**
     * New limit reset type for the API key (daily, weekly, monthly, or null for no reset). Resets happen automatically
     * at midnight UTC, and weeks are Monday through Sunday.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var limitReset: InlineKeysPatchRequestJsonLimitResetXcae93884?
      get() = limitResetState.valueOrNull()
      set(`value`) {
        limitResetState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * New name for the API key
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    /**
     * Omits `disabled` from serialized output.
     */
    public fun unsetDisabled() {
      disabledState = FieldState.Absent
    }

    /**
     * Omits `include_byok_in_limit` from serialized output.
     */
    public fun unsetIncludeByokInLimit() {
      includeByokInLimitState = FieldState.Absent
    }

    /**
     * Omits `limit` from serialized output.
     */
    public fun unsetLimit() {
      limitState = FieldState.Absent
    }

    /**
     * Omits `limit_reset` from serialized output.
     */
    public fun unsetLimitReset() {
      limitResetState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    public fun build(): InlineKeysPatchRequestJsonX0d3a5cc0 = InlineKeysPatchRequestJsonX0d3a5cc0(
      disabledState = disabledState,
      includeByokInLimitState = includeByokInLimitState,
      limitState = limitState,
      limitResetState = limitResetState,
      nameState = nameState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineKeysPatchRequestJsonX0d3a5cc0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineKeysPatchRequestJsonX0d3a5cc0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineKeysPatchRequestJsonX0d3a5cc0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineKeysPatchRequestJsonX0d3a5cc0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineKeysPatchRequestJsonX0d3a5cc0 must be a JSON object")
      return InlineKeysPatchRequestJsonX0d3a5cc0(
        disabledState = json.decodeOptional(rawObject, "disabled", nullable = false),
        includeByokInLimitState = json.decodeOptional(rawObject, "include_byok_in_limit", nullable = false),
        limitState = json.decodeOptional(rawObject, "limit", nullable = true),
        limitResetState = json.decodeOptional(rawObject, "limit_reset", nullable = true),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineKeysPatchRequestJsonX0d3a5cc0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineKeysPatchRequestJsonX0d3a5cc0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("disabled", value.disabledState, json::encodeToJsonElement)
        putState("include_byok_in_limit", value.includeByokInLimitState, json::encodeToJsonElement)
        putState("limit", value.limitState, json::encodeToJsonElement)
        putState("limit_reset", value.limitResetState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineKeysPatchRequestJsonX0d3a5cc0(block: InlineKeysPatchRequestJsonX0d3a5cc0.Builder.() -> Unit): InlineKeysPatchRequestJsonX0d3a5cc0 = InlineKeysPatchRequestJsonX0d3a5cc0.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineKeysPatchRequestJsonX0d3a5cc0 property '" + name + "' is not nullable")
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
