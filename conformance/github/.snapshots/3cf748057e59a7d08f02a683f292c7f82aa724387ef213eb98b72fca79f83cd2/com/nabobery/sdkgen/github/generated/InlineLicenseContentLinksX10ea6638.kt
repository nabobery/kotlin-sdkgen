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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/license-content/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/license-content/properties/_links
 */
@Serializable(with = InlineLicenseContentLinksX10ea6638.Serializer::class)
public class InlineLicenseContentLinksX10ea6638(
  public val git: String?,
  public val html: String?,
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
     * Required nullable field; assigning `null` records present-null.
     */
    public var git: String?
      get() = gitState.valueOrNull()
      set(`value`) {
        gitState = value.toNullableFieldState()
      }

    private var htmlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var html: String?
      get() = htmlState.valueOrNull()
      set(`value`) {
        htmlState = value.toNullableFieldState()
      }

    public fun build(): InlineLicenseContentLinksX10ea6638 {
      check(selfValue != null) { "self is required" }
      check(gitState !== FieldState.Absent) { "git is required, even when null" }
      check(htmlState !== FieldState.Absent) { "html is required, even when null" }
      return InlineLicenseContentLinksX10ea6638(
        git = gitState.valueOrNull(),
        html = htmlState.valueOrNull(),
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineLicenseContentLinksX10ea6638 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineLicenseContentLinksX10ea6638> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLicenseContentLinksX10ea6638 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLicenseContentLinksX10ea6638")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineLicenseContentLinksX10ea6638 must be a JSON object")
      val self = json.decodeRequired<String>(rawObject, "self")
      if (!rawObject.containsKey("git")) {
        throw SerializationException("InlineLicenseContentLinksX10ea6638 is missing required property 'git'")
      }
      val git = rawObject["git"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("html")) {
        throw SerializationException("InlineLicenseContentLinksX10ea6638 is missing required property 'html'")
      }
      val html = rawObject["html"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineLicenseContentLinksX10ea6638(
        git = git,
        html = html,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineLicenseContentLinksX10ea6638) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineLicenseContentLinksX10ea6638")
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

public fun inlineLicenseContentLinksX10ea6638(block: InlineLicenseContentLinksX10ea6638.Builder.() -> Unit): InlineLicenseContentLinksX10ea6638 = InlineLicenseContentLinksX10ea6638.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineLicenseContentLinksX10ea6638 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineLicenseContentLinksX10ea6638 property '" + name + "' is not nullable")
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
