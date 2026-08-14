package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Double
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
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/package_dimensions/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/package_dimensions/anyOf/0
 */
@Serializable(with = InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9.Serializer::class)
public class InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val height: Double,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val length: Double,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val weight: Double,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val width: Double,
) {
  public class Builder {
    private var heightValue: Double? = null

    public var height: Double
      get() = requireNotNull(heightValue) { "height is required" }
      set(`value`) {
        heightValue = value
      }

    private var lengthValue: Double? = null

    public var length: Double
      get() = requireNotNull(lengthValue) { "length is required" }
      set(`value`) {
        lengthValue = value
      }

    private var weightValue: Double? = null

    public var weight: Double
      get() = requireNotNull(weightValue) { "weight is required" }
      set(`value`) {
        weightValue = value
      }

    private var widthValue: Double? = null

    public var width: Double
      get() = requireNotNull(widthValue) { "width is required" }
      set(`value`) {
        widthValue = value
      }

    public fun build(): InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9 {
      check(heightValue != null) { "height is required" }
      check(lengthValue != null) { "length is required" }
      check(weightValue != null) { "weight is required" }
      check(widthValue != null) { "width is required" }
      return InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9(
        height = height,
        length = length,
        weight = weight,
        width = width,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9 must be a JSON object")
      val height = json.decodeRequired<Double>(rawObject, "height")
      val length = json.decodeRequired<Double>(rawObject, "length")
      val weight = json.decodeRequired<Double>(rawObject, "weight")
      val width = json.decodeRequired<Double>(rawObject, "width")
      return InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9(
        height = height,
        length = length,
        weight = weight,
        width = width,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("height", json.encodeToJsonElement(value.height))
        put("length", json.encodeToJsonElement(value.length))
        put("weight", json.encodeToJsonElement(value.weight))
        put("width", json.encodeToJsonElement(value.width))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9(block: InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9.Builder.() -> Unit): InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9 = InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ProductsPostRequestFormPackageDimensionsAnyOf1Xf8bf69d9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
