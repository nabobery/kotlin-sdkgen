package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_balance_api_resource_credit_balance
 */
@Serializable(with = BankConnectionsResourceBalanceApiResourceCreditBalance.Serializer::class)
public class BankConnectionsResourceBalanceApiResourceCreditBalance(
  used: Map<String, Int>? = null,
) {
  /**
   * The credit that has been used by the account holder.
   *
   * Each key is a three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase.
   *
   * Each value is a integer amount. A positive amount indicates money owed to the account holder. A negative amount
   * indicates money owed by the account holder.
   */
  public val used: Map<String, Int>? = used?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var usedValue: Map<String, Int>? = null

    /**
     * The credit that has been used by the account holder.
     *
     * Each key is a three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase.
     *
     * Each value is a integer amount. A positive amount indicates money owed to the account holder. A negative amount
     * indicates money owed by the account holder.
     */
    public var used: Map<String, Int>?
      get() = usedValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        usedValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): BankConnectionsResourceBalanceApiResourceCreditBalance = BankConnectionsResourceBalanceApiResourceCreditBalance(
      used = used,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BankConnectionsResourceBalanceApiResourceCreditBalance = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BankConnectionsResourceBalanceApiResourceCreditBalance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BankConnectionsResourceBalanceApiResourceCreditBalance {
      val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceBalanceApiResourceCreditBalance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BankConnectionsResourceBalanceApiResourceCreditBalance must be a JSON object")
      return BankConnectionsResourceBalanceApiResourceCreditBalance(
        used = rawObject["used"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, Int>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BankConnectionsResourceBalanceApiResourceCreditBalance) {
      val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceBalanceApiResourceCreditBalance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.used?.let { put("used", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bankConnectionsResourceBalanceApiResourceCreditBalance(block: BankConnectionsResourceBalanceApiResourceCreditBalance.Builder.() -> Unit): BankConnectionsResourceBalanceApiResourceCreditBalance = BankConnectionsResourceBalanceApiResourceCreditBalance.build(block)
