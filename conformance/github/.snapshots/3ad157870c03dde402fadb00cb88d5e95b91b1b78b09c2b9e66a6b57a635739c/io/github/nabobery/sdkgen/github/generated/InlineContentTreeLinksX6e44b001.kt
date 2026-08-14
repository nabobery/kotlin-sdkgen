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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/content-tree/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-tree/properties/_links
 */
@Serializable(with = InlineContentTreeLinksX6e44b001.Serializer::class)
public class InlineContentTreeLinksX6e44b001(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val git: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val html: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val self: String,
) {
  public class Builder {
    private var selfValue: String? = null

    public var self: String
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var gitState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var git: String?
      get() = gitState.valueOrNull()
      set(`value`) {
        gitState = value.toNullableFieldState()
      }

    private var htmlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var html: String?
      get() = htmlState.valueOrNull()
      set(`value`) {
        htmlState = value.toNullableFieldState()
      }

    public fun build(): InlineContentTreeLinksX6e44b001 {
      check(selfValue != null) { "self is required" }
      check(gitState !== FieldState.Absent) { "git is required, even when null" }
      check(htmlState !== FieldState.Absent) { "html is required, even when null" }
      return InlineContentTreeLinksX6e44b001(
        git = gitState.valueOrNull(),
        html = htmlState.valueOrNull(),
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineContentTreeLinksX6e44b001 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineContentTreeLinksX6e44b001> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineContentTreeLinksX6e44b001 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineContentTreeLinksX6e44b001")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineContentTreeLinksX6e44b001 must be a JSON object")
      val self = json.decodeRequired<String>(rawObject, "self")
      if (!rawObject.containsKey("git")) {
        throw SerializationException("InlineContentTreeLinksX6e44b001 is missing required property 'git'")
      }
      val git = rawObject["git"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("html")) {
        throw SerializationException("InlineContentTreeLinksX6e44b001 is missing required property 'html'")
      }
      val html = rawObject["html"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineContentTreeLinksX6e44b001(
        git = git,
        html = html,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineContentTreeLinksX6e44b001) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineContentTreeLinksX6e44b001")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("git", value.git?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html", value.html?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("self", value.self)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineContentTreeLinksX6e44b001(block: InlineContentTreeLinksX6e44b001.Builder.() -> Unit): InlineContentTreeLinksX6e44b001 = InlineContentTreeLinksX6e44b001.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineContentTreeLinksX6e44b001 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineContentTreeLinksX6e44b001 property '" + name + "' is not nullable")
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
