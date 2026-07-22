package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/issue/properties/pull_request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue/properties/pull_request
 */
@Serializable(with = InlineIssuePullRequestXae679629.Serializer::class)
public class InlineIssuePullRequestXae679629 internal constructor(
  public val diffUrl: String?,
  public val htmlUrl: String?,
  public val patchUrl: String?,
  public val url: String?,
  private val mergedAtState: FieldState<String?>,
) {
  public val mergedAt: String?
    get() = mergedAtState.valueOrNull()

  public constructor(
    diffUrl: String?,
    htmlUrl: String?,
    patchUrl: String?,
    url: String?,
  ) : this(diffUrl = diffUrl,
  htmlUrl = htmlUrl,
  patchUrl = patchUrl,
  url = url,
  mergedAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `merged_at`.
   */
  public fun mergedAtPresence(): FieldPresence = mergedAtState.presence

  public class Builder {
    private var diffUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var diffUrl: String?
      get() = diffUrlState.valueOrNull()
      set(`value`) {
        diffUrlState = value.toNullableFieldState()
      }

    private var htmlUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var htmlUrl: String?
      get() = htmlUrlState.valueOrNull()
      set(`value`) {
        htmlUrlState = value.toNullableFieldState()
      }

    private var patchUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var patchUrl: String?
      get() = patchUrlState.valueOrNull()
      set(`value`) {
        patchUrlState = value.toNullableFieldState()
      }

    private var urlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        urlState = value.toNullableFieldState()
      }

    private var mergedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var mergedAt: String?
      get() = mergedAtState.valueOrNull()
      set(`value`) {
        mergedAtState = value.toNullableFieldState()
      }

    /**
     * Omits `merged_at` from serialized output.
     */
    public fun unsetMergedAt() {
      mergedAtState = FieldState.Absent
    }

    public fun build(): InlineIssuePullRequestXae679629 {
      check(diffUrlState !== FieldState.Absent) { "diffUrl is required, even when null" }
      check(htmlUrlState !== FieldState.Absent) { "htmlUrl is required, even when null" }
      check(patchUrlState !== FieldState.Absent) { "patchUrl is required, even when null" }
      check(urlState !== FieldState.Absent) { "url is required, even when null" }
      return InlineIssuePullRequestXae679629(
        diffUrl = diffUrlState.valueOrNull(),
        htmlUrl = htmlUrlState.valueOrNull(),
        patchUrl = patchUrlState.valueOrNull(),
        url = urlState.valueOrNull(),
        mergedAtState = mergedAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineIssuePullRequestXae679629 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineIssuePullRequestXae679629> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuePullRequestXae679629 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuePullRequestXae679629")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineIssuePullRequestXae679629 must be a JSON object")
      if (!rawObject.containsKey("diff_url")) {
        throw SerializationException("InlineIssuePullRequestXae679629 is missing required property 'diff_url'")
      }
      val diffUrl = rawObject["diff_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("html_url")) {
        throw SerializationException("InlineIssuePullRequestXae679629 is missing required property 'html_url'")
      }
      val htmlUrl = rawObject["html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("patch_url")) {
        throw SerializationException("InlineIssuePullRequestXae679629 is missing required property 'patch_url'")
      }
      val patchUrl = rawObject["patch_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("url")) {
        throw SerializationException("InlineIssuePullRequestXae679629 is missing required property 'url'")
      }
      val url = rawObject["url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineIssuePullRequestXae679629(
        diffUrl = diffUrl,
        htmlUrl = htmlUrl,
        patchUrl = patchUrl,
        url = url,
        mergedAtState = json.decodeOptional(rawObject, "merged_at", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuePullRequestXae679629) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineIssuePullRequestXae679629")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("diff_url", value.diffUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("patch_url", value.patchUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("merged_at", value.mergedAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineIssuePullRequestXae679629(block: InlineIssuePullRequestXae679629.Builder.() -> Unit): InlineIssuePullRequestXae679629 = InlineIssuePullRequestXae679629.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineIssuePullRequestXae679629 property '" + name + "' is not nullable")
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
