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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/mandate_data/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/mandate_data/anyOf/0
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085(
  public val customerAcceptance:
      InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e,
) {
  public class Builder {
    private var customerAcceptanceValue:
        InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e? = null

    public var customerAcceptance:
        InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e
      get() = requireNotNull(customerAcceptanceValue) { "customerAcceptance is required" }
      set(`value`) {
        customerAcceptanceValue = value
      }

    public fun build(): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085 {
      check(customerAcceptanceValue != null) { "customerAcceptance is required" }
      return InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085(
        customerAcceptance = customerAcceptance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085 must be a JSON object")
      val customerAcceptance = json.decodeRequired<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e>(rawObject, "customer_acceptance")
      return InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085(
        customerAcceptance = customerAcceptance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("customer_acceptance", json.encodeToJsonElement(value.customerAcceptance))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085(block: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085 = InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
