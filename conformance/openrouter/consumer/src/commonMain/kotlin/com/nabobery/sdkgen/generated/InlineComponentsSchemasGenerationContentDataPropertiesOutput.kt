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
 */
@Serializable(with = InlineComponentsSchemasGenerationContentDataPropertiesOutput.Serializer::class)
public class InlineComponentsSchemasGenerationContentDataPropertiesOutput(
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

    public fun build(): InlineComponentsSchemasGenerationContentDataPropertiesOutput {
      check(completionState !== FieldState.Absent) { "completion is required, even when null" }
      check(reasoningState !== FieldState.Absent) { "reasoning is required, even when null" }
      return InlineComponentsSchemasGenerationContentDataPropertiesOutput(
        completion = completionState.valueOrNull(),
        reasoning = reasoningState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasGenerationContentDataPropertiesOutput =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasGenerationContentDataPropertiesOutput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasGenerationContentDataPropertiesOutput {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasGenerationContentDataPropertiesOutput")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasGenerationContentDataPropertiesOutput must be a JSON " +
          "object")
      if (!raw.containsKey("completion")) {
        throw SerializationException("InlineComponentsSchemasGenerationContentDataPropertiesOutput is missing " +
          "required property 'completion'")
      }
      val completion = raw["completion"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("reasoning")) {
        throw SerializationException("InlineComponentsSchemasGenerationContentDataPropertiesOutput is missing " +
          "required property 'reasoning'")
      }
      val reasoning = raw["reasoning"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineComponentsSchemasGenerationContentDataPropertiesOutput(
        completion = completion,
        reasoning = reasoning,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasGenerationContentDataPropertiesOutput) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasGenerationContentDataPropertiesOutput")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completion", value.completion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("reasoning", value.reasoning?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasGenerationContentDataPropertiesOutput(block: InlineComponentsSchemasGenerationContentDataPropertiesOutput.Builder.() -> Unit): InlineComponentsSchemasGenerationContentDataPropertiesOutput = InlineComponentsSchemasGenerationContentDataPropertiesOutput.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineComponentsSchemasGenerationContentDataPropertiesOutput " +
      "property '" + name + "' is not nullable")
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
