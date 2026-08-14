package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payouts/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payouts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PayoutsPostRequestFormXa9ffa118.Serializer::class)
public class InlineV1PayoutsPostRequestFormXa9ffa118(
  /**
   * A positive integer in cents representing how much to payout.
   */
  public val amount: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * The ID of a bank account or a card to send the payout to. If you don't provide a destination, we use the default
   * external account for the specified currency.
   */
  public val destination: String? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * The method used to send this payout, which is `standard` or `instant`. We support `instant` for payouts to debit
   * cards and bank accounts in certain countries. Learn more about [bank support for Instant
   * Payouts](https://stripe.com/docs/payouts/instant-payouts-banks).
   */
  public val method: InlineV1PayoutsPostRequestFormMethodXb57a053f? = null,
  /**
   * The ID of a v2 FinancialAccount to send funds to.
   */
  public val payoutMethod: String? = null,
  /**
   * The balance type of your Stripe balance to draw this payout from. Balances for different payment sources are kept
   * separately. You can find the amounts with the Balances API. One of `bank_account`, `card`, or `fpx`.
   */
  public val sourceType: InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5? = null,
  /**
   * A string that displays on the recipient's bank or card statement (up to 22 characters). A `statement_descriptor`
   * that's longer than 22 characters return an error. Most banks truncate this information and display it
   * inconsistently. Some banks might not display it at all. For US ACH payouts, this maps to the ACH Company Entry
   * Description field, which the NACHA standard limits to 10 characters. Stripe truncates descriptors longer than 10
   * characters for US ACH payouts.
   */
  public val statementDescriptor: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

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

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * The ID of a bank account or a card to send the payout to. If you don't provide a destination, we use the default
     * external account for the specified currency.
     */
    public var destination: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The method used to send this payout, which is `standard` or `instant`. We support `instant` for payouts to debit
     * cards and bank accounts in certain countries. Learn more about [bank support for Instant
     * Payouts](https://stripe.com/docs/payouts/instant-payouts-banks).
     */
    public var method: InlineV1PayoutsPostRequestFormMethodXb57a053f? = null

    /**
     * The ID of a v2 FinancialAccount to send funds to.
     */
    public var payoutMethod: String? = null

    /**
     * The balance type of your Stripe balance to draw this payout from. Balances for different payment sources are kept
     * separately. You can find the amounts with the Balances API. One of `bank_account`, `card`, or `fpx`.
     */
    public var sourceType: InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5? = null

    /**
     * A string that displays on the recipient's bank or card statement (up to 22 characters). A `statement_descriptor`
     * that's longer than 22 characters return an error. Most banks truncate this information and display it
     * inconsistently. Some banks might not display it at all. For US ACH payouts, this maps to the ACH Company Entry
     * Description field, which the NACHA standard limits to 10 characters. Stripe truncates descriptors longer than 10
     * characters for US ACH payouts.
     */
    public var statementDescriptor: String? = null

    public fun build(): InlineV1PayoutsPostRequestFormXa9ffa118 {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return InlineV1PayoutsPostRequestFormXa9ffa118(
        amount = amount,
        currency = currency,
        description = description,
        destination = destination,
        expand = expand,
        metadata = metadata,
        method = method,
        payoutMethod = payoutMethod,
        sourceType = sourceType,
        statementDescriptor = statementDescriptor,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PayoutsPostRequestFormXa9ffa118 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PayoutsPostRequestFormXa9ffa118> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PayoutsPostRequestFormXa9ffa118 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PayoutsPostRequestFormXa9ffa118")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PayoutsPostRequestFormXa9ffa118 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1PayoutsPostRequestFormXa9ffa118(
        amount = amount,
        currency = currency,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        destination = rawObject["destination"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        method = rawObject["method"]?.let { json.decodeFromJsonElement<InlineV1PayoutsPostRequestFormMethodXb57a053f>(it) },
        payoutMethod = rawObject["payout_method"]?.let { json.decodeFromJsonElement<String>(it) },
        sourceType = rawObject["source_type"]?.let { json.decodeFromJsonElement<InlineV1PayoutsPostRequestFormSourceTypeX11cba1c5>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PayoutsPostRequestFormXa9ffa118) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PayoutsPostRequestFormXa9ffa118")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        value.description?.let { put("description", it) }
        value.destination?.let { put("destination", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.method?.let { put("method", json.encodeToJsonElement(it)) }
        value.payoutMethod?.let { put("payout_method", it) }
        value.sourceType?.let { put("source_type", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PayoutsPostRequestFormXa9ffa118(block: InlineV1PayoutsPostRequestFormXa9ffa118.Builder.() -> Unit): InlineV1PayoutsPostRequestFormXa9ffa118 = InlineV1PayoutsPostRequestFormXa9ffa118.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PayoutsPostRequestFormXa9ffa118 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
