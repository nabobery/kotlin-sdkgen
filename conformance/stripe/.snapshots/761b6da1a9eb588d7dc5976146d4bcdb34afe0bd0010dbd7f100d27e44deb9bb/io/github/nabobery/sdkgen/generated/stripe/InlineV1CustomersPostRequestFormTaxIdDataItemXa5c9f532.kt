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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/tax_id_data/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/tax_id_data/items
 */
@Serializable(with = InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532.Serializer::class)
public class InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532(
  public val type: InlineV1CustomersPostRequestFormTaxIdDataItemTypeXa7e534b2,
  public val `value`: String,
) {
  public class Builder {
    private var typeValue: InlineV1CustomersPostRequestFormTaxIdDataItemTypeXa7e534b2? = null

    public var type: InlineV1CustomersPostRequestFormTaxIdDataItemTypeXa7e534b2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532 {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532 must be a JSON object")
      val type = json.decodeRequired<InlineV1CustomersPostRequestFormTaxIdDataItemTypeXa7e534b2>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532(block: InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532.Builder.() -> Unit): InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532 = InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
