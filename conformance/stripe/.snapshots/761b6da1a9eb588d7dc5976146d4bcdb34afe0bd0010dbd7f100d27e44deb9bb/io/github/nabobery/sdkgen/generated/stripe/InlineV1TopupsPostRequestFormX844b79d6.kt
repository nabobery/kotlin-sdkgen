package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1topups/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1topups/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TopupsPostRequestFormX844b79d6.Serializer::class)
public class InlineV1TopupsPostRequestFormX844b79d6(
  /**
   * A positive integer representing how much to transfer.
   */
  public val amount: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  public val currency: String,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1TopupsPostRequestFormMetadataX7aa3f56a? = null,
  /**
   * The ID of a PaymentMethod representing the payment method to be used for the top-up. A PaymentMethod of type
   * `us_bank_account` can be used.
   */
  public val paymentMethod: String? = null,
  /**
   * Payment method-specific configuration for this top-up.
   */
  public val paymentMethodOptions:
      InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043? = null,
  /**
   * The ID of a source to transfer funds from. For most users, this should be left unspecified which will use the bank
   * account that was set up in the dashboard for the specified currency. In test mode, this can be a test bank token
   * (see [Testing Top-ups](https://docs.stripe.com/connect/testing#testing-top-ups)).
   */
  public val source: String? = null,
  /**
   * Extra information about a top-up for the source's bank statement. Limited to 15 ASCII characters.
   */
  public val statementDescriptor: String? = null,
  /**
   * A string that identifies this top-up as part of a group.
   */
  public val transferGroup: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

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
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1TopupsPostRequestFormMetadataX7aa3f56a? = null

    /**
     * The ID of a PaymentMethod representing the payment method to be used for the top-up. A PaymentMethod of type
     * `us_bank_account` can be used.
     */
    public var paymentMethod: String? = null

    /**
     * Payment method-specific configuration for this top-up.
     */
    public var paymentMethodOptions: InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043? =
        null

    /**
     * The ID of a source to transfer funds from. For most users, this should be left unspecified which will use the
     * bank account that was set up in the dashboard for the specified currency. In test mode, this can be a test bank
     * token (see [Testing Top-ups](https://docs.stripe.com/connect/testing#testing-top-ups)).
     */
    public var source: String? = null

    /**
     * Extra information about a top-up for the source's bank statement. Limited to 15 ASCII characters.
     */
    public var statementDescriptor: String? = null

    /**
     * A string that identifies this top-up as part of a group.
     */
    public var transferGroup: String? = null

    public fun build(): InlineV1TopupsPostRequestFormX844b79d6 {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return InlineV1TopupsPostRequestFormX844b79d6(
        amount = amount,
        currency = currency,
        description = description,
        expand = expand,
        metadata = metadata,
        paymentMethod = paymentMethod,
        paymentMethodOptions = paymentMethodOptions,
        source = source,
        statementDescriptor = statementDescriptor,
        transferGroup = transferGroup,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TopupsPostRequestFormX844b79d6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TopupsPostRequestFormX844b79d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TopupsPostRequestFormX844b79d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TopupsPostRequestFormX844b79d6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TopupsPostRequestFormX844b79d6 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1TopupsPostRequestFormX844b79d6(
        amount = amount,
        currency = currency,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1TopupsPostRequestFormMetadataX7aa3f56a>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1TopupsPostRequestFormPaymentMethodOptionsXed765043>(it) },
        source = rawObject["source"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        transferGroup = rawObject["transfer_group"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TopupsPostRequestFormX844b79d6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TopupsPostRequestFormX844b79d6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        value.description?.let { put("description", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.source?.let { put("source", it) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TopupsPostRequestFormX844b79d6(block: InlineV1TopupsPostRequestFormX844b79d6.Builder.() -> Unit): InlineV1TopupsPostRequestFormX844b79d6 = InlineV1TopupsPostRequestFormX844b79d6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TopupsPostRequestFormX844b79d6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
