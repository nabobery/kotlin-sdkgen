package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate_currency_option
 */
@Serializable(with = ShippingRateCurrencyOption.Serializer::class)
public class ShippingRateCurrencyOption(
  /**
   * A non-negative integer in cents representing how much to charge.
   */
  public val amount: Int,
  /**
   * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`,
   * or `unspecified`.
   */
  public val taxBehavior: InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var taxBehaviorValue: InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58? = null

    public var taxBehavior: InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58
      get() = requireNotNull(taxBehaviorValue) { "taxBehavior is required" }
      set(`value`) {
        taxBehaviorValue = value
      }

    public fun build(): ShippingRateCurrencyOption {
      check(amountValue != null) { "amount is required" }
      check(taxBehaviorValue != null) { "taxBehavior is required" }
      return ShippingRateCurrencyOption(
        amount = amount,
        taxBehavior = taxBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShippingRateCurrencyOption = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ShippingRateCurrencyOption> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShippingRateCurrencyOption {
      val jsonDecoder = decoder.requireJsonDecoder("ShippingRateCurrencyOption")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ShippingRateCurrencyOption must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val taxBehavior = json.decodeRequired<InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58>(rawObject, "tax_behavior")
      return ShippingRateCurrencyOption(
        amount = amount,
        taxBehavior = taxBehavior,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShippingRateCurrencyOption) {
      val jsonEncoder = encoder.requireJsonEncoder("ShippingRateCurrencyOption")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("tax_behavior", json.encodeToJsonElement(value.taxBehavior))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shippingRateCurrencyOption(block: ShippingRateCurrencyOption.Builder.() -> Unit): ShippingRateCurrencyOption = ShippingRateCurrencyOption.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ShippingRateCurrencyOption is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
