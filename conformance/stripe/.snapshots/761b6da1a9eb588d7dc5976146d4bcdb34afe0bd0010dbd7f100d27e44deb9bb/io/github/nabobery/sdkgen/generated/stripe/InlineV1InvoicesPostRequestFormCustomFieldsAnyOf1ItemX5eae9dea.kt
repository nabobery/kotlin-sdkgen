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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/custom_fields/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/custom_fields/anyOf/0/items
 */
@Serializable(with = InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea.Serializer::class)
public class InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea(
  public val name: String,
  public val `value`: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea {
      check(nameValue != null) { "name is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea(
        name = name,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea(
        name = name,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea(block: InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea.Builder.() -> Unit): InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea = InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
