package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/bacs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/bacs_debit
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4(
  public val accountNumber: String? = null,
  public val sortCode: String? = null,
) {
  public class Builder {
    public var accountNumber: String? = null

    public var sortCode: String? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4(
      accountNumber = accountNumber,
      sortCode = sortCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4(
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        sortCode = rawObject["sort_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountNumber?.let { put("account_number", it) }
        value.sortCode?.let { put("sort_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataBacsDebitX836757d4.build(block)
