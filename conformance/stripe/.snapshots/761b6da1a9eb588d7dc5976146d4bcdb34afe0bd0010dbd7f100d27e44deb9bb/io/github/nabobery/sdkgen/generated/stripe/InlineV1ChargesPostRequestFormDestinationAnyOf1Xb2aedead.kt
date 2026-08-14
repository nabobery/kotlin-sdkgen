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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/destination/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/destination/anyOf/0
 */
@Serializable(with = InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead.Serializer::class)
public class InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead(
  public val account: String,
  public val amount: Int? = null,
) {
  public class Builder {
    private var accountValue: String? = null

    public var account: String
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    public var amount: Int? = null

    public fun build(): InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead {
      check(accountValue != null) { "account is required" }
      return InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead(
        account = account,
        amount = amount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead must be a JSON object")
      val account = json.decodeRequired<String>(rawObject, "account")
      return InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead(
        account = account,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", value.account)
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead(block: InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead.Builder.() -> Unit): InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead = InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
