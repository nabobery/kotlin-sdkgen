package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1prices~1search/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineV1PricesSearchGetResponse200JsonX5105616d.Serializer::class)
public class InlineV1PricesSearchGetResponse200JsonX5105616d(
  `data`: List<Price>,
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7,
  public val url: String,
  public val nextPage: String? = null,
  /**
   * The total number of objects that match the query, only accurate up to 10,000.
   */
  public val totalCount: Int? = null,
) {
  public val `data`: List<Price> = data.toList()

  public class Builder {
    private var dataValue: List<Price>? = null

    public var `data`: List<Price>
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

    private var objectValueValue: InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7? = null

    public var objectValue: InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7
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

    public var nextPage: String? = null

    /**
     * The total number of objects that match the query, only accurate up to 10,000.
     */
    public var totalCount: Int? = null

    public fun build(): InlineV1PricesSearchGetResponse200JsonX5105616d {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineV1PricesSearchGetResponse200JsonX5105616d(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
        nextPage = nextPage,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PricesSearchGetResponse200JsonX5105616d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PricesSearchGetResponse200JsonX5105616d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesSearchGetResponse200JsonX5105616d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesSearchGetResponse200JsonX5105616d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PricesSearchGetResponse200JsonX5105616d must be a JSON object")
      val data = json.decodeRequired<List<Price>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1PricesSearchGetResponse200JsonX5105616d(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
        nextPage = rawObject["next_page"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesSearchGetResponse200JsonX5105616d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesSearchGetResponse200JsonX5105616d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
        value.nextPage?.let { put("next_page", it) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PricesSearchGetResponse200JsonX5105616d(block: InlineV1PricesSearchGetResponse200JsonX5105616d.Builder.() -> Unit): InlineV1PricesSearchGetResponse200JsonX5105616d = InlineV1PricesSearchGetResponse200JsonX5105616d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PricesSearchGetResponse200JsonX5105616d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
