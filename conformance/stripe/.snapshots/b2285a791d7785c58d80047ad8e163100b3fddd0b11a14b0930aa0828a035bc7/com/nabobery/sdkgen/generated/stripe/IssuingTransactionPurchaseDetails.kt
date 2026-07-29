package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

@ConsistentCopyVisibility
@Serializable
public data class IssuingTransactionPurchaseDetailsView internal constructor(
  public val fleet: InlineIssuingTransactionPurchaseDetailsFleetXf3299b90? = null,
  public val flight: InlineIssuingTransactionPurchaseDetailsFlightX759b7297? = null,
  public val fuel: InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b? = null,
  public val lodging: InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5? = null,
  public val receipt: List<IssuingTransactionReceiptData>? = null,
  public val reference: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_purchase_details
 */
@Serializable(with = IssuingTransactionPurchaseDetails.Serializer::class)
public class IssuingTransactionPurchaseDetails(
  /**
   * Fleet-specific information for transactions using Fleet cards.
   */
  public val fleet: InlineIssuingTransactionPurchaseDetailsFleetXf3299b90? = null,
  /**
   * Information about the flight that was purchased with this transaction.
   */
  public val flight: InlineIssuingTransactionPurchaseDetailsFlightX759b7297? = null,
  /**
   * Information about fuel that was purchased with this transaction.
   */
  public val fuel: InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b? = null,
  /**
   * Information about lodging that was purchased with this transaction.
   */
  public val lodging: InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5? = null,
  receipt: List<IssuingTransactionReceiptData>? = null,
  /**
   * A merchant-specific order number.
   */
  public val reference: String? = null,
) {
  /**
   * The line items in the purchase.
   */
  public val receipt: List<IssuingTransactionReceiptData>? =
      receipt?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Fleet-specific information for transactions using Fleet cards.
     */
    public var fleet: InlineIssuingTransactionPurchaseDetailsFleetXf3299b90? = null

    /**
     * Information about the flight that was purchased with this transaction.
     */
    public var flight: InlineIssuingTransactionPurchaseDetailsFlightX759b7297? = null

    /**
     * Information about fuel that was purchased with this transaction.
     */
    public var fuel: InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b? = null

    /**
     * Information about lodging that was purchased with this transaction.
     */
    public var lodging: InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5? = null

    private var receiptValue: List<IssuingTransactionReceiptData>? = null

    /**
     * The line items in the purchase.
     */
    public var receipt: List<IssuingTransactionReceiptData>?
      get() = receiptValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        receiptValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * A merchant-specific order number.
     */
    public var reference: String? = null

    public fun build(): IssuingTransactionPurchaseDetails = IssuingTransactionPurchaseDetails(
      fleet = fleet,
      flight = flight,
      fuel = fuel,
      lodging = lodging,
      receipt = receipt,
      reference = reference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransactionPurchaseDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingTransactionPurchaseDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransactionPurchaseDetails {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionPurchaseDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransactionPurchaseDetails must be a JSON object")
      return IssuingTransactionPurchaseDetails(
        fleet = rawObject["fleet"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionPurchaseDetailsFleetXf3299b90?>(element) },
        flight = rawObject["flight"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionPurchaseDetailsFlightX759b7297?>(element) },
        fuel = rawObject["fuel"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b?>(element) },
        lodging = rawObject["lodging"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionPurchaseDetailsLodgingX4e97eca5?>(element) },
        receipt = rawObject["receipt"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<IssuingTransactionReceiptData>?>(element) },
        reference = rawObject["reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransactionPurchaseDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionPurchaseDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fleet?.let { put("fleet", json.encodeToJsonElement(it)) }
        value.flight?.let { put("flight", json.encodeToJsonElement(it)) }
        value.fuel?.let { put("fuel", json.encodeToJsonElement(it)) }
        value.lodging?.let { put("lodging", json.encodeToJsonElement(it)) }
        value.receipt?.let { put("receipt", json.encodeToJsonElement(it)) }
        value.reference?.let { put("reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransactionPurchaseDetails(block: IssuingTransactionPurchaseDetails.Builder.() -> Unit): IssuingTransactionPurchaseDetails = IssuingTransactionPurchaseDetails.build(block)
