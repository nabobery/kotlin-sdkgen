package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class BankConnectionsResourceAccountholderView(
  public val account: InlineBankConnectionsResourceAccountholderAccountX9870ade7? = null,
  public val customer: InlineBankConnectionsResourceAccountholderCustomerX6b1e2861? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  public val type: InlineBankConnectionsResourceAccountholderTypeX4438d25c,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_accountholder
 */
@Serializable(with = BankConnectionsResourceAccountholder.Serializer::class)
public class BankConnectionsResourceAccountholder(
  /**
   * Type of account holder that this account belongs to.
   */
  public val type: InlineBankConnectionsResourceAccountholderTypeX4438d25c,
  /**
   * The ID of the Stripe account that this account belongs to. Only available when `account_holder.type` is `account`.
   */
  public val account: InlineBankConnectionsResourceAccountholderAccountX9870ade7? = null,
  /**
   * The ID for an Account representing a customer that this account belongs to. Only available when
   * `account_holder.type` is `customer`.
   */
  public val customer: InlineBankConnectionsResourceAccountholderCustomerX6b1e2861? = null,
  public val customerAccount: String? = null,
) {
  public class Builder {
    private var typeValue: InlineBankConnectionsResourceAccountholderTypeX4438d25c? = null

    public var type: InlineBankConnectionsResourceAccountholderTypeX4438d25c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The ID of the Stripe account that this account belongs to. Only available when `account_holder.type` is
     * `account`.
     */
    public var account: InlineBankConnectionsResourceAccountholderAccountX9870ade7? = null

    /**
     * The ID for an Account representing a customer that this account belongs to. Only available when
     * `account_holder.type` is `customer`.
     */
    public var customer: InlineBankConnectionsResourceAccountholderCustomerX6b1e2861? = null

    public var customerAccount: String? = null

    public fun build(): BankConnectionsResourceAccountholder {
      check(typeValue != null) { "type is required" }
      return BankConnectionsResourceAccountholder(
        type = type,
        account = account,
        customer = customer,
        customerAccount = customerAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BankConnectionsResourceAccountholder = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BankConnectionsResourceAccountholder> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BankConnectionsResourceAccountholder {
      val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceAccountholder")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BankConnectionsResourceAccountholder must be a JSON object")
      val type = json.decodeRequired<InlineBankConnectionsResourceAccountholderTypeX4438d25c>(rawObject, "type")
      return BankConnectionsResourceAccountholder(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<InlineBankConnectionsResourceAccountholderAccountX9870ade7>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<InlineBankConnectionsResourceAccountholderCustomerX6b1e2861>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BankConnectionsResourceAccountholder) {
      val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceAccountholder")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bankConnectionsResourceAccountholder(block: BankConnectionsResourceAccountholder.Builder.() -> Unit): BankConnectionsResourceAccountholder = BankConnectionsResourceAccountholder.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BankConnectionsResourceAccountholder is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
