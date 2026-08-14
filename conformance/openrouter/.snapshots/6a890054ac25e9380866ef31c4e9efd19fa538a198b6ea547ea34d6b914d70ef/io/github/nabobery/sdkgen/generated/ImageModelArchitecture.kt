package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ImageModelArchitecture.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageModelArchitecture
 */
@Serializable(with = ImageModelArchitecture.Serializer::class)
public class ImageModelArchitecture(
  inputModalities: List<ImageInputModality>,
  outputModalities: List<ImageOutputModality>,
) {
  /**
   * Supported input modalities
   */
  public val inputModalities: List<ImageInputModality> = inputModalities.toList()

  /**
   * Supported output modalities
   */
  public val outputModalities: List<ImageOutputModality> = outputModalities.toList()

  public class Builder {
    private var inputModalitiesValue: List<ImageInputModality>? = null

    public var inputModalities: List<ImageInputModality>
      get() = requireNotNull(inputModalitiesValue) { "inputModalities is required" }.toList()
      set(`value`) {
        inputModalitiesValue = value.toList()
      }

    private var outputModalitiesValue: List<ImageOutputModality>? = null

    public var outputModalities: List<ImageOutputModality>
      get() = requireNotNull(outputModalitiesValue) { "outputModalities is required" }.toList()
      set(`value`) {
        outputModalitiesValue = value.toList()
      }

    public fun build(): ImageModelArchitecture {
      check(inputModalitiesValue != null) { "inputModalities is required" }
      check(outputModalitiesValue != null) { "outputModalities is required" }
      return ImageModelArchitecture(
        inputModalities = inputModalities,
        outputModalities = outputModalities,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageModelArchitecture = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageModelArchitecture> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageModelArchitecture {
      val jsonDecoder = decoder.requireJsonDecoder("ImageModelArchitecture")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageModelArchitecture must be a JSON object")
      val inputModalities = json.decodeRequired<List<ImageInputModality>>(rawObject, "input_modalities")
      val outputModalities = json.decodeRequired<List<ImageOutputModality>>(rawObject, "output_modalities")
      return ImageModelArchitecture(
        inputModalities = inputModalities,
        outputModalities = outputModalities,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageModelArchitecture) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageModelArchitecture")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_modalities", json.encodeToJsonElement(value.inputModalities))
        put("output_modalities", json.encodeToJsonElement(value.outputModalities))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageModelArchitecture(block: ImageModelArchitecture.Builder.() -> Unit): ImageModelArchitecture = ImageModelArchitecture.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageModelArchitecture is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
