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
 * Org Hook
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-hook
 */
@Serializable(with = OrgHook.Serializer::class)
public class OrgHook(
  public val active: Boolean,
  public val config: InlineOrgHookConfigX1cfdc994,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  events: List<String>,
  public val id: Int,
  public val name: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pingUrl: String,
  public val type: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val deliveriesUrl: String? = null,
) {
  public val events: List<String> = events.toList()

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var configValue: InlineOrgHookConfigX1cfdc994? = null

    public var config: InlineOrgHookConfigX1cfdc994
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

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var deliveriesUrl: String? = null

    public fun build(): OrgHook {
      check(activeValue != null) { "active is required" }
      check(configValue != null) { "config is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsValue != null) { "events is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(pingUrlValue != null) { "pingUrl is required" }
      check(typeValue != null) { "type is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      return OrgHook(
        active = active,
        config = config,
        createdAt = createdAt,
        events = events,
        id = id,
        name = name,
        pingUrl = pingUrl,
        type = type,
        updatedAt = updatedAt,
        url = url,
        deliveriesUrl = deliveriesUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrgHook = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OrgHook> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrgHook {
      val jsonDecoder = decoder.requireJsonDecoder("OrgHook")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrgHook must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val config = json.decodeRequired<InlineOrgHookConfigX1cfdc994>(rawObject, "config")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val events = json.decodeRequired<List<String>>(rawObject, "events")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val pingUrl = json.decodeRequired<String>(rawObject, "ping_url")
      val type = json.decodeRequired<String>(rawObject, "type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      return OrgHook(
        active = active,
        config = config,
        createdAt = createdAt,
        events = events,
        id = id,
        name = name,
        pingUrl = pingUrl,
        type = type,
        updatedAt = updatedAt,
        url = url,
        deliveriesUrl = rawObject["deliveries_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrgHook) {
      val jsonEncoder = encoder.requireJsonEncoder("OrgHook")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("config", json.encodeToJsonElement(value.config))
        put("created_at", value.createdAt)
        put("events", json.encodeToJsonElement(value.events))
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("ping_url", value.pingUrl)
        put("type", value.type)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        value.deliveriesUrl?.let { put("deliveries_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun orgHook(block: OrgHook.Builder.() -> Unit): OrgHook = OrgHook.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrgHook is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
