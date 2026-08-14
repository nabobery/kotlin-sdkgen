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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/hook-delivery/properties/response.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/hook-delivery/properties/response
 */
@Serializable(with = InlineHookDeliveryResponseX99dba0e9.Serializer::class)
public class InlineHookDeliveryResponseX99dba0e9(
  /**
   * The response headers received when the delivery was made.
   */
  public val headers: JsonObject?,
  /**
   * The response payload received.
   */
  public val payload: String?,
) {
  public class Builder {
    private var headersState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * The response headers received when the delivery was made.
     * Required nullable field; assigning `null` records present-null.
     */
    public var headers: JsonObject?
      get() = headersState.valueOrNull()
      set(`value`) {
        headersState = value.toNullableFieldState()
      }

    private var payloadState: FieldState<String?> = FieldState.Absent

    /**
     * The response payload received.
     * Required nullable field; assigning `null` records present-null.
     */
    public var payload: String?
      get() = payloadState.valueOrNull()
      set(`value`) {
        payloadState = value.toNullableFieldState()
      }

    public fun build(): InlineHookDeliveryResponseX99dba0e9 {
      check(headersState !== FieldState.Absent) { "headers is required, even when null" }
      check(payloadState !== FieldState.Absent) { "payload is required, even when null" }
      return InlineHookDeliveryResponseX99dba0e9(
        headers = headersState.valueOrNull(),
        payload = payloadState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineHookDeliveryResponseX99dba0e9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineHookDeliveryResponseX99dba0e9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineHookDeliveryResponseX99dba0e9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineHookDeliveryResponseX99dba0e9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineHookDeliveryResponseX99dba0e9 must be a JSON object")
      if (!rawObject.containsKey("headers")) {
        throw SerializationException("InlineHookDeliveryResponseX99dba0e9 is missing required property 'headers'")
      }
      val headers = rawObject["headers"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(requireNotNull(element)) }
      if (!rawObject.containsKey("payload")) {
        throw SerializationException("InlineHookDeliveryResponseX99dba0e9 is missing required property 'payload'")
      }
      val payload = rawObject["payload"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineHookDeliveryResponseX99dba0e9(
        headers = headers,
        payload = payload,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineHookDeliveryResponseX99dba0e9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineHookDeliveryResponseX99dba0e9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("headers", value.headers?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("payload", value.payload?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineHookDeliveryResponseX99dba0e9(block: InlineHookDeliveryResponseX99dba0e9.Builder.() -> Unit): InlineHookDeliveryResponseX99dba0e9 = InlineHookDeliveryResponseX99dba0e9.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineHookDeliveryResponseX99dba0e9 property '" + name + "' is not nullable")
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
