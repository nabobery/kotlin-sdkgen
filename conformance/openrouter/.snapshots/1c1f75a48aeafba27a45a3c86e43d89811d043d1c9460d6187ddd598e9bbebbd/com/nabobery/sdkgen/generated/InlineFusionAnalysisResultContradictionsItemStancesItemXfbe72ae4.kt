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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/contradictions/items/properties/stan
 * ces/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/contradictions/items/properties/stan
 * ces/items
 */
@Serializable(with = InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4.Serializer::class)
public class InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4(
  public val model: String,
  public val stance: String,
) {
  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var stanceValue: String? = null

    public var stance: String
      get() = requireNotNull(stanceValue) { "stance is required" }
      set(`value`) {
        stanceValue = value
      }

    public fun build(): InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4 {
      check(modelValue != null) { "model is required" }
      check(stanceValue != null) { "stance is required" }
      return InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4(
        model = model,
        stance = stance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4 must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      val stance = json.decodeRequired<String>(rawObject, "stance")
      return InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4(
        model = model,
        stance = stance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("stance", value.stance)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4(block: InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4.Builder.() -> Unit): InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4 = InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
