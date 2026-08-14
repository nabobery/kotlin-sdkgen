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
 * Pagination links
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModelsListResponse/properties/links
 */
@Serializable(with = InlineModelsListResponseLinksX85316965.Serializer::class)
public class InlineModelsListResponseLinksX85316965(
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

    public fun build(): InlineModelsListResponseLinksX85316965 {
      check(nextState !== FieldState.Absent) { "next is required, even when null" }
      return InlineModelsListResponseLinksX85316965(
        next = nextState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineModelsListResponseLinksX85316965 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineModelsListResponseLinksX85316965> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineModelsListResponseLinksX85316965 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineModelsListResponseLinksX85316965")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineModelsListResponseLinksX85316965 must be a JSON object")
      if (!rawObject.containsKey("next")) {
        throw SerializationException("InlineModelsListResponseLinksX85316965 is missing required property 'next'")
      }
      val next = rawObject["next"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineModelsListResponseLinksX85316965(
        next = next,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineModelsListResponseLinksX85316965) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineModelsListResponseLinksX85316965")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("next", value.next?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineModelsListResponseLinksX85316965(block: InlineModelsListResponseLinksX85316965.Builder.() -> Unit): InlineModelsListResponseLinksX85316965 = InlineModelsListResponseLinksX85316965.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineModelsListResponseLinksX85316965 property '" + name + "' is not nullable")
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
