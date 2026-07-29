package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1funding_instructions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/bank_transfer/properties/eu_bank_transfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1funding_instructions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/bank_transfer/properties/eu_bank_transfer
 */
@Serializable(with = InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe.Serializer::class)
public class InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe(
  public val country: String,
) {
  public class Builder {
    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    public fun build(): InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe {
      check(countryValue != null) { "country is required" }
      return InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe(
        country = country,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe must be a JSON object")
      val country = json.decodeRequired<String>(rawObject, "country")
      return InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe(
        country = country,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", value.country)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe(block: InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe.Builder.() -> Unit): InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe = InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersFundingIn90ecPostRequestFormBankTransferEuBankTransferX17770dfe is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
