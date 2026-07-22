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
 * License Simple
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/license-simple
 */
@Serializable(with = LicenseSimple.Serializer::class)
public class LicenseSimple internal constructor(
  public val key: String,
  public val name: String,
  public val nodeId: String,
  public val spdxId: String?,
  public val url: String?,
  private val htmlUrlState: FieldState<String>,
) {
  public val htmlUrl: String?
    get() = htmlUrlState.valueOrNull()

  public constructor(
    key: String,
    name: String,
    nodeId: String,
    spdxId: String?,
    url: String?,
  ) : this(key = key,
  name = name,
  nodeId = nodeId,
  spdxId = spdxId,
  url = url,
  htmlUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `html_url`.
   */
  public fun htmlUrlPresence(): FieldPresence = htmlUrlState.presence

  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var spdxIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var spdxId: String?
      get() = spdxIdState.valueOrNull()
      set(`value`) {
        spdxIdState = value.toNullableFieldState()
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

    private var htmlUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var htmlUrl: String?
      get() = htmlUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "htmlUrl is not nullable; call unsetHtmlUrl() to omit it" }
        htmlUrlState = FieldState.Value(present)
      }

    /**
     * Omits `html_url` from serialized output.
     */
    public fun unsetHtmlUrl() {
      htmlUrlState = FieldState.Absent
    }

    public fun build(): LicenseSimple {
      check(keyValue != null) { "key is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(spdxIdState !== FieldState.Absent) { "spdxId is required, even when null" }
      check(urlState !== FieldState.Absent) { "url is required, even when null" }
      return LicenseSimple(
        key = key,
        name = name,
        nodeId = nodeId,
        spdxId = spdxIdState.valueOrNull(),
        url = urlState.valueOrNull(),
        htmlUrlState = htmlUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LicenseSimple = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<LicenseSimple> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LicenseSimple {
      val jsonDecoder = decoder.requireJsonDecoder("LicenseSimple")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LicenseSimple must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      if (!rawObject.containsKey("spdx_id")) {
        throw SerializationException("LicenseSimple is missing required property 'spdx_id'")
      }
      val spdxId = rawObject["spdx_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("url")) {
        throw SerializationException("LicenseSimple is missing required property 'url'")
      }
      val url = rawObject["url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return LicenseSimple(
        key = key,
        name = name,
        nodeId = nodeId,
        spdxId = spdxId,
        url = url,
        htmlUrlState = json.decodeOptional(rawObject, "html_url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: LicenseSimple) {
      val jsonEncoder = encoder.requireJsonEncoder("LicenseSimple")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("name", value.name)
        put("node_id", value.nodeId)
        put("spdx_id", value.spdxId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("html_url", value.htmlUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun licenseSimple(block: LicenseSimple.Builder.() -> Unit): LicenseSimple = LicenseSimple.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LicenseSimple is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("LicenseSimple property '" + name + "' is not nullable")
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
