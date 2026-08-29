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
 * If this is an `acss_debit` PaymentMethod, this hash contains details about the ACSS Debit payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/acss_debit
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f(
  public val accountNumber: String,
  public val institutionNumber: String,
  public val transitNumber: String,
) {
  public class Builder {
    private var accountNumberValue: String? = null

    public var accountNumber: String
      get() = requireNotNull(accountNumberValue) { "accountNumber is required" }
      set(`value`) {
        accountNumberValue = value
      }

    private var institutionNumberValue: String? = null

    public var institutionNumber: String
      get() = requireNotNull(institutionNumberValue) { "institutionNumber is required" }
      set(`value`) {
        institutionNumberValue = value
      }

    private var transitNumberValue: String? = null

    public var transitNumber: String
      get() = requireNotNull(transitNumberValue) { "transitNumber is required" }
      set(`value`) {
        transitNumberValue = value
      }

    public fun build(): InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f {
      check(accountNumberValue != null) { "accountNumber is required" }
      check(institutionNumberValue != null) { "institutionNumber is required" }
      check(transitNumberValue != null) { "transitNumber is required" }
      return InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f(
        accountNumber = accountNumber,
        institutionNumber = institutionNumber,
        transitNumber = transitNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f must be a JSON object")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val institutionNumber = json.decodeRequired<String>(rawObject, "institution_number")
      val transitNumber = json.decodeRequired<String>(rawObject, "transit_number")
      return InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f(
        accountNumber = accountNumber,
        institutionNumber = institutionNumber,
        transitNumber = transitNumber,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_number", value.accountNumber)
        put("institution_number", value.institutionNumber)
        put("transit_number", value.transitNumber)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f(block: InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f = InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
