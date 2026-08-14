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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1tax_ids/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1tax_ids/get/parameters/3/schema
 */
@Serializable(with = InlineV1TaxIdsGetParameterXee5909c8.Serializer::class)
public class InlineV1TaxIdsGetParameterXee5909c8(
  public val type: InlineV1TaxIdsGetParameterTypeX71d94e6a,
  public val account: String? = null,
  public val customer: String? = null,
  public val customerAccount: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1TaxIdsGetParameterTypeX71d94e6a? = null

    public var type: InlineV1TaxIdsGetParameterTypeX71d94e6a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public var customer: String? = null

    public var customerAccount: String? = null

    public fun build(): InlineV1TaxIdsGetParameterXee5909c8 {
      check(typeValue != null) { "type is required" }
      return InlineV1TaxIdsGetParameterXee5909c8(
        type = type,
        account = account,
        customer = customer,
        customerAccount = customerAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxIdsGetParameterXee5909c8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxIdsGetParameterXee5909c8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxIdsGetParameterXee5909c8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxIdsGetParameterXee5909c8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxIdsGetParameterXee5909c8 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxIdsGetParameterTypeX71d94e6a>(rawObject, "type")
      return InlineV1TaxIdsGetParameterXee5909c8(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxIdsGetParameterXee5909c8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxIdsGetParameterXee5909c8")
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

public fun inlineV1TaxIdsGetParameterXee5909c8(block: InlineV1TaxIdsGetParameterXee5909c8.Builder.() -> Unit): InlineV1TaxIdsGetParameterXee5909c8 = InlineV1TaxIdsGetParameterXee5909c8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxIdsGetParameterXee5909c8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
