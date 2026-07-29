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
 * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally
 * provide descriptive details about the run.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/output
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonOutputX5d92be16.Serializer::class)
public class InlineReposCheckRunsPostRequestJsonOutputX5d92be16(
  /**
   * The summary of the check run. This parameter supports Markdown. **Maximum length**: 65535 characters.
   */
  public val summary: String,
  /**
   * The title of the check run.
   */
  public val title: String,
  annotations: List<InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811>? = null,
  images: List<InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2>? = null,
  /**
   * The details of the check run. This parameter supports Markdown. **Maximum length**: 65535 characters.
   */
  public val text: String? = null,
) {
  /**
   * Adds information from your analysis to specific lines of code. Annotations are visible on GitHub in the **Checks**
   * and **Files changed** tab of the pull request. The Checks API limits the number of annotations to a maximum of 50
   * per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a check
   * run](https://docs.github.com/rest/checks/runs#update-a-check-run) endpoint. Each time you update the check run,
   * annotations are appended to the list of annotations that already exist for the check run. GitHub Actions are
   * limited to 10 warning annotations and 10 error annotations per step. For details about how you can view annotations
   * on GitHub, see "[About status checks](https://docs.github.com/articles/about-status-checks#checks)".
   */
  public val annotations: List<InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811>? =
      annotations?.let { collection0 -> collection0.toList() }

  /**
   * Adds images to the output displayed in the GitHub pull request UI.
   */
  public val images: List<InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2>? =
      images?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var summaryValue: String? = null

    public var summary: String
      get() = requireNotNull(summaryValue) { "summary is required" }
      set(`value`) {
        summaryValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var annotationsValue:
        List<InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811>? = null

    /**
     * Adds information from your analysis to specific lines of code. Annotations are visible on GitHub in the
     * **Checks** and **Files changed** tab of the pull request. The Checks API limits the number of annotations to a
     * maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the
     * [Update a check run](https://docs.github.com/rest/checks/runs#update-a-check-run) endpoint. Each time you update
     * the check run, annotations are appended to the list of annotations that already exist for the check run. GitHub
     * Actions are limited to 10 warning annotations and 10 error annotations per step. For details about how you can
     * view annotations on GitHub, see "[About status
     * checks](https://docs.github.com/articles/about-status-checks#checks)".
     */
    public var annotations: List<InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811>?
      get() = annotationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        annotationsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var imagesValue: List<InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2>? =
        null

    /**
     * Adds images to the output displayed in the GitHub pull request UI.
     */
    public var images: List<InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2>?
      get() = imagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        imagesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The details of the check run. This parameter supports Markdown. **Maximum length**: 65535 characters.
     */
    public var text: String? = null

    public fun build(): InlineReposCheckRunsPostRequestJsonOutputX5d92be16 {
      check(summaryValue != null) { "summary is required" }
      check(titleValue != null) { "title is required" }
      return InlineReposCheckRunsPostRequestJsonOutputX5d92be16(
        summary = summary,
        title = title,
        annotations = annotations,
        images = images,
        text = text,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOutputX5d92be16 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonOutputX5d92be16> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonOutputX5d92be16 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPostRequestJsonOutputX5d92be16")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonOutputX5d92be16 must be a JSON object")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      val title = json.decodeRequired<String>(rawObject, "title")
      return InlineReposCheckRunsPostRequestJsonOutputX5d92be16(
        summary = summary,
        title = title,
        annotations = rawObject["annotations"]?.let { json.decodeFromJsonElement<List<InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811>>(it) },
        images = rawObject["images"]?.let { json.decodeFromJsonElement<List<InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2>>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonOutputX5d92be16) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPostRequestJsonOutputX5d92be16")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("summary", value.summary)
        put("title", value.title)
        value.annotations?.let { put("annotations", json.encodeToJsonElement(it)) }
        value.images?.let { put("images", json.encodeToJsonElement(it)) }
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPostRequestJsonOutputX5d92be16(block: InlineReposCheckRunsPostRequestJsonOutputX5d92be16.Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOutputX5d92be16 = InlineReposCheckRunsPostRequestJsonOutputX5d92be16.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonOutputX5d92be16 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
