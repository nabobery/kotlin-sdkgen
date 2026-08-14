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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/contradictions/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionAnalysisResult/properties/contradictions/items
 */
@Serializable(with = InlineFusionAnalysisResultContradictionsItemX8aec6ddb.Serializer::class)
public class InlineFusionAnalysisResultContradictionsItemX8aec6ddb(
  stances: List<InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4>,
  public val topic: String,
) {
  public val stances: List<InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4> =
      stances.toList()

  public class Builder {
    private var stancesValue:
        List<InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4>? = null

    public var stances: List<InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4>
      get() = requireNotNull(stancesValue) { "stances is required" }.toList()
      set(`value`) {
        stancesValue = value.toList()
      }

    private var topicValue: String? = null

    public var topic: String
      get() = requireNotNull(topicValue) { "topic is required" }
      set(`value`) {
        topicValue = value
      }

    public fun build(): InlineFusionAnalysisResultContradictionsItemX8aec6ddb {
      check(stancesValue != null) { "stances is required" }
      check(topicValue != null) { "topic is required" }
      return InlineFusionAnalysisResultContradictionsItemX8aec6ddb(
        stances = stances,
        topic = topic,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFusionAnalysisResultContradictionsItemX8aec6ddb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFusionAnalysisResultContradictionsItemX8aec6ddb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFusionAnalysisResultContradictionsItemX8aec6ddb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFusionAnalysisResultContradictionsItemX8aec6ddb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFusionAnalysisResultContradictionsItemX8aec6ddb must be a JSON object")
      val stances = json.decodeRequired<List<InlineFusionAnalysisResultContradictionsItemStancesItemXfbe72ae4>>(rawObject, "stances")
      val topic = json.decodeRequired<String>(rawObject, "topic")
      return InlineFusionAnalysisResultContradictionsItemX8aec6ddb(
        stances = stances,
        topic = topic,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFusionAnalysisResultContradictionsItemX8aec6ddb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFusionAnalysisResultContradictionsItemX8aec6ddb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("stances", json.encodeToJsonElement(value.stances))
        put("topic", value.topic)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFusionAnalysisResultContradictionsItemX8aec6ddb(block: InlineFusionAnalysisResultContradictionsItemX8aec6ddb.Builder.() -> Unit): InlineFusionAnalysisResultContradictionsItemX8aec6ddb = InlineFusionAnalysisResultContradictionsItemX8aec6ddb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFusionAnalysisResultContradictionsItemX8aec6ddb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
