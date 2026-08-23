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
 * The account holder to link accounts for.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/account_holder
 */
@Serializable(with = InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a.Serializer::class)
public class InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a(
  public val type: InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a,
  public val account: String? = null,
  public val customer: String? = null,
  public val customerAccount: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a? =
        null

    public var type: InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public var customer: String? = null

    public var customerAccount: String? = null

    public fun build(): InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a {
      check(typeValue != null) { "type is required" }
      return InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a(
        type = type,
        account = account,
        customer = customer,
        customerAccount = customerAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a must be a JSON object")
      val type = json.decodeRequired<InlineV1LinkAccountSessionsPostRequestFormAccountHolderTypeX59fc2b8a>(rawObject, "type")
      return InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a(block: InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a.Builder.() -> Unit): InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a = InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1LinkAccountSessionsPostRequestFormAccountHolderXf956ba1a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
