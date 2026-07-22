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
 * Webhooks for repositories.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/hook
 */
@Serializable(with = Hook.Serializer::class)
public class Hook(
  /**
   * Determines whether the hook is actually triggered on pushes.
   */
  public val active: Boolean,
  public val config: WebhookConfig,
  public val createdAt: String,
  events: List<String>,
  /**
   * Unique identifier of the webhook.
   */
  public val id: Int,
  public val lastResponse: HookResponse,
  /**
   * The name of a valid service, use 'web' for a webhook.
   */
  public val name: String,
  public val pingUrl: String,
  public val testUrl: String,
  public val type: String,
  public val updatedAt: String,
  public val url: String,
  public val deliveriesUrl: String? = null,
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

    private var configValue: WebhookConfig? = null

    public var config: WebhookConfig
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
      get() = requireNotNull(eventsValue) { "events is required" }
      set(`value`) {
        eventsValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var lastResponseValue: HookResponse? = null

    public var lastResponse: HookResponse
      get() = requireNotNull(lastResponseValue) { "lastResponse is required" }
      set(`value`) {
        lastResponseValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var pingUrlValue: String? = null

    public var pingUrl: String
      get() = requireNotNull(pingUrlValue) { "pingUrl is required" }
      set(`value`) {
        pingUrlValue = value
      }

    private var testUrlValue: String? = null

    public var testUrl: String
      get() = requireNotNull(testUrlValue) { "testUrl is required" }
      set(`value`) {
        testUrlValue = value
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

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var deliveriesUrl: String? = null

    public fun build(): Hook {
      check(activeValue != null) { "active is required" }
      check(configValue != null) { "config is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsValue != null) { "events is required" }
      check(idValue != null) { "id is required" }
      check(lastResponseValue != null) { "lastResponse is required" }
      check(nameValue != null) { "name is required" }
      check(pingUrlValue != null) { "pingUrl is required" }
      check(testUrlValue != null) { "testUrl is required" }
      check(typeValue != null) { "type is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      return Hook(
        active = active,
        config = config,
        createdAt = createdAt,
        events = events,
        id = id,
        lastResponse = lastResponse,
        name = name,
        pingUrl = pingUrl,
        testUrl = testUrl,
        type = type,
        updatedAt = updatedAt,
        url = url,
        deliveriesUrl = deliveriesUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Hook = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Hook> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Hook {
      val jsonDecoder = decoder.requireJsonDecoder("Hook")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Hook must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val config = json.decodeRequired<WebhookConfig>(rawObject, "config")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val events = json.decodeRequired<List<String>>(rawObject, "events")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val lastResponse = json.decodeRequired<HookResponse>(rawObject, "last_response")
      val name = json.decodeRequired<String>(rawObject, "name")
      val pingUrl = json.decodeRequired<String>(rawObject, "ping_url")
      val testUrl = json.decodeRequired<String>(rawObject, "test_url")
      val type = json.decodeRequired<String>(rawObject, "type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      return Hook(
        active = active,
        config = config,
        createdAt = createdAt,
        events = events,
        id = id,
        lastResponse = lastResponse,
        name = name,
        pingUrl = pingUrl,
        testUrl = testUrl,
        type = type,
        updatedAt = updatedAt,
        url = url,
        deliveriesUrl = rawObject["deliveries_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Hook) {
      val jsonEncoder = encoder.requireJsonEncoder("Hook")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("config", json.encodeToJsonElement(value.config))
        put("created_at", value.createdAt)
        put("events", json.encodeToJsonElement(value.events))
        put("id", json.encodeToJsonElement(value.id))
        put("last_response", json.encodeToJsonElement(value.lastResponse))
        put("name", value.name)
        put("ping_url", value.pingUrl)
        put("test_url", value.testUrl)
        put("type", value.type)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        value.deliveriesUrl?.let { put("deliveries_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun hook(block: Hook.Builder.() -> Unit): Hook = Hook.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Hook is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
