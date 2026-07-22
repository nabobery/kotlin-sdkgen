package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/check-run-with-simple-check-suite/properties/output.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-run-with-simple-check-suite/properties/output
 */
@Serializable(with = InlineCheckRunWithSimpleCheckSuiteOutputX62517e78.Serializer::class)
public class InlineCheckRunWithSimpleCheckSuiteOutputX62517e78(
  public val annotationsCount: Int,
  public val annotationsUrl: String,
  public val summary: String?,
  public val text: String?,
  public val title: String?,
) {
  public class Builder {
    private var annotationsCountValue: Int? = null

    public var annotationsCount: Int
      get() = requireNotNull(annotationsCountValue) { "annotationsCount is required" }
      set(`value`) {
        annotationsCountValue = value
      }

    private var annotationsUrlValue: String? = null

    public var annotationsUrl: String
      get() = requireNotNull(annotationsUrlValue) { "annotationsUrl is required" }
      set(`value`) {
        annotationsUrlValue = value
      }

    private var summaryState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var summary: String?
      get() = summaryState.valueOrNull()
      set(`value`) {
        summaryState = value.toNullableFieldState()
      }

    private var textState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var text: String?
      get() = textState.valueOrNull()
      set(`value`) {
        textState = value.toNullableFieldState()
      }

    private var titleState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var title: String?
      get() = titleState.valueOrNull()
      set(`value`) {
        titleState = value.toNullableFieldState()
      }

    public fun build(): InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 {
      check(annotationsCountValue != null) { "annotationsCount is required" }
      check(annotationsUrlValue != null) { "annotationsUrl is required" }
      check(summaryState !== FieldState.Absent) { "summary is required, even when null" }
      check(textState !== FieldState.Absent) { "text is required, even when null" }
      check(titleState !== FieldState.Absent) { "title is required, even when null" }
      return InlineCheckRunWithSimpleCheckSuiteOutputX62517e78(
        annotationsCount = annotationsCount,
        annotationsUrl = annotationsUrl,
        summary = summaryState.valueOrNull(),
        text = textState.valueOrNull(),
        title = titleState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCheckRunWithSimpleCheckSuiteOutputX62517e78> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckRunWithSimpleCheckSuiteOutputX62517e78")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 must be a JSON object")
      val annotationsCount = json.decodeRequired<Int>(rawObject, "annotations_count")
      val annotationsUrl = json.decodeRequired<String>(rawObject, "annotations_url")
      if (!rawObject.containsKey("summary")) {
        throw SerializationException("InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 is missing required property 'summary'")
      }
      val summary = rawObject["summary"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("text")) {
        throw SerializationException("InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 is missing required property 'text'")
      }
      val text = rawObject["text"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("title")) {
        throw SerializationException("InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 is missing required property 'title'")
      }
      val title = rawObject["title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineCheckRunWithSimpleCheckSuiteOutputX62517e78(
        annotationsCount = annotationsCount,
        annotationsUrl = annotationsUrl,
        summary = summary,
        text = text,
        title = title,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckRunWithSimpleCheckSuiteOutputX62517e78) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCheckRunWithSimpleCheckSuiteOutputX62517e78")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("annotations_count", json.encodeToJsonElement(value.annotationsCount))
        put("annotations_url", value.annotationsUrl)
        put("summary", value.summary?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("text", value.text?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("title", value.title?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCheckRunWithSimpleCheckSuiteOutputX62517e78(block: InlineCheckRunWithSimpleCheckSuiteOutputX62517e78.Builder.() -> Unit): InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 = InlineCheckRunWithSimpleCheckSuiteOutputX62517e78.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineCheckRunWithSimpleCheckSuiteOutputX62517e78 property '" + name + "' is not nullable")
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
