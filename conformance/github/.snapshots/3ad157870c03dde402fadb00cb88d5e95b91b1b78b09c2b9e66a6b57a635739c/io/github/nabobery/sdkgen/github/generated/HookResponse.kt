package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/hook-response.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/hook-response
 */
@Serializable(with = HookResponse.Serializer::class)
public class HookResponse(
  public val code: Int?,
  public val message: String?,
  public val status: String?,
) {
  public class Builder {
    private var codeState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var code: Int?
      get() = codeState.valueOrNull()
      set(`value`) {
        codeState = value.toNullableFieldState()
      }

    private var messageState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var message: String?
      get() = messageState.valueOrNull()
      set(`value`) {
        messageState = value.toNullableFieldState()
      }

    private var statusState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var status: String?
      get() = statusState.valueOrNull()
      set(`value`) {
        statusState = value.toNullableFieldState()
      }

    public fun build(): HookResponse {
      check(codeState !== FieldState.Absent) { "code is required, even when null" }
      check(messageState !== FieldState.Absent) { "message is required, even when null" }
      check(statusState !== FieldState.Absent) { "status is required, even when null" }
      return HookResponse(
        code = codeState.valueOrNull(),
        message = messageState.valueOrNull(),
        status = statusState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): HookResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<HookResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): HookResponse {
      val jsonDecoder = decoder.requireJsonDecoder("HookResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("HookResponse must be a JSON object")
      if (!rawObject.containsKey("code")) {
        throw SerializationException("HookResponse is missing required property 'code'")
      }
      val code = rawObject["code"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("message")) {
        throw SerializationException("HookResponse is missing required property 'message'")
      }
      val message = rawObject["message"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("status")) {
        throw SerializationException("HookResponse is missing required property 'status'")
      }
      val status = rawObject["status"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return HookResponse(
        code = code,
        message = message,
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: HookResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("HookResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", value.code?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("message", value.message?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", value.status?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun hookResponse(block: HookResponse.Builder.() -> Unit): HookResponse = HookResponse.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("HookResponse property '" + name + "' is not nullable")
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
