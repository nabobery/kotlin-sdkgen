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
 * A builtin content filter entry for create/update requests. Labels are system-assigned and cannot be set by the
 * caller.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentFilterBuiltinEntryInput
 */
@Serializable(with = ContentFilterBuiltinEntryInput.Serializer::class)
public class ContentFilterBuiltinEntryInput internal constructor(
  public val action: ContentFilterBuiltinAction,
  public val slug: ContentFilterBuiltinSlug,
  private val labelState: FieldState<String>,
  private val scanScopeState: FieldState<PromptInjectionScanScope>,
) {
  /**
   * Deprecated: labels are system-assigned and cannot be set by the caller. Accepted for backward compatibility but
   * silently ignored.
   */
  public val label: String?
    get() = labelState.valueOrNull()

  public val scanScope: PromptInjectionScanScope?
    get() = scanScopeState.valueOrNull()

  public constructor(action: ContentFilterBuiltinAction, slug: ContentFilterBuiltinSlug) : this(action = action,
  slug = slug,
  labelState = FieldState.Absent,
  scanScopeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `label`.
   */
  public fun labelPresence(): FieldPresence = labelState.presence

  /**
   * Returns the wire presence of `scan_scope`.
   */
  public fun scanScopePresence(): FieldPresence = scanScopeState.presence

  public class Builder {
    private var actionValue: ContentFilterBuiltinAction? = null

    public var action: ContentFilterBuiltinAction
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var slugValue: ContentFilterBuiltinSlug? = null

    public var slug: ContentFilterBuiltinSlug
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var labelState: FieldState<String> = FieldState.Absent

    /**
     * Deprecated: labels are system-assigned and cannot be set by the caller. Accepted for backward compatibility but
     * silently ignored.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var label: String?
      get() = labelState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "label is not nullable; call unsetLabel() to omit it" }
        labelState = FieldState.Value(present)
      }

    private var scanScopeState: FieldState<PromptInjectionScanScope> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var scanScope: PromptInjectionScanScope?
      get() = scanScopeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "scanScope is not nullable; call unsetScanScope() to omit it" }
        scanScopeState = FieldState.Value(present)
      }

    /**
     * Omits `label` from serialized output.
     */
    public fun unsetLabel() {
      labelState = FieldState.Absent
    }

    /**
     * Omits `scan_scope` from serialized output.
     */
    public fun unsetScanScope() {
      scanScopeState = FieldState.Absent
    }

    public fun build(): ContentFilterBuiltinEntryInput {
      check(actionValue != null) { "action is required" }
      check(slugValue != null) { "slug is required" }
      return ContentFilterBuiltinEntryInput(
        action = action,
        slug = slug,
        labelState = labelState,
        scanScopeState = scanScopeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentFilterBuiltinEntryInput = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContentFilterBuiltinEntryInput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentFilterBuiltinEntryInput {
      val jsonDecoder = decoder.requireJsonDecoder("ContentFilterBuiltinEntryInput")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentFilterBuiltinEntryInput must be a JSON object")
      val action = json.decodeRequired<ContentFilterBuiltinAction>(rawObject, "action")
      val slug = json.decodeRequired<ContentFilterBuiltinSlug>(rawObject, "slug")
      return ContentFilterBuiltinEntryInput(
        action = action,
        slug = slug,
        labelState = json.decodeOptional(rawObject, "label", nullable = false),
        scanScopeState = json.decodeOptional(rawObject, "scan_scope", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentFilterBuiltinEntryInput) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentFilterBuiltinEntryInput")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("slug", json.encodeToJsonElement(value.slug))
        putState("label", value.labelState, json::encodeToJsonElement)
        putState("scan_scope", value.scanScopeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentFilterBuiltinEntryInput(block: ContentFilterBuiltinEntryInput.Builder.() -> Unit): ContentFilterBuiltinEntryInput = ContentFilterBuiltinEntryInput.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentFilterBuiltinEntryInput is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ContentFilterBuiltinEntryInput property '" + name + "' is not nullable")
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
