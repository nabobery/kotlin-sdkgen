package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class AccountAnnualRevenueView(
  public val amount: Int? = null,
  public val currency: String? = null,
  @SerialName("fiscal_year_end")
  public val fiscalYearEnd: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_annual_revenue
 */
@Serializable(with = AccountAnnualRevenue.Serializer::class)
public class AccountAnnualRevenue(
  /**
   * A non-negative integer representing the amount in the [smallest currency unit](/currencies#zero-decimal).
   */
  public val amount: Int? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for the 31st of December, 2023.
   */
  public val fiscalYearEnd: String? = null,
) {
  public class Builder {
    /**
     * A non-negative integer representing the amount in the [smallest currency unit](/currencies#zero-decimal).
     */
    public var amount: Int? = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for the 31st of December,
     * 2023.
     */
    public var fiscalYearEnd: String? = null

    public fun build(): AccountAnnualRevenue = AccountAnnualRevenue(
      amount = amount,
      currency = currency,
      fiscalYearEnd = fiscalYearEnd,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountAnnualRevenue = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountAnnualRevenue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountAnnualRevenue {
      val jsonDecoder = decoder.requireJsonDecoder("AccountAnnualRevenue")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountAnnualRevenue must be a JSON object")
      return AccountAnnualRevenue(
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        currency = rawObject["currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fiscalYearEnd = rawObject["fiscal_year_end"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountAnnualRevenue) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountAnnualRevenue")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.fiscalYearEnd?.let { put("fiscal_year_end", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountAnnualRevenue(block: AccountAnnualRevenue.Builder.() -> Unit): AccountAnnualRevenue = AccountAnnualRevenue.build(block)
