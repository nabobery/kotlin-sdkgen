package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/status-check-policy/properties/checks/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/status-check-policy/properties/checks/items
 */
@Serializable(with = InlineStatusCheckPolicyChecksItemX94eb01eb.Serializer::class)
public class InlineStatusCheckPolicyChecksItemX94eb01eb(
  public val appId: Int?,
  public val context: String,
) {
  public class Builder {
    private var contextValue: String? = null

    public var context: String
      get() = requireNotNull(contextValue) { "context is required" }
      set(`value`) {
        contextValue = value
      }

    private var appIdState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var appId: Int?
      get() = appIdState.valueOrNull()
      set(`value`) {
        appIdState = value.toNullableFieldState()
      }

    public fun build(): InlineStatusCheckPolicyChecksItemX94eb01eb {
      check(contextValue != null) { "context is required" }
      check(appIdState !== FieldState.Absent) { "appId is required, even when null" }
      return InlineStatusCheckPolicyChecksItemX94eb01eb(
        appId = appIdState.valueOrNull(),
        context = context,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineStatusCheckPolicyChecksItemX94eb01eb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineStatusCheckPolicyChecksItemX94eb01eb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStatusCheckPolicyChecksItemX94eb01eb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStatusCheckPolicyChecksItemX94eb01eb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineStatusCheckPolicyChecksItemX94eb01eb must be a JSON object")
      val context = json.decodeRequired<String>(rawObject, "context")
      if (!rawObject.containsKey("app_id")) {
        throw SerializationException("InlineStatusCheckPolicyChecksItemX94eb01eb is missing required property 'app_id'")
      }
      val appId = rawObject["app_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return InlineStatusCheckPolicyChecksItemX94eb01eb(
        appId = appId,
        context = context,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineStatusCheckPolicyChecksItemX94eb01eb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineStatusCheckPolicyChecksItemX94eb01eb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app_id", value.appId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("context", value.context)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineStatusCheckPolicyChecksItemX94eb01eb(block: InlineStatusCheckPolicyChecksItemX94eb01eb.Builder.() -> Unit): InlineStatusCheckPolicyChecksItemX94eb01eb = InlineStatusCheckPolicyChecksItemX94eb01eb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineStatusCheckPolicyChecksItemX94eb01eb is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineStatusCheckPolicyChecksItemX94eb01eb property '" + name + "' is not nullable")
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
