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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/put/requestBody/content/
 * application~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/put/requestBody/content/
 * application~1json/schema/oneOf/0
 */
@Serializable(with = InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed.Serializer::class)
public class InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed(
  /**
   * The names of the labels to set for the issue. The labels you set replace any existing labels. You can pass an empty
   * array to remove all labels. Alternatively, you can pass a single label as a `string` or an `array` of labels
   * directly, but GitHub recommends passing an object with the `labels` key. You can also add labels to the existing
   * labels for an issue. For more information, see "[Add labels to an
   * issue](https://docs.github.com/rest/issues/labels#add-labels-to-an-issue)."
   */
  public val labels: List<String>? = null,
) {
  public class Builder {
    /**
     * The names of the labels to set for the issue. The labels you set replace any existing labels. You can pass an
     * empty array to remove all labels. Alternatively, you can pass a single label as a `string` or an `array` of
     * labels directly, but GitHub recommends passing an object with the `labels` key. You can also add labels to the
     * existing labels for an issue. For more information, see "[Add labels to an
     * issue](https://docs.github.com/rest/issues/labels#add-labels-to-an-issue)."
     */
    public var labels: List<String>? = null

    public fun build(): InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed = InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed(
      labels = labels,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed must be a JSON object")
      return InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed(
        labels = rawObject["labels"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.labels?.let { put("labels", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed(block: InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed.Builder.() -> Unit): InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed = InlineReposIssuesLabelsPutRequestJsonOneOf1X4fa63bed.build(block)
