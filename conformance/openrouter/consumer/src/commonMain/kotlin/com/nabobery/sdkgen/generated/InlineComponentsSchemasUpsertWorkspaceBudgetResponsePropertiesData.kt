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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpsertWorkspaceBudgetResponse/properties/data.
 */
@Serializable(with = InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData.Serializer::class)
public class InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData(
  /**
   * ISO 8601 timestamp of when the budget was created
   */
  public val createdAt: String,
  /**
   * Unique identifier for the budget
   */
  public val id: String,
  /**
   * Spending limit in USD for this interval
   */
  public val limitUsd: Double,
  /**
   * Interval at which spend resets. Null means a lifetime (one-time) budget.
   */
  public val resetInterval: InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval?,
  /**
   * ISO 8601 timestamp of when the budget was last updated
   */
  public val updatedAt: String,
  /**
   * ID of the workspace the budget belongs to
   */
  public val workspaceId: String,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var limitUsdValue: Double? = null

    public var limitUsd: Double
      get() = requireNotNull(limitUsdValue) { "limitUsd is required" }
      set(`value`) {
        limitUsdValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var workspaceIdValue: String? = null

    public var workspaceId: String
      get() = requireNotNull(workspaceIdValue) { "workspaceId is required" }
      set(`value`) {
        workspaceIdValue = value
      }

    private var resetIntervalState:
        FieldState<InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval?> =
        FieldState.Absent

    /**
     * Interval at which spend resets. Null means a lifetime (one-time) budget.
     * Required nullable field; assigning `null` records present-null.
     */
    public var resetInterval: InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval?
      get() = resetIntervalState.valueOrNull()
      set(`value`) {
        resetIntervalState = value.toNullableFieldState()
      }

    public fun build(): InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(limitUsdValue != null) { "limitUsd is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(workspaceIdValue != null) { "workspaceId is required" }
      check(resetIntervalState !== FieldState.Absent) { "resetInterval is required, even when null" }
      return InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData(
        createdAt = createdAt,
        id = id,
        limitUsd = limitUsd,
        resetInterval = resetIntervalState.valueOrNull(),
        updatedAt = updatedAt,
        workspaceId = workspaceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData must be a " +
          "JSON object")
      val createdAt = json.decodeRequired<String>(raw, "created_at")
      val id = json.decodeRequired<String>(raw, "id")
      val limitUsd = json.decodeRequired<Double>(raw, "limit_usd")
      val updatedAt = json.decodeRequired<String>(raw, "updated_at")
      val workspaceId = json.decodeRequired<String>(raw, "workspace_id")
      if (!raw.containsKey("reset_interval")) {
        throw SerializationException("InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData is missing " +
          "required property 'reset_interval'")
      }
      val resetInterval = raw["reset_interval"].let { element -> if (element == JsonNull) null else json
























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval?>(requireNotNull(element)) }
      return InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData(
        createdAt = createdAt,
        id = id,
        limitUsd = limitUsd,
        resetInterval = resetInterval,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", value.id)
        put("limit_usd", json.encodeToJsonElement(value.limitUsd))
        put("reset_interval", value.resetInterval?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("workspace_id", value.workspaceId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData(block: InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData.Builder.() -> Unit): InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData = InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData is missing " +
      "required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineComponentsSchemasUpsertWorkspaceBudgetResponsePropertiesData " +
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
