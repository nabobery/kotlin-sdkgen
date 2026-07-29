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
 * Amount of this credit grant.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/amount
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654.Serializer::class)
public class InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654(
  public val type: InlineV1BillingCreditGrantsPostRequestFormAmountTypeXc982cfc0,
  public val monetary: InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e? = null,
) {
  public class Builder {
    private var typeValue: InlineV1BillingCreditGrantsPostRequestFormAmountTypeXc982cfc0? = null

    public var type: InlineV1BillingCreditGrantsPostRequestFormAmountTypeXc982cfc0
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var monetary: InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e? = null

    public fun build(): InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654 {
      check(typeValue != null) { "type is required" }
      return InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654(
        type = type,
        monetary = monetary,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654 must be a JSON object")
      val type = json.decodeRequired<InlineV1BillingCreditGrantsPostRequestFormAmountTypeXc982cfc0>(rawObject, "type")
      return InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654(
        type = type,
        monetary = rawObject["monetary"]?.let { json.decodeFromJsonElement<InlineV1BillingCreditGrantsPostRequestFormAmountMonetaryXbe225a3e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.monetary?.let { put("monetary", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingCreditGrantsPostRequestFormAmountXadaed654(block: InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654.Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654 = InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormAmountXadaed654 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
