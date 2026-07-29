package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/components/responses/actions_runner_labels/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/responses/actions_runner_labels/content/application~1json/schema
 */
@Serializable(with = InlineActionsRunnerLabelsResponseJsonX5e357afc.Serializer::class)
public class InlineActionsRunnerLabelsResponseJsonX5e357afc(
  labels: List<RunnerLabel>,
  public val totalCount: Int,
) {
  public val labels: List<RunnerLabel> = labels.toList()

  public class Builder {
    private var labelsValue: List<RunnerLabel>? = null

    public var labels: List<RunnerLabel>
      get() = requireNotNull(labelsValue) { "labels is required" }.toList()
      set(`value`) {
        labelsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineActionsRunnerLabelsResponseJsonX5e357afc {
      check(labelsValue != null) { "labels is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineActionsRunnerLabelsResponseJsonX5e357afc(
        labels = labels,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineActionsRunnerLabelsResponseJsonX5e357afc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineActionsRunnerLabelsResponseJsonX5e357afc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineActionsRunnerLabelsResponseJsonX5e357afc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineActionsRunnerLabelsResponseJsonX5e357afc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineActionsRunnerLabelsResponseJsonX5e357afc must be a JSON object")
      val labels = json.decodeRequired<List<RunnerLabel>>(rawObject, "labels")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineActionsRunnerLabelsResponseJsonX5e357afc(
        labels = labels,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineActionsRunnerLabelsResponseJsonX5e357afc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineActionsRunnerLabelsResponseJsonX5e357afc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("labels", json.encodeToJsonElement(value.labels))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineActionsRunnerLabelsResponseJsonX5e357afc(block: InlineActionsRunnerLabelsResponseJsonX5e357afc.Builder.() -> Unit): InlineActionsRunnerLabelsResponseJsonX5e357afc = InlineActionsRunnerLabelsResponseJsonX5e357afc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineActionsRunnerLabelsResponseJsonX5e357afc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
