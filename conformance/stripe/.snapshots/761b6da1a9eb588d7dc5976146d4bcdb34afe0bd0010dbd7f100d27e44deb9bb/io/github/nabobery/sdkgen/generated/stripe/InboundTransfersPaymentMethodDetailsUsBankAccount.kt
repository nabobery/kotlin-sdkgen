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
 * Source: sdkgen://source/openapi.json#/components/schemas/inbound_transfers_payment_method_details_us_bank_account
 */
@Serializable(with = InboundTransfersPaymentMethodDetailsUsBankAccount.Serializer::class)
public class InboundTransfersPaymentMethodDetailsUsBankAccount(
  /**
   * The network rails used. See the [docs](https://docs.stripe.com/treasury/money-movement/timelines) to learn more
   * about money movement timelines for each network type.
   */
  public val network: InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023,
  /**
   * Account holder type: individual or company.
   */
  public val accountHolderType: InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f? = null,
  /**
   * Account type: checkings or savings. Defaults to checking if omitted.
   */
  public val accountType:
      InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c? = null,
  /**
   * Name of the bank associated with the bank account.
   */
  public val bankName: String? = null,
  /**
   * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are
   * the same.
   */
  public val fingerprint: String? = null,
  /**
   * Last four digits of the bank account number.
   */
  public val last4: String? = null,
  /**
   * ID of the mandate used to make this payment.
   */
  public val mandate:
      InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d? = null,
  /**
   * Routing number of the bank account.
   */
  public val routingNumber: String? = null,
) {
  public class Builder {
    private var networkValue:
        InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023? = null

    public var network: InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023
      get() = requireNotNull(networkValue) { "network is required" }
      set(`value`) {
        networkValue = value
      }

    /**
     * Account holder type: individual or company.
     */
    public var accountHolderType: InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f? = null

    /**
     * Account type: checkings or savings. Defaults to checking if omitted.
     */
    public var accountType:
        InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c? = null

    /**
     * Name of the bank associated with the bank account.
     */
    public var bankName: String? = null

    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts
     * are the same.
     */
    public var fingerprint: String? = null

    /**
     * Last four digits of the bank account number.
     */
    public var last4: String? = null

    /**
     * ID of the mandate used to make this payment.
     */
    public var mandate: InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d? =
        null

    /**
     * Routing number of the bank account.
     */
    public var routingNumber: String? = null

    public fun build(): InboundTransfersPaymentMethodDetailsUsBankAccount {
      check(networkValue != null) { "network is required" }
      return InboundTransfersPaymentMethodDetailsUsBankAccount(
        network = network,
        accountHolderType = accountHolderType,
        accountType = accountType,
        bankName = bankName,
        fingerprint = fingerprint,
        last4 = last4,
        mandate = mandate,
        routingNumber = routingNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InboundTransfersPaymentMethodDetailsUsBankAccount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InboundTransfersPaymentMethodDetailsUsBankAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InboundTransfersPaymentMethodDetailsUsBankAccount {
      val jsonDecoder = decoder.requireJsonDecoder("InboundTransfersPaymentMethodDetailsUsBankAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InboundTransfersPaymentMethodDetailsUsBankAccount must be a JSON object")
      val network = json.decodeRequired<InlineInboundTransfersPaymentMethodDetailsUsBankAccountNetworkXca8f6023>(rawObject, "network")
      return InboundTransfersPaymentMethodDetailsUsBankAccount(
        network = network,
        accountHolderType = rawObject["account_holder_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInboundTransfersPaymaf43AccountHolderTypeXc7c6f01f?>(element) },
        accountType = rawObject["account_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInboundTransfersPaymentMethodDetailsUsBankAccountAccountTypeX1f87d12c?>(element) },
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        mandate = rawObject["mandate"]?.let { json.decodeFromJsonElement<InlineInboundTransfersPaymentMethodDetailsUsBankAccountMandateX5ef0400d>(it) },
        routingNumber = rawObject["routing_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InboundTransfersPaymentMethodDetailsUsBankAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("InboundTransfersPaymentMethodDetailsUsBankAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("network", json.encodeToJsonElement(value.network))
        value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
        value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
        value.bankName?.let { put("bank_name", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.last4?.let { put("last4", it) }
        value.mandate?.let { put("mandate", json.encodeToJsonElement(it)) }
        value.routingNumber?.let { put("routing_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inboundTransfersPaymentMethodDetailsUsBankAccount(block: InboundTransfersPaymentMethodDetailsUsBankAccount.Builder.() -> Unit): InboundTransfersPaymentMethodDetailsUsBankAccount = InboundTransfersPaymentMethodDetailsUsBankAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InboundTransfersPaymentMethodDetailsUsBankAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
