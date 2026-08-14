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
 * Source: sdkgen://source/openapi.json#/components/schemas/coupon_currency_option
 */
@Serializable(with = CouponCurrencyOption.Serializer::class)
public class CouponCurrencyOption(
  /**
   * Amount (in the `currency` specified) that will be taken off the subtotal of any invoices for this customer.
   */
  public val amountOff: Int,
) {
  public class Builder {
    private var amountOffValue: Int? = null

    public var amountOff: Int
      get() = requireNotNull(amountOffValue) { "amountOff is required" }
      set(`value`) {
        amountOffValue = value
      }

    public fun build(): CouponCurrencyOption {
      check(amountOffValue != null) { "amountOff is required" }
      return CouponCurrencyOption(
        amountOff = amountOff,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CouponCurrencyOption = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CouponCurrencyOption> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CouponCurrencyOption {
      val jsonDecoder = decoder.requireJsonDecoder("CouponCurrencyOption")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CouponCurrencyOption must be a JSON object")
      val amountOff = json.decodeRequired<Int>(rawObject, "amount_off")
      return CouponCurrencyOption(
        amountOff = amountOff,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CouponCurrencyOption) {
      val jsonEncoder = encoder.requireJsonEncoder("CouponCurrencyOption")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_off", json.encodeToJsonElement(value.amountOff))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun couponCurrencyOption(block: CouponCurrencyOption.Builder.() -> Unit): CouponCurrencyOption = CouponCurrencyOption.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CouponCurrencyOption is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
