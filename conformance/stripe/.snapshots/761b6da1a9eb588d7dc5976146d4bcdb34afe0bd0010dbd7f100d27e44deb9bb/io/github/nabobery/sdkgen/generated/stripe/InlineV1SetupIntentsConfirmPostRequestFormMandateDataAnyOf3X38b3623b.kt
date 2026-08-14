package io.github.nabobery.sdkgen.generated.stripe

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
 * This hash contains details about the Mandate to create
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/2
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b(
  public val customerAcceptance:
      InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448,
) {
  public class Builder {
    private var customerAcceptanceValue:
        InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448? = null

    public var customerAcceptance:
        InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448
      get() = requireNotNull(customerAcceptanceValue) { "customerAcceptance is required" }
      set(`value`) {
        customerAcceptanceValue = value
      }

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b {
      check(customerAcceptanceValue != null) { "customerAcceptance is required" }
      return InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b(
        customerAcceptance = customerAcceptance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b must be a JSON object")
      val customerAcceptance = json.decodeRequired<InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceXcda42448>(rawObject, "customer_acceptance")
      return InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b(
        customerAcceptance = customerAcceptance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("customer_acceptance", json.encodeToJsonElement(value.customerAcceptance))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b(block: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b = InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
