package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runners~1{runner_id}~1labels/put/requestBody/c
 * ontent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runners~1{runner_id}~1labels/put/requestBody/c
 * ontent/application~1json/schema
 */
@Serializable(with = InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54.Serializer::class)
public class InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54(
  labels: List<String>,
) {
  /**
   * The names of the custom labels to set for the runner. You can pass an empty array to remove all custom labels.
   */
  public val labels: List<String> = labels.toList()

  public class Builder {
    private var labelsValue: List<String>? = null

    public var labels: List<String>
      get() = requireNotNull(labelsValue) { "labels is required" }.toList()
      set(`value`) {
        labelsValue = value.toList()
      }

    public fun build(): InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54 {
      check(labelsValue != null) { "labels is required" }
      return InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54(
        labels = labels,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54 must be a JSON object")
      val labels = json.decodeRequired<List<String>>(rawObject, "labels")
      return InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54(
        labels = labels,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("labels", json.encodeToJsonElement(value.labels))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsRunnersLabelsPutRequestJsonXb681ab54(block: InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54.Builder.() -> Unit): InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54 = InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsRunnersLabelsPutRequestJsonXb681ab54 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
