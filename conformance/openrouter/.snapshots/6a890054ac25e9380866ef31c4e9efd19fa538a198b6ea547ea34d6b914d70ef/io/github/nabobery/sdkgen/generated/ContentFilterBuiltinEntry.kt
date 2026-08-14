package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A builtin content filter entry. Builtin filters include PII detectors and the regex-based prompt injection detector.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentFilterBuiltinEntry
 */
@Serializable(with = ContentFilterBuiltinEntry.Serializer::class)
public class ContentFilterBuiltinEntry(
  public val action: ContentFilterBuiltinAction,
  public val slug: ContentFilterBuiltinSlug,
  /**
   * Read-only, system-assigned redaction placeholder derived from the slug (e.g. "[EMAIL]", "[PHONE]"). Not settable by
   * the caller.
   */
  public val label: String? = null,
  public val scanScope: PromptInjectionScanScope? = null,
) {
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

    /**
     * Read-only, system-assigned redaction placeholder derived from the slug (e.g. "[EMAIL]", "[PHONE]"). Not settable
     * by the caller.
     */
    public var label: String? = null

    public var scanScope: PromptInjectionScanScope? = null

    public fun build(): ContentFilterBuiltinEntry {
      check(actionValue != null) { "action is required" }
      check(slugValue != null) { "slug is required" }
      return ContentFilterBuiltinEntry(
        action = action,
        slug = slug,
        label = label,
        scanScope = scanScope,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentFilterBuiltinEntry = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContentFilterBuiltinEntry> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentFilterBuiltinEntry {
      val jsonDecoder = decoder.requireJsonDecoder("ContentFilterBuiltinEntry")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentFilterBuiltinEntry must be a JSON object")
      val action = json.decodeRequired<ContentFilterBuiltinAction>(rawObject, "action")
      val slug = json.decodeRequired<ContentFilterBuiltinSlug>(rawObject, "slug")
      return ContentFilterBuiltinEntry(
        action = action,
        slug = slug,
        label = rawObject["label"]?.let { json.decodeFromJsonElement<String>(it) },
        scanScope = rawObject["scan_scope"]?.let { json.decodeFromJsonElement<PromptInjectionScanScope>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentFilterBuiltinEntry) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentFilterBuiltinEntry")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("slug", json.encodeToJsonElement(value.slug))
        value.label?.let { put("label", it) }
        value.scanScope?.let { put("scan_scope", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentFilterBuiltinEntry(block: ContentFilterBuiltinEntry.Builder.() -> Unit): ContentFilterBuiltinEntry = ContentFilterBuiltinEntry.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentFilterBuiltinEntry is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
