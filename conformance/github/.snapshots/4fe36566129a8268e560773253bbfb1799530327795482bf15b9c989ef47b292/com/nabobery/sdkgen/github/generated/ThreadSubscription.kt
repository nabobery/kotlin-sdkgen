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
 * Thread Subscription
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/thread-subscription
 */
@Serializable(with = ThreadSubscription.Serializer::class)
public class ThreadSubscription internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String?,
  public val ignored: Boolean,
  public val reason: String?,
  public val subscribed: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val repositoryUrlState: FieldState<String>,
  private val threadUrlState: FieldState<String>,
) {
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoryUrl: String?
    get() = repositoryUrlState.valueOrNull()

  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val threadUrl: String?
    get() = threadUrlState.valueOrNull()

  public constructor(
    createdAt: String?,
    ignored: Boolean,
    reason: String?,
    subscribed: Boolean,
    url: String,
  ) : this(createdAt = createdAt,
  ignored = ignored,
  reason = reason,
  subscribed = subscribed,
  url = url,
  repositoryUrlState = FieldState.Absent,
  threadUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `repository_url`.
   */
  public fun repositoryUrlPresence(): FieldPresence = repositoryUrlState.presence

  /**
   * Returns the wire presence of `thread_url`.
   */
  public fun threadUrlPresence(): FieldPresence = threadUrlState.presence

  public class Builder {
    private var ignoredValue: Boolean? = null

    public var ignored: Boolean
      get() = requireNotNull(ignoredValue) { "ignored is required" }
      set(`value`) {
        ignoredValue = value
      }

    private var subscribedValue: Boolean? = null

    public var subscribed: Boolean
      get() = requireNotNull(subscribedValue) { "subscribed is required" }
      set(`value`) {
        subscribedValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
      }

    private var reasonState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var reason: String?
      get() = reasonState.valueOrNull()
      set(`value`) {
        reasonState = value.toNullableFieldState()
      }

    private var repositoryUrlState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var repositoryUrl: String?
      get() = repositoryUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "repositoryUrl is not nullable; call unsetRepositoryUrl() to omit it" }
        repositoryUrlState = FieldState.Value(present)
      }

    private var threadUrlState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var threadUrl: String?
      get() = threadUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "threadUrl is not nullable; call unsetThreadUrl() to omit it" }
        threadUrlState = FieldState.Value(present)
      }

    /**
     * Omits `repository_url` from serialized output.
     */
    public fun unsetRepositoryUrl() {
      repositoryUrlState = FieldState.Absent
    }

    /**
     * Omits `thread_url` from serialized output.
     */
    public fun unsetThreadUrl() {
      threadUrlState = FieldState.Absent
    }

    public fun build(): ThreadSubscription {
      check(ignoredValue != null) { "ignored is required" }
      check(subscribedValue != null) { "subscribed is required" }
      check(urlValue != null) { "url is required" }
      check(createdAtState !== FieldState.Absent) { "createdAt is required, even when null" }
      check(reasonState !== FieldState.Absent) { "reason is required, even when null" }
      return ThreadSubscription(
        createdAt = createdAtState.valueOrNull(),
        ignored = ignored,
        reason = reasonState.valueOrNull(),
        subscribed = subscribed,
        url = url,
        repositoryUrlState = repositoryUrlState,
        threadUrlState = threadUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ThreadSubscription = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ThreadSubscription> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ThreadSubscription {
      val jsonDecoder = decoder.requireJsonDecoder("ThreadSubscription")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ThreadSubscription must be a JSON object")
      val ignored = json.decodeRequired<Boolean>(rawObject, "ignored")
      val subscribed = json.decodeRequired<Boolean>(rawObject, "subscribed")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("created_at")) {
        throw SerializationException("ThreadSubscription is missing required property 'created_at'")
      }
      val createdAt = rawObject["created_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("reason")) {
        throw SerializationException("ThreadSubscription is missing required property 'reason'")
      }
      val reason = rawObject["reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ThreadSubscription(
        createdAt = createdAt,
        ignored = ignored,
        reason = reason,
        subscribed = subscribed,
        url = url,
        repositoryUrlState = json.decodeOptional(rawObject, "repository_url", nullable = false),
        threadUrlState = json.decodeOptional(rawObject, "thread_url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ThreadSubscription) {
      val jsonEncoder = encoder.requireJsonEncoder("ThreadSubscription")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("ignored", json.encodeToJsonElement(value.ignored))
        put("reason", value.reason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("subscribed", json.encodeToJsonElement(value.subscribed))
        put("url", value.url)
        putState("repository_url", value.repositoryUrlState, json::encodeToJsonElement)
        putState("thread_url", value.threadUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun threadSubscription(block: ThreadSubscription.Builder.() -> Unit): ThreadSubscription = ThreadSubscription.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ThreadSubscription is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ThreadSubscription property '" + name + "' is not nullable")
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
