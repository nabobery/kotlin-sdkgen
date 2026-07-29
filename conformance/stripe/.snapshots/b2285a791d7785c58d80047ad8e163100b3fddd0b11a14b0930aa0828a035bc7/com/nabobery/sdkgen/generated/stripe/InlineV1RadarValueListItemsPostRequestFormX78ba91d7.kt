package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_list_items/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_list_items/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema
 */
@Serializable(with = InlineV1RadarValueListItemsPostRequestFormX78ba91d7.Serializer::class)
public class InlineV1RadarValueListItemsPostRequestFormX78ba91d7(
  /**
   * The value of the item (whose type must match the type of the parent value list).
   */
  public val `value`: String,
  /**
   * The identifier of the value list which the created item will be added to.
   */
  public val valueList: String,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    private var valueListValue: String? = null

    public var valueList: String
      get() = requireNotNull(valueListValue) { "valueList is required" }
      set(`value`) {
        valueListValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1RadarValueListItemsPostRequestFormX78ba91d7 {
      check(valueValue != null) { "value is required" }
      check(valueListValue != null) { "valueList is required" }
      return InlineV1RadarValueListItemsPostRequestFormX78ba91d7(
        value = value,
        valueList = valueList,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1RadarValueListItemsPostRequestFormX78ba91d7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1RadarValueListItemsPostRequestFormX78ba91d7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarValueListItemsPostRequestFormX78ba91d7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarValueListItemsPostRequestFormX78ba91d7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1RadarValueListItemsPostRequestFormX78ba91d7 must be a JSON object")
      val value = json.decodeRequired<String>(rawObject, "value")
      val valueList = json.decodeRequired<String>(rawObject, "value_list")
      return InlineV1RadarValueListItemsPostRequestFormX78ba91d7(
        value = value,
        valueList = valueList,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarValueListItemsPostRequestFormX78ba91d7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1RadarValueListItemsPostRequestFormX78ba91d7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("value", value.value)
        put("value_list", value.valueList)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1RadarValueListItemsPostRequestFormX78ba91d7(block: InlineV1RadarValueListItemsPostRequestFormX78ba91d7.Builder.() -> Unit): InlineV1RadarValueListItemsPostRequestFormX78ba91d7 = InlineV1RadarValueListItemsPostRequestFormX78ba91d7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1RadarValueListItemsPostRequestFormX78ba91d7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
