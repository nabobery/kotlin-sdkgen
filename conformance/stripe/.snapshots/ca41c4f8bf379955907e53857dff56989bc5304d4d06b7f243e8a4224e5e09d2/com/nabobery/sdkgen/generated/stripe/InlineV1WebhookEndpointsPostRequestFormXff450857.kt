package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema
 */
@Serializable(with = InlineV1WebhookEndpointsPostRequestFormXff450857.Serializer::class)
public class InlineV1WebhookEndpointsPostRequestFormXff450857(
  enabledEvents: List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXc13d542b>,
  /**
   * The URL of the webhook endpoint.
   */
  public val url: String,
  /**
   * Events sent to this endpoint will be generated with this Stripe Version instead of your account's default Stripe
   * Version.
   */
  public val apiVersion: InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3? = null,
  /**
   * Whether this endpoint should receive events from connected accounts (`true`), or from your account (`false`).
   * Defaults to `false`.
   */
  public val connect: Boolean? = null,
  /**
   * An optional description of what the webhook is used for.
   */
  public val description: InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e? = null,
) {
  /**
   * The list of events to enable for this endpoint. You may specify `['*']` to enable all events, except those that
   * require explicit selection.
   */
  public val enabledEvents: List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXc13d542b>
      = enabledEvents.toList()

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var enabledEventsValue:
        List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXc13d542b>? = null

    public var enabledEvents:
        List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXc13d542b>
      get() = requireNotNull(enabledEventsValue) { "enabledEvents is required" }.toList()
      set(`value`) {
        enabledEventsValue = value.toList()
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * Events sent to this endpoint will be generated with this Stripe Version instead of your account's default Stripe
     * Version.
     */
    public var apiVersion: InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3? = null

    /**
     * Whether this endpoint should receive events from connected accounts (`true`), or from your account (`false`).
     * Defaults to `false`.
     */
    public var connect: Boolean? = null

    /**
     * An optional description of what the webhook is used for.
     */
    public var description: InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e? = null

    public fun build(): InlineV1WebhookEndpointsPostRequestFormXff450857 {
      check(enabledEventsValue != null) { "enabledEvents is required" }
      check(urlValue != null) { "url is required" }
      return InlineV1WebhookEndpointsPostRequestFormXff450857(
        enabledEvents = enabledEvents,
        url = url,
        apiVersion = apiVersion,
        connect = connect,
        description = description,
        expand = expand,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1WebhookEndpointsPostRequestFormXff450857 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1WebhookEndpointsPostRequestFormXff450857> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsPostRequestFormXff450857 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1WebhookEndpointsPostRequestFormXff450857")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1WebhookEndpointsPostRequestFormXff450857 must be a JSON object")
      val enabledEvents = json.decodeRequired<List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXc13d542b>>(rawObject, "enabled_events")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1WebhookEndpointsPostRequestFormXff450857(
        enabledEvents = enabledEvents,
        url = url,
        apiVersion = rawObject["api_version"]?.let { json.decodeFromJsonElement<InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3>(it) },
        connect = rawObject["connect"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1WebhookEndpointsPostRequestFormXff450857) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1WebhookEndpointsPostRequestFormXff450857")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled_events", json.encodeToJsonElement(value.enabledEvents))
        put("url", value.url)
        value.apiVersion?.let { put("api_version", json.encodeToJsonElement(it)) }
        value.connect?.let { put("connect", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1WebhookEndpointsPostRequestFormXff450857(block: InlineV1WebhookEndpointsPostRequestFormXff450857.Builder.() -> Unit): InlineV1WebhookEndpointsPostRequestFormXff450857 = InlineV1WebhookEndpointsPostRequestFormXff450857.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1WebhookEndpointsPostRequestFormXff450857 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
