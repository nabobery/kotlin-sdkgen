package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatTokenLogprob/properties/top_logprobs/items.
 */
@Serializable(with = InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems.Serializer::class)
public class InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems(
  public val bytes: List<Int>?,
  public val logprob: Double,
  public val token: String,
) {
  public class Builder {
    private var logprobValue: Double? = null

    public var logprob: Double
      get() = requireNotNull(logprobValue) { "logprob is required" }
      set(`value`) {
        logprobValue = value
      }

    private var tokenValue: String? = null

    public var token: String
      get() = requireNotNull(tokenValue) { "token is required" }
      set(`value`) {
        tokenValue = value
      }

    private var bytesState: FieldState<List<Int>?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var bytes: List<Int>?
      get() = bytesState.valueOrNull()
      set(`value`) {
        bytesState = value.toNullableFieldState()
      }

    public fun build(): InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems {
      check(logprobValue != null) { "logprob is required" }
      check(tokenValue != null) { "token is required" }
      check(bytesState !== FieldState.Absent) { "bytes is required, even when null" }
      return InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems(
        bytes = bytesState.valueOrNull(),
        logprob = logprob,
        token = token,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems must be a " +
          "JSON object")
      val logprob = json.decodeRequired<Double>(raw, "logprob")
      val token = json.decodeRequired<String>(raw, "token")
      if (!raw.containsKey("bytes")) {
        throw SerializationException("InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems is missing " +
          "required property 'bytes'")
      }
      val bytes = raw["bytes"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<Int>?>(requireNotNull(element)) }
      return InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems(
        bytes = bytes,
        logprob = logprob,
        token = token,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bytes", value.bytes?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("logprob", json.encodeToJsonElement(value.logprob))
        put("token", value.token)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems(block: InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems.Builder.() -> Unit): InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems = InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems is missing " +
      "required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems " +
      "property '" + name + "' is not nullable")
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
