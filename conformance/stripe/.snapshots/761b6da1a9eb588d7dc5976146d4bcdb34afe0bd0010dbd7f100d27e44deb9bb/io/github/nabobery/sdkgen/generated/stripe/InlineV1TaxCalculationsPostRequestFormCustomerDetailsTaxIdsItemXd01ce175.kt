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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/tax_ids/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/tax_ids/items
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175(
  public val type: InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemTypeXfad006a3,
  public val `value`: String,
) {
  public class Builder {
    private var typeValue:
        InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemTypeXfad006a3? = null

    public var type: InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemTypeXfad006a3
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

    public fun build(): InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175 {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175 must be a JSON object")
      val type = json.decodeRequired<InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemTypeXfad006a3>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175(block: InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175.Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175 = InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxIdsItemXd01ce175 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
