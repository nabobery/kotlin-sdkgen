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
 * The deleted webhook. This will contain different keys based on the type of webhook it is: repository, organization,
 * business, app, or GitHub Marketplace.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted/properties/hook
 */
@Serializable(with = InlineWebhookMetaDeletedHookX7d6c0cae.Serializer::class)
public class InlineWebhookMetaDeletedHookX7d6c0cae(
  public val active: Boolean,
  public val config: InlineWebhookMetaDeletedHookConfigXe7072148,
  public val createdAt: String,
  events: List<InlineWebhookMetaDeletedHookEventsItemXc9816294>,
  public val id: Int,
  public val name: String,
  public val type: String,
  public val updatedAt: String,
) {
  public val events: List<InlineWebhookMetaDeletedHookEventsItemXc9816294> = events.toList()

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var configValue: InlineWebhookMetaDeletedHookConfigXe7072148? = null

    public var config: InlineWebhookMetaDeletedHookConfigXe7072148
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

    private var eventsValue: List<InlineWebhookMetaDeletedHookEventsItemXc9816294>? = null

    public var events: List<InlineWebhookMetaDeletedHookEventsItemXc9816294>
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

    public fun build(): InlineWebhookMetaDeletedHookX7d6c0cae {
      check(activeValue != null) { "active is required" }
      check(configValue != null) { "config is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsValue != null) { "events is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return InlineWebhookMetaDeletedHookX7d6c0cae(
        active = active,
        config = config,
        createdAt = createdAt,
        events = events,
        id = id,
        name = name,
        type = type,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMetaDeletedHookX7d6c0cae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookMetaDeletedHookX7d6c0cae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMetaDeletedHookX7d6c0cae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMetaDeletedHookX7d6c0cae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMetaDeletedHookX7d6c0cae must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val config = json.decodeRequired<InlineWebhookMetaDeletedHookConfigXe7072148>(rawObject, "config")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val events = json.decodeRequired<List<InlineWebhookMetaDeletedHookEventsItemXc9816294>>(rawObject, "events")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<String>(rawObject, "type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return InlineWebhookMetaDeletedHookX7d6c0cae(
        active = active,
        config = config,
        createdAt = createdAt,
        events = events,
        id = id,
        name = name,
        type = type,
        updatedAt = updatedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMetaDeletedHookX7d6c0cae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMetaDeletedHookX7d6c0cae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("config", json.encodeToJsonElement(value.config))
        put("created_at", value.createdAt)
        put("events", json.encodeToJsonElement(value.events))
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("type", value.type)
        put("updated_at", value.updatedAt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMetaDeletedHookX7d6c0cae(block: InlineWebhookMetaDeletedHookX7d6c0cae.Builder.() -> Unit): InlineWebhookMetaDeletedHookX7d6c0cae = InlineWebhookMetaDeletedHookX7d6c0cae.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMetaDeletedHookX7d6c0cae is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
