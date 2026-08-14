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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/text.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/text
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375(
  public val defaultValue: String? = null,
  public val maximumLength: Int? = null,
  public val minimumLength: Int? = null,
) {
  public class Builder {
    public var defaultValue: String? = null

    public var maximumLength: Int? = null

    public var minimumLength: Int? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375 = InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375(
      defaultValue = defaultValue,
      maximumLength = maximumLength,
      minimumLength = minimumLength,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375(
        defaultValue = rawObject["default_value"]?.let { json.decodeFromJsonElement<String>(it) },
        maximumLength = rawObject["maximum_length"]?.let { json.decodeFromJsonElement<Int>(it) },
        minimumLength = rawObject["minimum_length"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultValue?.let { put("default_value", it) }
        value.maximumLength?.let { put("maximum_length", json.encodeToJsonElement(it)) }
        value.minimumLength?.let { put("minimum_length", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375(block: InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375 = InlineV1PaymentLinksPostRequestFormCustomFieldsItemTextX81d62375.build(block)
