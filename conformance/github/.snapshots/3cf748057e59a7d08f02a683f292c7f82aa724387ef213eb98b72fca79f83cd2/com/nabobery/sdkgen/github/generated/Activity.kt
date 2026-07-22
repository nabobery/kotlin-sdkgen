package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Activity
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/activity
 */
@Serializable(with = Activity.Serializer::class)
public class Activity(
  /**
   * The type of the activity that was performed.
   */
  public val activityType: InlineActivityActivityTypeX3192d8e3,
  public val actor: NullableSimpleUser?,
  /**
   * The SHA of the commit after the activity.
   */
  public val after: String,
  /**
   * The SHA of the commit before the activity.
   */
  public val before: String,
  public val id: Int,
  public val nodeId: String,
  /**
   * The full Git reference, formatted as `refs/heads/<branch name>`.
   */
  public val ref: String,
  /**
   * The time when the activity occurred.
   */
  public val timestamp: String,
) {
  public class Builder {
    private var activityTypeValue: InlineActivityActivityTypeX3192d8e3? = null

    public var activityType: InlineActivityActivityTypeX3192d8e3
      get() = requireNotNull(activityTypeValue) { "activityType is required" }
      set(`value`) {
        activityTypeValue = value
      }

    private var afterValue: String? = null

    public var after: String
      get() = requireNotNull(afterValue) { "after is required" }
      set(`value`) {
        afterValue = value
      }

    private var beforeValue: String? = null

    public var before: String
      get() = requireNotNull(beforeValue) { "before is required" }
      set(`value`) {
        beforeValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var timestampValue: String? = null

    public var timestamp: String
      get() = requireNotNull(timestampValue) { "timestamp is required" }
      set(`value`) {
        timestampValue = value
      }

    private var actorState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var actor: NullableSimpleUser?
      get() = actorState.valueOrNull()
      set(`value`) {
        actorState = value.toNullableFieldState()
      }

    public fun build(): Activity {
      check(activityTypeValue != null) { "activityType is required" }
      check(afterValue != null) { "after is required" }
      check(beforeValue != null) { "before is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(refValue != null) { "ref is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(actorState !== FieldState.Absent) { "actor is required, even when null" }
      return Activity(
        activityType = activityType,
        actor = actorState.valueOrNull(),
        after = after,
        before = before,
        id = id,
        nodeId = nodeId,
        ref = ref,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Activity = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Activity> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Activity {
      val jsonDecoder = decoder.requireJsonDecoder("Activity")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Activity must be a JSON object")
      val activityType = json.decodeRequired<InlineActivityActivityTypeX3192d8e3>(rawObject, "activity_type")
      val after = json.decodeRequired<String>(rawObject, "after")
      val before = json.decodeRequired<String>(rawObject, "before")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      if (!rawObject.containsKey("actor")) {
        throw SerializationException("Activity is missing required property 'actor'")
      }
      val actor = rawObject["actor"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return Activity(
        activityType = activityType,
        actor = actor,
        after = after,
        before = before,
        id = id,
        nodeId = nodeId,
        ref = ref,
        timestamp = timestamp,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Activity) {
      val jsonEncoder = encoder.requireJsonEncoder("Activity")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("activity_type", json.encodeToJsonElement(value.activityType))
        put("actor", value.actor?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("after", value.after)
        put("before", value.before)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("ref", value.ref)
        put("timestamp", value.timestamp)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun activity(block: Activity.Builder.() -> Unit): Activity = Activity.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Activity is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Activity property '" + name + "' is not nullable")
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
