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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runners~1{runner_id}~1labels/put/requestBody/content/appl
 * ication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runners~1{runner_id}~1labels/put/requestBody/content/appl
 * ication~1json/schema
 */
@Serializable(with = InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec.Serializer::class)
public class InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec(
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

    public fun build(): InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec {
      check(labelsValue != null) { "labels is required" }
      return InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec(
        labels = labels,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec must be a JSON object")
      val labels = json.decodeRequired<List<String>>(rawObject, "labels")
      return InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec(
        labels = labels,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("labels", json.encodeToJsonElement(value.labels))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec(block: InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec.Builder.() -> Unit): InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec = InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnersLabelsPutRequestJsonX62c365ec is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
