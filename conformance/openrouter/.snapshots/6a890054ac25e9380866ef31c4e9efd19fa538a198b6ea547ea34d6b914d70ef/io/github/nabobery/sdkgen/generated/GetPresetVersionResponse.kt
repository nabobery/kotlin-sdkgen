package io.github.nabobery.sdkgen.generated

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
 * A single version of a preset.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GetPresetVersionResponse
 */
@Serializable(with = GetPresetVersionResponse.Serializer::class)
public class GetPresetVersionResponse(
  public val `data`: PresetDesignatedVersion?,
) {
  public class Builder {
    private var dataState: FieldState<PresetDesignatedVersion?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var `data`: PresetDesignatedVersion?
      get() = dataState.valueOrNull()
      set(`value`) {
        dataState = value.toNullableFieldState()
      }

    public fun build(): GetPresetVersionResponse {
      check(dataState !== FieldState.Absent) { "data is required, even when null" }
      return GetPresetVersionResponse(
        data = dataState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GetPresetVersionResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GetPresetVersionResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GetPresetVersionResponse {
      val jsonDecoder = decoder.requireJsonDecoder("GetPresetVersionResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GetPresetVersionResponse must be a JSON object")
      if (!rawObject.containsKey("data")) {
        throw SerializationException("GetPresetVersionResponse is missing required property 'data'")
      }
      val data = rawObject["data"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<PresetDesignatedVersion?>(requireNotNull(element)) }
      return GetPresetVersionResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GetPresetVersionResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("GetPresetVersionResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun getPresetVersionResponse(block: GetPresetVersionResponse.Builder.() -> Unit): GetPresetVersionResponse = GetPresetVersionResponse.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("GetPresetVersionResponse property '" + name + "' is not nullable")
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
