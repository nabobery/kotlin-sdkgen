package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineV1WebhookEndpointsGetResponse200JsonXaefba60a.Serializer::class)
public class InlineV1WebhookEndpointsGetResponse200JsonXaefba60a(
  `data`: List<WebhookEndpoint>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineV1WebhookEndpointsGetResponse200JsonObjectValueX7a2fd96c,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  public val `data`: List<WebhookEndpoint> = data.toList()

  public class Builder {
    private var dataValue: List<WebhookEndpoint>? = null

    public var `data`: List<WebhookEndpoint>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue: InlineV1WebhookEndpointsGetResponse200JsonObjectValueX7a2fd96c? =
        null

    public var objectValue: InlineV1WebhookEndpointsGetResponse200JsonObjectValueX7a2fd96c
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineV1WebhookEndpointsGetResponse200JsonXaefba60a {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineV1WebhookEndpointsGetResponse200JsonXaefba60a(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1WebhookEndpointsGetResponse200JsonXaefba60a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1WebhookEndpointsGetResponse200JsonXaefba60a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsGetResponse200JsonXaefba60a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1WebhookEndpointsGetResponse200JsonXaefba60a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1WebhookEndpointsGetResponse200JsonXaefba60a must be a JSON object")
      val data = json.decodeRequired<List<WebhookEndpoint>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineV1WebhookEndpointsGetResponse200JsonObjectValueX7a2fd96c>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1WebhookEndpointsGetResponse200JsonXaefba60a(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1WebhookEndpointsGetResponse200JsonXaefba60a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1WebhookEndpointsGetResponse200JsonXaefba60a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1WebhookEndpointsGetResponse200JsonXaefba60a(block: InlineV1WebhookEndpointsGetResponse200JsonXaefba60a.Builder.() -> Unit): InlineV1WebhookEndpointsGetResponse200JsonXaefba60a = InlineV1WebhookEndpointsGetResponse200JsonXaefba60a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1WebhookEndpointsGetResponse200JsonXaefba60a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
