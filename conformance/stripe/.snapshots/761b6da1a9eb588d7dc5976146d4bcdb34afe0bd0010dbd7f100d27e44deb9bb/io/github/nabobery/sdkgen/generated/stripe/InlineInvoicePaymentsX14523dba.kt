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
 * Payments for this invoice. Use [invoice payment](/api/invoice-payment) to get more details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/payments
 */
@Serializable(with = InlineInvoicePaymentsX14523dba.Serializer::class)
public class InlineInvoicePaymentsX14523dba(
  `data`: List<InvoicePayment>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineInvoicePaymentsObjectValueXbf417d0f,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<InvoicePayment> = data.toList()

  public class Builder {
    private var dataValue: List<InvoicePayment>? = null

    public var `data`: List<InvoicePayment>
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

    private var objectValueValue: InlineInvoicePaymentsObjectValueXbf417d0f? = null

    public var objectValue: InlineInvoicePaymentsObjectValueXbf417d0f
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

    public fun build(): InlineInvoicePaymentsX14523dba {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineInvoicePaymentsX14523dba(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineInvoicePaymentsX14523dba = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineInvoicePaymentsX14523dba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentsX14523dba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicePaymentsX14523dba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineInvoicePaymentsX14523dba must be a JSON object")
      val data = json.decodeRequired<List<InvoicePayment>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineInvoicePaymentsObjectValueXbf417d0f>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineInvoicePaymentsX14523dba(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentsX14523dba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineInvoicePaymentsX14523dba")
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

public fun inlineInvoicePaymentsX14523dba(block: InlineInvoicePaymentsX14523dba.Builder.() -> Unit): InlineInvoicePaymentsX14523dba = InlineInvoicePaymentsX14523dba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineInvoicePaymentsX14523dba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
