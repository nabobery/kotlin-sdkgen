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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/card/anyOf/0/properties/network_token.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/card/anyOf/0/properties/network_token
 */
@Serializable(with = InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a.Serializer::class)
public class InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a(
  public val number: String? = null,
) {
  public class Builder {
    public var number: String? = null

    public fun build(): InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a = InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a(
      number = number,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a must be a JSON object")
      return InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a(
        number = rawObject["number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.number?.let { put("number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a(block: InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a.Builder.() -> Unit): InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a = InlineV1CustomersCardsPostRequestFormCardAnyOf1NetworkTokenX442fac8a.build(block)
