package io.github.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/put/requestBody/content/
 * application~1json/schema/oneOf/2.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/put/requestBody/content/
 * application~1json/schema/oneOf/2
 */
@Serializable(with = InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76.Serializer::class)
public class InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76(
  labels: List<InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5>? = null,
) {
  public val labels: List<InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5>? =
      labels?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var labelsValue: List<InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5>? =
        null

    public var labels: List<InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5>?
      get() = labelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        labelsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76 = InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76(
      labels = labels,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76 must be a JSON object")
      return InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76(
        labels = rawObject["labels"]?.let { json.decodeFromJsonElement<List<InlineReposIssuesLabelsPutRequestJsonOneOf3LabelsItemX3ada81c5>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.labels?.let { put("labels", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76(block: InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76.Builder.() -> Unit): InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76 = InlineReposIssuesLabelsPutRequestJsonOneOf3Xc8627d76.build(block)
