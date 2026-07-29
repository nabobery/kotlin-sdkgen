package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class ConfirmationTokensResourceMandateDataView(
  @SerialName("customer_acceptance")
  public val customerAcceptance: ConfirmationTokensResourceMandateDataResourceCustomerAcceptance,
)

/**
 * Data used for generating a Mandate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_mandate_data
 */
@Serializable(with = ConfirmationTokensResourceMandateData.Serializer::class)
public class ConfirmationTokensResourceMandateData(
  public val customerAcceptance: ConfirmationTokensResourceMandateDataResourceCustomerAcceptance,
) {
  public class Builder {
    private var customerAcceptanceValue:
        ConfirmationTokensResourceMandateDataResourceCustomerAcceptance? = null

    public var customerAcceptance: ConfirmationTokensResourceMandateDataResourceCustomerAcceptance
      get() = requireNotNull(customerAcceptanceValue) { "customerAcceptance is required" }
      set(`value`) {
        customerAcceptanceValue = value
      }

    public fun build(): ConfirmationTokensResourceMandateData {
      check(customerAcceptanceValue != null) { "customerAcceptance is required" }
      return ConfirmationTokensResourceMandateData(
        customerAcceptance = customerAcceptance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConfirmationTokensResourceMandateData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ConfirmationTokensResourceMandateData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConfirmationTokensResourceMandateData {
      val jsonDecoder = decoder.requireJsonDecoder("ConfirmationTokensResourceMandateData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConfirmationTokensResourceMandateData must be a JSON object")
      val customerAcceptance = json.decodeRequired<ConfirmationTokensResourceMandateDataResourceCustomerAcceptance>(rawObject, "customer_acceptance")
      return ConfirmationTokensResourceMandateData(
        customerAcceptance = customerAcceptance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConfirmationTokensResourceMandateData) {
      val jsonEncoder = encoder.requireJsonEncoder("ConfirmationTokensResourceMandateData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("customer_acceptance", json.encodeToJsonElement(value.customerAcceptance))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun confirmationTokensResourceMandateData(block: ConfirmationTokensResourceMandateData.Builder.() -> Unit): ConfirmationTokensResourceMandateData = ConfirmationTokensResourceMandateData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConfirmationTokensResourceMandateData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
