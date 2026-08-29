package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/custom_unit_amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/custom_unit_amount
 */
@Serializable(with = InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626.Serializer::class)
public class InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626(
  public val enabled: Boolean,
  public val maximum: Int? = null,
  public val minimum: Int? = null,
  public val preset: Int? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var maximum: Int? = null

    public var minimum: Int? = null

    public var preset: Int? = null

    public fun build(): InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626(
        enabled = enabled,
        maximum = maximum,
        minimum = minimum,
        preset = preset,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626(
        enabled = enabled,
        maximum = rawObject["maximum"]?.let { json.decodeFromJsonElement<Int>(it) },
        minimum = rawObject["minimum"]?.let { json.decodeFromJsonElement<Int>(it) },
        preset = rawObject["preset"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
        value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
        value.preset?.let { put("preset", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626(block: InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626.Builder.() -> Unit): InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626 = InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ProductsPostRequestFormDefaultPriceDataCustomUnitAmountX8862e626 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
