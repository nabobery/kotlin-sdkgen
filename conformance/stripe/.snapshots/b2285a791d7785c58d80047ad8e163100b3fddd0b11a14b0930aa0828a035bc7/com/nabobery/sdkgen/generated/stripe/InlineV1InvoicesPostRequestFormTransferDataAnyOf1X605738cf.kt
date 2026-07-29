package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/transfer_data/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/transfer_data/anyOf/0
 */
@Serializable(with = InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf.Serializer::class)
public class InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf(
  public val destination: String,
  public val amount: Int? = null,
) {
  public class Builder {
    private var destinationValue: String? = null

    public var destination: String
      get() = requireNotNull(destinationValue) { "destination is required" }
      set(`value`) {
        destinationValue = value
      }

    public var amount: Int? = null

    public fun build(): InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf {
      check(destinationValue != null) { "destination is required" }
      return InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf(
        destination = destination,
        amount = amount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf must be a JSON object")
      val destination = json.decodeRequired<String>(rawObject, "destination")
      return InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf(
        destination = destination,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", value.destination)
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf(block: InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf.Builder.() -> Unit): InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf = InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
