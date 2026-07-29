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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The webhook that is being pinged
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-ping/properties/hook
 */
@Serializable(with = InlineWebhookPingHookXab113e63.Serializer::class)
public class InlineWebhookPingHookXab113e63(
  /**
   * Determines whether the hook is actually triggered for the events it subscribes to.
   */
  public val active: Boolean,
  public val config: InlineWebhookPingHookConfigXb62ac383,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  events: List<String>,
  /**
   * Unique identifier of the webhook.
   */
  public val id: Int,
  /**
   * The type of webhook. The only valid value is 'web'.
   */
  public val name: InlineWebhookPingHookNameX3d0e484a,
  public val type: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event to the webhook URL you
   * specified during registration. The GitHub App ID sent in this field is required for authenticating an app.
   */
  public val appId: Int? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val deliveriesUrl: String? = null,
  public val lastResponse: HookResponse? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pingUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val testUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  /**
   * Determines what events the hook is triggered for. Default: ['push'].
   */
  public val events: List<String> = events.toList()

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var configValue: InlineWebhookPingHookConfigXb62ac383? = null

    public var config: InlineWebhookPingHookConfigXb62ac383
      get() = requireNotNull(configValue) { "config is required" }
      set(`value`) {
        configValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var eventsValue: List<String>? = null

    public var events: List<String>
      get() = requireNotNull(eventsValue) { "events is required" }.toList()
      set(`value`) {
        eventsValue = value.toList()
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: InlineWebhookPingHookNameX3d0e484a? = null

    public var name: InlineWebhookPingHookNameX3d0e484a
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    /**
     * Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event to the webhook URL
     * you specified during registration. The GitHub App ID sent in this field is required for authenticating an app.
     */
    public var appId: Int? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var deliveriesUrl: String? = null

    public var lastResponse: HookResponse? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var pingUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var testUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): InlineWebhookPingHookXab113e63 {
      check(activeValue != null) { "active is required" }
      check(configValue != null) { "config is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsValue != null) { "events is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return InlineWebhookPingHookXab113e63(
        active = active,
        config = config,
        createdAt = createdAt,
        events = events,
        id = id,
        name = name,
        type = type,
        updatedAt = updatedAt,
        appId = appId,
        deliveriesUrl = deliveriesUrl,
        lastResponse = lastResponse,
        pingUrl = pingUrl,
        testUrl = testUrl,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPingHookXab113e63 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPingHookXab113e63> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPingHookXab113e63 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPingHookXab113e63")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPingHookXab113e63 must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val config = json.decodeRequired<InlineWebhookPingHookConfigXb62ac383>(rawObject, "config")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val events = json.decodeRequired<List<String>>(rawObject, "events")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<InlineWebhookPingHookNameX3d0e484a>(rawObject, "name")
      val type = json.decodeRequired<String>(rawObject, "type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return InlineWebhookPingHookXab113e63(
        active = active,
        config = config,
        createdAt = createdAt,
        events = events,
        id = id,
        name = name,
        type = type,
        updatedAt = updatedAt,
        appId = rawObject["app_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        deliveriesUrl = rawObject["deliveries_url"]?.let { json.decodeFromJsonElement<String>(it) },
        lastResponse = rawObject["last_response"]?.let { json.decodeFromJsonElement<HookResponse>(it) },
        pingUrl = rawObject["ping_url"]?.let { json.decodeFromJsonElement<String>(it) },
        testUrl = rawObject["test_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPingHookXab113e63) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPingHookXab113e63")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("config", json.encodeToJsonElement(value.config))
        put("created_at", value.createdAt)
        put("events", json.encodeToJsonElement(value.events))
        put("id", json.encodeToJsonElement(value.id))
        put("name", json.encodeToJsonElement(value.name))
        put("type", value.type)
        put("updated_at", value.updatedAt)
        value.appId?.let { put("app_id", json.encodeToJsonElement(it)) }
        value.deliveriesUrl?.let { put("deliveries_url", it) }
        value.lastResponse?.let { put("last_response", json.encodeToJsonElement(it)) }
        value.pingUrl?.let { put("ping_url", it) }
        value.testUrl?.let { put("test_url", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPingHookXab113e63(block: InlineWebhookPingHookXab113e63.Builder.() -> Unit): InlineWebhookPingHookXab113e63 = InlineWebhookPingHookXab113e63.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPingHookXab113e63 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
