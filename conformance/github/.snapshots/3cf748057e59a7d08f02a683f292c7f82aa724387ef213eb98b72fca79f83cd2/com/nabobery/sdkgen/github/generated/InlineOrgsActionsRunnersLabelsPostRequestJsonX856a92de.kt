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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runners~1{runner_id}~1labels/post/requestBody/content/app
 * lication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runners~1{runner_id}~1labels/post/requestBody/content/app
 * lication~1json/schema
 */
@Serializable(with = InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de.Serializer::class)
public class InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de(
  labels: List<String>,
) {
  /**
   * The names of the custom labels to add to the runner.
   */
  public val labels: List<String> = labels.toList()

  public class Builder {
    private var labelsValue: List<String>? = null

    public var labels: List<String>
      get() = requireNotNull(labelsValue) { "labels is required" }
      set(`value`) {
        labelsValue = value
      }

    public fun build(): InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de {
      check(labelsValue != null) { "labels is required" }
      return InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de(
        labels = labels,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de must be a JSON object")
      val labels = json.decodeRequired<List<String>>(rawObject, "labels")
      return InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de(
        labels = labels,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("labels", json.encodeToJsonElement(value.labels))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de(block: InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de.Builder.() -> Unit): InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de = InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnersLabelsPostRequestJsonX856a92de is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
