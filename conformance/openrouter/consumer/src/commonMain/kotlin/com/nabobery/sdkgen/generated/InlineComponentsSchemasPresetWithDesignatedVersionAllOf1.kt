package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlineComponentsSchemasPresetWithDesignatedVersionAllOf1.Serializer::class)
public class InlineComponentsSchemasPresetWithDesignatedVersionAllOf1(
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

    public fun build(): InlineComponentsSchemasPresetWithDesignatedVersionAllOf1 {
      check(designatedVersionState !== FieldState.Absent) { "designatedVersion is required, even when null" }
      return InlineComponentsSchemasPresetWithDesignatedVersionAllOf1(
        designatedVersion = designatedVersionState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasPresetWithDesignatedVersionAllOf1 = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPresetWithDesignatedVersionAllOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPresetWithDesignatedVersionAllOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasPresetWithDesignatedVersionAllOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasPresetWithDesignatedVersionAllOf1 must be a JSON object")
      if (!raw.containsKey("designated_version")) {
        throw SerializationException("InlineComponentsSchemasPresetWithDesignatedVersionAllOf1 is missing required " +
          "property 'designated_version'")
      }
      val designatedVersion = raw["designated_version"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<PresetDesignatedVersion?>(requireNotNull(element)) }
      return InlineComponentsSchemasPresetWithDesignatedVersionAllOf1(
        designatedVersion = designatedVersion,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasPresetWithDesignatedVersionAllOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasPresetWithDesignatedVersionAllOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("designated_version", value.designatedVersion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasPresetWithDesignatedVersionAllOf1(block: InlineComponentsSchemasPresetWithDesignatedVersionAllOf1.Builder.() -> Unit): InlineComponentsSchemasPresetWithDesignatedVersionAllOf1 = InlineComponentsSchemasPresetWithDesignatedVersionAllOf1.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineComponentsSchemasPresetWithDesignatedVersionAllOf1 property '" +
      name + "' is not nullable")
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
