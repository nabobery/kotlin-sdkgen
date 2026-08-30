package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class CashBalanceView internal constructor(
  public val available: Map<String, Int>? = null,
  public val customer: String,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  public val livemode: Boolean,
  @SerialName("object")
  public val objectValue: InlineCashBalanceObjectValueX319d0464,
  public val settings: CustomerBalanceCustomerBalanceSettings,
)

/**
 * A customer's `Cash balance` represents real funds. Customers can add funds to their cash balance by sending a bank
 * transfer. These funds can be used for payment and can eventually be paid out to your bank account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/cash_balance
 */
@Serializable(with = CashBalance.Serializer::class)
public class CashBalance(
  /**
   * The ID of the customer whose cash balance this object represents.
   */
  public val customer: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCashBalanceObjectValueX319d0464,
  public val settings: CustomerBalanceCustomerBalanceSettings,
  available: Map<String, Int>? = null,
  /**
   * The ID of an Account representing a customer whose cash balance this object represents.
   */
  public val customerAccount: String? = null,
) {
  /**
   * A hash of all cash balances available to this customer. You cannot delete a customer with any cash balances, even
   * if the balance is 0. Amounts are represented in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val available: Map<String, Int>? = available?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var customerValue: String? = null

    public var customer: String
      get() = requireNotNull(customerValue) { "customer is required" }
      set(`value`) {
        customerValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineCashBalanceObjectValueX319d0464? = null

    public var objectValue: InlineCashBalanceObjectValueX319d0464
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var settingsValue: CustomerBalanceCustomerBalanceSettings? = null

    public var settings: CustomerBalanceCustomerBalanceSettings
      get() = requireNotNull(settingsValue) { "settings is required" }
      set(`value`) {
        settingsValue = value
      }

    private var availableValue: Map<String, Int>? = null

    /**
     * A hash of all cash balances available to this customer. You cannot delete a customer with any cash balances, even
     * if the balance is 0. Amounts are represented in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public var available: Map<String, Int>?
      get() = availableValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        availableValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The ID of an Account representing a customer whose cash balance this object represents.
     */
    public var customerAccount: String? = null

    public fun build(): CashBalance {
      check(customerValue != null) { "customer is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(settingsValue != null) { "settings is required" }
      return CashBalance(
        customer = customer,
        livemode = livemode,
        objectValue = objectValue,
        settings = settings,
        available = available,
        customerAccount = customerAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CashBalance = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CashBalance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CashBalance {
      val jsonDecoder = decoder.requireJsonDecoder("CashBalance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CashBalance must be a JSON object")
      val customer = json.decodeRequired<String>(rawObject, "customer")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineCashBalanceObjectValueX319d0464>(rawObject, "object")
      val settings = json.decodeRequired<CustomerBalanceCustomerBalanceSettings>(rawObject, "settings")
      return CashBalance(
        customer = customer,
        livemode = livemode,
        objectValue = objectValue,
        settings = settings,
        available = rawObject["available"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, Int>?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CashBalance) {
      val jsonEncoder = encoder.requireJsonEncoder("CashBalance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("customer", value.customer)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("settings", json.encodeToJsonElement(value.settings))
        value.available?.let { put("available", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun cashBalance(block: CashBalance.Builder.() -> Unit): CashBalance = CashBalance.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CashBalance is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
