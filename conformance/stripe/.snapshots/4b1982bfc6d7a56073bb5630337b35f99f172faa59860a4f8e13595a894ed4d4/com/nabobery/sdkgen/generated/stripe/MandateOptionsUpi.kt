package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_options_upi
 */
@Serializable(with = MandateOptionsUpi.Serializer::class)
public class MandateOptionsUpi(
  /**
   * Amount to be charged for future payments.
   */
  public val amount: Int? = null,
  /**
   * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
   * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
   */
  public val amountType: InlineMandateOptionsUpiAmountTypeX11825549? = null,
  /**
   * A description of the mandate or subscription that is meant to be displayed to the customer.
   */
  public val description: String? = null,
  /**
   * End date of the mandate or subscription.
   */
  public val endDate: Int? = null,
) {
  public class Builder {
    /**
     * Amount to be charged for future payments.
     */
    public var amount: Int? = null

    /**
     * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
     * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
     */
    public var amountType: InlineMandateOptionsUpiAmountTypeX11825549? = null

    /**
     * A description of the mandate or subscription that is meant to be displayed to the customer.
     */
    public var description: String? = null

    /**
     * End date of the mandate or subscription.
     */
    public var endDate: Int? = null

    public fun build(): MandateOptionsUpi = MandateOptionsUpi(
      amount = amount,
      amountType = amountType,
      description = description,
      endDate = endDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MandateOptionsUpi = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MandateOptionsUpi> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MandateOptionsUpi {
      val jsonDecoder = decoder.requireJsonDecoder("MandateOptionsUpi")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MandateOptionsUpi must be a JSON object")
      return MandateOptionsUpi(
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        amountType = rawObject["amount_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineMandateOptionsUpiAmountTypeX11825549?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        endDate = rawObject["end_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MandateOptionsUpi) {
      val jsonEncoder = encoder.requireJsonEncoder("MandateOptionsUpi")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mandateOptionsUpi(block: MandateOptionsUpi.Builder.() -> Unit): MandateOptionsUpi = MandateOptionsUpi.build(block)
