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
 * Pagination links
 */
@Serializable(with = InlineComponentsSchemasModelsListResponsePropertiesLinks.Serializer::class)
public class InlineComponentsSchemasModelsListResponsePropertiesLinks(
  /**
   * URL for the next page of results, or null if this is the last page
   */
  public val next: String?,
) {
  public class Builder {
    private var nextState: FieldState<String?> = FieldState.Absent

    /**
     * URL for the next page of results, or null if this is the last page
     * Required nullable field; assigning `null` records present-null.
     */
    public var next: String?
      get() = nextState.valueOrNull()
      set(`value`) {
        nextState = value.toNullableFieldState()
      }

    public fun build(): InlineComponentsSchemasModelsListResponsePropertiesLinks {
      check(nextState !== FieldState.Absent) { "next is required, even when null" }
      return InlineComponentsSchemasModelsListResponsePropertiesLinks(
        next = nextState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasModelsListResponsePropertiesLinks = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasModelsListResponsePropertiesLinks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasModelsListResponsePropertiesLinks {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasModelsListResponsePropertiesLinks")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasModelsListResponsePropertiesLinks must be a JSON object")
      if (!raw.containsKey("next")) {
        throw SerializationException("InlineComponentsSchemasModelsListResponsePropertiesLinks is missing required " +
          "property 'next'")
      }
      val next = raw["next"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineComponentsSchemasModelsListResponsePropertiesLinks(
        next = next,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasModelsListResponsePropertiesLinks) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasModelsListResponsePropertiesLinks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("next", value.next?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasModelsListResponsePropertiesLinks(block: InlineComponentsSchemasModelsListResponsePropertiesLinks.Builder.() -> Unit): InlineComponentsSchemasModelsListResponsePropertiesLinks = InlineComponentsSchemasModelsListResponsePropertiesLinks.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineComponentsSchemasModelsListResponsePropertiesLinks property '" +
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
