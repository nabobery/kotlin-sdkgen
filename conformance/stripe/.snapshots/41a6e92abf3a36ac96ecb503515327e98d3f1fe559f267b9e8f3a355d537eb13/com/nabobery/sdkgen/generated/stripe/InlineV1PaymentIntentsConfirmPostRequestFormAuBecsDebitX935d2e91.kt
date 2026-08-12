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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/au_becs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/au_becs_debit
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91(
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

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91 {
      check(accountNumberValue != null) { "accountNumber is required" }
      check(bsbNumberValue != null) { "bsbNumber is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91(
        accountNumber = accountNumber,
        bsbNumber = bsbNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91 must be a JSON object")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val bsbNumber = json.decodeRequired<String>(rawObject, "bsb_number")
      return InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91(
        accountNumber = accountNumber,
        bsbNumber = bsbNumber,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_number", value.accountNumber)
        put("bsb_number", value.bsbNumber)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91(block: InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91 = InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX935d2e91 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
