package io.github.nabobery.sdkgen.generated

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
 * A custom regex content filter that scans request messages for matching patterns.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentFilterEntry
 */
@Serializable(with = ContentFilterEntry.Serializer::class)
public class ContentFilterEntry internal constructor(
  public val action: ContentFilterAction,
  /**
   * A regex pattern to match against request content
   */
  public val pattern: String,
  private val labelState: FieldState<String?>,
) {
  /**
   * Optional label used in redaction placeholders or error messages
   */
  public val label: String?
    get() = labelState.valueOrNull()

  public constructor(action: ContentFilterAction, pattern: String) : this(action = action,
  pattern = pattern,
  labelState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `label`.
   */
  public fun labelPresence(): FieldPresence = labelState.presence

  public class Builder {
    private var actionValue: ContentFilterAction? = null

    public var action: ContentFilterAction
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var patternValue: String? = null

    public var pattern: String
      get() = requireNotNull(patternValue) { "pattern is required" }
      set(`value`) {
        patternValue = value
      }

    private var labelState: FieldState<String?> = FieldState.Absent

    /**
     * Optional label used in redaction placeholders or error messages
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var label: String?
      get() = labelState.valueOrNull()
      set(`value`) {
        labelState = value.toNullableFieldState()
      }

    /**
     * Omits `label` from serialized output.
     */
    public fun unsetLabel() {
      labelState = FieldState.Absent
    }

    public fun build(): ContentFilterEntry {
      check(actionValue != null) { "action is required" }
      check(patternValue != null) { "pattern is required" }
      return ContentFilterEntry(
        action = action,
        pattern = pattern,
        labelState = labelState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentFilterEntry = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContentFilterEntry> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentFilterEntry {
      val jsonDecoder = decoder.requireJsonDecoder("ContentFilterEntry")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentFilterEntry must be a JSON object")
      val action = json.decodeRequired<ContentFilterAction>(rawObject, "action")
      val pattern = json.decodeRequired<String>(rawObject, "pattern")
      return ContentFilterEntry(
        action = action,
        pattern = pattern,
        labelState = json.decodeOptional(rawObject, "label", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentFilterEntry) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentFilterEntry")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("pattern", value.pattern)
        putState("label", value.labelState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentFilterEntry(block: ContentFilterEntry.Builder.() -> Unit): ContentFilterEntry = ContentFilterEntry.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentFilterEntry is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ContentFilterEntry property '" + name + "' is not nullable")
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
