package io.github.nabobery.sdkgen.github.generated

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
 * Code Of Conduct
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-of-conduct
 */
@Serializable(with = CodeOfConduct.Serializer::class)
public class CodeOfConduct internal constructor(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String?,
  public val key: String,
  public val name: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val bodyState: FieldState<String>,
) {
  public val body: String?
    get() = bodyState.valueOrNull()

  public constructor(
    htmlUrl: String?,
    key: String,
    name: String,
    url: String,
  ) : this(htmlUrl = htmlUrl,
  key = key,
  name = name,
  url = url,
  bodyState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `body`.
   */
  public fun bodyPresence(): FieldPresence = bodyState.presence

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

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var htmlUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var htmlUrl: String?
      get() = htmlUrlState.valueOrNull()
      set(`value`) {
        htmlUrlState = value.toNullableFieldState()
      }

    private var bodyState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "body is not nullable; call unsetBody() to omit it" }
        bodyState = FieldState.Value(present)
      }

    /**
     * Omits `body` from serialized output.
     */
    public fun unsetBody() {
      bodyState = FieldState.Absent
    }

    public fun build(): CodeOfConduct {
      check(keyValue != null) { "key is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      check(htmlUrlState !== FieldState.Absent) { "htmlUrl is required, even when null" }
      return CodeOfConduct(
        htmlUrl = htmlUrlState.valueOrNull(),
        key = key,
        name = name,
        url = url,
        bodyState = bodyState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeOfConduct = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeOfConduct> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeOfConduct {
      val jsonDecoder = decoder.requireJsonDecoder("CodeOfConduct")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeOfConduct must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("html_url")) {
        throw SerializationException("CodeOfConduct is missing required property 'html_url'")
      }
      val htmlUrl = rawObject["html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CodeOfConduct(
        htmlUrl = htmlUrl,
        key = key,
        name = name,
        url = url,
        bodyState = json.decodeOptional(rawObject, "body", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeOfConduct) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeOfConduct")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html_url", value.htmlUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("key", value.key)
        put("name", value.name)
        put("url", value.url)
        putState("body", value.bodyState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeOfConduct(block: CodeOfConduct.Builder.() -> Unit): CodeOfConduct = CodeOfConduct.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeOfConduct is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CodeOfConduct property '" + name + "' is not nullable")
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
