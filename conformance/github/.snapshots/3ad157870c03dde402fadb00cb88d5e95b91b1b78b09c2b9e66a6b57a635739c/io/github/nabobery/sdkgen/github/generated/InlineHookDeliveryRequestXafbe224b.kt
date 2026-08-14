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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/hook-delivery/properties/request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/hook-delivery/properties/request
 */
@Serializable(with = InlineHookDeliveryRequestXafbe224b.Serializer::class)
public class InlineHookDeliveryRequestXafbe224b(
  /**
   * The request headers sent with the webhook delivery.
   */
  public val headers: JsonObject?,
  /**
   * The webhook payload.
   */
  public val payload: JsonObject?,
) {
  public class Builder {
    private var headersState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * The request headers sent with the webhook delivery.
     * Required nullable field; assigning `null` records present-null.
     */
    public var headers: JsonObject?
      get() = headersState.valueOrNull()
      set(`value`) {
        headersState = value.toNullableFieldState()
      }

    private var payloadState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * The webhook payload.
     * Required nullable field; assigning `null` records present-null.
     */
    public var payload: JsonObject?
      get() = payloadState.valueOrNull()
      set(`value`) {
        payloadState = value.toNullableFieldState()
      }

    public fun build(): InlineHookDeliveryRequestXafbe224b {
      check(headersState !== FieldState.Absent) { "headers is required, even when null" }
      check(payloadState !== FieldState.Absent) { "payload is required, even when null" }
      return InlineHookDeliveryRequestXafbe224b(
        headers = headersState.valueOrNull(),
        payload = payloadState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineHookDeliveryRequestXafbe224b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineHookDeliveryRequestXafbe224b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineHookDeliveryRequestXafbe224b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineHookDeliveryRequestXafbe224b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineHookDeliveryRequestXafbe224b must be a JSON object")
      if (!rawObject.containsKey("headers")) {
        throw SerializationException("InlineHookDeliveryRequestXafbe224b is missing required property 'headers'")
      }
      val headers = rawObject["headers"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(requireNotNull(element)) }
      if (!rawObject.containsKey("payload")) {
        throw SerializationException("InlineHookDeliveryRequestXafbe224b is missing required property 'payload'")
      }
      val payload = rawObject["payload"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(requireNotNull(element)) }
      return InlineHookDeliveryRequestXafbe224b(
        headers = headers,
        payload = payload,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineHookDeliveryRequestXafbe224b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineHookDeliveryRequestXafbe224b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("headers", value.headers?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("payload", value.payload?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineHookDeliveryRequestXafbe224b(block: InlineHookDeliveryRequestXafbe224b.Builder.() -> Unit): InlineHookDeliveryRequestXafbe224b = InlineHookDeliveryRequestXafbe224b.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineHookDeliveryRequestXafbe224b property '" + name + "' is not nullable")
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
