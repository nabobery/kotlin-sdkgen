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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/PresetWithDesignatedVersion/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PresetWithDesignatedVersion/allOf/1
 */
@Serializable(with = InlinePresetWithDesignatedVersionAllOf2X42b4c64f.Serializer::class)
public class InlinePresetWithDesignatedVersionAllOf2X42b4c64f(
  public val designatedVersion: PresetDesignatedVersion?,
) {
  public class Builder {
    private var designatedVersionState: FieldState<PresetDesignatedVersion?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var designatedVersion: PresetDesignatedVersion?
      get() = designatedVersionState.valueOrNull()
      set(`value`) {
        designatedVersionState = value.toNullableFieldState()
      }

    public fun build(): InlinePresetWithDesignatedVersionAllOf2X42b4c64f {
      check(designatedVersionState !== FieldState.Absent) { "designatedVersion is required, even when null" }
      return InlinePresetWithDesignatedVersionAllOf2X42b4c64f(
        designatedVersion = designatedVersionState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePresetWithDesignatedVersionAllOf2X42b4c64f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePresetWithDesignatedVersionAllOf2X42b4c64f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePresetWithDesignatedVersionAllOf2X42b4c64f {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePresetWithDesignatedVersionAllOf2X42b4c64f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePresetWithDesignatedVersionAllOf2X42b4c64f must be a JSON object")
      if (!rawObject.containsKey("designated_version")) {
        throw SerializationException("InlinePresetWithDesignatedVersionAllOf2X42b4c64f is missing required property 'designated_version'")
      }
      val designatedVersion = rawObject["designated_version"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<PresetDesignatedVersion?>(requireNotNull(element)) }
      return InlinePresetWithDesignatedVersionAllOf2X42b4c64f(
        designatedVersion = designatedVersion,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePresetWithDesignatedVersionAllOf2X42b4c64f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePresetWithDesignatedVersionAllOf2X42b4c64f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("designated_version", value.designatedVersion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePresetWithDesignatedVersionAllOf2X42b4c64f(block: InlinePresetWithDesignatedVersionAllOf2X42b4c64f.Builder.() -> Unit): InlinePresetWithDesignatedVersionAllOf2X42b4c64f = InlinePresetWithDesignatedVersionAllOf2X42b4c64f.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlinePresetWithDesignatedVersionAllOf2X42b4c64f property '" + name + "' is not nullable")
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
