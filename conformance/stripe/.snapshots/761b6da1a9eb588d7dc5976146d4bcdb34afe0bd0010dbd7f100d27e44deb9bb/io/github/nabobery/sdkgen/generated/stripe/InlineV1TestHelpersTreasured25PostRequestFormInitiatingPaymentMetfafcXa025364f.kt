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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_credits/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/initiating_payment_method_details
 */
@Serializable(with = InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f.Serializer::class)
public class InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f(
  public val type: InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d,
  public val usBankAccount:
      InlineV1TestHelpersTreasured25PostRequestFormUsBankAccountX3bc53d43? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d? = null

    public var type: InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var usBankAccount: InlineV1TestHelpersTreasured25PostRequestFormUsBankAccountX3bc53d43? =
        null

    public fun build(): InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f {
      check(typeValue != null) { "type is required" }
      return InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f(
        type = type,
        usBankAccount = usBankAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f must be a JSON object")
      val type = json.decodeRequired<InlineV1TestHelpersTreasured25PostRequestFormTypeXebb68e0d>(rawObject, "type")
      return InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f(
        type = type,
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTreasured25PostRequestFormUsBankAccountX3bc53d43>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f(block: InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f.Builder.() -> Unit): InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f = InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTreasured25PostRequestFormInitiatingPaymentMetfafcXa025364f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
