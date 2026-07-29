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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints~1{webhook_endpoint}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints~1{webhook_endpoint}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1WebhookEndpointsPostRequestFormX13dfd1de.Serializer::class)
public class InlineV1WebhookEndpointsPostRequestFormX13dfd1de(
  /**
   * An optional description of what the webhook is used for.
   */
  public val description: InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6? = null,
  /**
   * Disable the webhook endpoint if set to true.
   */
  public val disabled: Boolean? = null,
  enabledEvents: List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd>? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1WebhookEndpointsPostRequestFormMetadataXee719122? = null,
  /**
   * The URL of the webhook endpoint.
   */
  public val url: String? = null,
) {
  /**
   * The list of events to enable for this endpoint. You may specify `['*']` to enable all events, except those that
   * require explicit selection.
   */
  public val enabledEvents: List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd>?
      = enabledEvents?.let { collection0 -> collection0.toList() }

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * An optional description of what the webhook is used for.
     */
    public var description: InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6? = null

    /**
     * Disable the webhook endpoint if set to true.
     */
    public var disabled: Boolean? = null

    private var enabledEventsValue:
        List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd>? = null

    /**
     * The list of events to enable for this endpoint. You may specify `['*']` to enable all events, except those that
     * require explicit selection.
     */
    public var enabledEvents:
        List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd>?
      get() = enabledEventsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        enabledEventsValue = value?.let { collection0 -> collection0.toList() }
      }

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
    public var metadata: InlineV1WebhookEndpointsPostRequestFormMetadataXee719122? = null

    /**
     * The URL of the webhook endpoint.
     */
    public var url: String? = null

    public fun build(): InlineV1WebhookEndpointsPostRequestFormX13dfd1de = InlineV1WebhookEndpointsPostRequestFormX13dfd1de(
      description = description,
      disabled = disabled,
      enabledEvents = enabledEvents,
      expand = expand,
      metadata = metadata,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1WebhookEndpointsPostRequestFormX13dfd1de = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1WebhookEndpointsPostRequestFormX13dfd1de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsPostRequestFormX13dfd1de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1WebhookEndpointsPostRequestFormX13dfd1de")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1WebhookEndpointsPostRequestFormX13dfd1de must be a JSON object")
      return InlineV1WebhookEndpointsPostRequestFormX13dfd1de(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6>(it) },
        disabled = rawObject["disabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        enabledEvents = rawObject["enabled_events"]?.let { json.decodeFromJsonElement<List<InlineV1WebhookEndpointsPostRequestFormEnabledEventsItemXcac7d4cd>>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1WebhookEndpointsPostRequestFormMetadataXee719122>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1WebhookEndpointsPostRequestFormX13dfd1de) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1WebhookEndpointsPostRequestFormX13dfd1de")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.disabled?.let { put("disabled", json.encodeToJsonElement(it)) }
        value.enabledEvents?.let { put("enabled_events", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1WebhookEndpointsPostRequestFormX13dfd1de(block: InlineV1WebhookEndpointsPostRequestFormX13dfd1de.Builder.() -> Unit): InlineV1WebhookEndpointsPostRequestFormX13dfd1de = InlineV1WebhookEndpointsPostRequestFormX13dfd1de.build(block)
