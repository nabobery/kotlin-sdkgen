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
 * If specified, the funds from the invoice will be transferred to the destination and the ID of the resulting transfer
 * will be found on the invoice's charge.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/transfer_data
 */
@Serializable(with = InlineV1InvoicesPostRequestFormTransferDataXea589c39.Serializer::class)
public class InlineV1InvoicesPostRequestFormTransferDataXea589c39(
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

    public fun build(): InlineV1InvoicesPostRequestFormTransferDataXea589c39 {
      check(destinationValue != null) { "destination is required" }
      return InlineV1InvoicesPostRequestFormTransferDataXea589c39(
        destination = destination,
        amount = amount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormTransferDataXea589c39 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormTransferDataXea589c39> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormTransferDataXea589c39 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormTransferDataXea589c39")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormTransferDataXea589c39 must be a JSON object")
      val destination = json.decodeRequired<String>(rawObject, "destination")
      return InlineV1InvoicesPostRequestFormTransferDataXea589c39(
        destination = destination,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormTransferDataXea589c39) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormTransferDataXea589c39")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", value.destination)
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormTransferDataXea589c39(block: InlineV1InvoicesPostRequestFormTransferDataXea589c39.Builder.() -> Unit): InlineV1InvoicesPostRequestFormTransferDataXea589c39 = InlineV1InvoicesPostRequestFormTransferDataXea589c39.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormTransferDataXea589c39 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
