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
 * chema/properties/payment_method_data/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/acss_debit
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856(
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

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856 {
      check(accountNumberValue != null) { "accountNumber is required" }
      check(institutionNumberValue != null) { "institutionNumber is required" }
      check(transitNumberValue != null) { "transitNumber is required" }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856(
        accountNumber = accountNumber,
        institutionNumber = institutionNumber,
        transitNumber = transitNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856 must be a JSON object")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val institutionNumber = json.decodeRequired<String>(rawObject, "institution_number")
      val transitNumber = json.decodeRequired<String>(rawObject, "transit_number")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856(
        accountNumber = accountNumber,
        institutionNumber = institutionNumber,
        transitNumber = transitNumber,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856")
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAcssDebitXd5c92856 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
