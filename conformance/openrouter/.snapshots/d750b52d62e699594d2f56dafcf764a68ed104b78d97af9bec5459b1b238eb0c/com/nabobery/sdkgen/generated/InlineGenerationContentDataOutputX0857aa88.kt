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
 * The output from the generation
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GenerationContentData/properties/output
 */
@Serializable(with = InlineGenerationContentDataOutputX0857aa88.Serializer::class)
public class InlineGenerationContentDataOutputX0857aa88(
  /**
   * The completion output
   */
  public val completion: String?,
  /**
   * Reasoning/thinking output, if any
   */
  public val reasoning: String?,
) {
  public class Builder {
    private var completionState: FieldState<String?> = FieldState.Absent

    /**
     * The completion output
     * Required nullable field; assigning `null` records present-null.
     */
    public var completion: String?
      get() = completionState.valueOrNull()
      set(`value`) {
        completionState = value.toNullableFieldState()
      }

    private var reasoningState: FieldState<String?> = FieldState.Absent

    /**
     * Reasoning/thinking output, if any
     * Required nullable field; assigning `null` records present-null.
     */
    public var reasoning: String?
      get() = reasoningState.valueOrNull()
      set(`value`) {
        reasoningState = value.toNullableFieldState()
      }

    public fun build(): InlineGenerationContentDataOutputX0857aa88 {
      check(completionState !== FieldState.Absent) { "completion is required, even when null" }
      check(reasoningState !== FieldState.Absent) { "reasoning is required, even when null" }
      return InlineGenerationContentDataOutputX0857aa88(
        completion = completionState.valueOrNull(),
        reasoning = reasoningState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGenerationContentDataOutputX0857aa88 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGenerationContentDataOutputX0857aa88> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGenerationContentDataOutputX0857aa88 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGenerationContentDataOutputX0857aa88")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGenerationContentDataOutputX0857aa88 must be a JSON object")
      if (!rawObject.containsKey("completion")) {
        throw SerializationException("InlineGenerationContentDataOutputX0857aa88 is missing required property 'completion'")
      }
      val completion = rawObject["completion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("reasoning")) {
        throw SerializationException("InlineGenerationContentDataOutputX0857aa88 is missing required property 'reasoning'")
      }
      val reasoning = rawObject["reasoning"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineGenerationContentDataOutputX0857aa88(
        completion = completion,
        reasoning = reasoning,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGenerationContentDataOutputX0857aa88) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGenerationContentDataOutputX0857aa88")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completion", value.completion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("reasoning", value.reasoning?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGenerationContentDataOutputX0857aa88(block: InlineGenerationContentDataOutputX0857aa88.Builder.() -> Unit): InlineGenerationContentDataOutputX0857aa88 = InlineGenerationContentDataOutputX0857aa88.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineGenerationContentDataOutputX0857aa88 property '" + name + "' is not nullable")
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
