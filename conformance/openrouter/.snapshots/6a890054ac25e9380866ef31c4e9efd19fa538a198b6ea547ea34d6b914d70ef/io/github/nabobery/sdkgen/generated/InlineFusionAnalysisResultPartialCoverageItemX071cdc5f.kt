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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/partial_coverage/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/partial_coverage/items
 */
@Serializable(with = InlineFusionAnalysisResultPartialCoverageItemX071cdc5f.Serializer::class)
public class InlineFusionAnalysisResultPartialCoverageItemX071cdc5f(
  models: List<String>,
  public val point: String,
) {
  public val models: List<String> = models.toList()

  public class Builder {
    private var modelsValue: List<String>? = null

    public var models: List<String>
      get() = requireNotNull(modelsValue) { "models is required" }.toList()
      set(`value`) {
        modelsValue = value.toList()
      }

    private var pointValue: String? = null

    public var point: String
      get() = requireNotNull(pointValue) { "point is required" }
      set(`value`) {
        pointValue = value
      }

    public fun build(): InlineFusionAnalysisResultPartialCoverageItemX071cdc5f {
      check(modelsValue != null) { "models is required" }
      check(pointValue != null) { "point is required" }
      return InlineFusionAnalysisResultPartialCoverageItemX071cdc5f(
        models = models,
        point = point,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFusionAnalysisResultPartialCoverageItemX071cdc5f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFusionAnalysisResultPartialCoverageItemX071cdc5f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFusionAnalysisResultPartialCoverageItemX071cdc5f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFusionAnalysisResultPartialCoverageItemX071cdc5f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFusionAnalysisResultPartialCoverageItemX071cdc5f must be a JSON object")
      val models = json.decodeRequired<List<String>>(rawObject, "models")
      val point = json.decodeRequired<String>(rawObject, "point")
      return InlineFusionAnalysisResultPartialCoverageItemX071cdc5f(
        models = models,
        point = point,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFusionAnalysisResultPartialCoverageItemX071cdc5f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFusionAnalysisResultPartialCoverageItemX071cdc5f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("models", json.encodeToJsonElement(value.models))
        put("point", value.point)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFusionAnalysisResultPartialCoverageItemX071cdc5f(block: InlineFusionAnalysisResultPartialCoverageItemX071cdc5f.Builder.() -> Unit): InlineFusionAnalysisResultPartialCoverageItemX071cdc5f = InlineFusionAnalysisResultPartialCoverageItemX071cdc5f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFusionAnalysisResultPartialCoverageItemX071cdc5f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
