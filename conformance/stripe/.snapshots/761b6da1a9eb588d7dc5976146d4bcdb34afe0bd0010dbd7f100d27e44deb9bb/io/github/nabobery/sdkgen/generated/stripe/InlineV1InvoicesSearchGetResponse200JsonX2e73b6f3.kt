package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoices~1search/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3.Serializer::class)
public class InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3(
  `data`: List<Invoice>,
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be,
  public val url: String,
  public val nextPage: String? = null,
  /**
   * The total number of objects that match the query, only accurate up to 10,000.
   */
  public val totalCount: Int? = null,
) {
  public val `data`: List<Invoice> = data.toList()

  public class Builder {
    private var dataValue: List<Invoice>? = null

    public var `data`: List<Invoice>
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

    private var objectValueValue: InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be? =
        null

    public var objectValue: InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be
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

    public fun build(): InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3(
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
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3 must be a JSON object")
      val data = json.decodeRequired<List<Invoice>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineV1InvoicesSearchGetResponse200JsonObjectValueX5ff404be>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
        nextPage = rawObject["next_page"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3")
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

public fun inlineV1InvoicesSearchGetResponse200JsonX2e73b6f3(block: InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3.Builder.() -> Unit): InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3 = InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesSearchGetResponse200JsonX2e73b6f3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
