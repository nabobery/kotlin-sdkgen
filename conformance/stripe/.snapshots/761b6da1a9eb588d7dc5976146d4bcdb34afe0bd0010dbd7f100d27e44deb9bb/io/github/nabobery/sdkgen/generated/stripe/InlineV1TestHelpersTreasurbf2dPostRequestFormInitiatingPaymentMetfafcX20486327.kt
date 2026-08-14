package io.github.nabobery.sdkgen.generated.stripe

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
 * Initiating payment method details for the object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_debits/post/requestBody/content/applicatio
 * n~1x-www-form-urlencoded/schema/properties/initiating_payment_method_details
 */
@Serializable(with = InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327.Serializer::class)
public class InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327(
  public val type: InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab,
  public val usBankAccount:
      InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab? = null

    public var type: InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var usBankAccount: InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611? =
        null

    public fun build(): InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327 {
      check(typeValue != null) { "type is required" }
      return InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327(
        type = type,
        usBankAccount = usBankAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327 must be a JSON object")
      val type = json.decodeRequired<InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab>(rawObject, "type")
      return InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327(
        type = type,
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327(block: InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327.Builder.() -> Unit): InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327 = InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTreasurbf2dPostRequestFormInitiatingPaymentMetfafcX20486327 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
