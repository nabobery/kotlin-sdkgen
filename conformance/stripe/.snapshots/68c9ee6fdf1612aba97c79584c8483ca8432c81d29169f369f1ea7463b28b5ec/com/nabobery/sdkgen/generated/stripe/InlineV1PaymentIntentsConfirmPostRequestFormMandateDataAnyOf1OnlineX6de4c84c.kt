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
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/0/properties/customer_acceptance/properties/online.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/0/properties/customer_acceptance/properties/online
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c(
  public val ipAddress: String,
  public val userAgent: String,
) {
  public class Builder {
    private var ipAddressValue: String? = null

    public var ipAddress: String
      get() = requireNotNull(ipAddressValue) { "ipAddress is required" }
      set(`value`) {
        ipAddressValue = value
      }

    private var userAgentValue: String? = null

    public var userAgent: String
      get() = requireNotNull(userAgentValue) { "userAgent is required" }
      set(`value`) {
        userAgentValue = value
      }

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c {
      check(ipAddressValue != null) { "ipAddress is required" }
      check(userAgentValue != null) { "userAgent is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c(
        ipAddress = ipAddress,
        userAgent = userAgent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c must be a JSON object")
      val ipAddress = json.decodeRequired<String>(rawObject, "ip_address")
      val userAgent = json.decodeRequired<String>(rawObject, "user_agent")
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c(
        ipAddress = ipAddress,
        userAgent = userAgent,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ip_address", value.ipAddress)
        put("user_agent", value.userAgent)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c(block: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c = InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
