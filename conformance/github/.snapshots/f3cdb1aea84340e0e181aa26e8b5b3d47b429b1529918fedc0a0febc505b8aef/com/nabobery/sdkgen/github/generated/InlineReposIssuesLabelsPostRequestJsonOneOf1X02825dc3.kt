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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/post/requestBody/content
 * /application~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1labels/post/requestBody/content
 * /application~1json/schema/oneOf/0
 */
@Serializable(with = InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3.Serializer::class)
public class InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3(
  labels: List<String>? = null,
) {
  /**
   * The names of the labels to add to the issue's existing labels. You can also pass an `array` of labels directly, but
   * GitHub recommends passing an object with the `labels` key. To replace all of the labels for an issue, use "[Set
   * labels for an issue](https://docs.github.com/rest/issues/labels#set-labels-for-an-issue)."
   */
  public val labels: List<String>? = labels?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var labelsValue: List<String>? = null

    /**
     * The names of the labels to add to the issue's existing labels. You can also pass an `array` of labels directly,
     * but GitHub recommends passing an object with the `labels` key. To replace all of the labels for an issue, use
     * "[Set labels for an issue](https://docs.github.com/rest/issues/labels#set-labels-for-an-issue)."
     */
    public var labels: List<String>?
      get() = labelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        labelsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3 = InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3(
      labels = labels,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3 must be a JSON object")
      return InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3(
        labels = rawObject["labels"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.labels?.let { put("labels", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3(block: InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3.Builder.() -> Unit): InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3 = InlineReposIssuesLabelsPostRequestJsonOneOf1X02825dc3.build(block)
