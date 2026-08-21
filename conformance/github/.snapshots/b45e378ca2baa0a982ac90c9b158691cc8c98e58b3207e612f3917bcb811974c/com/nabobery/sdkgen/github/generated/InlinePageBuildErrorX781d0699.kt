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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/page-build/properties/error.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/page-build/properties/error
 */
@Serializable(with = InlinePageBuildErrorX781d0699.Serializer::class)
public class InlinePageBuildErrorX781d0699(
  public val message: String?,
) {
  public class Builder {
    private var messageState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var message: String?
      get() = messageState.valueOrNull()
      set(`value`) {
        messageState = value.toNullableFieldState()
      }

    public fun build(): InlinePageBuildErrorX781d0699 {
      check(messageState !== FieldState.Absent) { "message is required, even when null" }
      return InlinePageBuildErrorX781d0699(
        message = messageState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePageBuildErrorX781d0699 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePageBuildErrorX781d0699> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePageBuildErrorX781d0699 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePageBuildErrorX781d0699")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePageBuildErrorX781d0699 must be a JSON object")
      if (!rawObject.containsKey("message")) {
        throw SerializationException("InlinePageBuildErrorX781d0699 is missing required property 'message'")
      }
      val message = rawObject["message"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlinePageBuildErrorX781d0699(
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePageBuildErrorX781d0699) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePageBuildErrorX781d0699")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePageBuildErrorX781d0699(block: InlinePageBuildErrorX781d0699.Builder.() -> Unit): InlinePageBuildErrorX781d0699 = InlinePageBuildErrorX781d0699.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlinePageBuildErrorX781d0699 property '" + name + "' is not nullable")
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
