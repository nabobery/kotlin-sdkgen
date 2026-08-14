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

@Serializable
public data class PackageDimensionsView(
  public val height: Double,
  public val length: Double,
  public val weight: Double,
  public val width: Double,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/package_dimensions
 */
@Serializable(with = PackageDimensions.Serializer::class)
public class PackageDimensions(
  /**
   * Height, in inches.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val height: Double,
  /**
   * Length, in inches.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val length: Double,
  /**
   * Weight, in ounces.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val weight: Double,
  /**
   * Width, in inches.
   *
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

    public fun build(): PackageDimensions {
      check(heightValue != null) { "height is required" }
      check(lengthValue != null) { "length is required" }
      check(weightValue != null) { "weight is required" }
      check(widthValue != null) { "width is required" }
      return PackageDimensions(
        height = height,
        length = length,
        weight = weight,
        width = width,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PackageDimensions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PackageDimensions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PackageDimensions {
      val jsonDecoder = decoder.requireJsonDecoder("PackageDimensions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PackageDimensions must be a JSON object")
      val height = json.decodeRequired<Double>(rawObject, "height")
      val length = json.decodeRequired<Double>(rawObject, "length")
      val weight = json.decodeRequired<Double>(rawObject, "weight")
      val width = json.decodeRequired<Double>(rawObject, "width")
      return PackageDimensions(
        height = height,
        length = length,
        weight = weight,
        width = width,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PackageDimensions) {
      val jsonEncoder = encoder.requireJsonEncoder("PackageDimensions")
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

public fun packageDimensions(block: PackageDimensions.Builder.() -> Unit): PackageDimensions = PackageDimensions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PackageDimensions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
