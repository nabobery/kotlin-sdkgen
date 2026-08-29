package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runners~1{runner_id}~1labels/post/requestBody/
 * content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runners~1{runner_id}~1labels/post/requestBody/
 * content/application~1json/schema
 */
@Serializable(with = InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0.Serializer::class)
public class InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0(
  labels: List<String>,
) {
  /**
   * The names of the custom labels to add to the runner.
   */
  public val labels: List<String> = labels.toList()

  public class Builder {
    private var labelsValue: List<String>? = null

    public var labels: List<String>
      get() = requireNotNull(labelsValue) { "labels is required" }.toList()
      set(`value`) {
        labelsValue = value.toList()
      }

    public fun build(): InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0 {
      check(labelsValue != null) { "labels is required" }
      return InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0(
        labels = labels,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0 must be a JSON object")
      val labels = json.decodeRequired<List<String>>(rawObject, "labels")
      return InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0(
        labels = labels,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("labels", json.encodeToJsonElement(value.labels))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsRunnersLabelsPostRequestJsonX58b877b0(block: InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0.Builder.() -> Unit): InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0 = InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsRunnersLabelsPostRequestJsonX58b877b0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
