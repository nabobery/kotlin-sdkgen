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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/card/anyOf/0/properties/network_token.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/card/anyOf/0/properties/network_token
 */
@Serializable(with = InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687.Serializer::class)
public class InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687(
  public val number: String? = null,
) {
  public class Builder {
    public var number: String? = null

    public fun build(): InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687 = InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687(
      number = number,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687 must be a JSON object")
      return InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687(
        number = rawObject["number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.number?.let { put("number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687(block: InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687.Builder.() -> Unit): InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687 = InlineV1CustomersSourcesPostRequestFormCardAnyOf1NetworkTokenXd124f687.build(block)
