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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/au_becs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/au_becs_debit
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e(
  public val accountNumber: String,
  public val bsbNumber: String,
) {
  public class Builder {
    private var accountNumberValue: String? = null

    public var accountNumber: String
      get() = requireNotNull(accountNumberValue) { "accountNumber is required" }
      set(`value`) {
        accountNumberValue = value
      }

    private var bsbNumberValue: String? = null

    public var bsbNumber: String
      get() = requireNotNull(bsbNumberValue) { "bsbNumber is required" }
      set(`value`) {
        bsbNumberValue = value
      }

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e {
      check(accountNumberValue != null) { "accountNumber is required" }
      check(bsbNumberValue != null) { "bsbNumber is required" }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e(
        accountNumber = accountNumber,
        bsbNumber = bsbNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e must be a JSON object")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val bsbNumber = json.decodeRequired<String>(rawObject, "bsb_number")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e(
        accountNumber = accountNumber,
        bsbNumber = bsbNumber,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_number", value.accountNumber)
        put("bsb_number", value.bsbNumber)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAuBecsDebitX31fb309e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
