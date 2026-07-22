package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * You can configure [webhook endpoints](https://docs.stripe.com/webhooks/) via the API to be
 * notified about events that happen in your Stripe account or connected
 * accounts.
 *
 * Most users configure webhooks from [the dashboard](https://dashboard.stripe.com/webhooks), which provides a user
 * interface for registering and testing your webhook endpoints.
 *
 * Related guide: [Setting up webhooks](https://docs.stripe.com/webhooks/configure)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/webhook_endpoint
 */
@Serializable(with = WebhookEndpoint.Serializer::class)
public class WebhookEndpoint(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  enabledEvents: List<String>,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineWebhookEndpointObjectValueXc052bec3,
  /**
   * The status of the webhook. It can be `enabled` or `disabled`.
   */
  public val status: String,
  /**
   * The URL of the webhook endpoint.
   */
  public val url: String,
  /**
   * The API version events are rendered as for this webhook endpoint.
   */
  public val apiVersion: String? = null,
  /**
   * The ID of the associated Connect application.
   */
  public val application: String? = null,
  /**
   * An optional description of what the webhook is used for.
   */
  public val description: String? = null,
  /**
   * The endpoint's secret, used to generate [webhook signatures](https://docs.stripe.com/webhooks/signatures). Only
   * returned at creation.
   */
  public val secret: String? = null,
) {
  /**
   * The list of events to enable for this endpoint. `['*']` indicates that all events are enabled, except those that
   * require explicit selection.
   */
  public val enabledEvents: List<String> = enabledEvents.toList()

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var enabledEventsValue: List<String>? = null

    public var enabledEvents: List<String>
      get() = requireNotNull(enabledEventsValue) { "enabledEvents is required" }
      set(`value`) {
        enabledEventsValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }
      set(`value`) {
        metadataValue = value
      }

    private var objectValueValue: InlineWebhookEndpointObjectValueXc052bec3? = null

    public var objectValue: InlineWebhookEndpointObjectValueXc052bec3
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * The API version events are rendered as for this webhook endpoint.
     */
    public var apiVersion: String? = null

    /**
     * The ID of the associated Connect application.
     */
    public var application: String? = null

    /**
     * An optional description of what the webhook is used for.
     */
    public var description: String? = null

    /**
     * The endpoint's secret, used to generate [webhook signatures](https://docs.stripe.com/webhooks/signatures). Only
     * returned at creation.
     */
    public var secret: String? = null

    public fun build(): WebhookEndpoint {
      check(createdValue != null) { "created is required" }
      check(enabledEventsValue != null) { "enabledEvents is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(urlValue != null) { "url is required" }
      return WebhookEndpoint(
        created = created,
        enabledEvents = enabledEvents,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        status = status,
        url = url,
        apiVersion = apiVersion,
        application = application,
        description = description,
        secret = secret,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookEndpoint = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookEndpoint> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookEndpoint {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookEndpoint")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookEndpoint must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val enabledEvents = json.decodeRequired<List<String>>(rawObject, "enabled_events")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineWebhookEndpointObjectValueXc052bec3>(rawObject, "object")
      val status = json.decodeRequired<String>(rawObject, "status")
      val url = json.decodeRequired<String>(rawObject, "url")
      return WebhookEndpoint(
        created = created,
        enabledEvents = enabledEvents,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        status = status,
        url = url,
        apiVersion = rawObject["api_version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        secret = rawObject["secret"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookEndpoint) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookEndpoint")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("enabled_events", json.encodeToJsonElement(value.enabledEvents))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", value.status)
        put("url", value.url)
        value.apiVersion?.let { put("api_version", it) }
        value.application?.let { put("application", it) }
        value.description?.let { put("description", it) }
        value.secret?.let { put("secret", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookEndpoint(block: WebhookEndpoint.Builder.() -> Unit): WebhookEndpoint = WebhookEndpoint.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookEndpoint is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
