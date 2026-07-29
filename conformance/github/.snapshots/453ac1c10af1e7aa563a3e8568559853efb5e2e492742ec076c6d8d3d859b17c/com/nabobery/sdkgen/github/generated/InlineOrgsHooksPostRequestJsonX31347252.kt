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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1hooks/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1hooks/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsHooksPostRequestJsonX31347252.Serializer::class)
public class InlineOrgsHooksPostRequestJsonX31347252(
  /**
   * Key/value pairs to provide settings for this webhook.
   */
  public val config: InlineOrgsHooksPostRequestJsonConfigX31160f36,
  /**
   * Must be passed as "web".
   */
  public val name: String,
  /**
   * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
   */
  public val active: Boolean? = null,
  events: List<String>? = null,
) {
  /**
   * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. Set to `["*"]`
   * to receive all possible events.
   */
  public val events: List<String>? = events?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var configValue: InlineOrgsHooksPostRequestJsonConfigX31160f36? = null

    public var config: InlineOrgsHooksPostRequestJsonConfigX31160f36
      get() = requireNotNull(configValue) { "config is required" }
      set(`value`) {
        configValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
     */
    public var active: Boolean? = null

    private var eventsValue: List<String>? = null

    /**
     * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. Set to
     * `["*"]` to receive all possible events.
     */
    public var events: List<String>?
      get() = eventsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        eventsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsHooksPostRequestJsonX31347252 {
      check(configValue != null) { "config is required" }
      check(nameValue != null) { "name is required" }
      return InlineOrgsHooksPostRequestJsonX31347252(
        config = config,
        name = name,
        active = active,
        events = events,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsHooksPostRequestJsonX31347252 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsHooksPostRequestJsonX31347252> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsHooksPostRequestJsonX31347252 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsHooksPostRequestJsonX31347252")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsHooksPostRequestJsonX31347252 must be a JSON object")
      val config = json.decodeRequired<InlineOrgsHooksPostRequestJsonConfigX31160f36>(rawObject, "config")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsHooksPostRequestJsonX31347252(
        config = config,
        name = name,
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        events = rawObject["events"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsHooksPostRequestJsonX31347252) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsHooksPostRequestJsonX31347252")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("config", json.encodeToJsonElement(value.config))
        put("name", value.name)
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.events?.let { put("events", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsHooksPostRequestJsonX31347252(block: InlineOrgsHooksPostRequestJsonX31347252.Builder.() -> Unit): InlineOrgsHooksPostRequestJsonX31347252 = InlineOrgsHooksPostRequestJsonX31347252.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsHooksPostRequestJsonX31347252 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
