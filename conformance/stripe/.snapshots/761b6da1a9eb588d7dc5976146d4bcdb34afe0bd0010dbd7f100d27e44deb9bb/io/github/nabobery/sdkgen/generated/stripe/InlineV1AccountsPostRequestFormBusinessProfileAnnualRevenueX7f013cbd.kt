package io.github.nabobery.sdkgen.generated.stripe

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
 * /properties/business_profile/properties/annual_revenue.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/business_profile/properties/annual_revenue
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd.Serializer::class)
public class InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd(
  public val amount: Int,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val fiscalYearEnd: String,
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

    private var fiscalYearEndValue: String? = null

    public var fiscalYearEnd: String
      get() = requireNotNull(fiscalYearEndValue) { "fiscalYearEnd is required" }
      set(`value`) {
        fiscalYearEndValue = value
      }

    public fun build(): InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      check(fiscalYearEndValue != null) { "fiscalYearEnd is required" }
      return InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd(
        amount = amount,
        currency = currency,
        fiscalYearEnd = fiscalYearEnd,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val fiscalYearEnd = json.decodeRequired<String>(rawObject, "fiscal_year_end")
      return InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd(
        amount = amount,
        currency = currency,
        fiscalYearEnd = fiscalYearEnd,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        put("fiscal_year_end", value.fiscalYearEnd)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd(block: InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd.Builder.() -> Unit): InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd = InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountsPostRequestFormBusinessProfileAnnualRevenueX7f013cbd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
