package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_spending_limit
 */
@Serializable(with = IssuingCardholderSpendingLimit.Serializer::class)
public class IssuingCardholderSpendingLimit(
  /**
   * Maximum amount allowed to spend per interval. This amount is in the card's currency and in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amount: Int,
  /**
   * Interval (or event) to which the amount applies.
   */
  public val interval: InlineIssuingCardholderSpendingLimitIntervalX1263902e,
  categories: List<InlineIssuingCardholderSpendingLimitCategoriesItemX4fcf603b>? = null,
) {
  /**
   * Array of strings containing
   * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) this limit applies
   * to. Omitting this field will apply the limit to all categories.
   */
  public val categories: List<InlineIssuingCardholderSpendingLimitCategoriesItemX4fcf603b>? =
      categories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var intervalValue: InlineIssuingCardholderSpendingLimitIntervalX1263902e? = null

    public var interval: InlineIssuingCardholderSpendingLimitIntervalX1263902e
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    private var categoriesValue: List<InlineIssuingCardholderSpendingLimitCategoriesItemX4fcf603b>?
        = null

    /**
     * Array of strings containing
     * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) this limit applies
     * to. Omitting this field will apply the limit to all categories.
     */
    public var categories: List<InlineIssuingCardholderSpendingLimitCategoriesItemX4fcf603b>?
      get() = categoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        categoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): IssuingCardholderSpendingLimit {
      check(amountValue != null) { "amount is required" }
      check(intervalValue != null) { "interval is required" }
      return IssuingCardholderSpendingLimit(
        amount = amount,
        interval = interval,
        categories = categories,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardholderSpendingLimit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingCardholderSpendingLimit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardholderSpendingLimit {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderSpendingLimit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardholderSpendingLimit must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val interval = json.decodeRequired<InlineIssuingCardholderSpendingLimitIntervalX1263902e>(rawObject, "interval")
      return IssuingCardholderSpendingLimit(
        amount = amount,
        interval = interval,
        categories = rawObject["categories"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineIssuingCardholderSpendingLimitCategoriesItemX4fcf603b>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardholderSpendingLimit) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderSpendingLimit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("interval", json.encodeToJsonElement(value.interval))
        value.categories?.let { put("categories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardholderSpendingLimit(block: IssuingCardholderSpendingLimit.Builder.() -> Unit): IssuingCardholderSpendingLimit = IssuingCardholderSpendingLimit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingCardholderSpendingLimit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
