package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/bacs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/bacs_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127(
  public val accountNumber: String? = null,
  public val sortCode: String? = null,
) {
  public class Builder {
    public var accountNumber: String? = null

    public var sortCode: String? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127(
      accountNumber = accountNumber,
      sortCode = sortCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127(
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        sortCode = rawObject["sort_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountNumber?.let { put("account_number", it) }
        value.sortCode?.let { put("sort_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXd9516127.build(block)
