package com.nabobery.sdkgen.generated.stripe

import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_receipt_data
 */
@Serializable(with = IssuingTransactionReceiptData.Serializer::class)
public class IssuingTransactionReceiptData(
  /**
   * The description of the item. The maximum length of this field is 26 characters.
   */
  public val description: String? = null,
  /**
   * The quantity of the item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val quantity: Double? = null,
  /**
   * The total for this line item in cents.
   */
  public val total: Int? = null,
  /**
   * The unit cost of the item in cents.
   */
  public val unitCost: Int? = null,
) {
  public class Builder {
    /**
     * The description of the item. The maximum length of this field is 26 characters.
     */
    public var description: String? = null

    /**
     * The quantity of the item.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var quantity: Double? = null

    /**
     * The total for this line item in cents.
     */
    public var total: Int? = null

    /**
     * The unit cost of the item in cents.
     */
    public var unitCost: Int? = null

    public fun build(): IssuingTransactionReceiptData = IssuingTransactionReceiptData(
      description = description,
      quantity = quantity,
      total = total,
      unitCost = unitCost,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransactionReceiptData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingTransactionReceiptData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransactionReceiptData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionReceiptData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransactionReceiptData must be a JSON object")
      return IssuingTransactionReceiptData(
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        quantity = rawObject["quantity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        total = rawObject["total"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        unitCost = rawObject["unit_cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransactionReceiptData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionReceiptData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", it) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.total?.let { put("total", json.encodeToJsonElement(it)) }
        value.unitCost?.let { put("unit_cost", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransactionReceiptData(block: IssuingTransactionReceiptData.Builder.() -> Unit): IssuingTransactionReceiptData = IssuingTransactionReceiptData.build(block)
