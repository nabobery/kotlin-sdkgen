package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1hooks/post/requestBody/content/application~1json/schema
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1hooks/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposHooksPostRequestJsonXc6196618.Serializer::class)
public class InlineReposHooksPostRequestJsonXc6196618(
  /**
   * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
   */
  public val active: Boolean? = null,
  /**
   * Key/value pairs to provide settings for this webhook.
   */
  public val config: InlineReposHooksPostRequestJsonConfigX412f21f5? = null,
  events: List<String>? = null,
  /**
   * Use `web` to create a webhook. Default: `web`. This parameter only accepts the value `web`.
   */
  public val name: String? = null,
) {
  /**
   * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for.
   */
  public val events: List<String>? = events?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
     */
    public var active: Boolean? = null

    /**
     * Key/value pairs to provide settings for this webhook.
     */
    public var config: InlineReposHooksPostRequestJsonConfigX412f21f5? = null

    private var eventsValue: List<String>? = null

    /**
     * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for.
     */
    public var events: List<String>?
      get() = eventsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        eventsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Use `web` to create a webhook. Default: `web`. This parameter only accepts the value `web`.
     */
    public var name: String? = null

    public fun build(): InlineReposHooksPostRequestJsonXc6196618 = InlineReposHooksPostRequestJsonXc6196618(
      active = active,
      config = config,
      events = events,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposHooksPostRequestJsonXc6196618 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposHooksPostRequestJsonXc6196618> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposHooksPostRequestJsonXc6196618 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposHooksPostRequestJsonXc6196618")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposHooksPostRequestJsonXc6196618 must be a JSON object")
      return InlineReposHooksPostRequestJsonXc6196618(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        config = rawObject["config"]?.let { json.decodeFromJsonElement<InlineReposHooksPostRequestJsonConfigX412f21f5>(it) },
        events = rawObject["events"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposHooksPostRequestJsonXc6196618) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposHooksPostRequestJsonXc6196618")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.config?.let { put("config", json.encodeToJsonElement(it)) }
        value.events?.let { put("events", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposHooksPostRequestJsonXc6196618(block: InlineReposHooksPostRequestJsonXc6196618.Builder.() -> Unit): InlineReposHooksPostRequestJsonXc6196618 = InlineReposHooksPostRequestJsonXc6196618.build(block)
