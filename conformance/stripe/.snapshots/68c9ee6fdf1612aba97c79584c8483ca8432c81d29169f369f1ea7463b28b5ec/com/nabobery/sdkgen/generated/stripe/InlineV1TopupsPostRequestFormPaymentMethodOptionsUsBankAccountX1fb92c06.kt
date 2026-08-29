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
 * sdkgen://source/openapi.json#/paths/~1v1~1topups/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1topups/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06.Serializer::class)
public class InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06(
  public val network:
      InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f,
) {
  public class Builder {
    private var networkValue:
        InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f? = null

    public var network:
        InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f
      get() = requireNotNull(networkValue) { "network is required" }
      set(`value`) {
        networkValue = value
      }

    public fun build(): InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06 {
      check(networkValue != null) { "network is required" }
      return InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06(
        network = network,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06 must be a JSON object")
      val network = json.decodeRequired<InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountNetworkX7c23142f>(rawObject, "network")
      return InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06(
        network = network,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("network", json.encodeToJsonElement(value.network))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06(block: InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06.Builder.() -> Unit): InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06 = InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TopupsPostRequestFormPaymentMethodOptionsUsBankAccountX1fb92c06 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
