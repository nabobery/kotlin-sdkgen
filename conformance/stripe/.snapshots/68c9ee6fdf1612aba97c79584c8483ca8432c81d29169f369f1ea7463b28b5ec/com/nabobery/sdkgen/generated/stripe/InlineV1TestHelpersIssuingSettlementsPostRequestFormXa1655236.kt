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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1settlements/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1settlements/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236.Serializer::class)
public class InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236(
  /**
   * The Bank Identification Number reflecting this settlement record.
   */
  public val bin: String,
  /**
   * The date that the transactions are cleared and posted to user's accounts.
   */
  public val clearingDate: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * The total net amount required to settle with the network.
   */
  public val netTotalAmount: Int,
  expand: List<String>? = null,
  /**
   * The total interchange received as reimbursement for the transactions.
   */
  public val interchangeFeesAmount: Int? = null,
  /**
   * The card network for this settlement. One of ["visa", "maestro", "mastercard"]
   */
  public val network: InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d? = null,
  /**
   * The Settlement Identification Number assigned by the network.
   */
  public val networkSettlementIdentifier: String? = null,
  /**
   * The total transaction amount reflected in this settlement.
   */
  public val transactionAmount: Int? = null,
  /**
   * The total number of transactions reflected in this settlement.
   */
  public val transactionCount: Int? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var binValue: String? = null

    public var bin: String
      get() = requireNotNull(binValue) { "bin is required" }
      set(`value`) {
        binValue = value
      }

    private var clearingDateValue: Int? = null

    public var clearingDate: Int
      get() = requireNotNull(clearingDateValue) { "clearingDate is required" }
      set(`value`) {
        clearingDateValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var netTotalAmountValue: Int? = null

    public var netTotalAmount: Int
      get() = requireNotNull(netTotalAmountValue) { "netTotalAmount is required" }
      set(`value`) {
        netTotalAmountValue = value
      }

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
     * The total interchange received as reimbursement for the transactions.
     */
    public var interchangeFeesAmount: Int? = null

    /**
     * The card network for this settlement. One of ["visa", "maestro", "mastercard"]
     */
    public var network: InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d? = null

    /**
     * The Settlement Identification Number assigned by the network.
     */
    public var networkSettlementIdentifier: String? = null

    /**
     * The total transaction amount reflected in this settlement.
     */
    public var transactionAmount: Int? = null

    /**
     * The total number of transactions reflected in this settlement.
     */
    public var transactionCount: Int? = null

    public fun build(): InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236 {
      check(binValue != null) { "bin is required" }
      check(clearingDateValue != null) { "clearingDate is required" }
      check(currencyValue != null) { "currency is required" }
      check(netTotalAmountValue != null) { "netTotalAmount is required" }
      return InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236(
        bin = bin,
        clearingDate = clearingDate,
        currency = currency,
        netTotalAmount = netTotalAmount,
        expand = expand,
        interchangeFeesAmount = interchangeFeesAmount,
        network = network,
        networkSettlementIdentifier = networkSettlementIdentifier,
        transactionAmount = transactionAmount,
        transactionCount = transactionCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236 must be a JSON object")
      val bin = json.decodeRequired<String>(rawObject, "bin")
      val clearingDate = json.decodeRequired<Int>(rawObject, "clearing_date")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val netTotalAmount = json.decodeRequired<Int>(rawObject, "net_total_amount")
      return InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236(
        bin = bin,
        clearingDate = clearingDate,
        currency = currency,
        netTotalAmount = netTotalAmount,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        interchangeFeesAmount = rawObject["interchange_fees_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        network = rawObject["network"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d>(it) },
        networkSettlementIdentifier = rawObject["network_settlement_identifier"]?.let { json.decodeFromJsonElement<String>(it) },
        transactionAmount = rawObject["transaction_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        transactionCount = rawObject["transaction_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bin", value.bin)
        put("clearing_date", json.encodeToJsonElement(value.clearingDate))
        put("currency", value.currency)
        put("net_total_amount", json.encodeToJsonElement(value.netTotalAmount))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.interchangeFeesAmount?.let { put("interchange_fees_amount", json.encodeToJsonElement(it)) }
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
        value.networkSettlementIdentifier?.let { put("network_settlement_identifier", it) }
        value.transactionAmount?.let { put("transaction_amount", json.encodeToJsonElement(it)) }
        value.transactionCount?.let { put("transaction_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236(block: InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236.Builder.() -> Unit): InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236 = InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
