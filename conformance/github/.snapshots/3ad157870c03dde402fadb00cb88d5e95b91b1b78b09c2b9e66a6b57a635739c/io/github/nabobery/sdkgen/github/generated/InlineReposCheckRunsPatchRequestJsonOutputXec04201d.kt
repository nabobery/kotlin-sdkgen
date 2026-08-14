package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally
 * provide descriptive details about the run.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/output
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonOutputXec04201d.Serializer::class)
public class InlineReposCheckRunsPatchRequestJsonOutputXec04201d internal constructor(
  /**
   * Can contain Markdown.
   */
  public val summary: String,
  annotationsState: FieldState<List<InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8>>,
  imagesState: FieldState<List<InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c>>,
  private val textState: FieldState<String>,
  private val titleState: FieldState<String>,
) {
  private val annotationsState:
      FieldState<List<InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8>> =
      annotationsState.copyValue { fieldValue -> fieldValue.toList() }

  private val imagesState:
      FieldState<List<InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c>> =
      imagesState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * Adds information from your analysis to specific lines of code. Annotations are visible in GitHub's pull request UI.
   * Annotations are visible in GitHub's pull request UI. The Checks API limits the number of annotations to a maximum
   * of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a
   * check run](https://docs.github.com/rest/checks/runs#update-a-check-run) endpoint. Each time you update the check
   * run, annotations are appended to the list of annotations that already exist for the check run. GitHub Actions are
   * limited to 10 warning annotations and 10 error annotations per step. For details about annotations in the UI, see
   * "[About status checks](https://docs.github.com/articles/about-status-checks#checks)".
   */
  public val annotations: List<InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8>?
    get() = annotationsState.valueOrNull()

  /**
   * Adds images to the output displayed in the GitHub pull request UI.
   */
  public val images: List<InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c>?
    get() = imagesState.valueOrNull()

  /**
   * Can contain Markdown.
   */
  public val text: String?
    get() = textState.valueOrNull()

  /**
   * **Required**.
   */
  public val title: String?
    get() = titleState.valueOrNull()

  public constructor(summary: String) : this(summary = summary,
  annotationsState = FieldState.Absent,
  imagesState = FieldState.Absent,
  textState = FieldState.Absent,
  titleState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `annotations`.
   */
  public fun annotationsPresence(): FieldPresence = annotationsState.presence

  /**
   * Returns the wire presence of `images`.
   */
  public fun imagesPresence(): FieldPresence = imagesState.presence

  /**
   * Returns the wire presence of `text`.
   */
  public fun textPresence(): FieldPresence = textState.presence

  /**
   * Returns the wire presence of `title`.
   */
  public fun titlePresence(): FieldPresence = titleState.presence

  public class Builder {
    private var summaryValue: String? = null

    public var summary: String
      get() = requireNotNull(summaryValue) { "summary is required" }
      set(`value`) {
        summaryValue = value
      }

    private var annotationsState:
        FieldState<List<InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8>> =
        FieldState.Absent

    /**
     * Adds information from your analysis to specific lines of code. Annotations are visible in GitHub's pull request
     * UI. Annotations are visible in GitHub's pull request UI. The Checks API limits the number of annotations to a
     * maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the
     * [Update a check run](https://docs.github.com/rest/checks/runs#update-a-check-run) endpoint. Each time you update
     * the check run, annotations are appended to the list of annotations that already exist for the check run. GitHub
     * Actions are limited to 10 warning annotations and 10 error annotations per step. For details about annotations in
     * the UI, see "[About status checks](https://docs.github.com/articles/about-status-checks#checks)".
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var annotations:
        List<InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8>?
      get() = annotationsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "annotations is not nullable; call unsetAnnotations() to omit it" }
        annotationsState = FieldState.Value(present.toList())
      }

    private var imagesState:
        FieldState<List<InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c>> =
        FieldState.Absent

    /**
     * Adds images to the output displayed in the GitHub pull request UI.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var images: List<InlineReposCheckRunsPatchRequestJsonOutputImagesItemX80ad2e4c>?
      get() = imagesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "images is not nullable; call unsetImages() to omit it" }
        imagesState = FieldState.Value(present.toList())
      }

    private var textState: FieldState<String> = FieldState.Absent

    /**
     * Can contain Markdown.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var text: String?
      get() = textState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "text is not nullable; call unsetText() to omit it" }
        textState = FieldState.Value(present)
      }

    private var titleState: FieldState<String> = FieldState.Absent

    /**
     * **Required**.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var title: String?
      get() = titleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "title is not nullable; call unsetTitle() to omit it" }
        titleState = FieldState.Value(present)
      }

    /**
     * Omits `annotations` from serialized output.
     */
    public fun unsetAnnotations() {
      annotationsState = FieldState.Absent
    }

    /**
     * Omits `images` from serialized output.
     */
    public fun unsetImages() {
      imagesState = FieldState.Absent
    }

    /**
     * Omits `text` from serialized output.
     */
    public fun unsetText() {
      textState = FieldState.Absent
    }

    /**
     * Omits `title` from serialized output.
     */
    public fun unsetTitle() {
      titleState = FieldState.Absent
    }

    public fun build(): InlineReposCheckRunsPatchRequestJsonOutputXec04201d {
      check(summaryValue != null) { "summary is required" }
      return InlineReposCheckRunsPatchRequestJsonOutputXec04201d(
        summary = summary,
        annotationsState = annotationsState,
        imagesState = imagesState,
        textState = textState,
        titleState = titleState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonOutputXec04201d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonOutputXec04201d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonOutputXec04201d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPatchRequestJsonOutputXec04201d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPatchRequestJsonOutputXec04201d must be a JSON object")
      val summary = json.decodeRequired<String>(rawObject, "summary")
      return InlineReposCheckRunsPatchRequestJsonOutputXec04201d(
        summary = summary,
        annotationsState = json.decodeOptional(rawObject, "annotations", nullable = false),
        imagesState = json.decodeOptional(rawObject, "images", nullable = false),
        textState = json.decodeOptional(rawObject, "text", nullable = false),
        titleState = json.decodeOptional(rawObject, "title", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonOutputXec04201d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPatchRequestJsonOutputXec04201d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("summary", value.summary)
        putState("annotations", value.annotationsState, json::encodeToJsonElement)
        putState("images", value.imagesState, json::encodeToJsonElement)
        putState("text", value.textState, json::encodeToJsonElement)
        putState("title", value.titleState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPatchRequestJsonOutputXec04201d(block: InlineReposCheckRunsPatchRequestJsonOutputXec04201d.Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonOutputXec04201d = InlineReposCheckRunsPatchRequestJsonOutputXec04201d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckRunsPatchRequestJsonOutputXec04201d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposCheckRunsPatchRequestJsonOutputXec04201d property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
