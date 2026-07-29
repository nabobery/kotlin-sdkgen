package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_subscription_data_subscription_data
 */
@Serializable(with = QuotesResourceSubscriptionDataSubscriptionData.Serializer::class)
public class QuotesResourceSubscriptionDataSubscriptionData(
  public val billingMode: QuotesResourceSubscriptionDataBillingMode,
  /**
   * The subscription's description, meant to be displayable to the customer. Use this field to optionally store an
   * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
   */
  public val description: String? = null,
  /**
   * When creating a new subscription, the date of which the subscription schedule will start after the quote is
   * accepted. This date is ignored if it is in the past when the quote is accepted. Measured in seconds since the Unix
   * epoch.
   */
  public val effectiveDate: Int? = null,
  metadata: Map<String, String>? = null,
  /**
   * Integer representing the number of trial period days before the customer is charged for the first time.
   */
  public val trialPeriodDays: Int? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that will set metadata on the subscription or
   * subscription schedule when the quote is accepted. If a recurring price is included in `line_items`, this field will
   * be passed to the resulting subscription's `metadata` field. If `subscription_data.effective_date` is used, this
   * field will be passed to the resulting subscription schedule's `phases.metadata` field. Unlike object-level
   * metadata, this field is declarative. Updates will clear prior values.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var billingModeValue: QuotesResourceSubscriptionDataBillingMode? = null

    public var billingMode: QuotesResourceSubscriptionDataBillingMode
      get() = requireNotNull(billingModeValue) { "billingMode is required" }
      set(`value`) {
        billingModeValue = value
      }

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to optionally store an
     * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
     */
    public var description: String? = null

    /**
     * When creating a new subscription, the date of which the subscription schedule will start after the quote is
     * accepted. This date is ignored if it is in the past when the quote is accepted. Measured in seconds since the
     * Unix epoch.
     */
    public var effectiveDate: Int? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that will set metadata on the subscription or
     * subscription schedule when the quote is accepted. If a recurring price is included in `line_items`, this field
     * will be passed to the resulting subscription's `metadata` field. If `subscription_data.effective_date` is used,
     * this field will be passed to the resulting subscription schedule's `phases.metadata` field. Unlike object-level
     * metadata, this field is declarative. Updates will clear prior values.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Integer representing the number of trial period days before the customer is charged for the first time.
     */
    public var trialPeriodDays: Int? = null

    public fun build(): QuotesResourceSubscriptionDataSubscriptionData {
      check(billingModeValue != null) { "billingMode is required" }
      return QuotesResourceSubscriptionDataSubscriptionData(
        billingMode = billingMode,
        description = description,
        effectiveDate = effectiveDate,
        metadata = metadata,
        trialPeriodDays = trialPeriodDays,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceSubscriptionDataSubscriptionData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<QuotesResourceSubscriptionDataSubscriptionData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceSubscriptionDataSubscriptionData {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceSubscriptionDataSubscriptionData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceSubscriptionDataSubscriptionData must be a JSON object")
      val billingMode = json.decodeRequired<QuotesResourceSubscriptionDataBillingMode>(rawObject, "billing_mode")
      return QuotesResourceSubscriptionDataSubscriptionData(
        billingMode = billingMode,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        effectiveDate = rawObject["effective_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        trialPeriodDays = rawObject["trial_period_days"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceSubscriptionDataSubscriptionData) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceSubscriptionDataSubscriptionData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing_mode", json.encodeToJsonElement(value.billingMode))
        value.description?.let { put("description", it) }
        value.effectiveDate?.let { put("effective_date", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceSubscriptionDataSubscriptionData(block: QuotesResourceSubscriptionDataSubscriptionData.Builder.() -> Unit): QuotesResourceSubscriptionDataSubscriptionData = QuotesResourceSubscriptionDataSubscriptionData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("QuotesResourceSubscriptionDataSubscriptionData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
