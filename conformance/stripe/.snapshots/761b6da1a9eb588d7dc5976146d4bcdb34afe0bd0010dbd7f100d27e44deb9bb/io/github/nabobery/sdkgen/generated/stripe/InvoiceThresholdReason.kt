package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_threshold_reason
 */
@Serializable(with = InvoiceThresholdReason.Serializer::class)
public class InvoiceThresholdReason(
  itemReasons: List<InvoiceItemThresholdReason>,
  /**
   * The total invoice amount threshold boundary if it triggered the threshold invoice.
   */
  public val amountGte: Int? = null,
) {
  /**
   * Indicates which line items triggered a threshold invoice.
   */
  public val itemReasons: List<InvoiceItemThresholdReason> = itemReasons.toList()

  public class Builder {
    private var itemReasonsValue: List<InvoiceItemThresholdReason>? = null

    public var itemReasons: List<InvoiceItemThresholdReason>
      get() = requireNotNull(itemReasonsValue) { "itemReasons is required" }.toList()
      set(`value`) {
        itemReasonsValue = value.toList()
      }

    /**
     * The total invoice amount threshold boundary if it triggered the threshold invoice.
     */
    public var amountGte: Int? = null

    public fun build(): InvoiceThresholdReason {
      check(itemReasonsValue != null) { "itemReasons is required" }
      return InvoiceThresholdReason(
        itemReasons = itemReasons,
        amountGte = amountGte,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceThresholdReason = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoiceThresholdReason> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceThresholdReason {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceThresholdReason")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceThresholdReason must be a JSON object")
      val itemReasons = json.decodeRequired<List<InvoiceItemThresholdReason>>(rawObject, "item_reasons")
      return InvoiceThresholdReason(
        itemReasons = itemReasons,
        amountGte = rawObject["amount_gte"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceThresholdReason) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceThresholdReason")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("item_reasons", json.encodeToJsonElement(value.itemReasons))
        value.amountGte?.let { put("amount_gte", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceThresholdReason(block: InvoiceThresholdReason.Builder.() -> Unit): InvoiceThresholdReason = InvoiceThresholdReason.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InvoiceThresholdReason is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
