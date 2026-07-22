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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/check-run/properties/output.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-run/properties/output
 */
@Serializable(with = InlineCheckRunOutputX552fa2b7.Serializer::class)
public class InlineCheckRunOutputX552fa2b7(
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

    public fun build(): InlineCheckRunOutputX552fa2b7 {
      check(annotationsCountValue != null) { "annotationsCount is required" }
      check(annotationsUrlValue != null) { "annotationsUrl is required" }
      check(summaryState !== FieldState.Absent) { "summary is required, even when null" }
      check(textState !== FieldState.Absent) { "text is required, even when null" }
      check(titleState !== FieldState.Absent) { "title is required, even when null" }
      return InlineCheckRunOutputX552fa2b7(
        annotationsCount = annotationsCount,
        annotationsUrl = annotationsUrl,
        summary = summaryState.valueOrNull(),
        text = textState.valueOrNull(),
        title = titleState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCheckRunOutputX552fa2b7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCheckRunOutputX552fa2b7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckRunOutputX552fa2b7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckRunOutputX552fa2b7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCheckRunOutputX552fa2b7 must be a JSON object")
      val annotationsCount = json.decodeRequired<Int>(rawObject, "annotations_count")
      val annotationsUrl = json.decodeRequired<String>(rawObject, "annotations_url")
      if (!rawObject.containsKey("summary")) {
        throw SerializationException("InlineCheckRunOutputX552fa2b7 is missing required property 'summary'")
      }
      val summary = rawObject["summary"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("text")) {
        throw SerializationException("InlineCheckRunOutputX552fa2b7 is missing required property 'text'")
      }
      val text = rawObject["text"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("title")) {
        throw SerializationException("InlineCheckRunOutputX552fa2b7 is missing required property 'title'")
      }
      val title = rawObject["title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineCheckRunOutputX552fa2b7(
        annotationsCount = annotationsCount,
        annotationsUrl = annotationsUrl,
        summary = summary,
        text = text,
        title = title,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckRunOutputX552fa2b7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCheckRunOutputX552fa2b7")
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

public fun inlineCheckRunOutputX552fa2b7(block: InlineCheckRunOutputX552fa2b7.Builder.() -> Unit): InlineCheckRunOutputX552fa2b7 = InlineCheckRunOutputX552fa2b7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCheckRunOutputX552fa2b7 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineCheckRunOutputX552fa2b7 property '" + name + "' is not nullable")
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
