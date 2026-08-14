package io.github.nabobery.sdkgen.generated.stripe

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
 * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will be
 * transferred to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/transfer_data
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb(
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

    public fun build(): InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb {
      check(destinationValue != null) { "destination is required" }
      return InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb(
        destination = destination,
        amount = amount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb must be a JSON object")
      val destination = json.decodeRequired<String>(rawObject, "destination")
      return InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb(
        destination = destination,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", value.destination)
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormTransferDataXa5942deb(block: InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb = InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
