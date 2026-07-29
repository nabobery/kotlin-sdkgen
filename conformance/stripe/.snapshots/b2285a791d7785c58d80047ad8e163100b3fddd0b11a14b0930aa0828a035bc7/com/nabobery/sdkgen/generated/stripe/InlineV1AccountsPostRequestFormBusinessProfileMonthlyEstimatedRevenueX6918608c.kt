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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/business_profile/properties/monthly_estimated_revenue.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/business_profile/properties/monthly_estimated_revenue
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c.Serializer::class)
public class InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c(
  public val amount: Int,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    public fun build(): InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c(
        amount = amount,
        currency = currency,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c(
        amount = amount,
        currency = currency,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c(block: InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c.Builder.() -> Unit): InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c = InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountsPostRequestFormBusinessProfileMonthlyEstimatedRevenueX6918608c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
