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
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineV1BillingAlertsGetResponse200JsonX685d5281.Serializer::class)
public class InlineV1BillingAlertsGetResponse200JsonX685d5281(
  `data`: List<BillingAlert>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineV1BillingAlertsGetResponse200JsonObjectValueXb64926df,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  public val `data`: List<BillingAlert> = data.toList()

  public class Builder {
    private var dataValue: List<BillingAlert>? = null

    public var `data`: List<BillingAlert>
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

    private var objectValueValue: InlineV1BillingAlertsGetResponse200JsonObjectValueXb64926df? =
        null

    public var objectValue: InlineV1BillingAlertsGetResponse200JsonObjectValueXb64926df
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

    public fun build(): InlineV1BillingAlertsGetResponse200JsonX685d5281 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineV1BillingAlertsGetResponse200JsonX685d5281(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingAlertsGetResponse200JsonX685d5281 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingAlertsGetResponse200JsonX685d5281> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingAlertsGetResponse200JsonX685d5281 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingAlertsGetResponse200JsonX685d5281")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingAlertsGetResponse200JsonX685d5281 must be a JSON object")
      val data = json.decodeRequired<List<BillingAlert>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineV1BillingAlertsGetResponse200JsonObjectValueXb64926df>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1BillingAlertsGetResponse200JsonX685d5281(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingAlertsGetResponse200JsonX685d5281) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingAlertsGetResponse200JsonX685d5281")
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

public fun inlineV1BillingAlertsGetResponse200JsonX685d5281(block: InlineV1BillingAlertsGetResponse200JsonX685d5281.Builder.() -> Unit): InlineV1BillingAlertsGetResponse200JsonX685d5281 = InlineV1BillingAlertsGetResponse200JsonX685d5281.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingAlertsGetResponse200JsonX685d5281 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
