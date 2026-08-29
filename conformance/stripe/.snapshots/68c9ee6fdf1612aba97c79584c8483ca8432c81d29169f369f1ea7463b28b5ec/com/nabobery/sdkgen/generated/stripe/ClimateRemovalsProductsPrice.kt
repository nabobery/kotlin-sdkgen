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
 * Source: sdkgen://source/openapi.json#/components/schemas/climate_removals_products_price
 */
@Serializable(with = ClimateRemovalsProductsPrice.Serializer::class)
public class ClimateRemovalsProductsPrice(
  /**
   * Fees for one metric ton of carbon removal in the currency's smallest unit.
   */
  public val amountFees: Int,
  /**
   * Subtotal for one metric ton of carbon removal (excluding fees) in the currency's smallest unit.
   */
  public val amountSubtotal: Int,
  /**
   * Total for one metric ton of carbon removal (including fees) in the currency's smallest unit.
   */
  public val amountTotal: Int,
) {
  public class Builder {
    private var amountFeesValue: Int? = null

    public var amountFees: Int
      get() = requireNotNull(amountFeesValue) { "amountFees is required" }
      set(`value`) {
        amountFeesValue = value
      }

    private var amountSubtotalValue: Int? = null

    public var amountSubtotal: Int
      get() = requireNotNull(amountSubtotalValue) { "amountSubtotal is required" }
      set(`value`) {
        amountSubtotalValue = value
      }

    private var amountTotalValue: Int? = null

    public var amountTotal: Int
      get() = requireNotNull(amountTotalValue) { "amountTotal is required" }
      set(`value`) {
        amountTotalValue = value
      }

    public fun build(): ClimateRemovalsProductsPrice {
      check(amountFeesValue != null) { "amountFees is required" }
      check(amountSubtotalValue != null) { "amountSubtotal is required" }
      check(amountTotalValue != null) { "amountTotal is required" }
      return ClimateRemovalsProductsPrice(
        amountFees = amountFees,
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ClimateRemovalsProductsPrice = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ClimateRemovalsProductsPrice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ClimateRemovalsProductsPrice {
      val jsonDecoder = decoder.requireJsonDecoder("ClimateRemovalsProductsPrice")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ClimateRemovalsProductsPrice must be a JSON object")
      val amountFees = json.decodeRequired<Int>(rawObject, "amount_fees")
      val amountSubtotal = json.decodeRequired<Int>(rawObject, "amount_subtotal")
      val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
      return ClimateRemovalsProductsPrice(
        amountFees = amountFees,
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ClimateRemovalsProductsPrice) {
      val jsonEncoder = encoder.requireJsonEncoder("ClimateRemovalsProductsPrice")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_fees", json.encodeToJsonElement(value.amountFees))
        put("amount_subtotal", json.encodeToJsonElement(value.amountSubtotal))
        put("amount_total", json.encodeToJsonElement(value.amountTotal))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun climateRemovalsProductsPrice(block: ClimateRemovalsProductsPrice.Builder.() -> Unit): ClimateRemovalsProductsPrice = ClimateRemovalsProductsPrice.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ClimateRemovalsProductsPrice is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
