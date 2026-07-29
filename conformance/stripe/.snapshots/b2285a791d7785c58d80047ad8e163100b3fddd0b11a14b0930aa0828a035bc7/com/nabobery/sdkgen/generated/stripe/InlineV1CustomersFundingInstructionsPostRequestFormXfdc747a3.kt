package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1funding_instructions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1funding_instructions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3.Serializer::class)
public class InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3(
  /**
   * Additional parameters for `bank_transfer` funding types
   */
  public val bankTransfer: InlineV1CustomersFundingInstructionsPostRequestFormBankTransferXf6edde40,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * The `funding_type` to get the instructions for.
   */
  public val fundingType: InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var bankTransferValue:
        InlineV1CustomersFundingInstructionsPostRequestFormBankTransferXf6edde40? = null

    public var bankTransfer:
        InlineV1CustomersFundingInstructionsPostRequestFormBankTransferXf6edde40
      get() = requireNotNull(bankTransferValue) { "bankTransfer is required" }
      set(`value`) {
        bankTransferValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var fundingTypeValue:
        InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487? = null

    public var fundingType: InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487
      get() = requireNotNull(fundingTypeValue) { "fundingType is required" }
      set(`value`) {
        fundingTypeValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3 {
      check(bankTransferValue != null) { "bankTransfer is required" }
      check(currencyValue != null) { "currency is required" }
      check(fundingTypeValue != null) { "fundingType is required" }
      return InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3(
        bankTransfer = bankTransfer,
        currency = currency,
        fundingType = fundingType,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3 must be a JSON object")
      val bankTransfer = json.decodeRequired<InlineV1CustomersFundingInstructionsPostRequestFormBankTransferXf6edde40>(rawObject, "bank_transfer")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val fundingType = json.decodeRequired<InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487>(rawObject, "funding_type")
      return InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3(
        bankTransfer = bankTransfer,
        currency = currency,
        fundingType = fundingType,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bank_transfer", json.encodeToJsonElement(value.bankTransfer))
        put("currency", value.currency)
        put("funding_type", json.encodeToJsonElement(value.fundingType))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3(block: InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3.Builder.() -> Unit): InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3 = InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
