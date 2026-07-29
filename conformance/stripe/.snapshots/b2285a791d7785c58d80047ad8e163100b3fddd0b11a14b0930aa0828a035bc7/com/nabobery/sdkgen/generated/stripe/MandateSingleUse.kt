package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_single_use
 */
@Serializable(with = MandateSingleUse.Serializer::class)
public class MandateSingleUse(
  /**
   * The amount of the payment on a single use mandate.
   */
  public val amount: Int,
  /**
   * The currency of the payment on a single use mandate.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
) {
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

    public fun build(): MandateSingleUse {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return MandateSingleUse(
        amount = amount,
        currency = currency,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MandateSingleUse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MandateSingleUse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MandateSingleUse {
      val jsonDecoder = decoder.requireJsonDecoder("MandateSingleUse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MandateSingleUse must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return MandateSingleUse(
        amount = amount,
        currency = currency,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MandateSingleUse) {
      val jsonEncoder = encoder.requireJsonEncoder("MandateSingleUse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mandateSingleUse(block: MandateSingleUse.Builder.() -> Unit): MandateSingleUse = MandateSingleUse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MandateSingleUse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
