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
 * Code of Conduct Simple
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-of-conduct-simple
 */
@Serializable(with = CodeOfConductSimple.Serializer::class)
public class CodeOfConductSimple(
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
) {
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

    public fun build(): CodeOfConductSimple {
      check(keyValue != null) { "key is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      check(htmlUrlState !== FieldState.Absent) { "htmlUrl is required, even when null" }
      return CodeOfConductSimple(
        htmlUrl = htmlUrlState.valueOrNull(),
        key = key,
        name = name,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeOfConductSimple = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeOfConductSimple> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeOfConductSimple {
      val jsonDecoder = decoder.requireJsonDecoder("CodeOfConductSimple")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeOfConductSimple must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("html_url")) {
        throw SerializationException("CodeOfConductSimple is missing required property 'html_url'")
      }
      val htmlUrl = rawObject["html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CodeOfConductSimple(
        htmlUrl = htmlUrl,
        key = key,
        name = name,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeOfConductSimple) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeOfConductSimple")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html_url", value.htmlUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("key", value.key)
        put("name", value.name)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeOfConductSimple(block: CodeOfConductSimple.Builder.() -> Unit): CodeOfConductSimple = CodeOfConductSimple.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeOfConductSimple is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CodeOfConductSimple property '" + name + "' is not nullable")
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
