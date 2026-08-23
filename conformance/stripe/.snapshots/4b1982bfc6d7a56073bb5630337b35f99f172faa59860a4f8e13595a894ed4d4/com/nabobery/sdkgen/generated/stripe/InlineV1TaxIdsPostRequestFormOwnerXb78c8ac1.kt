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
 * The account or customer the tax ID belongs to. Defaults to `owner[type]=self`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_ids/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/owner
 */
@Serializable(with = InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1.Serializer::class)
public class InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1(
  public val type: InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27,
  public val account: String? = null,
  public val customer: String? = null,
  public val customerAccount: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27? = null

    public var type: InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public var customer: String? = null

    public var customerAccount: String? = null

    public fun build(): InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1(
        type = type,
        account = account,
        customer = customer,
        customerAccount = customerAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27>(rawObject, "type")
      return InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1")
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

public fun inlineV1TaxIdsPostRequestFormOwnerXb78c8ac1(block: InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1.Builder.() -> Unit): InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1 = InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxIdsPostRequestFormOwnerXb78c8ac1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
