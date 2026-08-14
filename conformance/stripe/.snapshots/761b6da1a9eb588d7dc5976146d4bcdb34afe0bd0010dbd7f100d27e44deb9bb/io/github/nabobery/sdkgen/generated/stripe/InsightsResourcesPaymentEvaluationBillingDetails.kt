package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class InsightsResourcesPaymentEvaluationBillingDetailsView(
  public val address: InsightsResourcesPaymentEvaluationAddress,
  public val email: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
)

/**
 * Billing details attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_billing_details
 */
@Serializable(with = InsightsResourcesPaymentEvaluationBillingDetails.Serializer::class)
public class InsightsResourcesPaymentEvaluationBillingDetails(
  public val address: InsightsResourcesPaymentEvaluationAddress,
  /**
   * Email address.
   */
  public val email: String? = null,
  /**
   * Full name.
   */
  public val name: String? = null,
  /**
   * Billing phone number (including extension).
   */
  public val phone: String? = null,
) {
  public class Builder {
    private var addressValue: InsightsResourcesPaymentEvaluationAddress? = null

    public var address: InsightsResourcesPaymentEvaluationAddress
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    /**
     * Email address.
     */
    public var email: String? = null

    /**
     * Full name.
     */
    public var name: String? = null

    /**
     * Billing phone number (including extension).
     */
    public var phone: String? = null

    public fun build(): InsightsResourcesPaymentEvaluationBillingDetails {
      check(addressValue != null) { "address is required" }
      return InsightsResourcesPaymentEvaluationBillingDetails(
        address = address,
        email = email,
        name = name,
        phone = phone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationBillingDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationBillingDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationBillingDetails {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationBillingDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationBillingDetails must be a JSON object")
      val address = json.decodeRequired<InsightsResourcesPaymentEvaluationAddress>(rawObject, "address")
      return InsightsResourcesPaymentEvaluationBillingDetails(
        address = address,
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationBillingDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationBillingDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationBillingDetails(block: InsightsResourcesPaymentEvaluationBillingDetails.Builder.() -> Unit): InsightsResourcesPaymentEvaluationBillingDetails = InsightsResourcesPaymentEvaluationBillingDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationBillingDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
