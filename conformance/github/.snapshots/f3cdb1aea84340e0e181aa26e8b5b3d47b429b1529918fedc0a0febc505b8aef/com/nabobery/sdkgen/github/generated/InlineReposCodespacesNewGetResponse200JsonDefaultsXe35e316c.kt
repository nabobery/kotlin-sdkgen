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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1new/get/responses/200/content/application~1
 * json/schema/properties/defaults.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1new/get/responses/200/content/application~1
 * json/schema/properties/defaults
 */
@Serializable(with = InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c.Serializer::class)
public class InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c(
  public val devcontainerPath: String?,
  public val location: String,
) {
  public class Builder {
    private var locationValue: String? = null

    public var location: String
      get() = requireNotNull(locationValue) { "location is required" }
      set(`value`) {
        locationValue = value
      }

    private var devcontainerPathState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var devcontainerPath: String?
      get() = devcontainerPathState.valueOrNull()
      set(`value`) {
        devcontainerPathState = value.toNullableFieldState()
      }

    public fun build(): InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c {
      check(locationValue != null) { "location is required" }
      check(devcontainerPathState !== FieldState.Absent) { "devcontainerPath is required, even when null" }
      return InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c(
        devcontainerPath = devcontainerPathState.valueOrNull(),
        location = location,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c must be a JSON object")
      val location = json.decodeRequired<String>(rawObject, "location")
      if (!rawObject.containsKey("devcontainer_path")) {
        throw SerializationException("InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c is missing required property 'devcontainer_path'")
      }
      val devcontainerPath = rawObject["devcontainer_path"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c(
        devcontainerPath = devcontainerPath,
        location = location,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("devcontainer_path", value.devcontainerPath?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("location", value.location)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c(block: InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c.Builder.() -> Unit): InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c = InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c property '" + name + "' is not nullable")
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
