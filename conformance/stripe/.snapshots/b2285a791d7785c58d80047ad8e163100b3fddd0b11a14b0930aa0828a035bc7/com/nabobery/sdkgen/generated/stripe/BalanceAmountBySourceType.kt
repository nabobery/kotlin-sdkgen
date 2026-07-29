package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_amount_by_source_type
 */
@Serializable(with = BalanceAmountBySourceType.Serializer::class)
public class BalanceAmountBySourceType(
  /**
   * Amount coming from [legacy US ACH payments](https://docs.stripe.com/ach-deprecated).
   */
  public val bankAccount: Int? = null,
  /**
   * Amount coming from most payment methods, including cards as well as [non-legacy bank
   * debits](https://docs.stripe.com/payments/bank-debits).
   */
  public val card: Int? = null,
  /**
   * Amount coming from [FPX](https://docs.stripe.com/payments/fpx), a Malaysian payment method.
   */
  public val fpx: Int? = null,
) {
  public class Builder {
    /**
     * Amount coming from [legacy US ACH payments](https://docs.stripe.com/ach-deprecated).
     */
    public var bankAccount: Int? = null

    /**
     * Amount coming from most payment methods, including cards as well as [non-legacy bank
     * debits](https://docs.stripe.com/payments/bank-debits).
     */
    public var card: Int? = null

    /**
     * Amount coming from [FPX](https://docs.stripe.com/payments/fpx), a Malaysian payment method.
     */
    public var fpx: Int? = null

    public fun build(): BalanceAmountBySourceType = BalanceAmountBySourceType(
      bankAccount = bankAccount,
      card = card,
      fpx = fpx,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BalanceAmountBySourceType = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BalanceAmountBySourceType> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BalanceAmountBySourceType {
      val jsonDecoder = decoder.requireJsonDecoder("BalanceAmountBySourceType")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BalanceAmountBySourceType must be a JSON object")
      return BalanceAmountBySourceType(
        bankAccount = rawObject["bank_account"]?.let { json.decodeFromJsonElement<Int>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<Int>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BalanceAmountBySourceType) {
      val jsonEncoder = encoder.requireJsonEncoder("BalanceAmountBySourceType")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankAccount?.let { put("bank_account", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.fpx?.let { put("fpx", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balanceAmountBySourceType(block: BalanceAmountBySourceType.Builder.() -> Unit): BalanceAmountBySourceType = BalanceAmountBySourceType.build(block)
