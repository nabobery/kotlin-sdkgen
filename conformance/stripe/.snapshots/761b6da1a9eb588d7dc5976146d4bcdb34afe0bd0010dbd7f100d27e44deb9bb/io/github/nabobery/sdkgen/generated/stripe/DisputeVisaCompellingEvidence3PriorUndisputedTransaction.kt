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

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_visa_compelling_evidence3_prior_undisputed_transaction
 */
@Serializable(with = DisputeVisaCompellingEvidence3PriorUndisputedTransaction.Serializer::class)
public class DisputeVisaCompellingEvidence3PriorUndisputedTransaction(
  /**
   * Stripe charge ID for the Visa Compelling Evidence 3.0 eligible prior charge.
   */
  public val charge: String,
  /**
   * User Account ID used to log into business platform. Must be recognizable by the user.
   */
  public val customerAccountId: String? = null,
  /**
   * Unique identifier of the cardholder’s device derived from a combination of at least two hardware and software
   * attributes. Must be at least 20 characters.
   */
  public val customerDeviceFingerprint: String? = null,
  /**
   * Unique identifier of the cardholder’s device such as a device serial number (e.g., International Mobile Equipment
   * Identity [IMEI]). Must be at least 15 characters.
   */
  public val customerDeviceId: String? = null,
  /**
   * The email address of the customer.
   */
  public val customerEmailAddress: String? = null,
  /**
   * The IP address that the customer used when making the purchase.
   */
  public val customerPurchaseIp: String? = null,
  /**
   * A description of the product or service that was sold.
   */
  public val productDescription: String? = null,
  /**
   * The address to which a physical product was shipped. All fields are required for Visa Compelling Evidence 3.0
   * evidence submission.
   */
  public val shippingAddress: InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c? = null,
) {
  public class Builder {
    private var chargeValue: String? = null

    public var charge: String
      get() = requireNotNull(chargeValue) { "charge is required" }
      set(`value`) {
        chargeValue = value
      }

    /**
     * User Account ID used to log into business platform. Must be recognizable by the user.
     */
    public var customerAccountId: String? = null

    /**
     * Unique identifier of the cardholder’s device derived from a combination of at least two hardware and software
     * attributes. Must be at least 20 characters.
     */
    public var customerDeviceFingerprint: String? = null

    /**
     * Unique identifier of the cardholder’s device such as a device serial number (e.g., International Mobile Equipment
     * Identity [IMEI]). Must be at least 15 characters.
     */
    public var customerDeviceId: String? = null

    /**
     * The email address of the customer.
     */
    public var customerEmailAddress: String? = null

    /**
     * The IP address that the customer used when making the purchase.
     */
    public var customerPurchaseIp: String? = null

    /**
     * A description of the product or service that was sold.
     */
    public var productDescription: String? = null

    /**
     * The address to which a physical product was shipped. All fields are required for Visa Compelling Evidence 3.0
     * evidence submission.
     */
    public var shippingAddress: InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c? = null

    public fun build(): DisputeVisaCompellingEvidence3PriorUndisputedTransaction {
      check(chargeValue != null) { "charge is required" }
      return DisputeVisaCompellingEvidence3PriorUndisputedTransaction(
        charge = charge,
        customerAccountId = customerAccountId,
        customerDeviceFingerprint = customerDeviceFingerprint,
        customerDeviceId = customerDeviceId,
        customerEmailAddress = customerEmailAddress,
        customerPurchaseIp = customerPurchaseIp,
        productDescription = productDescription,
        shippingAddress = shippingAddress,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputeVisaCompellingEvidence3PriorUndisputedTransaction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DisputeVisaCompellingEvidence3PriorUndisputedTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputeVisaCompellingEvidence3PriorUndisputedTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("DisputeVisaCompellingEvidence3PriorUndisputedTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputeVisaCompellingEvidence3PriorUndisputedTransaction must be a JSON object")
      val charge = json.decodeRequired<String>(rawObject, "charge")
      return DisputeVisaCompellingEvidence3PriorUndisputedTransaction(
        charge = charge,
        customerAccountId = rawObject["customer_account_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerDeviceFingerprint = rawObject["customer_device_fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerDeviceId = rawObject["customer_device_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerEmailAddress = rawObject["customer_email_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerPurchaseIp = rawObject["customer_purchase_ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        productDescription = rawObject["product_description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        shippingAddress = rawObject["shipping_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputeVisaCompellingEvidence3PriorUndisputedTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputeVisaCompellingEvidence3PriorUndisputedTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("charge", value.charge)
        value.customerAccountId?.let { put("customer_account_id", it) }
        value.customerDeviceFingerprint?.let { put("customer_device_fingerprint", it) }
        value.customerDeviceId?.let { put("customer_device_id", it) }
        value.customerEmailAddress?.let { put("customer_email_address", it) }
        value.customerPurchaseIp?.let { put("customer_purchase_ip", it) }
        value.productDescription?.let { put("product_description", it) }
        value.shippingAddress?.let { put("shipping_address", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputeVisaCompellingEvidence3PriorUndisputedTransaction(block: DisputeVisaCompellingEvidence3PriorUndisputedTransaction.Builder.() -> Unit): DisputeVisaCompellingEvidence3PriorUndisputedTransaction = DisputeVisaCompellingEvidence3PriorUndisputedTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DisputeVisaCompellingEvidence3PriorUndisputedTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
