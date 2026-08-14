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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340.Serializer::class)
public class InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340(
  /**
   * The updated total amount that you intend to collect from the cardholder. This amount must be greater than the
   * currently authorized amount.
   */
  public val amount: Int,
  /**
   * Provides industry-specific information about the amount.
   */
  public val amountDetails:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8? = null,
  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
   * the application owner's Stripe account. The amount of the application fee collected will be capped at the total
   * amount captured. For more information, see the PaymentIntents [use case for connected
   * accounts](https://docs.stripe.com/payments/connected-accounts).
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  expand: List<String>? = null,
  /**
   * Automations to be run during the PaymentIntent lifecycle
   */
  public val hooks:
      InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318? = null,
  metadata: Map<String, String>? = null,
  /**
   * Provides industry-specific information about the charge.
   */
  public val paymentDetails:
      InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b? = null,
  /**
   * Text that appears on the customer's statement as the statement descriptor for a non-card or card charge. This value
   * overrides the account's default statement descriptor. For information about requirements, including the
   * 22-character limit, see [the Statement Descriptor
   * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
   */
  public val statementDescriptor: String? = null,
  /**
   * The parameters used to automatically create a transfer after the payment is captured.
   * Learn more about the [use case for connected accounts](https://docs.stripe.com/payments/connected-accounts).
   */
  public val transferData:
      InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormTransferDataX9a57b9e7? = null,
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

    /**
     * Provides industry-specific information about the amount.
     */
    public var amountDetails: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8? =
        null

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
     * the application owner's Stripe account. The amount of the application fee collected will be capped at the total
     * amount captured. For more information, see the PaymentIntents [use case for connected
     * accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public var applicationFeeAmount: Int? = null

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
     * Automations to be run during the PaymentIntent lifecycle
     */
    public var hooks: InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318? =
        null

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
     * Provides industry-specific information about the charge.
     */
    public var paymentDetails: InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b?
        = null

    /**
     * Text that appears on the customer's statement as the statement descriptor for a non-card or card charge. This
     * value overrides the account's default statement descriptor. For information about requirements, including the
     * 22-character limit, see [the Statement Descriptor
     * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
     */
    public var statementDescriptor: String? = null

    /**
     * The parameters used to automatically create a transfer after the payment is captured.
     * Learn more about the [use case for connected accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public var transferData:
        InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormTransferDataX9a57b9e7? = null

    public fun build(): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340 {
      check(amountValue != null) { "amount is required" }
      return InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340(
        amount = amount,
        amountDetails = amountDetails,
        applicationFeeAmount = applicationFeeAmount,
        description = description,
        expand = expand,
        hooks = hooks,
        metadata = metadata,
        paymentDetails = paymentDetails,
        statementDescriptor = statementDescriptor,
        transferData = transferData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      return InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340(
        amount = amount,
        amountDetails = rawObject["amount_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8>(it) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        hooks = rawObject["hooks"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormHooksX56cd1318>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        paymentDetails = rawObject["payment_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormTransferDataX9a57b9e7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.hooks?.let { put("hooks", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.paymentDetails?.let { put("payment_details", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340(block: InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340.Builder.() -> Unit): InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340 = InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsIncrementAuthorizationPostRequestFormX7293f340 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
