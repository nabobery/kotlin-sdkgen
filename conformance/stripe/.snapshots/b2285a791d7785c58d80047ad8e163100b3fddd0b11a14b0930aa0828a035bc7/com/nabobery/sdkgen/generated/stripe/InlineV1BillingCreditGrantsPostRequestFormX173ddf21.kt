package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormX173ddf21.Serializer::class)
public class InlineV1BillingCreditGrantsPostRequestFormX173ddf21(
  /**
   * Amount of this credit grant.
   */
  public val amount: InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654,
  /**
   * Configuration specifying what this credit grant applies to. We currently only support `metered` prices that have a
   * [Billing Meter](https://docs.stripe.com/api/billing/meter) attached to them.
   */
  public val applicabilityConfig:
      InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e,
  /**
   * The category of this credit grant. It defaults to `paid` if not specified.
   */
  public val category: InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a? = null,
  /**
   * ID of the customer receiving the billing credits.
   */
  public val customer: String? = null,
  /**
   * ID of the account representing the customer receiving the billing credits.
   */
  public val customerAccount: String? = null,
  /**
   * The time when the billing credits become effective-when they're eligible for use. It defaults to the current
   * timestamp if not specified.
   */
  public val effectiveAt: Int? = null,
  expand: List<String>? = null,
  /**
   * The time when the billing credits expire. If not specified, the billing credits don't expire.
   */
  public val expiresAt: Int? = null,
  metadata: Map<String, String>? = null,
  /**
   * A descriptive name shown in the Dashboard.
   */
  public val name: String? = null,
  /**
   * The desired priority for applying this credit grant. If not specified, it will be set to the default value of 50.
   * The highest priority is 0 and the lowest is 100.
   */
  public val priority: Int? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of key-value pairs that you can attach to an object. You can use this to store additional information about the
   * object (for example, cost basis) in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var amountValue: InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654? = null

    public var amount: InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var applicabilityConfigValue:
        InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e? = null

    public var applicabilityConfig:
        InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e
      get() = requireNotNull(applicabilityConfigValue) { "applicabilityConfig is required" }
      set(`value`) {
        applicabilityConfigValue = value
      }

    /**
     * The category of this credit grant. It defaults to `paid` if not specified.
     */
    public var category: InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a? = null

    /**
     * ID of the customer receiving the billing credits.
     */
    public var customer: String? = null

    /**
     * ID of the account representing the customer receiving the billing credits.
     */
    public var customerAccount: String? = null

    /**
     * The time when the billing credits become effective-when they're eligible for use. It defaults to the current
     * timestamp if not specified.
     */
    public var effectiveAt: Int? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The time when the billing credits expire. If not specified, the billing credits don't expire.
     */
    public var expiresAt: Int? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of key-value pairs that you can attach to an object. You can use this to store additional information about
     * the object (for example, cost basis) in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * A descriptive name shown in the Dashboard.
     */
    public var name: String? = null

    /**
     * The desired priority for applying this credit grant. If not specified, it will be set to the default value of 50.
     * The highest priority is 0 and the lowest is 100.
     */
    public var priority: Int? = null

    public fun build(): InlineV1BillingCreditGrantsPostRequestFormX173ddf21 {
      check(amountValue != null) { "amount is required" }
      check(applicabilityConfigValue != null) { "applicabilityConfig is required" }
      return InlineV1BillingCreditGrantsPostRequestFormX173ddf21(
        amount = amount,
        applicabilityConfig = applicabilityConfig,
        category = category,
        customer = customer,
        customerAccount = customerAccount,
        effectiveAt = effectiveAt,
        expand = expand,
        expiresAt = expiresAt,
        metadata = metadata,
        name = name,
        priority = priority,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormX173ddf21 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormX173ddf21> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormX173ddf21 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingCreditGrantsPostRequestFormX173ddf21")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormX173ddf21 must be a JSON object")
      val amount = json.decodeRequired<InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654>(rawObject, "amount")
      val applicabilityConfig = json.decodeRequired<InlineV1BillingCreditGrantsPostRequestFormApplicabilityConfigX8078051e>(rawObject, "applicability_config")
      return InlineV1BillingCreditGrantsPostRequestFormX173ddf21(
        amount = amount,
        applicabilityConfig = applicabilityConfig,
        category = rawObject["category"]?.let { json.decodeFromJsonElement<InlineV1BillingCreditGrantsPostRequestFormCategoryXfd62be7a>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        effectiveAt = rawObject["effective_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        priority = rawObject["priority"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormX173ddf21) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingCreditGrantsPostRequestFormX173ddf21")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("applicability_config", json.encodeToJsonElement(value.applicabilityConfig))
        value.category?.let { put("category", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.effectiveAt?.let { put("effective_at", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.priority?.let { put("priority", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingCreditGrantsPostRequestFormX173ddf21(block: InlineV1BillingCreditGrantsPostRequestFormX173ddf21.Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormX173ddf21 = InlineV1BillingCreditGrantsPostRequestFormX173ddf21.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormX173ddf21 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
