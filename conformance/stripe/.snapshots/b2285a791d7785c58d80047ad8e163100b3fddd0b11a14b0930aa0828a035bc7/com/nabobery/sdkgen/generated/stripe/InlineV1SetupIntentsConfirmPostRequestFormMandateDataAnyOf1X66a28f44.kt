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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/0
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44(
  public val customerAcceptance:
      InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb,
) {
  public class Builder {
    private var customerAcceptanceValue:
        InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb? = null

    public var customerAcceptance:
        InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb
      get() = requireNotNull(customerAcceptanceValue) { "customerAcceptance is required" }
      set(`value`) {
        customerAcceptanceValue = value
      }

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44 {
      check(customerAcceptanceValue != null) { "customerAcceptance is required" }
      return InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44(
        customerAcceptance = customerAcceptance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44 must be a JSON object")
      val customerAcceptance = json.decodeRequired<InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb>(rawObject, "customer_acceptance")
      return InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44(
        customerAcceptance = customerAcceptance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("customer_acceptance", json.encodeToJsonElement(value.customerAcceptance))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44(block: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44 = InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
