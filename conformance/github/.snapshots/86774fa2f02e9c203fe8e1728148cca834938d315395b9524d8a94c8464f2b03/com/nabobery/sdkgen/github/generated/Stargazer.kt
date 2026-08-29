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
 * Stargazer
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/stargazer
 */
@Serializable(with = Stargazer.Serializer::class)
public class Stargazer(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val starredAt: String,
  public val user: NullableSimpleUser?,
) {
  public class Builder {
    private var starredAtValue: String? = null

    public var starredAt: String
      get() = requireNotNull(starredAtValue) { "starredAt is required" }
      set(`value`) {
        starredAtValue = value
      }

    private var userState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: NullableSimpleUser?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): Stargazer {
      check(starredAtValue != null) { "starredAt is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return Stargazer(
        starredAt = starredAt,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Stargazer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Stargazer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Stargazer {
      val jsonDecoder = decoder.requireJsonDecoder("Stargazer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Stargazer must be a JSON object")
      val starredAt = json.decodeRequired<String>(rawObject, "starred_at")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("Stargazer is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return Stargazer(
        starredAt = starredAt,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Stargazer) {
      val jsonEncoder = encoder.requireJsonEncoder("Stargazer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("starred_at", value.starredAt)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun stargazer(block: Stargazer.Builder.() -> Unit): Stargazer = Stargazer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Stargazer is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Stargazer property '" + name + "' is not nullable")
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
