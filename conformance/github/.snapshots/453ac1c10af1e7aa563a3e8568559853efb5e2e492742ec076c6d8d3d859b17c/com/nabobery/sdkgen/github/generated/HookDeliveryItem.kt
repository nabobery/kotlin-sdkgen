package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
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
 * Delivery made by a webhook, without request and response information.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/hook-delivery-item
 */
@Serializable(with = HookDeliveryItem.Serializer::class)
public class HookDeliveryItem internal constructor(
  /**
   * The type of activity for the event that triggered the delivery.
   */
  public val action: String?,
  /**
   * Time when the webhook delivery occurred.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val deliveredAt: String,
  /**
   * Time spent delivering.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val duration: Double,
  /**
   * The event that triggered the delivery.
   */
  public val event: String,
  /**
   * Unique identifier for the event (shared with all deliveries for all webhooks that subscribe to this event).
   */
  public val guid: String,
  /**
   * Unique identifier of the webhook delivery.
   */
  public val id: Long,
  /**
   * The id of the GitHub App installation associated with this event.
   */
  public val installationId: Long?,
  /**
   * Whether the webhook delivery is a redelivery.
   */
  public val redelivery: Boolean,
  /**
   * The id of the repository associated with this event.
   */
  public val repositoryId: Long?,
  /**
   * Describes the response returned after attempting the delivery.
   */
  public val status: String,
  /**
   * Status code received when delivery was made.
   */
  public val statusCode: Int,
  private val throttledAtState: FieldState<String?>,
) {
  /**
   * Time when the webhook delivery was throttled.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val throttledAt: String?
    get() = throttledAtState.valueOrNull()

  public constructor(
    action: String?,
    deliveredAt: String,
    duration: Double,
    event: String,
    guid: String,
    id: Long,
    installationId: Long?,
    redelivery: Boolean,
    repositoryId: Long?,
    status: String,
    statusCode: Int,
  ) : this(action = action,
  deliveredAt = deliveredAt,
  duration = duration,
  event = event,
  guid = guid,
  id = id,
  installationId = installationId,
  redelivery = redelivery,
  repositoryId = repositoryId,
  status = status,
  statusCode = statusCode,
  throttledAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `throttled_at`.
   */
  public fun throttledAtPresence(): FieldPresence = throttledAtState.presence

  public class Builder {
    private var deliveredAtValue: String? = null

    public var deliveredAt: String
      get() = requireNotNull(deliveredAtValue) { "deliveredAt is required" }
      set(`value`) {
        deliveredAtValue = value
      }

    private var durationValue: Double? = null

    public var duration: Double
      get() = requireNotNull(durationValue) { "duration is required" }
      set(`value`) {
        durationValue = value
      }

    private var eventValue: String? = null

    public var event: String
      get() = requireNotNull(eventValue) { "event is required" }
      set(`value`) {
        eventValue = value
      }

    private var guidValue: String? = null

    public var guid: String
      get() = requireNotNull(guidValue) { "guid is required" }
      set(`value`) {
        guidValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var redeliveryValue: Boolean? = null

    public var redelivery: Boolean
      get() = requireNotNull(redeliveryValue) { "redelivery is required" }
      set(`value`) {
        redeliveryValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusCodeValue: Int? = null

    public var statusCode: Int
      get() = requireNotNull(statusCodeValue) { "statusCode is required" }
      set(`value`) {
        statusCodeValue = value
      }

    private var actionState: FieldState<String?> = FieldState.Absent

    /**
     * The type of activity for the event that triggered the delivery.
     * Required nullable field; assigning `null` records present-null.
     */
    public var action: String?
      get() = actionState.valueOrNull()
      set(`value`) {
        actionState = value.toNullableFieldState()
      }

    private var installationIdState: FieldState<Long?> = FieldState.Absent

    /**
     * The id of the GitHub App installation associated with this event.
     * Required nullable field; assigning `null` records present-null.
     */
    public var installationId: Long?
      get() = installationIdState.valueOrNull()
      set(`value`) {
        installationIdState = value.toNullableFieldState()
      }

    private var repositoryIdState: FieldState<Long?> = FieldState.Absent

    /**
     * The id of the repository associated with this event.
     * Required nullable field; assigning `null` records present-null.
     */
    public var repositoryId: Long?
      get() = repositoryIdState.valueOrNull()
      set(`value`) {
        repositoryIdState = value.toNullableFieldState()
      }

    private var throttledAtState: FieldState<String?> = FieldState.Absent

    /**
     * Time when the webhook delivery was throttled.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var throttledAt: String?
      get() = throttledAtState.valueOrNull()
      set(`value`) {
        throttledAtState = value.toNullableFieldState()
      }

    /**
     * Omits `throttled_at` from serialized output.
     */
    public fun unsetThrottledAt() {
      throttledAtState = FieldState.Absent
    }

    public fun build(): HookDeliveryItem {
      check(deliveredAtValue != null) { "deliveredAt is required" }
      check(durationValue != null) { "duration is required" }
      check(eventValue != null) { "event is required" }
      check(guidValue != null) { "guid is required" }
      check(idValue != null) { "id is required" }
      check(redeliveryValue != null) { "redelivery is required" }
      check(statusValue != null) { "status is required" }
      check(statusCodeValue != null) { "statusCode is required" }
      check(actionState !== FieldState.Absent) { "action is required, even when null" }
      check(installationIdState !== FieldState.Absent) { "installationId is required, even when null" }
      check(repositoryIdState !== FieldState.Absent) { "repositoryId is required, even when null" }
      return HookDeliveryItem(
        action = actionState.valueOrNull(),
        deliveredAt = deliveredAt,
        duration = duration,
        event = event,
        guid = guid,
        id = id,
        installationId = installationIdState.valueOrNull(),
        redelivery = redelivery,
        repositoryId = repositoryIdState.valueOrNull(),
        status = status,
        statusCode = statusCode,
        throttledAtState = throttledAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): HookDeliveryItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<HookDeliveryItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): HookDeliveryItem {
      val jsonDecoder = decoder.requireJsonDecoder("HookDeliveryItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("HookDeliveryItem must be a JSON object")
      val deliveredAt = json.decodeRequired<String>(rawObject, "delivered_at")
      val duration = json.decodeRequired<Double>(rawObject, "duration")
      val event = json.decodeRequired<String>(rawObject, "event")
      val guid = json.decodeRequired<String>(rawObject, "guid")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val redelivery = json.decodeRequired<Boolean>(rawObject, "redelivery")
      val status = json.decodeRequired<String>(rawObject, "status")
      val statusCode = json.decodeRequired<Int>(rawObject, "status_code")
      if (!rawObject.containsKey("action")) {
        throw SerializationException("HookDeliveryItem is missing required property 'action'")
      }
      val action = rawObject["action"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("installation_id")) {
        throw SerializationException("HookDeliveryItem is missing required property 'installation_id'")
      }
      val installationId = rawObject["installation_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Long?>(requireNotNull(element)) }
      if (!rawObject.containsKey("repository_id")) {
        throw SerializationException("HookDeliveryItem is missing required property 'repository_id'")
      }
      val repositoryId = rawObject["repository_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Long?>(requireNotNull(element)) }
      return HookDeliveryItem(
        action = action,
        deliveredAt = deliveredAt,
        duration = duration,
        event = event,
        guid = guid,
        id = id,
        installationId = installationId,
        redelivery = redelivery,
        repositoryId = repositoryId,
        status = status,
        statusCode = statusCode,
        throttledAtState = json.decodeOptional(rawObject, "throttled_at", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: HookDeliveryItem) {
      val jsonEncoder = encoder.requireJsonEncoder("HookDeliveryItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("delivered_at", value.deliveredAt)
        put("duration", json.encodeToJsonElement(value.duration))
        put("event", value.event)
        put("guid", value.guid)
        put("id", json.encodeToJsonElement(value.id))
        put("installation_id", value.installationId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("redelivery", json.encodeToJsonElement(value.redelivery))
        put("repository_id", value.repositoryId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", value.status)
        put("status_code", json.encodeToJsonElement(value.statusCode))
        putState("throttled_at", value.throttledAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun hookDeliveryItem(block: HookDeliveryItem.Builder.() -> Unit): HookDeliveryItem = HookDeliveryItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("HookDeliveryItem is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("HookDeliveryItem property '" + name + "' is not nullable")
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
