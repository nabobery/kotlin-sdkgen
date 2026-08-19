package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/operators/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/operators/items
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714.Serializer::class)
public class InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714(
  /**
   * Operator identifier used in filter definitions
   */
  public val name: InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592,
  /**
   * Whether the operator expects a single value or an array
   */
  public val valueType: InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da,
) {
  public class Builder {
    private var nameValue: InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592? =
        null

    public var name: InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var valueTypeValue:
        InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da? = null

    public var valueType: InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da
      get() = requireNotNull(valueTypeValue) { "valueType is required" }
      set(`value`) {
        valueTypeValue = value
      }

    public fun build(): InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714 {
      check(nameValue != null) { "name is required" }
      check(valueTypeValue != null) { "valueType is required" }
      return InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714(
        name = name,
        valueType = valueType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714 must be a JSON object")
      val name = json.decodeRequired<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592>(rawObject, "name")
      val valueType = json.decodeRequired<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da>(rawObject, "value_type")
      return InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714(
        name = name,
        valueType = valueType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", json.encodeToJsonElement(value.name))
        put("value_type", json.encodeToJsonElement(value.valueType))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714(block: InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714.Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714 = InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
