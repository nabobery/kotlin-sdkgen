package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class BankConnectionsResourceBalanceView internal constructor(
  @SerialName("as_of")
  public val asOf: Int,
  public val cash: BankConnectionsResourceBalanceApiResourceCashBalance? = null,
  public val credit: BankConnectionsResourceBalanceApiResourceCreditBalance? = null,
  public val current: Map<String, Int>,
  public val type: InlineBankConnectionsResourceBalanceTypeX335d46c9,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_balance
 */
@Serializable(with = BankConnectionsResourceBalance.Serializer::class)
public class BankConnectionsResourceBalance(
  /**
   * The time that the external institution calculated this balance. Measured in seconds since the Unix epoch.
   */
  public val asOf: Int,
  current: Map<String, Int>,
  /**
   * The `type` of the balance. An additional hash is included on the balance with a name matching this value.
   */
  public val type: InlineBankConnectionsResourceBalanceTypeX335d46c9,
  public val cash: BankConnectionsResourceBalanceApiResourceCashBalance? = null,
  public val credit: BankConnectionsResourceBalanceApiResourceCreditBalance? = null,
) {
  /**
   * The balances owed to (or by) the account holder, before subtracting any outbound pending transactions or adding any
   * inbound pending transactions.
   *
   * Each key is a three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase.
   *
   * Each value is a integer amount. A positive amount indicates money owed to the account holder. A negative amount
   * indicates money owed by the account holder.
   */
  public val current: Map<String, Int> = current.toMap()

  public class Builder {
    private var asOfValue: Int? = null

    public var asOf: Int
      get() = requireNotNull(asOfValue) { "asOf is required" }
      set(`value`) {
        asOfValue = value
      }

    private var currentValue: Map<String, Int>? = null

    public var current: Map<String, Int>
      get() = requireNotNull(currentValue) { "current is required" }.toMap()
      set(`value`) {
        currentValue = value.toMap()
      }

    private var typeValue: InlineBankConnectionsResourceBalanceTypeX335d46c9? = null

    public var type: InlineBankConnectionsResourceBalanceTypeX335d46c9
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cash: BankConnectionsResourceBalanceApiResourceCashBalance? = null

    public var credit: BankConnectionsResourceBalanceApiResourceCreditBalance? = null

    public fun build(): BankConnectionsResourceBalance {
      check(asOfValue != null) { "asOf is required" }
      check(currentValue != null) { "current is required" }
      check(typeValue != null) { "type is required" }
      return BankConnectionsResourceBalance(
        asOf = asOf,
        current = current,
        type = type,
        cash = cash,
        credit = credit,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BankConnectionsResourceBalance = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BankConnectionsResourceBalance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BankConnectionsResourceBalance {
      val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceBalance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BankConnectionsResourceBalance must be a JSON object")
      val asOf = json.decodeRequired<Int>(rawObject, "as_of")
      val current = json.decodeRequired<Map<String, Int>>(rawObject, "current")
      val type = json.decodeRequired<InlineBankConnectionsResourceBalanceTypeX335d46c9>(rawObject, "type")
      return BankConnectionsResourceBalance(
        asOf = asOf,
        current = current,
        type = type,
        cash = rawObject["cash"]?.let { json.decodeFromJsonElement<BankConnectionsResourceBalanceApiResourceCashBalance>(it) },
        credit = rawObject["credit"]?.let { json.decodeFromJsonElement<BankConnectionsResourceBalanceApiResourceCreditBalance>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BankConnectionsResourceBalance) {
      val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceBalance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("as_of", json.encodeToJsonElement(value.asOf))
        put("current", json.encodeToJsonElement(value.current))
        put("type", json.encodeToJsonElement(value.type))
        value.cash?.let { put("cash", json.encodeToJsonElement(it)) }
        value.credit?.let { put("credit", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bankConnectionsResourceBalance(block: BankConnectionsResourceBalance.Builder.() -> Unit): BankConnectionsResourceBalance = BankConnectionsResourceBalance.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BankConnectionsResourceBalance is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
